
/**
 * trieda je zodpovedna za triedenie cisiel ulozenych v datovej strukture pole
 */

public class TriedicVkladanim {

	private int[] data;

	public TriedicVkladanim(int[] nezotriedenePole) {
		this.data = nezotriedenePole;
	}

	public void zotried() {
		for (int i = 1; i < data.length; i++) {
			int kluc = data[i];
			int j = i - 1;

			while (j >= 0 && data[j] > kluc) {
				data[j + 1] = data[j];
				j = j - 1;
			}
			data[j + 1] = kluc;
		}
	}

}
