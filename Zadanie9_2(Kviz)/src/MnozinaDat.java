public class MnozinaDat {

	private Kviz maximum, minimum;
	private int pocetPrvkov;
	private int sucet;

	public MnozinaDat() {
		pocetPrvkov = 0;

	}

	public void pridaj(Kviz kviz) {
		if (pocetPrvkov == 0 || kviz.getHodnota() > maximum.getHodnota()) {
			maximum = kviz;

		}
		if (pocetPrvkov == 0 || kviz.getHodnota() < maximum.getHodnota()) {
			minimum = kviz;
		}
		int cislo = kviz.getHodnota();
		sucet += cislo;
		pocetPrvkov++;

	}

	public double getPriemer() {

		return sucet / pocetPrvkov;
	}

	public Kviz getMaximum() {

		return maximum;

	}
}
