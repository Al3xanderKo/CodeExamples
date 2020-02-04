import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class SendUrlJson {
	String url;
	String jsonOperacie;
	int resultCode;
	String codeDescribtion;
	String contextId;
	String opCode;
	String opGroup;

	public SendUrlJson(String url, String jsonOperacie) {
		this.url = url;
		this.jsonOperacie = jsonOperacie;
	}

	public void posliJsonToUrl() {
		try {
			URL vytvorUrl = new URL(url);
			System.out.println(vytvorUrl);
			HttpURLConnection vytvorConn = (HttpURLConnection) vytvorUrl.openConnection();
			vytvorConn.setConnectTimeout(500);
			vytvorConn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			vytvorConn.setDoOutput(true);
			vytvorConn.setDoInput(true);
			vytvorConn.setRequestMethod("PUT");
			OutputStream vytvorOs = vytvorConn.getOutputStream();
			vytvorOs.write(jsonOperacie.getBytes("UTF-8"));
			vytvorOs.close();
			// System.out.println(alokuj.json_allocate);
			// vytvorOs znamena allokuj output stream ... skratka
			InputStream vytvorIn = new BufferedInputStream(vytvorConn.getInputStream());
			// vytvorIn znamena allokuj input stream ... skratka
			String inputResult = IOUtils.toString(vytvorIn, "UTF-8");
			System.out.println(vytvorOs);
			// vkladame odpoved allokujin do json formatu
			JSONObject resultToJson = new JSONObject(inputResult);
			resultCode = resultToJson.getInt("code");
			codeDescribtion = resultToJson.getString("desc");
			contextId = resultToJson.getString("contextId");
			opCode = resultToJson.getString("opCode");
			opGroup = resultToJson.getString("opGroup");
			vytvorIn.close();

			System.out.println("Návratový kód: " + resultCode);
			System.out.println("Popis kódu: " + codeDescribtion);
			System.out.println("Context ID:	" + contextId);
			System.out.println("opCode: " + opCode);
			System.out.println("opGroup: " + opGroup);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(jsonOperacie);

		}
	}

}
