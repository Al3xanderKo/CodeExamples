
public class MnozinaDat {

	private int pocetPrvkov;
	private double sucet;
	private int cislo;

	public MnozinaDat() {
		pocetPrvkov = 0;
		sucet = 0;
	}

	public void pridaj(int cislo) {
		this.cislo = cislo;
		sucet += cislo;
		pocetPrvkov++;
	}

	public double getPriemer() {
		return sucet / pocetPrvkov;
	}
}
