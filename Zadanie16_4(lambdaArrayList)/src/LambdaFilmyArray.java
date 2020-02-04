import java.util.ArrayList;

public class LambdaFilmyArray {

	public static void main(String[] args) {

		LambdaFilmyArray pole = new LambdaFilmyArray();
		ArrayList<String> zoznamFilmov = new ArrayList<String>();

		zoznamFilmov.add("Avatar");
		zoznamFilmov.add("Pán prstenov");
		zoznamFilmov.add("Nedotknutelní");
		zoznamFilmov.add("Zelená míla");
		zoznamFilmov.add("Vojna svetov");

		zoznamFilmov.forEach((filmy) -> System.out.println(filmy));

	}

}
