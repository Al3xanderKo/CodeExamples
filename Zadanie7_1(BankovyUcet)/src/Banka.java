
import java.util.ArrayList;
import java.util.ListIterator;

public class Banka {
	double aktualnyZostatok = 0;
	int id = 0;

	private ArrayList<BankovyUcet> bankoveUcty;

	public Banka() {
		bankoveUcty = new ArrayList<BankovyUcet>();
	}

	public void zalozUcet(BankovyUcet ucet) {
		bankoveUcty.add(ucet);
	}

	/**
	 * Prida novy ucet do zoznamu bankovych uctov.
	 * 
	 * @param cisloUctu          cislo bankoveho uctu
	 * @param pociatocnyZostatok pociatocny zostatok na bankovom ucte
	 */
	public void pridajUcet(int id, double pociatocnyZostatok)

	{
		this.id = id;
		this.aktualnyZostatok = pociatocnyZostatok;
		BankovyUcet bankovyUcet = new BankovyUcet(id, pociatocnyZostatok);
		bankoveUcty.add(bankovyUcet);

	}

	/**
	 * Vklada urcitu sumu na konkretny bankovy ucet.
	 * 
	 * @param cisloUctu cislo bankoveho uctu
	 * @param cistka    suma penazi, ktora sa vlozi na bankovy ucet
	 */
	public void vloz(int id, double ciastka)

	{
		this.id = id;

		for (BankovyUcet ucet : bankoveUcty) {
			if (ucet.getId() == id) {
				ucet.vloz(ciastka);
				break;
			}
		}

	}

	/**
	 * Vybera urcitu sumu z konkretneho bankoveho uctu.
	 * 
	 * @param cisloUctu cislo bankoveho uctu
	 * @param ciastka   suma penazi, ktora sa vyberie z bankoveho uctu
	 */
	public void vyber(int id, double ciastka)

	{
		this.id = id;

		for (BankovyUcet ucet : bankoveUcty) {
			if (ucet.getId() == id) {
				ucet.vyber(ciastka);
				break;
			}
		}

	}

	/**
	 * Vrati aktualny zostatok na bankovom ucte.
	 * 
	 * @param id cisloUctu cislo bankoveho uctu
	 * @return
	 */
	public double getAktualnyZostatok(int id)

	{
		this.id = id;

		for (BankovyUcet ucet : bankoveUcty) {
			if (ucet.getId() == id) {
				double zostatok = ucet.getAktualnyZostatok();
				return zostatok;
			}
		}
		return 0;

	}

	public void zmazUcet(int id) {
		// iterovanie pomocou Iteratora
		ListIterator<BankovyUcet> iterator = bankoveUcty.listIterator();

		while (iterator.hasNext()) {
			BankovyUcet ucet = iterator.next();

			if (ucet.getId() == id) {
				iterator.remove();
			}
		}
	}

	/**
	 * Vrati celkovy zostatok na vsetkych uctoch v banke
	 */
	public double celkovyZostatok() {
		double celkovyZostatok = 0; // -1321432143214

		for (BankovyUcet ucet : bankoveUcty) {
			celkovyZostatok += ucet.getAktualnyZostatok();
		}

		return celkovyZostatok;
	}

	/**
	 * Vrati pocet uctov, ktorych zostatok je vacsi ako dany zostatok.
	 * 
	 * @return pocet uctov splnajucich dane kriterium
	 */
	public int najdiUcetSoZostatkomVacsimAko(double zostatok) {
		int pocetUctov = 0; // pocet uctov splnajucich dane kriterium (zostatok)

		for (BankovyUcet ucet : bankoveUcty) {
			if (ucet.getAktualnyZostatok() > zostatok) {
				pocetUctov += 1; // pocetUctov++
			}
		}

		return pocetUctov;
	}

	/**
	 * Vyhlada a vrati bankovy ucet s danym id.
	 */
	public BankovyUcet vyhladajUcet(int id) {
		BankovyUcet hladanyUcet = null;

		for (BankovyUcet ucet : bankoveUcty) {
			if (ucet.getId() == id) {
				hladanyUcet = ucet;
				break;
			}
		}

		return hladanyUcet;
	}

	public BankovyUcet najdiBankovyUcetSNajvyssimZostatkom() {
		BankovyUcet maximum = bankoveUcty.get(0);

		for (int i = 1; i < bankoveUcty.size(); i++) {
			if (bankoveUcty.get(i).getAktualnyZostatok() > maximum.getAktualnyZostatok()) {
				maximum = bankoveUcty.get(i);
			}
		}

		return maximum;
	}

	public int pocetUctov() {
		return bankoveUcty.size();
	}
}
