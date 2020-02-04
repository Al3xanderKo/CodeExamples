public class BankoveUctyTester

{
	public static void main(String[] args) {
		SporiaciUcet sporiaciUcet = new SporiaciUcet(5);
		BeznyUcet beznyUcet = new BeznyUcet(1000);
		TerminovanyUcet terminovanyUcet = new TerminovanyUcet(10, 3);

		sporiaciUcet.vloz(10000);

		sporiaciUcet.vlozNaUcet(2000, beznyUcet);

		beznyUcet.vyber(1500);
		beznyUcet.vyber(80);

		sporiaciUcet.vlozNaUcet(1000, beznyUcet);
		beznyUcet.vyber(400);

		sporiaciUcet.vlozNaUcet(3000, terminovanyUcet);
		terminovanyUcet.vyber(400); // netreba zabudnut na pokutu

		// nasimulujte koniec mesiaca
		sporiaciUcet.pripisUrok();
		terminovanyUcet.pripisUrok();
		beznyUcet.pridajPokutu(terminovanyUcet); // laci podarilo sa mi toto zadanie splnit ale musel som si pridať
													// pomocnu funkciu ktorá vyčita pokuty z terminovaneho učtu a
													// prenesie do BeznehoUctu
		// neviem akym spôsobom zauctovatPoplatky bez toho aby som použil metodu
		// .zauctujPoplatky bez konštruktora, takto by som to spravil s konstruktorom
		// beznyUcet.zauctujPoplatky(terminovanyUcet.getPokuta())
		// interface tiež nebol medzi súbormi v zadaní

		beznyUcet.zauctujPoplatky(); // 16 euro poplatok z výberu 400/25 = 16

		// vypiste aktualne zosatky na jednotlivych uctov a ocakavane hodnoty
		System.out.println("Zostatok na beznom ucte: " + beznyUcet.getAktualnyZostatok());
		System.out.println("Ocakavana hodnota: 2004.0");
		System.out.println("Zostatok na sporiacom ucte: " + sporiaciUcet.getAktualnyZostatok());
		System.out.println("Ocakavana hodnota: 4200.0");
		System.out.println("Zostatok na terminovanom ucte: " + terminovanyUcet.getAktualnyZostatok());
		System.out.println("Ocakavana hodnota: 2860.0");
	}
}