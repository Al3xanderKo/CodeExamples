
/**
   Program kopiruje obsah jedneho suboru do ineho suboru.
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class KopirovacSuborov {
	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 2) {
			System.out.println("Pouzitie: KopirovacSuborov data.txt zaloha_dat.txt");
			return;
		}
		String nazovVstupnySubor = args[0];
		String nazovZaloznySubor = args[1];

		PrintWriter vyslednySubor = new PrintWriter(nazovZaloznySubor); // budeme zapisovat do nazvu args[1]
		FileReader citacSuboru = new FileReader(nazovVstupnySubor);
		Scanner vstupneData = new Scanner(citacSuboru);
		String obsahVstupu = "";
		while (vstupneData.hasNextLine()) {
			String riadok = vstupneData.nextLine();
			obsahVstupu += riadok + "\n";
		}

		vyslednySubor.println(obsahVstupu);
		vyslednySubor.flush(); // vlozime obsah suboru do vysledneho suboru
		vstupneData.close();
		vyslednySubor.close();

	}
}
