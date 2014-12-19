
public class Pjesma {
	
	private String naziv;
	private double duzina;
	private Autor autor;
	
	/**
	 * Konstruktor koji prima sva tri parametra
	 * @param naziv1
	 * @param duzina1
	 * @param autor1
	 */
	
	public Pjesma(String naziv1, double duzina1, Autor autor1){
		naziv = naziv1;
		duzina = duzina1;
		autor = autor1;
	}
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public Pjesma(){
		naziv = "Whole Lotta Love";
		duzina = 330;
		autor = new Autor("Robert Plant", "robert.plant@hotmail.com", 'M');
	}
	
	/**
	 * Konstruktor za kopiranje
	 * @param other
	 */
	
	public Pjesma(Pjesma other){
		this.naziv = other.naziv;
		this.duzina = other.duzina;
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
	 * Getter za duzinu
	 * @return duzina
	 */
	
	public double getDuzina(){
		return duzina;
	}
	
	/**
	 * Getter za autora
	 * @return autor
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
	 * Setter za duzinu
	 * @param duzina
	 */
	
	public void setDuzina(int duzina){
		if (duzina < 0){
			throw new IllegalArgumentException("Niste ispravno unijeli duzinu trajanja pjesme!");
		}
		else{
			this.duzina = duzina; 
		}	
	}
	
	/**
	 * Setter za autora
	 * @param autor
	 */
	
	public void setAutor(Autor autor){
		this.autor.setIme(autor.getIme());
		this.autor.setMail(autor.getMail());
		this.autor.setSpol(autor.getSpol());
	}
	
	/**
	 * Funkcija koja kreira string sa svim podacima o objektu
	 */
	
	public String toString(){
		String strPjesma = "";
		strPjesma += "\nNaziv pjesme: " + naziv + "\nDuzina trajanja: " + duzina + " sekundi\n" + autor.toString();
		return strPjesma;
	}

	/**
	 * Funkcija koja provjerava da li su dva objekta jednaka
	 * @param pjesma
	 * @return boolean
	 */
	
	public boolean equals(Pjesma pjesma){
		if (this.naziv.equals(pjesma.naziv) && this.duzina == pjesma.duzina){
			if (this.autor.getIme().equals(pjesma.autor.getIme()) && this.autor.getMail().equals(pjesma.autor.getMail()) && this.autor.getSpol() == pjesma.autor.getSpol())
					return true;
		}
		return false;
	}

}
