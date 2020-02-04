
public class SporiaciUcet {

	private double aktualnyZostatok;
	private double urokovaSadzba;

	/**
	 * vytvárame sporiaciUcet s nulovym pociatocnym zostatkom
	 * 
	 */
	public SporiaciUcet() {
		aktualnyZostatok = 0;
		urokovaSadzba = 0;

	}

	/**
	 * Vytvara sporiaci ucet s danym pociatocnym zostatkom a urokovou sadzbou
	 * 
	 * @param pociatocnyZostatok
	 * @param novaUrokovaSadzba
	 */
	public SporiaciUcet(double pociatocnyZostatok, double novaUrokovaSadzba) {
		aktualnyZostatok = pociatocnyZostatok;
		urokovaSadzba = novaUrokovaSadzba;
	}

	/**
	 * Vzorček pre výpočet zostatku na účte po pripísanom úročení
	 * 
	 * @param urokovaSadzba nám definuje akými % budeme zostatok úročiť
	 */
	public void pripisUrok() {
		double urok = (aktualnyZostatok / 100) * urokovaSadzba;
		aktualnyZostatok += urok;
	}

	public double getAktualnyZostatok() {
		return aktualnyZostatok;
	}

	/**
	 * getter pre zistenie urokovej sadzby na účte, nebolo to v zadaní ale zo
	 * zvedavosti som si ho doplnil
	 * 
	 * @return
	 */
	public double getUrokovaSadzba() {
		return urokovaSadzba;
	}

}
