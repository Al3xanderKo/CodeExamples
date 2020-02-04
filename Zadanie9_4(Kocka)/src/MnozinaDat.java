
public class MnozinaDat {

	private int pocetPrvkov;
	private double sucet;
	private int cislo;
	private int maximum;
	private int minimum;

	public MnozinaDat() {
		pocetPrvkov = 0;
		sucet = 0;
	}

	public void pridaj(int cislo) {
		this.cislo = cislo;
		if (pocetPrvkov == 0 || cislo > maximum) {
			maximum = cislo;

		}
		if (pocetPrvkov == 0 || cislo < minimum) {
			minimum = cislo;
		}

		this.cislo = cislo;
		sucet += cislo;
		pocetPrvkov++;
	}

	public double getPriemer() {
		return sucet / pocetPrvkov;
	}

	public int getMin() {
		return minimum;
	}

	public int getMax() {
		return maximum;
	}
}
