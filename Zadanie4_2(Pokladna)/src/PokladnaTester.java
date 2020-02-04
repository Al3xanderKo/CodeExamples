
public class PokladnaTester {

	public static void main(String[] args) {
		Pokladna pokladna = new Pokladna();

		// naskenujeme 4 rožky, kazdy rozok stoji 0.05Eur, chlieb 1.65Eur, mlieko stoji
		// 2.00Eur, tesco taska 0.08Eur
		// PRVY NAKUP
		System.out.println("------------------- PRVY NAKUP -------------------");
		pokladna.naskenujRozky(11);
		pokladna.naskenujMlieko(10);

		System.out.println("Celkova suma naskenovanych tovarov bez formatovania: "
				+ pokladna.getCelkovaSumaNaskenovanychTovarov());
		System.out.printf("Celkova suma naskenovanych tovarov s formatovanim: [%4.2f]%n",
				pokladna.getCelkovaSumaNaskenovanychTovarov());
		System.out.println("Ocakavana naskenovana hodnota 20.55");

		// pokladna.prijatHotovost(20, 2, 0, 0, 0, 0, 0);
		pokladna.prijmyEura(20);
		pokladna.prijmy50Centovky(2);
		System.out.println("Celkom položiek v košíku: " + pokladna.getPocetTovarov());
		System.out.println("Ocakavana prijata suma 21 EUR");
		System.out.println("Celkova suma prijatych penazi od zakaznika: " + pokladna.getSumaPenaziPrijataOdZakaznika());
		double vydavok = pokladna.vydajVydavok();
		System.out.println("Vydavok bez formatovania:" + vydavok);
		System.out.printf("Vydavok s formatovanim: [%4.2f]%n", vydavok);
		System.out.println("---------------KONIEC PRVEHO NAKUPU----------------");
		System.out.println("------------------- DRUHY NAKUP -------------------");
		pokladna.ukonciNakup();
		// test vynulovania celkovej sumy, prijatych penazi a pocet tovaru
		System.out.println("PocetTovarov: " + pokladna.getPocetTovarov());
		System.out.println("Cena: " + pokladna.getCelkovaSumaNaskenovanychTovarov());
		System.out.println("Prijate od zakaznika: " + pokladna.getSumaPenaziPrijataOdZakaznika());

	}

}
