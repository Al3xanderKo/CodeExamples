import java.util.ArrayList;

public class Prvocislo {

	private int cislo;
	private int delitel;
	private int n;
	ArrayList<Integer> prvoCisla = new ArrayList<Integer>();

	public Prvocislo(int cislo) {
		this.cislo = cislo;
	}

	public Prvocislo() {
	}

	public void jeCisloPrvocislo() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Delitele: ");
		for (int i = 1; i <= cislo; i++) {

			if (cislo % i == 0) {
				System.out.println(i);
				delitel++;
			}

		}

		if (delitel == 2) {
			System.out.println("Cislo: " + cislo + " je prvocislo, je delitelne 1 alebo sebou samym");
		} else {
			System.out.println("Cislo: " + cislo + " neni prvocislo !");
		}

	}

	public void najdiNtePrvocislo(int n) {
		this.n = n;

		int count = 0;

		for (int i = 2; count < n; i++) {

			boolean jePrvocislo = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					jePrvocislo = false;
					break;
				}
			}

			if (jePrvocislo == true) {
				prvoCisla.add(i);
				count++;
			}
		}
		System.out.println("-------------------------------------------------------");
		System.out.println(n + ". prvočislo je: " + prvoCisla.get(n - 1));
	}

}
