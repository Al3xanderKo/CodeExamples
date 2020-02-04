public class ZobrazovacMena {

	public static void main(String[] args) {

		// 1.Spôsob -> Podľa mna prehladnejší zápis
		String VrchnyOddelovac = "+----------------+" + "\n";
		String SpodnyOddelovac = "\n" + "+----------------+";
		String OhranicenieMena = "|";
		String MenoPriezvisko = "Alexander Kocian";
		String OhranicMeno = VrchnyOddelovac + OhranicenieMena + MenoPriezvisko + OhranicenieMena + SpodnyOddelovac;
		System.out.println("1. Spôsob\n" + OhranicMeno);
		// Koniec 1.Spôsobu

		// 2.Spôsob -> Rychlejší spôsob zápisu
		System.out.println(
				"2. Spôsob\n" + "+----------------+" + "\n" + "|Alexander Kocian|" + "\n" + "+----------------+");
		// Koniec 2.Spôsobu
	}
}
