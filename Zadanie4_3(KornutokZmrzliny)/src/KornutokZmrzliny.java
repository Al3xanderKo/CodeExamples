public class KornutokZmrzliny {

	double vyska;
	double polomer;
	final double PI = 3.14159265358979323846;

	KornutokZmrzliny(double vyska, double polomer) {
		this.vyska = vyska;
		this.polomer = polomer;
	}

	public double getPovrch() {
		double polomerPlasta = Math.sqrt((Math.pow(polomer, 2) + Math.pow(vyska, 2)));
		double obsahPlasta = PI * polomer * polomerPlasta;
		return obsahPlasta;
	}

	public double getObjem() {
		double objem = (PI * (Math.pow(polomer, 2)) * vyska) / 3;
		return objem;
	}

}