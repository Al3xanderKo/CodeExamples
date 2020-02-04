
public class Dvojica {
	double prveCislo;
	double druheCislo;

	public Dvojica(double prveCislo, double druheCislo) {
		this.prveCislo = prveCislo;
		this.druheCislo = druheCislo;
	}

	public double getSucet() {
		double sucet = prveCislo + druheCislo;
		return sucet;
	}

	public double getSucin() {
		double sucin = prveCislo * druheCislo;
		return sucin;
	}

	public double getRozdiel() {
		double rozdiel = prveCislo - druheCislo;
		return rozdiel;
	}

	public double getPriemer() {
		double priemer = (prveCislo + druheCislo) / 2;
		return priemer;
	}

	public double getVzdialenost() {
		double vzdialenost = (Math.abs(prveCislo)) + (Math.abs(druheCislo));
		return vzdialenost;
	}

	public double getMaximum() {
		double maximum = Math.max(prveCislo, druheCislo);
		return maximum;
	}

	public double getMinimum() {
		double minimum = Math.min(prveCislo, druheCislo);
		return minimum;
	}

}
