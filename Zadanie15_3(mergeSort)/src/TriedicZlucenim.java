public class TriedicZlucenim {

	private int[] data;

	public TriedicZlucenim(int[] nezotriedeneData) {
		this.data = nezotriedeneData;
	}

	public void zotried() {
		if (data.length <= 1) {
			return;
		}

		int[] lavaCast = new int[data.length / 2];
		int[] pravaCast = new int[data.length - lavaCast.length];

		System.arraycopy(data, 0, lavaCast, 0, lavaCast.length);
		System.arraycopy(data, lavaCast.length, pravaCast, 0, pravaCast.length);

		TriedicZlucenim triedicLavaCast = new TriedicZlucenim(lavaCast);
		TriedicZlucenim triedicPravaCast = new TriedicZlucenim(pravaCast);

		triedicLavaCast.zotried();
		triedicPravaCast.zotried();
		zluc(lavaCast, pravaCast);
	}

	// lavaCast = {1, 3, 5, 7} pravaCast = {2, 4, 6, 8}
	// data = {1...atd} porovnavame 0 index lavej a prave casti , mensi zapiseme na
	// 0 index
	private void zluc(int[] lavaCast, int[] pravaCast) {
		int indexLavaCast = 0;
		int indexPravaCast = 0;

		int j = 0;

		while (indexLavaCast < lavaCast.length && indexPravaCast < pravaCast.length) {
			if (lavaCast[indexLavaCast] < pravaCast[indexPravaCast]) {
				data[j] = lavaCast[indexLavaCast];
				indexLavaCast++;
			} else {
				data[j] = pravaCast[indexPravaCast];
				indexPravaCast++;
			}
			j++;
		}

		System.arraycopy(lavaCast, indexLavaCast, data, j, lavaCast.length - indexLavaCast);
		System.arraycopy(pravaCast, indexPravaCast, data, j, pravaCast.length - indexPravaCast);
	}

}
