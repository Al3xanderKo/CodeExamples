
public class Trojuholnik {

	private String vykreslovaciZnak;
	private int rozmer;
	private int typ;

	public Trojuholnik(int rozmer, String vykreslovaciZnak, int typ) {
		this.rozmer = rozmer;
		this.vykreslovaciZnak = vykreslovaciZnak;
		this.typ = typ;
	}

	public Trojuholnik(int rozmer, String vykreslovaciZnak) {
		this.rozmer = rozmer;
		this.vykreslovaciZnak = vykreslovaciZnak;

	}

	public void vykresli() {

		if (typ == 1) {

			System.out.println("");
			for (int i = 1; i <= rozmer; i++) {// vnutorny cyklus riesi stlpce v jednom riadku
				for (int j = 1; j <= i; j++) {
					System.out.print(vykreslovaciZnak);

				}
				System.out.println("");

			}

		}

		if (typ == 2) {

			System.out.println("");
			for (int i = 1; i <= rozmer; i++) {
				for (int j = i; j < rozmer; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(vykreslovaciZnak);
				}
				System.out.println("");
			}

		}

		if (typ == 3) {

			System.out.println("");
			for (int i = rozmer; i > 0; i--) {// vnutorny cyklus riesi stlpce v jednom riadku
				for (int j = 1; j <= i; j++) {
					System.out.print(vykreslovaciZnak);

				}
				System.out.println("");
			}

		}

		if (typ == 4) {

			System.out.println("");
			for (int i = rozmer; i > 0; i--) {
				for (int j = i; j < rozmer; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(vykreslovaciZnak);
				}
				System.out.println("");
			}

		}

	}

}
