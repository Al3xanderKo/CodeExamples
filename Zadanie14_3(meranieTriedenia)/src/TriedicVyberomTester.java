import java.util.Scanner;

public class TriedicVyberomTester {

	public static void main(String[] args) {

		Scanner dolnaHranicaPola = new Scanner(System.in);
		System.out.println("Zadaj dolnu hranicu pola: ");
		int vstupDolnaHranica = dolnaHranicaPola.nextInt();
		Scanner hornaHranicaPola = new Scanner(System.in);
		System.out.println("Zadaj hornu hranicu pola: ");
		int vstupHornaHranica = hornaHranicaPola.nextInt();

		if (vstupDolnaHranica > vstupHornaHranica) {
			System.out.println("Dolna hranica musi byt mensia ako horna!");
			dolnaHranicaPola.close();
			hornaHranicaPola.close();
			return;
		}

		Scanner pocetMerani = new Scanner(System.in);
		System.out.println("Zadaj pocet merani (>=2) : ");
		int vstupPocetMerani = pocetMerani.nextInt();

		if (vstupPocetMerani < 2) {
			System.out.println("Pocet merani musi byt vacsi ako 2 !");
			dolnaHranicaPola.close();
			hornaHranicaPola.close();
			pocetMerani.close();
			return;
		}

		int skokMerania = (vstupHornaHranica - vstupDolnaHranica) / vstupPocetMerani;

		System.out.println("Pocet merani: " + vstupPocetMerani + " so skokom: " + skokMerania
				+ " od dolnej hranice pola: " + vstupDolnaHranica);
		System.out.println("(Program vzdy vypocita dlzku zoradovania najmensieho pola, t.j pocet merani +1)");
		System.out.println("");

		Stopky casovac = new Stopky();
		for (int i = vstupDolnaHranica; i <= vstupHornaHranica; i += skokMerania) {

			int[] data = PoleUtil.vygenerujPoleCisel(i, 100);
			System.out.println("Vytvaram a triedim pole s rozsahom od [0] do [" + i + "]");
			TriedicVyberom triedic = new TriedicVyberom(data);
			casovac.start();
			triedic.zotried();
			casovac.stop();
			// System.out.println("Zotriedene pole: "+Arrays.toString(data));
			System.out.println("n: " + i + " Cas behu programu triedic.zotried(): " + casovac.getUplynulyCas() + " ms");

		}
		dolnaHranicaPola.close();
		hornaHranicaPola.close();
		pocetMerani.close();

	}

}