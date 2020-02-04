import java.awt.Rectangle;

public class ZobrazovacStyrochObdlznikov {

	public static void main(String[] args) {

		Rectangle obdlznik = new Rectangle(10, 10, 30, 40);
		System.out.println("Pôvodná poloha obdĺžnika :" + obdlznik);
		obdlznik.translate(35, 0);
		System.out.println("Poloha po prvom presunutí :" + obdlznik);
		obdlznik.translate(0, 45);
		System.out.println("Poloha po druhom presunutí :" + obdlznik);
		obdlznik.translate(-35, 0);
		System.out.println("Poloha po treťom presunutí :" + obdlznik);

	}

}
