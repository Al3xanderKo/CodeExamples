//vytvorenie triedy Minca s konštruktormi nazovMince a hodnotaMince
public class Minca {

	String nazovMince = "";
	double hodnotaMince = 0;

	public Minca(String nazovMince, double hodnotaMince) {
		this.nazovMince = nazovMince;
		this.hodnotaMince = hodnotaMince;

	}

// getter pre ziskanie double hodnoty pre budúci výpočet int pocetMinci * hodnotaMince
	public double getHodnotaMince() {
		return hodnotaMince;
	}

}
