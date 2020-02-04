import java.util.Scanner;

public class KonverziaTester {

	public static void main(String[] args) {
		String koniec = "k";
		System.out.println("Aktuálny kurz Eura voči USD: 1EUR = 1.10$ ");
		Scanner vstup = new Scanner(System.in);

		System.out.println("Kolko eur si žiadate zameniť? ");
		String vstupPouzivatela = vstup.nextLine();
		while (!vstupPouzivatela.equalsIgnoreCase(koniec)) {
			Konverzia konverzia = new Konverzia(vstupPouzivatela);
			konverzia.getDollars();
			System.out.println("\nKolko EUR si želáte zameniť?:");
			vstupPouzivatela = vstup.nextLine();

		}

		vstup.close();
	}

}
