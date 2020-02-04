public class JsonKontainer {

	// definicia rôznych URL použivanych v gapa
	String gapa_url = "https://tgapa.csob.cz:47777/rs/v3/";
	String paystart_url = gapa_url + "pay/start";
	String answer_url = gapa_url + "pay/answer";
	String release_url = gapa_url + "release";
	String progress_url = gapa_url + "progress";
	String ticket_url = gapa_url + "pay/ticket";
	String result_url = gapa_url + "pay/result";
	String allocate_url = gapa_url + "allocate";
	String answerT = "\"answerYes\":\"true\"";
	String answerF = "\"answerYes\":\"false\"";
	String termLang = "\"termLang\":\"NATURAL\"";
	String uuid = "\"uuid\":\"1111111111\"";
	String operationPay = "\"operation\":\"PAY\"";
	String operationReversal = "\"operation\":\"REVERSAL\"";
	String operationRevLast = "\"operation\":\"REVERSALLASTPAYMENT\"";
	String totalAmount = "\"totalAmount\":\"100\"";
	String cashbackAmount = "\"cashbackAmount\":\"0\"";
	String currency = "\"currency\":\"978\"";
	String language = "\"language\":\"NATURAL\"";
	String invoiceNo1 = "\"invoiceNo1\":\"\"";
	String invoiceNo2 = "\"invoiceNo2\":\"1\"";
	String authCode = "\"authCode\":\"\"";
	String preathDataBase64 = "\"preauthDataBase64\":\"\"";
	String merchantId = "\"merchantId\":\"1\"";
	String appId = "\"appId\":\"NODEFINE\"";
	String manualEntryCard = "\"manualEntryCard\":\"false\"";
	String json_allocate = termLang + "," + uuid + "}";
	String json_paystart = "{" + uuid + "," + operationPay + "," + totalAmount + "," + cashbackAmount + "," + currency
			+ "," + language + "," + invoiceNo1 + "," + invoiceNo2 + "," + authCode + "," + preathDataBase64 + ","
			+ merchantId + "," + appId + "," + manualEntryCard + ",";
	String json_release = "{" + uuid + ",";
	String json_progress = "{" + uuid + ",";

	String contextId;

	public JsonKontainer() {

	}

	public String getAllocateJson(String termId) {
		String payStartJson = "{\"termId\":\"" + termId + "\",\"secureId\":\"" + termId + "\"," + json_allocate;
		return payStartJson;
	}

	public String getPayStartJson(String ziskaneContextId) {
		String contextId = ziskaneContextId;
		String payStartJson = json_paystart + "\"contextId\":\"" + contextId + "\"}";
		return payStartJson;
	}

	public String getProgressJson(String ziskaneContextId) {
		String contextId = ziskaneContextId;
		String progressJson = json_progress + "\"contextId\":\"" + contextId + "\"}";
		return progressJson;
	}

	public String getReleaseJson(String ziskaneContextId) {
		String contextId = ziskaneContextId;
		String releaseJson = json_release + "\"contextId\":\"" + contextId + "\"}";
		return releaseJson;
	}

	public String getContextId() {
		return contextId;

	}

}
