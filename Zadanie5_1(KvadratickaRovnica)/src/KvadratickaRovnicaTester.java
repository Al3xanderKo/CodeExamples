/**
 * Program sluzi ako testovacia trieda pre triedu KvadratickaRovnica.
 */
public class KvadratickaRovnicaTester {
	public static void main(String[] args) {
		int a = 2, b = 2, c = -4;
		// povedzme ze a = 2, b, = 2, c = -4
		KvadratickaRovnica rovnica = new KvadratickaRovnica(a, b, c);
		System.out.println("Je rovnica riesitelna? " + rovnica.jeRiesitelna());
		System.out.println("Ocakavana hodnota: true");
		System.out
				.println("Rovnica ma dva korene: x1 = " + rovnica.getRiesenie1() + ", x2 = " + rovnica.getRiesenie2());
		System.out.println("Ocakavana hodnota: x1 = -2, x2 = 1");
		// zostrojte druhu kvadaraticku rovnicu, kde koeficienty budu a = 2, b = 2, c =
		// 4 a zobrazte informacie o riesitelnosti rovnice a jej korenoch
		// rovnica c. 2 -------------------------------------------
		KvadratickaRovnica rovnica2 = new KvadratickaRovnica(2, 2, 4);
		System.out.println("Je rovnica riesitelna? " + rovnica2.jeRiesitelna());
		System.out.println("x1 = " + rovnica2.getRiesenie1() + ", x2 = " + rovnica2.getRiesenie2());

	}
}