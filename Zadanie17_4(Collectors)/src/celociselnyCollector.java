import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class celociselnyCollector {

	public static void main(String[] args) {

		int[] pole = IntStream.rangeClosed(1, 10).toArray();
		shuffleArray.zamiesaj(pole);

		System.out.print("Nezotriedene pole: ");
		Arrays.stream(pole).forEach(n -> System.out.print(n + " "));

		System.out.println("");
		System.out.print("Zotriedeny list:   ");
		Arrays.stream(pole).boxed().sorted().collect(Collectors.toList()).forEach(a -> {
			System.out.print(a);
			System.out.print(" ");
		});

		System.out.println("");
		System.out.print("Zotriedeny list n>4: ");
		Arrays.stream(pole).boxed().sorted().filter(a -> a > 4).collect(Collectors.toList()).forEach(a -> {
			System.out.print(a);
			System.out.print(" ");
		});

		System.out.println("");
		System.out.print("Nezotriedeny list n>4: ");
		Arrays.stream(pole).boxed().filter(a -> a > 4).collect(Collectors.toList()).forEach(a -> {
			System.out.print(a);
			System.out.print(" ");
		});

	}

}
