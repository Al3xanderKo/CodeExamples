
public class BankaTester {

	public static void main(String[] args) {

		Banka banka = new Banka();

		final int UCET1_ID = 0;
		final int UCET2_ID = 1;
//        final int UCET3_ID = 2;
//        final int UCET4_ID = 3;

		banka.pridajUcet(UCET1_ID, 0);
		banka.pridajUcet(UCET2_ID, 10);

		banka.vloz(UCET1_ID, 0); // test vlozenia 0 pomocou vloz
		banka.vyber(UCET2_ID, 12); // test vybrania ciastky vacsej nez je aktualny zostatok
		banka.vyber(UCET2_ID, 0); // test vlozenia 0 pomocou vyberu

		banka.vloz(UCET2_ID, 10);// test overenia pôvodnej funkčnosti metód vloz a vyber
		banka.vyber(UCET2_ID, 5);
		banka.vloz(UCET1_ID, 5);
		banka.vyber(UCET1_ID, 2);

		System.out.print("Zostatok na ucte s ID " + UCET1_ID);
		System.out.println(" je " + banka.getAktualnyZostatok(UCET1_ID) + " EUR.");
		System.out.println("Ocakavana hodnota: 3");

		System.out.print("Zostatok na ucte s ID " + UCET2_ID);
		System.out.println(" je " + banka.getAktualnyZostatok(UCET2_ID) + " EUR.");
		System.out.println("Ocakavana hodnota: 15");

	}
}
