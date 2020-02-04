
public class Student extends Osoba {

	String odbor;

	public Student(String meno, double datumNarodenia, String odbor) {
		super(meno, datumNarodenia);
		this.odbor = odbor;
	}

	@Override
	public String toString() {

		return "Student [meno=" + getMeno() + ", datumNarodenia=" + getDatumNarodenia() + ", odbor=" + odbor + "]";
	}

}
