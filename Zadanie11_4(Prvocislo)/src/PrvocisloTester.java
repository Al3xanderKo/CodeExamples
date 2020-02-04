
public class PrvocisloTester {

	public static void main(String[] args) {

		// testy na 4 rôzne čísla
		Prvocislo overenie1 = new Prvocislo(9);
		overenie1.jeCisloPrvocislo();

		Prvocislo overenie2 = new Prvocislo(45);
		overenie2.jeCisloPrvocislo();

		Prvocislo overenie3 = new Prvocislo(863);
		overenie3.jeCisloPrvocislo();

		Prvocislo overenie4 = new Prvocislo(7);
		overenie4.jeCisloPrvocislo();

		// test na Nté prvocislo
		Prvocislo ntePrvocislo = new Prvocislo();
		ntePrvocislo.najdiNtePrvocislo(150);

	}

}
