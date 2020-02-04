import java.util.Comparator;

public class ReverznyPorovnavacMinci implements Comparator<Minca> {

	@Override
	public int compare(Minca m1, Minca m2) {
		// TODO Auto-generated method stub
		double posun = (m1.getHodnota() - m2.getHodnota());
		if (posun > 0)
			return -1;
		if (posun < 0)
			return 1;
		return 0;
	}

}
