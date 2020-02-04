import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class Makaj2 {

	public static void main(String[] args) {
		JsonKontainer alokuj = new JsonKontainer();
		// System.out.println(alokuj.allocate_url);
		// System.out.println(alokuj.json_allocate);

		try {
			URL alokujurl = new URL(alokuj.allocate_url);
			System.out.println(alokujurl);
			HttpURLConnection alokujconn = (HttpURLConnection) alokujurl.openConnection();
			alokujconn.setConnectTimeout(500);
			alokujconn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			alokujconn.setDoOutput(true);
			alokujconn.setDoInput(true);
			alokujconn.setRequestMethod("PUT");
			OutputStream allokujos = alokujconn.getOutputStream();
			allokujos.write(alokuj.json_allocate.getBytes("UTF-8"));
			allokujos.close();
			// System.out.println(alokuj.json_allocate);
			// allokujos znamena allokuj output stream ... skratka
			InputStream allokujin = new BufferedInputStream(alokujconn.getInputStream());
			// allokujin znamena allokuj input stream ... skratka
			String allokujresult = IOUtils.toString(allokujin, "UTF-8");
			// System.out.println("Allocate status");
			// System.out.println(allokujresult);

			// vkladame odpoved allokujin do json formatu
			JSONObject allocateresulttojson = new JSONObject(allokujresult);
			int resultcode = allocateresulttojson.getInt("code");
			String allocatecodedescribtion = allocateresulttojson.getString("desc");
			System.out.println("<Návratový kód: " + resultcode + "/><Popis kódu: " + allocatecodedescribtion + "/>");

			// ak dostanem reuslt code 0 pokračujem v zahajeni platby
			if (resultcode == 0) {
				System.out.println("návratový kód je 0 :)");
				// do premennej contextID vkladám vysledok z retazca "contextID"
				URL paystarturl = new URL(alokuj.paystart_url);

				String contextId = allocateresulttojson.getString("contextId");
				// vytvaram novy objekt triedy JsonKontainer s inštančnou premennou contextId
				// na zaklade ktorej použijem metodu getPayStartJson na zjednotenie context ID a
				// payStart hodnot
				JsonKontainer jsonkontainer = new JsonKontainer(contextId);
				jsonkontainer.getPayStartJson();
				// VYTVOR SI METODU S ODOSLANIM URL A VYTVORENIM JSON OBJEKTU S INSTANČNOU PR.
				// URL, SPOSOB OPERACIE ...
			}

			else {
				System.out.println("navratový kód neni 0! ");
			}

		}

		catch (Exception e) {
			System.out.println(e);

		}

	}

}
