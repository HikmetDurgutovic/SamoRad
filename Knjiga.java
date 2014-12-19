
public class Knjiga {
	
	private String naziv;
	private double cijena;
	private int stanje;
	private Autor autor;
	
	/**
	 * Konstruktor koji prima sva cetiri parametra
	 * @param naziv1
	 * @param cijena1
	 * @param stanje1
	 * @param autor1
	 */
	
	public Knjiga(String naziv1, double cijena1, int stanje1, Autor autor1){
		naziv = naziv1;
		cijena = cijena1;
		stanje = stanje1;
		autor = autor1;
	}
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public Knjiga(){
		naziv = "Kraj vjecnosti";
		cijena = 15;
		stanje = 7;
		autor = new Autor();
	}
	
	/**
	 * Konstruktor za kopiranje
	 * @param other
	 */
	
	public Knjiga(Knjiga other){
		this.naziv = other.naziv;
		this.cijena = other.cijena;
		this.stanje = other.stanje;
		this.autor = new Autor(other.autor);
	}
	
	/**
	 * Getter za naziv
	 * @return naziv
	 */
	
	public String getNaziv(){
		return naziv;
	}
	
	/**
	 * Getter za cijenu
	 * @return cijena
	 */
	
	public double getCijena(){
		return cijena;
	}
	
	/**
	 * Getter za stanje
	 * @return stanje
	 */
	
	public int getStanje(){
		return stanje;
	}
	
	/**
	 * Getter za autora
	 * @return
	 */
	
	public Autor getAutor(){
		return autor;
	}
	
	/**
	 * Setter za naziv
	 * @param naziv
	 */
	
	public void setNaziv(String naziv){
		this.naziv = naziv;
	}
	
	/**
	 * Setter za cijenu
	 * @param cijena
	 */
	
	public void setCijena(double cijena){
		if (cijena < 0){
			throw new IllegalArgumentException("Niste ispravno uneli cijenu!");
		}
		else{
			this.cijena = cijena;
		}
	}
	
	/**
	 * Setter za stanje
	 * @param stanje
	 */
	
	public void setStanje(int stanje){
		if (stanje < 0){
			throw new IllegalArgumentException("Niste ispravno uneli stanje!");
		}
		else{
			this.stanje = stanje;
		}
	}
	
	/**
	 * Setter za autor
	 * @param autor
	 */
	
	public void setAutor(Autor autor){
		this.autor.setIme(autor.getIme());
		this.autor.setMail(autor.getMail());
		this.autor.setSpol(autor.getSpol());
	}
	
	/**
	 * Funkcija kreira string u sa svim podacima o objektu
	 */
	
	public String toString(){
		String strKnjiga = "";
		strKnjiga += "\nNaziv knjige: " + naziv + "\nCijena: " + cijena + "\nImamo " + stanje + " knjiga na prodaji\n" + autor.toString();
		return strKnjiga;
	}

}
