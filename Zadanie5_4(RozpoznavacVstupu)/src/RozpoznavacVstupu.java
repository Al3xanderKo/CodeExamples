
public class RozpoznavacVstupu {

	String vstupPouzivatela;
	String[] ok = { "A", "ANO", "OK", "Iste", "Preco nie?" };
	String[] nok = { "N", "NIE" };

	public RozpoznavacVstupu(String vstupPouzivatela) {
		this.vstupPouzivatela = vstupPouzivatela;

	}

	public boolean jeToKladnaOdpoved() {

		if (vstupPouzivatela.equalsIgnoreCase(ok[0]) || vstupPouzivatela.equalsIgnoreCase(ok[1])
				|| vstupPouzivatela.equalsIgnoreCase(ok[2]) || vstupPouzivatela.equalsIgnoreCase(ok[3])
				|| vstupPouzivatela.equalsIgnoreCase(ok[4])) {
			return true;
		} else {
			return false;
		}
	}

	public boolean jeToZapornaOdpoved() {
		if (vstupPouzivatela.equalsIgnoreCase(nok[0]) || vstupPouzivatela.equalsIgnoreCase(nok[1])) {
			return true;
		} else {
			return false;
		}
	}

}
