
public class Knjizara {
	
	private Knjiga[] polica;
	private int brojKnjiga;
	
	/**
	 * Konstruktor koji kreira niz objekata
	 */
	
	public Knjizara(){
		polica = new Knjiga[10];
		brojKnjiga=0;
	}
	
	/**
	 * Funkcija koja kreira string sa svim clanovima niza objekata
	 */
	
	public String toString(){
		String strKnjizara = "";
		for (int i=0; i<brojKnjiga; i++){
			strKnjizara += polica[i] + "\n";
		}
		return strKnjizara;
	}
	
	/**
	 * Funkcija koja dodaje objekte u niz
	 * @param naziv
	 * @param cijena
	 * @param stanje
	 * @param autor
	 */
	
	public void dodajKnjigu(String naziv, double cijena, int stanje, Autor autor){
		polica[brojKnjiga] = new Knjiga(naziv, cijena, stanje, autor);
		if (brojKnjiga == polica.length){
			resize();
		}
		brojKnjiga++;
	}

	/**
	 * Funkcija koja povecava duzinu niza
	 */
	
	private void resize() {
		Knjiga[] niz = new Knjiga[polica.length * 2];
		for (int i=0; i<polica.length; i++){
			niz[i] = polica[i];
		}
		polica = niz;
	}
	
	/**
	 * Funkcija koja oduzima od niza jedan objekat
	 * @param naziv
	 * @param cijena
	 * @param stanje
	 * @param autor
	 */
	
	public void prodajKnjigu(String naziv, double cijena, int stanje, Autor autor){
		Knjiga[] niz = new Knjiga[polica.length];
		for (int i=0; i<brojKnjiga-1; i++){
			if (polica[i].getNaziv() != naziv && polica[i].getCijena() != cijena && polica[i].getStanje() != stanje && polica[i].getAutor() != autor){
				niz[i] = polica[i];
			}
		}
		polica = niz;
		brojKnjiga--;
	}
	
	/**
	 * Funkcija koja sortira objekte u nizu po nazivu
	 * @return polica
	 */
	
	public Knjiga[] poredajPoNazivu(){
		int i=0, j=1;
		do{
			if (polica[i].getNaziv() != polica[j].getNaziv()){
				Knjiga pomocna = new Knjiga();
				pomocna = polica[j];
				polica[j] = polica[i];
				polica[i] = pomocna;
			}
			i++;
			j++;
		}while (j<brojKnjiga);
		return polica;
	}
	
	/**
	 * Funkcija koja sortira objekte u nizu po cijeni
	 * @return polica
	 */
	
	public Knjiga[] poredajPoCijeni(){
		int i=0, j=1;
		do{
			if (polica[i].getCijena() < polica[j].getCijena()){
				Knjiga pomocna = new Knjiga();
				pomocna = polica[j];
				polica[j] = polica[i];
				polica[i] = pomocna;
			}
			i++;
			j++;
		}while (j<brojKnjiga);
		return polica;
	}
	
	/**
	 * Funkcija koja sortira objekte u nizu po autoru
	 * @return polica
	 */
	
	public Knjiga[] poredajPoAutoru(){
		int i=0, j=1;
		do{
			if (polica[i].getAutor() == polica[j].getAutor()){
				Knjiga pomocna = new Knjiga();
				pomocna = polica[j];
				polica[j] = polica[i];
				polica[i] = pomocna;
			}
			i++;
			j++;
		}while (j<brojKnjiga);
		return polica;
	}

}
