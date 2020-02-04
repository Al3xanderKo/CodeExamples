
public class Stopky {

	private boolean suSpustene;
	private long uplynulyCas;
	private long casSpustenia;
	private long casZastavenia;

	public Stopky() {
		vynuluj();
	}

	private void vynuluj() {
		// TODO Auto-generated method stub

	}

	public void start() {
		if (suSpustene) {
			return;
		}
		suSpustene = true;
		casSpustenia = System.currentTimeMillis();
		// casSpusteniaMs = System.currentTimeMillis();
	}

	public void stop() {
		if (!suSpustene) {
			return;
		}
		suSpustene = false;
		casZastavenia = System.currentTimeMillis();
		// casZastaveniaMs = System.currentTimeMillis();
		uplynulyCas = uplynulyCas + (casZastavenia - casSpustenia);
	}

	public long getUplynulyCas() {
		if (suSpustene) {
			long casZastavenia = System.currentTimeMillis();
			return uplynulyCas + (casZastavenia - casSpustenia);
		}
		return uplynulyCas;
	}

}
