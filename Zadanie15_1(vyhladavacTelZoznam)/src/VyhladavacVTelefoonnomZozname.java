import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/* 
 * Testovacie data by sa v subore mali nachadzat v nasledovnom formate
 * 
 * Peter Novak
 * 0906 255 658
 * Emil Horvath
 * 0902 145 786
 * Katka Mala
 * 02 458 56585
 * Igor Kovac
 * 0910 254 455
 * . . .
 */
public class VyhladavacVTelefoonnomZozname {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner vstup = new Scanner(System.in);
		System.out.println("Zadaj nazov telefonneho zoznamu: ");
		String nazovSuboru = vstup.nextLine();

		VyhladavaciaTabulka tabulka = new VyhladavaciaTabulka();
		FileReader citac = new FileReader(nazovSuboru);
		tabulka.nacitaj(new Scanner(citac));

		boolean koniec = false;

		while (!koniec) {
			System.out.println("Vyhladaj podla M)ena, T)elefonneho cisla, K)oniec:");
			String volba = vstup.nextLine();

			if (volba.equalsIgnoreCase("K")) {
				koniec = true;
			} else if (volba.equalsIgnoreCase("M")) {
				System.out.println("Zadaj meno: ");
				String meno = vstup.nextLine();
				System.out.println("Telefonne cislo: " + tabulka.vyhladajMeno(meno));
			} else if (volba.equalsIgnoreCase("T")) {
				System.out.println("Zadaj telefonne cislo: ");
				String telefon = vstup.nextLine();
				System.out.println("Meno: " + tabulka.vyhladajCislo(telefon));
			}
		}
	}
}