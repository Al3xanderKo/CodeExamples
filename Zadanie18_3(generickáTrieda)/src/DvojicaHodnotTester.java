//Implementujte statickú generickú metódu DvojicaHodnotUtil.vymenHodnotyParametrov(),
//ktorá bude prijímať  ako parameter objekt typu DvojicaHodnot, ktorý prislúcha ku generickej 
//triede podobnej akú ste implementovali v  predchádzajúcich zadaniach. Rozdiel spočíva len v tom, že v 
//aktuálnej implmenetácií triedy DvojicaHodnot bude  možné pracovať s atribútmi rôznych typov.

public class DvojicaHodnotTester {
	public static void main(String[] args) {
		Dvojica<String, Integer> dvojica = new Dvojica<String, Integer>("Programovanie nas bavi", 22);
		Dvojica<Integer, String> dvojicaSVymenenymiHodnotami = Dvojica.vymenHodnotyParametrov(dvojica);
		System.out.println("Prvy prvok: " + dvojicaSVymenenymiHodnotami.getPrvy());
		System.out.println("Ocakavana hodnota: 22");
		System.out.println("Druhy prvok: " + dvojicaSVymenenymiHodnotami.getDruhy());
		System.out.println("Ocakavana hodnota: Programovanie nas bavi");
	}

}
