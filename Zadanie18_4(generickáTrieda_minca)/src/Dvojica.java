import java.util.Arrays;
import java.util.Comparator;

public class Dvojica<T, S> {

	private T prvy;
	private S posledny;

	public Dvojica(T prvy, S posledny) {
		this.prvy = prvy;
		this.posledny = posledny;
	}

	public Dvojica() {

	}

	public T getPrvy() {
		return prvy;
	}

	public S getPosledny() {
		return posledny;
	}

//este musim porozmyslat

	public static <T, S> Dvojica<T, S> minmax(Minca[] mince) {

		Dvojica<T, S> minmaxDvojica = new Dvojica<>();

		Arrays.sort(mince, new Comparator<Minca>() {
			@Override
			public int compare(Minca m1, Minca m2) {
				double posun = (m1.getHodnota() - m2.getHodnota());
				if (posun > 0)
					return 1;
				if (posun < 0)
					return -1;
				return 0;
			}
		});
		minmaxDvojica.prvy = (T) mince[0];
		minmaxDvojica.posledny = (S) mince[mince.length - 1];

		return minmaxDvojica;

		// TODO Auto-generated method stub

	}

}
