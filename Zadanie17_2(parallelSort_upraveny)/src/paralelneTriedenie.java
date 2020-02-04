import java.util.Arrays;
import java.util.Comparator;

public class paralelneTriedenie {

	public static void main(String[] args) {

		Comparator<Integer> reverseComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
		};
		// TODO Auto-generated method stub
		Integer[] pole = PoleUtil.vygenerujPoleCisel(200, 200);
		int stred = pole.length / 2;
		Arrays.parallelSort(pole, stred, pole.length, reverseComparator);
		// musel som pouzit Integer namiesto int v poli, pa
		System.out.println("Zotriedene pole:");
		Arrays.stream(pole).forEach(n -> System.out.println(n + " "));

	}

}
