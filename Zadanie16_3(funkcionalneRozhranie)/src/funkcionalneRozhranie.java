
public class funkcionalneRozhranie {
//3.vytvorte testovaciu  triedu obsahujúcu metódu main()
	public static void main(String[] args) {
		funkcionalneRozhranie rozhranie = new funkcionalneRozhranie();
		// 4.naimplementujte lambda výraz, ktorý prijíma 2 celé čísla a vráti väčšie z
		// nich
		dveCisla lambda = (int a, int b) -> {
			int vacsie = a > b ? a : b;
			return vacsie;

		};
		// testovanie programu
		System.out.println("1.test");
		rozhranie.prijmyParameter(lambda, 6, 7);
		System.out.println("2.test");
		rozhranie.prijmyParameter(lambda, 19, 7);
		System.out.println("3.test");
		rozhranie.prijmyParameter(lambda, 6, 10);
		System.out.println("4.test");
		rozhranie.prijmyParameter(lambda, 4, 11);

	}

	// 5.vytvorte inštančnú metódu, ktorá príjme parameter typu vašej funkcionálne
	// rozhranie
	public void prijmyParameter(dveCisla dvecisla, int a, int b) {
		System.out.println(
				"Najdi vacsie cislo z dvojice: " + a + " a " + b + " -> vacsie cislo je " + dvecisla.prijmiCisla(a, b));
	}

}

//1.vytvorte funkcionálne rozhranie ľubovoľného názvu
interface dveCisla {

//2.v rámci tohto rozhrania vytvorte abstraktnú metódu, ktorá prijíma 2 celočíselné parametere a vracia celé číslo
	public int prijmiCisla(int a, int b);

}
