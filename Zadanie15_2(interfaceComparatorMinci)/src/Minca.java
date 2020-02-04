/**
 * Minca obsahuje nazov a hodnotu.
 */
public class Minca {
	private double hodnota;
	private String nazov;

	/**
	 * Vytvara novu mincu.
	 * 
	 * @param hodnota hodnota mince
	 * @param nazov   nazov mince
	 */
	public Minca(double hodnota, String nazov) {
		this.hodnota = hodnota;
		this.nazov = nazov;
	}

	/**
	 * Vracia hodnotu mince.
	 * 
	 * @return hodnotu mince
	 */
	public double getHodnota() {
		return hodnota;
	}

	/**
	 * Vracia nazov mince.
	 * 
	 * @return nazov mince
	 */
	public String getNazov() {
		return nazov;
	}

	/**
	 * Vracia retazvovu reprezentaciu mince.
	 * 
	 * @return retazcovu reprezetanciu mince
	 */
	public String toString() {
		return "Minca[hodnota=" + hodnota + ",nazov=" + nazov + "]";
	}
}