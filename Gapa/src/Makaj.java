public class Makaj {

	public static void main(String[] args) {
		JsonKontainer jsonKontainer = new JsonKontainer();

		SendUrlJson sendUrlJson = new SendUrlJson(jsonKontainer.allocate_url,
				jsonKontainer.setAllocateJson("X1AKOGAPA1"));
		sendUrlJson.posliJsonToUrl();
		// System.out.println(sendUrlJson.resultCode);

	}

}
