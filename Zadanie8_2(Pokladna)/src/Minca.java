//vytvorenie triedy Minca s konštruktormi nazovMince a hodnotaMince
public class Minca {

	String nazovMince = "";
	double hodnotaMince = 0;

	public Minca(double hodnotaMince, String nazovMince) {
		this.hodnotaMince = hodnotaMince;
		this.nazovMince = nazovMince;

	}

	// getter pre ziskanie double hodnoty pre výpočet int pocetMinci * hodnotaMince
	public double getHodnotaMince() {
		return hodnotaMince;
	}

	public String getNazov() {
		return nazovMince;
	}

}
