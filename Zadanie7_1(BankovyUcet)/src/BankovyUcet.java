
public class BankovyUcet {

	private double aktualnyZostatok;
	private int id;

	public BankovyUcet() {
		aktualnyZostatok = 0;
	}

	public BankovyUcet(int id, double pociatocnyZostatok) {
		this.id = id;
		this.aktualnyZostatok = pociatocnyZostatok;
	}

	public void vloz(double ciastka) {
// 		assercie na kontrolu či su splnené podmienky pre parametr ciastka	
//		assert ciastka > 0 : "Čiastka musí byť vačšia ako 0 ! "; 
		if (ciastka > 0) {
			this.aktualnyZostatok += ciastka;
		} else {
			System.out.println("Čiastka musí byť vačšia ako 0 ! ");
		}

	}

	public void vyber(double ciastka) {
//		 assercie na kontrolu či su splnené podmienky pre parametr ciastka		
//		 assert ciastka > 0 : "Čiastka musí byť vačšia ako 0 ! "; 
//		 assert ciastka <= this.aktualnyZostatok : "Čiastka je väčšia ako aktuálny zostatok ! ";
		if ((ciastka > 0) && (this.aktualnyZostatok > ciastka)) {
			this.aktualnyZostatok -= ciastka;
		} else {
			System.out.println("Čiastka musí byť vačšia ako nula alebo máš nedostatok prostriedkov");
		}
	}

	public double getAktualnyZostatok() {
		return aktualnyZostatok;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "BankovyUcet [aktualnyZostatok=" + aktualnyZostatok + ", id=" + id + "]";
	}
}
