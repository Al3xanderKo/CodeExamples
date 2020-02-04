
public class Karta {
	String skratka;
	String cislo;
	String typ;
	String cisloVystup;
	String typVystup;

	public Karta(String skratka) {
		this.skratka = skratka;
	}

	public String getPopis() {
		// Povolujem dĺžku reťazca s 2 alebo 3 znakmi.
		int dlzkaRetazca = skratka.length();

		if (dlzkaRetazca == 3) {
			// ak je dlžka retazca 3 čislo bude na 1 a 2 pozicií
			cislo = skratka.substring(0, 2);
			typ = skratka.substring(2, 3);
		} else if (dlzkaRetazca == 2) {
			// ak je dlžka retazca 2 čislo bude na 1 pozicií
			cislo = skratka.substring(0, 1);
			typ = skratka.substring(1, 2);
		} else {
			// použili sme dlhší reťazec než je povolený
			System.out.println("Zadal si neplatný reťazec !");
			// vytvorenie neplatnych premenných aby program neskončil v chybe
			// Exception in thread "main" java.lang.NullPointerException
			// at Karta.getPopis(Karta.java:30)
			// at ZobrazovacKarty.main(ZobrazovacKarty.java:15)
			cislo = "999";
			typ = "X";
		}

		switch (cislo) {
		case "1":
			cisloVystup = "Jednotka ";
			break;
		case "2":
			cisloVystup = "Dvojka ";
			break;
		case "3":
			cisloVystup = "Trojka ";
			break;
		case "4":
			cisloVystup = "Štvorka ";
			break;
		case "5":
			cisloVystup = "Päťka ";
			break;
		case "6":
			cisloVystup = "Šestka ";
			break;
		case "7":
			cisloVystup = "Sedmička ";
			break;
		case "8":
			cisloVystup = "Osmička ";
			break;
		case "9":
			cisloVystup = "Deviatka ";
			break;
		case "10":
			cisloVystup = "Desina ";
			break;
		case "999":
			cisloVystup = "Neznáma ";
			break;
		default:
			cisloVystup = "X";

		}
		switch (typ) {
		case "E":
			typVystup = "Eso";
			break;
		case "K":
			typVystup = "Kráľ";
			break;
		case "H":
			typVystup = "Horník";
			break;
		case "D":
			typVystup = "Dolník";
			break;
		case "G":
			typVystup = "Guľová/ý";
			break;
		case "M":
			typVystup = "Maková/ý";
			break;
		case "Z":
			typVystup = "Zelená/ý";
			break;
		case "Č":
			typVystup = "Červená/ý";
			break;
		case "X":
			typVystup = "karta!";
			break;
		default:
			typVystup = "X";

		}
		if (typVystup == "X" || cisloVystup == "X") {
			return "Neznáma karta!";
		} else {
			return cisloVystup + typVystup;
		}

	}
}
