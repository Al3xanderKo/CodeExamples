import java.util.Arrays;

public class paralelneTriedenie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ak vytvorim pole vacsie nez 9100 tak sa mi nevylistuje do konzole pomocou
		// print, println funguje
		int[] pole = PoleUtil.vygenerujPoleCisel(10000, 200);
		Arrays.parallelSort(pole);
		System.out.println("Zotriedene pole:");
		Arrays.stream(pole).forEach(n -> System.out.println(n + " "));
	}

}
