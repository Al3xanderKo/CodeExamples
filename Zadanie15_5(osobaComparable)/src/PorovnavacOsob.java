import java.util.Comparator;

public class PorovnavacOsob implements Comparator<Osoba> {

	@Override
	public int compare(Osoba o1, Osoba o2) {

		return o1.getMeno().compareToIgnoreCase(o2.getMeno());
	}

}
