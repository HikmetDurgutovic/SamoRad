
public class Krug {
	
	private Tacka centar;
	private double radijus;
	
	/**
	 * Konstruktor koji prima oba parametra
	 * @param c
	 * @param r
	 */
	
	public Krug(Tacka c, double r){
		centar = c;
		radijus = r;
	}
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public Krug(){
		centar = new Tacka();
		radijus = 1;
	}
	
	/**
	 * Konstruktor za kopiranje
	 * @param k
	 */
	
	public Krug(Krug k){
		this.centar = new Tacka(k.centar);
		this.radijus = k.radijus;
	}
	
	/**
	 * Getter za centar
	 * @return centar
	 */
	
	public Tacka getCentar(){
		return centar;
	}
	
	/**
	 * Getter za radijus
	 * @return radijus
	 */
	
	public double getRadijus(){
		return radijus;
	}
	
	/**
	 * Setter za centar
	 * @param centar
	 */
	
	public void setCentar(Tacka centar){
		this.centar.setX(centar.getX());
		this.centar.setY(centar.getY());
	}
	
	/**
	 * Setter za radijus
	 * @param radijus
	 */
	
	public void setRadijus(double radijus){
		if (radijus < 0){
			throw new IllegalArgumentException("Niste ispravno unijeli radijus!");
		}
		else{
			this.radijus = radijus;
		}
	}
	
	/**
	 * Funkcija koja kreira string sa podacima o objektu
	 */
	
	public String toString(){
		String strKrug = "Centar: " + centar + "\nRadijus: " + radijus;
		return strKrug;
	}
	
	/**
	 * Funkcija koja provjerava da li su dva objekta jednaka
	 * @param k
	 * @return
	 */
	
	public boolean equals(Krug k){
		if (this.centar.getX() == k.centar.getX() && this.centar.getY() == k.centar.getY() && this.radijus == k.radijus){
			return true;
		}
		return false;
	}
	
	/**
	 * Funkcija koja ispituje polozaj tacke u odnosu na krug
	 * @param t
	 * @return 1, 0 || -1
	 */
	
	public int polozajTacke(Tacka t){
		if (t.rastojanje(this.centar) > this.radijus){
			return -1;
		}
		else if (t.rastojanje(this.centar) == this.radijus){
			return 0;
		}
		return 1;
	}
	
	/**
	 * Funkcija koja ispituje da li se dva kruga sijeku
	 * @param k
	 * @return boolean
	 */
	
	public boolean drugiKrug(Krug k){
		double udaljenost = this.centar.rastojanje(k.centar);
		if (udaljenost < this.radijus + k.radijus){
			return true;
		}
		return false;
	}

}
