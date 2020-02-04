/**
 * Trieda Osoba reprezentuje osoby obsahujuce meno a vysku.
 */
public class Osoba {
	private String meno;
	private double vyska;

	/**
	 * Vytvara novu osobu s danym menom a vyskou.
	 * 
	 * @param meno  meno osoby
	 * @param vyska vyska osoby
	 */
	public Osoba(String meno, double vyska) {
		this.meno = meno;
		this.vyska = vyska;
	}

	/**
	 * Vrati meno osoby.
	 * 
	 * @return meno osoby
	 */
	public String getMeno() {
		return this.meno;
	}

	/**
	 * Vrati vysku osoby.
	 */
	public double getVyska() {
		return this.vyska;
	}
}

/**
 * Program sluzi na test merania objektov typu Osoba.
 */
