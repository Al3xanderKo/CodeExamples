/**
 * Trieda reprezentuje abstrakciu skutocnej mince, t.j. ma nazov a nominalnu
 * hodnotu.
 */
public class Minca {
	private double hodnota;
	private String nazov;

	/**
	 * Vytvara novu mincu s danou hodnotou a nazvom.
	 * 
	 * @param hodnota
	 * @param nazov
	 */
	public Minca(double hodnota, String nazov) {
		this.hodnota = hodnota;
		this.nazov = nazov;
	}

	/**
	 * Vracia hodnotu mince.
	 * 
	 * @return hodnota mince
	 */
	public double getHodnota() {
		return hodnota;
	}

	public void setHodnota(double hodnota) {
		this.hodnota = hodnota;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	/**
	 * Vracia nazov mince
	 * 
	 * @return nazov mince
	 */
	public String getNazov() {
		return nazov;
	}

	/**
	 * Vracia retazcovu reprezentaciu stavu objektu.
	 * 
	 * @return retazcovu reprezentaciu stavu objektu
	 */
	public String toString() {
		return "Minca [hodnota=" + hodnota + ", nazov=" + nazov + "]";
	}
}