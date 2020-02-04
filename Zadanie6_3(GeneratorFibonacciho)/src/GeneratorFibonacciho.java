
public class GeneratorFibonacciho {
	double c1 = 0;
	double c2 = 1;
	double c3;

	public double ntaPostupnost;

	public GeneratorFibonacciho(double ntaPostupnost) {
		this.ntaPostupnost = ntaPostupnost;
	}

	/**
	 * zadefinovali sme si prve 2 cisla c1 a c2, c3 nasledovne vypočitame a pomocou
	 * cyklu for zistujeme hodnotu nami zadaneho člena
	 * 
	 * @return vráti hodnotu nami zadaneho člena
	 */
	public double vypisPostupnost() {
		System.out.println("0. člen postupnosti má hodnotu: " + String.format("%.0f", c1));
		System.out.println("1. člen postupnosti má hodnotu: " + String.format("%.0f", c2));
		for (int i = 1; i < ntaPostupnost; i++) {
			c3 = c2 + c1;
			c1 = c2;
			c2 = c3;
			System.out.printf(i + 1 + ". člen postupnosti má hodnotu: " + String.format("%.0f", c3) + "\n");

		}
		System.out.printf("Nami zadaný " + String.format("%.0f", ntaPostupnost) + ". člen postupnosti má hodnotu: ");
		return c3;

	}

}
