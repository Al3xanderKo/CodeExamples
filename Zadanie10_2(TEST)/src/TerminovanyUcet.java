
public class TerminovanyUcet {

	private double aktualnyZostatok;
	private double urokovaSadzba;
	private double mesiaceViazanosti;
	private double pokuta;

	/**
	 * vytvárame sporiaciUcet s nulovym pociatocnym zostatkom
	 * 
	 */
	public TerminovanyUcet() {
		aktualnyZostatok = 0;
		urokovaSadzba = 0;
		pokuta = 0;

	}

	/**
	 * Vytvara sporiaci ucet s danym pociatocnym zostatkom a urokovou sadzbou
	 * 
	 * @param pociatocnyZostatok
	 * @param novaUrokovaSadzba
	 */
	public TerminovanyUcet(double novaUrokovaSadzba, double noveMesiaceViazanosti) {
		urokovaSadzba = novaUrokovaSadzba;
		mesiaceViazanosti = noveMesiaceViazanosti;
	}

	/**
	 * Vzorček pre výpočet zostatku na účte po pripísanom úročení
	 * 
	 * @param urokovaSadzba nám definuje akými % budeme zostatok úročiť
	 */
	public void pripisUrok() {

		double urok = (aktualnyZostatok / 100) * urokovaSadzba;
		aktualnyZostatok += urok;
		mesiaceViazanosti--;
	}

	public void vyber(double ciastka)

	{
		if (ciastka > 0) {

			if (mesiaceViazanosti > 0) {
				pokuta = ciastka / 25;
				aktualnyZostatok -= ciastka;
			} else {
				aktualnyZostatok -= ciastka;
			}

		} else {
			System.out.println("Čiastka musí byť vačšia ako 0 ! ");
		}

	}

	// getter pre ziskanie pokuty k bežnemu učtu
	public double getPokuta() {
		return pokuta;
	}

	public void vloz(double ciastka) {
// 		assercie na kontrolu či su splnené podmienky pre parametr ciastka	
//		assert ciastka > 0 : "Čiastka musí byť vačšia ako 0 ! "; 
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
