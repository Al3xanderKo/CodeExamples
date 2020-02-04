
public class SporiaciUcet {

	private double aktualnyZostatok;
	private double urokovaSadzba;
	private double minZostatok;

	/**
	 * vytvárame sporiaciUcet s nulovym pociatocnym zostatkom
	 * 
	 */
	public SporiaciUcet() {
		aktualnyZostatok = 0;
		urokovaSadzba = 0;
		minZostatok = 0;

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

	public SporiaciUcet(double novaUrokovaSadzba) {

		urokovaSadzba = novaUrokovaSadzba;
	}

	/**
	 * Vzorček pre výpočet zostatku na účte po pripísanom úročení
	 * 
	 * @param urokovaSadzba nám definuje akými % budeme zostatok úročiť
	 */
	public void pripisUrok() {

		if (minZostatok == 0.0) {
			double urok = (aktualnyZostatok / 100) * urokovaSadzba;
			aktualnyZostatok += urok;
		} else {
			double urok = (minZostatok / 100) * urokovaSadzba;
			aktualnyZostatok += urok;

		}
	}

	public void vyber(double ciastka)

	{
		if (ciastka > 0) {

			aktualnyZostatok -= ciastka;
			minZostatok = aktualnyZostatok;
		} else {
			System.out.println("Čiastka musí byť vačšia ako 0 ! ");
		}

	}

	public void vloz(double ciastka) {

		if (ciastka > 0) {
			aktualnyZostatok += ciastka;
		} else {
			System.out.println("Čiastka musí byť vačšia ako 0 ! ");
		}

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
