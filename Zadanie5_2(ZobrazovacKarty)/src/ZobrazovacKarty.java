import java.util.Scanner;

/**
 * Trieda sluzi ako testovacia trieda pre triedu Karta, ktora nam poskytne plny
 * popis karty.
 */
public class ZobrazovacKarty {
	public static void main(String[] args) {
		Scanner vstup = new Scanner(System.in);

		System.out.println("Zadaj skrateny zapis karty: ");
		String skratka = vstup.nextLine();
		Karta karta = new Karta(skratka);
		System.out.println(karta.getPopis());
		vstup.close();
	}
}