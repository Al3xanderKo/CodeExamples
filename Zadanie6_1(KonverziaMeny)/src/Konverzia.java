import java.util.Scanner;

public class Konverzia {
	String vstupPouzivatela;
	Double pocetDolarov;
	Scanner vstup = new Scanner(System.in);

	public Konverzia(String vstupPouzivatela) {
		this.vstupPouzivatela = vstupPouzivatela;
	}

	public void getDollars() {
		Double konverziaNaDouble = Double.parseDouble(vstupPouzivatela);
		pocetDolarov = konverziaNaDouble * 1.10;
		System.out.printf(konverziaNaDouble + " EUR -> ");
		System.out.printf("%.2f", pocetDolarov);
		System.out.printf(" $");

	}

}
