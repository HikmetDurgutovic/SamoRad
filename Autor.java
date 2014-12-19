
public class Autor {
	
	private String ime;
	private String mail;
	private char spol;
	
	/**
	 * Kontruktor koji prima sva tri parametra
	 * @param ime1
	 * @param mail1
	 * @param spol1
	 */
	
	public Autor(String ime1, String mail1, char spol1){
		ime = ime1;
		mail = mail1;
		spol = spol1;
	}
	
	/**
	 * Kontruktor bez parametara
	 */
	
	public Autor(){
		ime = "John Doe";
		mail = "johndoe@hotmail.com";
		spol = 'M';
	}
	
	/**
	 * Kontruktor za kopiranje
	 * @param other
	 */
	
	public Autor(Autor other){
		this.ime = other.ime;
		this.mail = other.mail;
		this.spol = other.spol;
	}
	
	/**
	 * Getter za ime
	 * @return ime
	 */
	
	public String getIme(){
		return ime;
	}
	
	/**
	 * Getter za mail
	 * @return mail
	 */
	
	public String getMail(){
		return mail;
	}
	
	/**
	 * Getter za spol
	 * @return spol
	 */
	
	public char getSpol(){
		return spol;
	}
	
	/**
	 * Setter za ime
	 */
	
	public void setIme(String ime){
		this.ime = ime;
	}
	
	/**
	 * Setter za mail
	 */
	
	public void setMail(String mail){
		boolean adresa = false;
		for (int i=0; i<mail.length(); i++){
			if (mail.charAt(i) == '@'){
				adresa = true;
			}
		}
		if (adresa == true){
			this.mail = mail;
		}
		else{
			throw new IllegalArgumentException("Niste ispravno unijeli mail!");
		}
	}
	
	/**
	 * Setter za spol
	 */
	
	public void setSpol(char spol){
		if (spol != 'M' && spol != 'm' && spol != 'Z' && spol != 'z'){
			this.spol = spol;
		}
		else{
			throw new IllegalArgumentException("Niste ispravno unijeli spol!");
		}
	}
	
	/**
	 * Funkcija koja kreira string sa svim podacima o autoru i vraca taj string
	 * return strAutor
	 */
	
	public String toString(){
		String strAutor = "";
		strAutor += "Ime autora: " + ime + "\nE-mail adresa: " + mail + "\nSpol autora: " + spol; 
		return strAutor;
	}

}
