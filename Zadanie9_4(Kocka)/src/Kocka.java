
public class Kocka {
	int velkostKocky;

	public Kocka(int i) {
		velkostKocky = i;
	}

	public int hod() {
		int r = 1 + (int) (Math.random() * ((velkostKocky - 1) + 1));
		return r;

	}

}
