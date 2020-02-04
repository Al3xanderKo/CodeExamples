import java.util.Arrays;

public class TriedicVyberomTester {

	public static void main(String[] args) {
		Minca[] mince = { new Minca(0.05, "Patcentovka"), new Minca(0.05, "Patcentovka"), new Minca(1, "Eurovka"),
				new Minca(0.02, "Dvojcentovka"), new Minca(0.50, "Patdesiatcentovka") };

		TriedicVyberom triedic = new TriedicVyberom(mince);
		triedic.zotried();

		System.out.println(Arrays.toString(mince));
		System.out.println("Ocakavany vysledok: [Minca[hodnota=0.02,nazov=Dvojcentovka],"
				+ "[Minca[hodnota=0.05,nazov=Patcentovka], [Minca[hodnota=0.05,nazov=Patcentovka],"
				+ "[Minca[hodnota=0.50,nazov=Patdesiatcentovka], [Minca[hodnota=1.0,nazov=Eurovka]]");
	}
}