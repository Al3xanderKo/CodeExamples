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
		beznyUcet.pridajPokutu(terminovanyUcet);

		beznyUcet.zauctujPoplatky(); // 16 euro poplatok z výberu 400/25 = 16 ... 2. riešenie?
										// beznyUcet.zauctujPoplatky(terminovanyUcet.getPokuta())

		// vypiste aktualne zosatky na jednotlivych uctov a ocakavane hodnoty
		System.out.println("Zostatok na beznom ucte: " + beznyUcet.getAktualnyZostatok());
		System.out.println("Ocakavana hodnota: 2004.0"); // 1000 + 2000 - 1500 - 80 + 1000 - 400 = 2020 - 16Eur pokuta z
															// čiastky terminovanyUcet.vyber(400); 400/25=16
		System.out.println("Zostatok na sporiacom ucte: " + sporiaciUcet.getAktualnyZostatok());
		System.out.println("Ocakavana hodnota: 4200.0"); // 10000-2000-1000-3000 = 4000 + 5%(200) = 4200
		System.out.println("Zostatok na terminovanom ucte: " + terminovanyUcet.getAktualnyZostatok());
		System.out.println("Ocakavana hodnota: 2860.0"); // 3000 - 400 = 2600 + 10%(260) = 2860
	}
}