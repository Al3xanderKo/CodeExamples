//Vytvorte triedu Osoba, ktorá bude implementovať rozhranie Comparable. Jednotlivé osoby porovnávajte na základe ich mien. Požiadajte používateľa, 
//aby zadal 10 mien a následne vytvorte 10 objektov typu Osoba. 
//Pomocou metódy compareTo() získajte prvú a poslednú osobu zo zotriedeného 
//zoznamu osob a následne tieto osoby vypíšte na štandardný výstup.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Trieda testuje triedu Osoba.
 */
public class OsobyDemo {
	public static void main(String[] args) {

		Scanner vstup = new Scanner(System.in);

		boolean ukonceneNacitavanie = false;

		ArrayList<Osoba> osoby = new ArrayList<Osoba>();

		while (!ukonceneNacitavanie) {
			System.out.println("Prosím zadaj meno osoby alebo prázdny riadok na ukončenie:");
			String meno = vstup.nextLine();

			if (meno.equals("")) {
				ukonceneNacitavanie = true;
			} else {

				Osoba osoba = new Osoba(meno);
				osoby.add(new Osoba(meno));
				System.out.println(osoba);
				Collections.sort(osoby, new PorovnavacOsob());

			}

		}
		vstup.close();
		System.out.println("Zoradene osoby: " + osoby);
		System.out.println("Prva osoba: " + osoby.get(0));
		System.out.println("Posledna osoba: " + osoby.get(osoby.size() - 1));

	}
}