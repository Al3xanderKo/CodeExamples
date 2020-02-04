
public class BankovyUcet {

	private double aktualnyZostatok;

	public BankovyUcet() {
		aktualnyZostatok = 0;
	}

	public BankovyUcet(double pociatocnyZostatok) {
		aktualnyZostatok = pociatocnyZostatok;
	}

	public void vyber(double ciastka) {

		double novyZostatok = aktualnyZostatok - ciastka;
		aktualnyZostatok = novyZostatok;
	}

	public void vloz(double ciastka) {
		double novyZostatok = aktualnyZostatok + ciastka;
		aktualnyZostatok = novyZostatok;
	}

	public double getAktualnyZostatok() {
		return aktualnyZostatok;
	}

}
