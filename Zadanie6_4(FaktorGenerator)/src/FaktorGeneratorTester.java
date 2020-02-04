public class FaktorGeneratorTester {
	public static void main(String[] args) {
		FaktorGenerator generator = new FaktorGenerator(15);
		System.out.println(generator.existujeDalsiFaktor());
		System.out.println(generator.dalsiFaktor());
		System.out.println("Ocakavana hodnota: true");
		System.out.println("Ocakavana hodnota: 1");

		System.out.println(generator.existujeDalsiFaktor());
		System.out.println(generator.dalsiFaktor());
		System.out.println("Ocakavana hodnota: true");
		System.out.println("Ocakavana hodnota: 3");

		System.out.println(generator.existujeDalsiFaktor());
		System.out.println(generator.dalsiFaktor());
		System.out.println("Ocakavana hodnota: true");
		System.out.println("Ocakavana hodnota: 5");

		System.out.println(generator.existujeDalsiFaktor());
		System.out.println(generator.dalsiFaktor());
		System.out.println("Ocakavana hodnota: false");
		System.out.println("Ocakavana hodnota: 15");
	}
}