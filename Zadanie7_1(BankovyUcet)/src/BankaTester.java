
public class BankaTester {

	public static void main(String[] args) {

		Banka banka = new Banka();

		final int UCET1_ID = 0;
		final int UCET2_ID = 1;
		final int UCET3_ID = 2;
		final int UCET4_ID = 3;

		banka.pridajUcet(UCET1_ID, 0);
		banka.pridajUcet(UCET2_ID, 500);

		banka.vloz(UCET1_ID, 5);
		banka.vyber(UCET2_ID, 500);
		banka.vyber(UCET2_ID, 10);
		banka.vloz(UCET2_ID, 10);
		banka.vyber(UCET2_ID, 5);

		System.out.print("Zostatok na ucte s ID " + UCET1_ID);
		System.out.println(" je " + banka.getAktualnyZostatok(UCET1_ID) + " EUR.");
		System.out.println("Ocakavana hodnota: 1200");

		System.out.print("Zostatok na ucte s ID " + UCET2_ID);
		System.out.println(" je " + banka.getAktualnyZostatok(UCET2_ID) + " EUR.");
		System.out.println("Ocakavana hodnota: 555");

	}
}
