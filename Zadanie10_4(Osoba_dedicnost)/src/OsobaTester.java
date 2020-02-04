public class OsobaTester {
	public static void main(String[] args) {
		Osoba osoba = new Osoba("Igor Kovac", 1988);
		Student student = new Student("Emil Horvath", 1999, "Kartografia");
		Instruktor instruktor = new Instruktor("Jan Valdner", 1969, 2500);
		System.out.println(osoba.toString());
		System.out.println("Ocakavana hodnota: Osoba [meno=Igor Kovac, datumNarodenia=1988.0]");
		System.out.println(student.toString());
		System.out.println("Ocakavana hodnota: Student [meno=Emil Horvath, datumNarodenia=1999.0, odbor=Kartografia]");
		System.out.println(instruktor.toString());
		System.out.println("Ocakavana hodnota: Instruktor [meno=Jan Valdner, datumNarodenia=1969.0, plat=2500.0]");
	}
}