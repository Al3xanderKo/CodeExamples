public class Kviz {

	String znamka = "";
	int cislo;

	public Kviz(int cislo, String znamka) {
		this.cislo = cislo;
		this.znamka = znamka;
	}

	public String getZnamka() {
		return znamka;
	}

	public int getHodnota() {
		return cislo;
	}

}
