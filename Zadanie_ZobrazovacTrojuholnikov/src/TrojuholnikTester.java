
public class TrojuholnikTester {

	public static void main(String[] args) {
		final String VYKRESLOVACI_ZNAK1 = "a";
		final String VYKRESLOVACI_ZNAK2 = "b";
		final String VYKRESLOVACI_ZNAK3 = "c";
		final String VYKRESLOVACI_ZNAK4 = "d";
		Trojuholnik trojuholnik = new Trojuholnik(7, VYKRESLOVACI_ZNAK1, 1);
		trojuholnik.vykresli();

		Trojuholnik trojuholnik2 = new Trojuholnik(7, VYKRESLOVACI_ZNAK2, 2);
		trojuholnik2.vykresli();

		Trojuholnik trojuholnik3 = new Trojuholnik(7, VYKRESLOVACI_ZNAK3, 3);
		trojuholnik3.vykresli();

		Trojuholnik trojuholnik4 = new Trojuholnik(7, VYKRESLOVACI_ZNAK4, 4);
		trojuholnik4.vykresli();

	}

}
