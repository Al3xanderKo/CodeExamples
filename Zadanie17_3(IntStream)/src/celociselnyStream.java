import java.util.Arrays;
import java.util.stream.IntStream;

public class celociselnyStream {

	public static void main(String[] args) {

		int[] pole = IntStream.rangeClosed(1, 10).toArray();
		shuffleArray.zamiesaj(pole);

		System.out.print("Prvky pola: ");

		Arrays.stream(pole).forEach(n -> System.out.print(n + " "));

		System.out.println("\nPocet prvkov: " + IntStream.of(pole).count());
		System.out.println("Najmensi prvok: " + IntStream.of(pole).min().getAsInt()); // getAsInt() vracia hodnotu inac
																						// dostanem "OptionalInt[0]"
		System.out.println("Najvecsi prvok: " + IntStream.of(pole).max().getAsInt());
		System.out.println("Sucet prvkov: " + IntStream.of(pole).sum());
		System.out.println("Priemerna hodnota prvku: " + IntStream.of(pole).average().getAsDouble());

		System.out
				.println("Sucet prvkov za pomoci metody reduce: " + IntStream.of(pole).reduce(Integer::sum).getAsInt());// stream.reduce((a,
																														// b)
																														// ->
																														// (a
																														// *
																														// b));
		System.out.println("Sucet druhych mocnic prvkov za pomoci metody reduce: "
				+ IntStream.of(pole).map(a -> a * a).reduce((a, b) -> a + b).getAsInt());

		System.out.println("Sucin vsetkych prvkov za pomoci metody reduce: "
				+ IntStream.of(pole).reduce((a, b) -> a * b).getAsInt());
		System.out.print("Zotriedene parne cisla v nasom poli: ");
		IntStream.of(pole).filter(a -> a % 2 == 0).sorted().forEach(a -> {
			System.out.print(a);
			System.out.print(" ");
		});
		System.out.println("");

		System.out.print("Neparne cisla v nasom poli vynasobene 10: ");
		IntStream.of(pole).filter(a -> a % 2 != 0).map(a -> a * 10).sorted().forEach(a -> {
			System.out.print(a);
			System.out.print(" ");
		});
		int intRange = IntStream.range(1, 10).sum();
		int intRangeClosed = IntStream.rangeClosed(1, 10).sum();
		System.out.println("");
		System.out.println("Sucet cisiel od 1-10 pomocou metody range(): " + intRange);
		System.out.println("Sucet cisiel od 1-10 pomocou metody rangeClosed(): " + intRangeClosed);

	}

}
