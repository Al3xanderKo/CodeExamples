public class SporiaciUcetTester {
	public static void main(String[] args) {
		SporiaciUcet sporiaciUcet = new SporiaciUcet(500, 10);

		System.out.println("Obsah účtu: " + sporiaciUcet.getAktualnyZostatok() + " EUR, so sadzbou úročenia: "
				+ sporiaciUcet.getUrokovaSadzba() + "%");
		sporiaciUcet.pripisUrok();
		System.out.println("Predpokladaný nárast o 50 EUR, výsledný zostatok účtu 550 EUR");
		System.out.println("Vypočítaný zostatok účtu: " + sporiaciUcet.getAktualnyZostatok() + " EUR");
		sporiaciUcet.pripisUrok();
		System.out.println("Predpokladaný nárast o 55 EUR, výsledný zostatok účtu 605 EUR");
		System.out.println("Vypočítaný zostatok účtu: " + sporiaciUcet.getAktualnyZostatok() + " EUR");
		sporiaciUcet.pripisUrok();
		System.out.println("Predpokladaný nárast o 60.5 EUR, výsledný zostatok účtu 665.5 EUR");
		System.out.println("Vypočítaný zostatok účtu: " + sporiaciUcet.getAktualnyZostatok() + " EUR");
		sporiaciUcet.pripisUrok();
		System.out.println("Predpokladaný nárast o 66.55 EUR, výsledný zostatok účtu 732.05 EUR");
		System.out.println("Vypočítaný zostatok účtu: " + sporiaciUcet.getAktualnyZostatok() + " EUR");
	}
}