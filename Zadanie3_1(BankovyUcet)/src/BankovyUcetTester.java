public class BankovyUcetTester {

	public static void main(String[] args) {
		BankovyUcet ucet = new BankovyUcet();
		System.out.println("Obsah účtu pred vkladom / výberom: " + ucet.getAktualnyZostatok());
		ucet.vloz(2000);
		System.out.println(
				"Predpokladaný stav po vložení 2000 Eur -> 2000 / reálny zostatok: " + ucet.getAktualnyZostatok());

		ucet.vyber(1000);
		System.out.println(
				"Predpokladaný stav po vybratí 1000 Eur -> 1000 / reálny zostatok: " + ucet.getAktualnyZostatok());

	}

}
