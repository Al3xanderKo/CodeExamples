public class KornutokZmrzlinyTester {
	public static void main(String[] args) {
		KornutokZmrzliny kornutok = new KornutokZmrzliny(5, 1);
		System.out.println("Objem kornutka:  : " + kornutok.getObjem());
		System.out.println("Ocakavana hodnota: 5.235987755982989");
		System.out.println("Plocha kornutka: : " + kornutok.getPovrch());
		System.out.println("Ocakavana hodnota: 16.01904224441409");
	}
}