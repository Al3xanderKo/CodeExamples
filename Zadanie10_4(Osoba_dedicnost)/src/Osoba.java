/**
 * Trieda Osoba reprezentuje osoby obsahujuce meno a vysku.
 */
public class Osoba {
	private String meno;
	private double datumNarodenia;

	/**
	 * Vytvara novu osobu s danym menom a vyskou.
	 * 
	 * @param meno  meno osoby
	 * @param vyska vyska osoby
	 */
	public Osoba(String meno, double datumNarodenia) {
		this.meno = meno;
		this.datumNarodenia = datumNarodenia;
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
	public double getDatumNarodenia() {
		return this.datumNarodenia;
	}

	@Override
	public String toString() {
		return "Osoba [meno=" + meno + ", datumNarodenia=" + datumNarodenia + "]";
	}
}
