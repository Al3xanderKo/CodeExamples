public class BeznyUcet {

	private double aktualnyZostatok;
	private double pokuta;

	public void pridajPokutu(TerminovanyUcet terminovanyucet) {
		pokuta = terminovanyucet.getPokuta();
	}

	public BeznyUcet() {
		aktualnyZostatok = 0;
	}

	public BeznyUcet(double pociatocnyZostatok) {

		aktualnyZostatok = pociatocnyZostatok;
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

	public void vyber(double ciastka) {
//		 assercie na kontrolu či su splnené podmienky pre parametr ciastka		
//		 assert ciastka > 0 : "Čiastka musí byť vačšia ako 0 ! "; 
//		 assert ciastka <= this.aktualnyZostatok : "Čiastka je väčšia ako aktuálny zostatok ! ";
		if ((ciastka > 0) && (aktualnyZostatok > ciastka)) {
			aktualnyZostatok -= ciastka;
		} else {
			System.out.println("Čiastka musí byť vačšia ako nula alebo máš nedostatok prostriedkov");
		}
	}

	public double getAktualnyZostatok() {
		return aktualnyZostatok;
	}

	@Override
	public String toString() {
		return "BankovyUcet [aktualnyZostatok=" + aktualnyZostatok + " ]";
	}

	public void zauctujPoplatky() {
		aktualnyZostatok -= pokuta;
	}
}
