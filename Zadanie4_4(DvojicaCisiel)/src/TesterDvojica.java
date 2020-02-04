import java.util.Scanner;

public class TesterDvojica {

	public static void main(String[] args) {
		Scanner prvyVstup = new Scanner(System.in);
		System.out.println("Zadaj prvé číslo: ");
		double prveCislo = prvyVstup.nextDouble();
		Scanner druhyVstup = new Scanner(System.in);
		System.out.println("Zadaj druhé číslo: ");
		double druheCislo = druhyVstup.nextDouble();
		prvyVstup.close();
		druhyVstup.close();
		Dvojica dvojica = new Dvojica(prveCislo, druheCislo);
		System.out.println("Predpokladaný súčet pri dvojici -5 a 10 = 5");
		System.out.println("Sučet dvojíc:" + prveCislo + " + " + druheCislo + " = " + dvojica.getSucet());
		System.out.println("Predpokladaný rozdiel pri dvojici -5 a 10 = -15");
		System.out.println("Rozdiel dvojíc: " + prveCislo + " - " + druheCislo + " = " + dvojica.getRozdiel());
		System.out.println("Predpokladaný súčin pri dvojici -5 a 10 = -50");
		System.out.println("Súčin dvojíc: " + prveCislo + " * " + druheCislo + " = " + dvojica.getSucin());
		System.out.println("Predpokladaný priemer pri dvojici -5 a 10 = 2.5");
		System.out.println("Priemer dvojíc: " + prveCislo + " a " + druheCislo + " = " + dvojica.getPriemer());
		System.out.println("Predpokladane MAX číslo pri dvojici -5 a 10 = 10");
		System.out.println("Max. číslo z dvojice: " + prveCislo + " , " + druheCislo + " = " + dvojica.getMaximum());
		System.out.println("Predpokladane MIN číslo pri dvojici -5 a 10 = -5");
		System.out.println("Min. číslo z dvojice: " + prveCislo + " , " + druheCislo + " = " + dvojica.getMinimum());
		System.out.println("Predpokladaná absolútna hodnota pri dvojici -5 a 10 = 15");
		System.out.println(
				"Absolútna hodnota rozdielu: " + prveCislo + " a " + druheCislo + " = " + dvojica.getVzdialenost());

	}

}
