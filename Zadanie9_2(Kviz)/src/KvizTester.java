
/**
 * Program testuje triedu Kviz a triedu MnozinaDat.
 */

public class KvizTester {
	public static void main(String[] args) {
		MnozinaDat kvizy = new MnozinaDat();
		Kviz kviz1 = new Kviz(89, "B+");
		Kviz kviz2 = new Kviz(90, "A-");
		Kviz kviz3 = new Kviz(73, "C");

		kvizy.pridaj(kviz1);
		kvizy.pridaj(kviz2);
		kvizy.pridaj(kviz3);

		double priemer = kvizy.getPriemer();

		Kviz maximum = kvizy.getMaximum();

		System.out.println("Priemerna hodnota kvizu: " + priemer);
		System.out.println("Ocakavana hodnota: 84");

		System.out.println("Najvyssia hodnota kvizu: " + maximum.getHodnota());
		System.out.println("Ocakavana hodnota: 90");

		System.out.println("Najvyssia znamka kvizu: " + maximum.getZnamka());
		System.out.println("Ocakavana hodnota: A-");
	}
}