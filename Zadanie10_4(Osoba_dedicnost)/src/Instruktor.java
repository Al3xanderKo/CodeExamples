
public class Instruktor extends Osoba {

	double plat;

	public Instruktor(String meno, double datumNarodenia, double plat) {
		super(meno, datumNarodenia);
		this.plat = plat;

	}

	@Override
	public String toString() {
		return "Instruktor [meno=" + getMeno() + ", datumNarodenia=" + getDatumNarodenia() + ", plat=" + plat + "]";
	}

}
