
/**
 * Trieda Osoba reprezentuje osoby obsahujuce meno a vysku.
 */
public class Osoba {
	private String meno;

	/**
	 * Vytvara novu osobu s danym menom a vyskou.
	 * 
	 * @param meno  meno osoby
	 * @param vyska vyska osoby
	 */
	public Osoba(String meno) {
		this.meno = meno;

	}

	public String getMeno() {
		return this.meno;
	}

	@Override
	public String toString() {
		return "Osoba [meno = " + meno + "]";
	}

}
