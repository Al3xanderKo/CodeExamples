public class DvojicaHodnotTester {
	public static void main(String[] args) {
		Dvojica<Integer> dvojica = new Dvojica<Integer>(20, 22);
		System.out.println("Prvy prvok: " + dvojica.getPrvy());
		System.out.println("Ocakavana hodnota: 20");
		System.out.println("Druhy prvok: " + dvojica.getDruhy());
		System.out.println("Ocakavana hodnota: 22");
	}
}