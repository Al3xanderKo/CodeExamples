public class Eur {

	String nazovEur = "";
	double hodnotaEur = 0;

	public Eur(double hodnotaEur, String nazovEur) {
		this.hodnotaEur = hodnotaEur;
		this.nazovEur = nazovEur;

	}

	// getter pre ziskanie double hodnoty pre budúci výpočet int pocetMinci *
	// hodnotaMince
	public double getHodnotaEur() {
		return hodnotaEur;
	}

	public String getNazovEur() {
		return nazovEur;
	}

}