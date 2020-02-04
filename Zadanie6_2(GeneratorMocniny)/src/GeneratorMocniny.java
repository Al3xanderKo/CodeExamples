
public class GeneratorMocniny {

	public int mocnina;
	public double cislo;
	public double riadok;

	public GeneratorMocniny(int cislo, int mocnina) {
		this.mocnina = mocnina;
		this.cislo = cislo;

	}

	public double dalsiaMocnina() {

		for (int i = 0; i < mocnina - 1; i++) {
			riadok = Math.pow(cislo, i);
			System.out.printf("%.0f", riadok);
			System.out.println("");

		}

		riadok = riadok * cislo;
		return riadok;

	}

}
