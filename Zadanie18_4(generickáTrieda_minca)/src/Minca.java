public class Minca implements Meratelne {
	double hodnota;
	String nazov;

	public Minca(final double hodnota, final String nazov) {
		this.hodnota = hodnota;
		this.nazov = nazov;
	}

	public String getNazov() {
		return nazov;
	}

	@Override
	public double getHodnota() {
		return this.hodnota;
	}

	@Override
	public String toString() {
		return "Minca [hodnota=" + hodnota + ", nazov=" + nazov + "]";
	}

}