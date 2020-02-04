public class BankovyUcetTester {

	public static void main(String[] args) {
		BankovyUcet ucet = new BankovyUcet(100);
		System.out.println("Obsah účtu pred vkladom,výberom alebo zúročením: " + ucet.getAktualnyZostatok());
		ucet.pripisUrok(10);
		System.out.println("Obsah účtu po 10% úročení: " + ucet.getAktualnyZostatok());
		System.out.println("Očakávaný výsledok po 10% úročení: 110 Eur");
	}

}
