public class Osoba {

	private String menoPriezvisko;
	private String telCislo;

	public Osoba(String menoPriezvisko, String telCislo) { // constructor

		this.menoPriezvisko = menoPriezvisko;
		this.telCislo = telCislo;

	}

	public String getMenoPriezvisko() {
		return menoPriezvisko;
	}

	public String getTelCislo() {
		return telCislo;
	}

	@Override
	public String toString() {
		return "Osoba [menoPriezvisko=" + menoPriezvisko + ", telCislo=" + telCislo + "]";
	}

}