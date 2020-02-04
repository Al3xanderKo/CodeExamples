public class MnozinaDat {

	private Osoba maximum, minimum;
	private int pocetPrvkov;
	private int sucet;

	public MnozinaDat() {
		pocetPrvkov = 0;

	}

	public void pridaj(Osoba osoba) {
		if (pocetPrvkov == 0 || osoba.getVyska() > maximum.getVyska()) {
			maximum = osoba;

		}
		if (pocetPrvkov == 0 || osoba.getVyska() < maximum.getVyska()) {
			minimum = osoba;
		}
		double cislo = osoba.getVyska();
		sucet += cislo;
		pocetPrvkov++;

	}

	public double getPriemer() {

		return sucet / pocetPrvkov;
	}

	public Osoba getMaxVyska() {

		return maximum;

	}
}
