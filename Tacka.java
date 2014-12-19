
public class Tacka {
	
	private double x;
	private double y;
	
	/**
	 * Konstruktor koji prima oba parametra
	 * @param x1
	 * @param y1
	 */
	
	public Tacka(double x1, double y1){
		x = x1;
		y = y1;
	}
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public Tacka(){
		x = 0;
		y = 0;
	}
	
	/**
	 * Konstruktor za kopiranje
	 * @param t
	 */
	
	public Tacka(Tacka t){
		this.x = t.x;
		this.y = t.y;
	}
	
	/**
	 * Getter za x
	 * @return x
	 */
	
	public double getX(){
		return x;
	}
	
	/**
	 * Getter za y
	 * @return y
	 */
	
	public double getY(){
		return y;
	}
	
	/**
	 * Setter za x
	 */
	
	public void setX(double x){
		this.x = x;
	}
	
	/**
	 * Setter za y
	 */
	
	public void setY(double y){
		this.y = y;
	}
	
	/**
	 * Fukcija koja kreira string sa podacima o objektu
	 */
	
	public String toString(){
		String strTacka = "X = " + x + ", Y = " + y;
		return strTacka;
	}
	
	/**
	 * Funkcija koja projerava da li su dva objekta jednaka
	 * @param t
	 * @return
	 */
	
	public boolean equals(Tacka t){
		if (this.x == t.x && this.y == t.y){
			return true;
		}
		return false;
	}
	
	/**
	 * Funkcija koja racuna rastojanje izmedju dvije tacke
	 * @param t
	 * @return
	 */
	
	public double rastojanje(Tacka t){
		double udaljenost = 0;
		udaljenost = Math.sqrt(Math.pow(this.x-t.x, 2) + Math.pow(this.y-t.y, 2));
		return udaljenost;
	}
	

}
