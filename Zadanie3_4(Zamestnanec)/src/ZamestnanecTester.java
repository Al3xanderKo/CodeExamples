
public class ZamestnanecTester {
	public static void main(String[] args) {
		// vytvorenie 3 zamestnancov
		Zamestnanec pista = new Zamestnanec("Stefan Novak", 800);
		Zamestnanec fero = new Zamestnanec("Franta Silný", 825);
		Zamestnanec jozo = new Zamestnanec("Jozef Pomalý", 150);

		System.out.println("1.Meno a priezvisko zamestnanca: " + pista.getMeno() + ", plat pred navýšením: "
				+ pista.getPlat() + " EUR");
		pista.navysPlat(20);
		System.out.println("Plat po 20% navýšení: " + pista.getPlat() + " EUR");

		System.out.println("2.Meno a priezvisko zamestnanca: " + fero.getMeno() + ", plat pred navýšením: "
				+ fero.getPlat() + " EUR");
		fero.navysPlat(10);
		System.out.println("Plat po 10% navýšení: " + fero.getPlat() + " EUR");

		System.out.println("3.Meno a priezvisko zamestnanca: " + jozo.getMeno() + ", plat pred navýšením: "
				+ jozo.getPlat() + " EUR");
		jozo.navysPlat(10);
		System.out.println("Plat po 10% navýšení: " + jozo.getPlat() + " EUR");

	}
}