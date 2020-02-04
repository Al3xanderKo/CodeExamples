
public class Dvojica<T> {

	private T prvy;
	private T druhy;

	public Dvojica(T prvy, T druhy) {
		this.prvy = prvy;
		this.druhy = druhy;
	}

	public T getPrvy() {
		return prvy;
	}

	public T getDruhy() {
		return druhy;
	}

	public void vymenHodnotyParametrov() {
		T temp = prvy;
		prvy = druhy;
		druhy = temp;

	}

}