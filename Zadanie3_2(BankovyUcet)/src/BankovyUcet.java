
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

	/**
	 * Vzorček pre výpočet zostatku na účte po pripísanom úročení
	 * 
	 * @param urokovaSadzba nám definuje akými % budeme zostatok úročiť
	 */
	public void pripisUrok(double urokovaSadzba) {
		double zurocenie = (aktualnyZostatok / 100) * (urokovaSadzba);
		aktualnyZostatok += zurocenie;
	}

	public double getAktualnyZostatok() {
		return aktualnyZostatok;
	}

}
