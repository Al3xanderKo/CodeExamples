
public class Dvojica<T, S> {

	public T prvy;
	public S druhy;

	public Dvojica(T prvy, S druhy) {
		this.prvy = prvy;
		this.druhy = druhy;
	}

	public Dvojica() {

	}

	public T getPrvy() {
		return prvy;
	}

	public S getDruhy() {
		return druhy;
	}

	public static <T, S> Dvojica<S, T> vymenHodnotyParametrov(Dvojica<T, S> dvojica) {
		Dvojica<S, T> vymenenaDvojica = new Dvojica<>();
		vymenenaDvojica.prvy = dvojica.druhy;
		vymenenaDvojica.druhy = dvojica.prvy;
		return vymenenaDvojica;

	}

}
