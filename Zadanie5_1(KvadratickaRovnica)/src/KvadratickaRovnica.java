public class KvadratickaRovnica {

	public int a;
	public int b;
	public int c;
	public int D;

	public KvadratickaRovnica(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
//
//	Ak je diskriminant záporný, je potrebné používateľovi zobraziť správu: "Rovnica nemá riešenie".
//	Ak je diskriminant rovný 0, je potrebné používateľovi zobraziť správu: "Rovnica má jeden dvojnásobný koren, x = ?".
//	Ak je diskriminant väčší ako 0, je potrebné používateľovi zobraziť správnu: "Rovnica má dva korene: x1 = ?, X2 = ?".
//	Diskriminant môžete vypočítať podľa známeho vzorca: D = b2 - 4 * a * c
//  ax2 + bx + c = 0

	public Boolean jeRiesitelna() {
		int D = (int) Math.pow(b, 2) - (4 * a * c);
		if (D < 0) {
			System.out.println("\nRovnica nemá riešenie, hodnota diskriminantu je :" + D);
			return false;
		} else if (D > 0) {
			System.out.println("Rovnica má dva korene: x1 = ?, X2 = ?");
			return true;
		} else if (D == 0) {
			System.out.println("Rovnica má jeden dvojnásobný koren, x = ?");
			return true;
		} else {
			return false;
		}
	}

	public int getRiesenie1() {
		int D = (int) (Math.pow(b, 2) - (4 * a * c));
		int x1 = (int) ((-b - Math.sqrt(D)) / (2 * a));
		return x1;
	}

	public int getRiesenie2() {
		int D = (int) (Math.pow(b, 2) - (4 * a * c));
		int x2 = (int) ((-b + Math.sqrt(D)) / (2 * a));
		return x2;
	}

}
