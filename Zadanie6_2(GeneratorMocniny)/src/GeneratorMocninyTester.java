
public class GeneratorMocninyTester {

	public static void main(String[] args) {

		// vytvoril som si metodu ktorá umožnuje vybrať jaké čislo chceme mocniť, a
		// mocniteľa
		GeneratorMocniny generatormocniny = new GeneratorMocniny(10, 12);
		// podla zadania umocňujem číslo 10 mocnitelom 12;
		System.out.printf("%.0f", generatormocniny.dalsiaMocnina());

	}

}
