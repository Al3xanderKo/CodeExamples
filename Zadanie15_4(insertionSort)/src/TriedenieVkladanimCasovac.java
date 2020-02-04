import java.util.Arrays;
import java.util.Scanner;

/**
 * Program testuje algoritmus triedenia vkladanim, ktory triedi pole nahodne
 * vygenerovanych cisel.
 */
public class TriedenieVkladanimCasovac {
	public static void main(String[] args) {
		Scanner vstup = new Scanner(System.in);
		System.out.print("Zadaj velkost pola: ");
		int velkost = vstup.nextInt();

		// vytvorime pole a naplnime ho nahodne vygenerovanym cislami
		int[] pole = PoleUtil.vygenerujPoleCisel(velkost, 100);
		TriedicVkladanim triedic = new TriedicVkladanim(pole);

		// pouzite triedu Stopky na meranie vykonnosti algoritmu
		Stopky stopky = new Stopky();

		stopky.start();
		triedic.zotried();
		stopky.stop();

		System.out.println("Uplynuly cas: " + stopky.getUplynulyCas() + " milisekund");
		vstup.close();
	}
}