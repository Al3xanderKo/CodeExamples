
public class Zamestnanec {
	// inicializačne premenné meno a plat;
	private String meno;
	private double plat;

	// parametrický konštruktor Zamestnanec
	public Zamestnanec(String meno, double plat) {
		this.meno = meno;
		this.plat = plat;
	}

	/**
	 * getter pre získanie zamestnancového mena
	 * 
	 * @return
	 */
	public String getMeno() {

		return this.meno;
	}

	/**
	 * getter pre získanie zamestnancového platu
	 * 
	 * @return
	 */
	public double getPlat() {

		return this.plat;
	}

	/**
	 * metoda so vzorcom na výpočet % nárastu platu
	 * 
	 * @param navysenie
	 */
	public void navysPlat(double navysenie) {
		navysenie = (this.plat / 100) * navysenie;
		this.plat += navysenie;
	}

}
