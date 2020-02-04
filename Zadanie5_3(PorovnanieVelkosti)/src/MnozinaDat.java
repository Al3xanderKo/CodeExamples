
/**
 * Trieda dokaze najst najmensie, prostredne a najvacsie cislo spomedzi troch
 * lubovolnych realnych cisel.
 */
public class MnozinaDat {
	double cislo1;
	double cislo2;
	double cislo3;
	double prve;
	double druhe;
	double tretie;

	/**
	 * Metoda na zoradenie čisiel od najmenšieho po najväčšie, prijmame 3 čísla
	 * využil som pole pre zoradenie
	 * 
	 * @param cislo1
	 * @param cislo2
	 * @param cislo3
	 */
	public MnozinaDat(double cislo1, double cislo2, double cislo3) {
		this.cislo1 = cislo1;
		this.cislo2 = cislo2;
		this.cislo3 = cislo3;

//        Double[] cisla={cislo1,cislo2,cislo3};
//        Arrays.sort(cisla);
//        prve = cisla[0];
//        druhe = cisla[1];
//        tretie = cisla[2];

	}

	/**
	 * getter pre ziskanie najmensieho cisla
	 * 
	 * @return
	 */

	public double getNajmensie() {
		if ((cislo1 <= cislo2) && (cislo1 <= cislo3)) {
			tretie = cislo1;
		} else if ((cislo2 <= cislo1) && (cislo2 <= cislo3)) {
			tretie = cislo2;
		} else if ((cislo3 <= cislo1) && (cislo3 <= cislo2)) {
			tretie = cislo3;
		}
		return tretie;
	}

	/**
	 * getter pre ziskanie stredneho cisla použil som || "or" pretože ak som zadal
	 * opačný smer, napr c1=3,c2=2,c3=1 tak prostredne číslo bolo 0
	 * 
	 * @return
	 */
	public double getProstredne() {
		if (((cislo1 <= cislo2) && (cislo1 >= cislo3)) || ((cislo1 >= cislo2) && (cislo1 <= cislo3))) {
			druhe = cislo1;
		} else if (((cislo2 <= cislo1) && (cislo2 >= cislo3)) || ((cislo2 >= cislo1) && (cislo2 <= cislo3))) {
			druhe = cislo2;
		} else if (((cislo3 <= cislo1) && (cislo3 >= cislo2)) || ((cislo3 >= cislo1) && (cislo3 <= cislo2))) {
			druhe = cislo3;
		}
		return druhe;
	}

	/**
	 * getter pre ziskanie najvacsieho cisla
	 * 
	 * @return
	 */
	public double getNajvacsie() {
		if ((cislo1 >= cislo2) && (cislo1 >= cislo3)) {
			prve = cislo1;
		} else if ((cislo2 >= cislo1) && (cislo2 >= cislo3)) {
			prve = cislo2;
		} else if ((cislo3 >= cislo1) && (cislo3 >= cislo2)) {
			prve = cislo3;
		}
		return prve;

	}
}

/**
 * Mas to super, ale prezradim ti trik, ako sa to da spravit ovela ovela
 * prehladnejsie a hlavne budes potrebovat menej prikazov porovnania a o pocte
 * zlozenych podmienok ani nehovoriac: Povedzme, ze mame hodnoty v troch
 * premennych a, b, c 1) porovnas b s c if (b > c) // vymenime hodnotych
 * premennych { int pom = b; b = c; c = pom; } if (a > c) // vymenime hodnotych
 * premennych { int pom = a; a = c; c = pom; } if (a > b) // vymenime hodnotych
 * premennych { int pom = a; a = b; b = pom; }
 * -------------------------------------------------------------------------------------------------------
 * Potrebovali sme 3 jednoduche podmienky IF a dokazali sme utriedit 3 cisla,
 * aktualne a - najmensia hodnota, b - potrestredna hodnota, c - najvacsia
 * hodnota No nie je to trosku prehladnejsie a efektivnejsie :-)
 **/