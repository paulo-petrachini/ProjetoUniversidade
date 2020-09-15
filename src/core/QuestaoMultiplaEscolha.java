package core;

public class QuestaoMultiplaEscolha extends QuestaoSimples {
	private String resp1;
	private String resp2;
	private String resp3;
	private String resp4;
	
	public String aplicarQuestao() {
		return super.enunciado+"\n"+" Alt. 1: "+this.resp1+" Alt. 2"+this.resp2+" Alt. 3"+this.resp3+"Alt. 4"+this.resp4;
	}

	public QuestaoMultiplaEscolha(String enunciado, String resposta, String resp1, String resp2, String resp3, String resp4) {
		super(enunciado, resposta);
		this.resp1 = resp1;
		this.resp2 = resp2;
		this.resp3 = resp3;
		this.resp4 = resp4;
	}

	public String getResp1() {
		return resp1;
	}

	public void setResp1(String resp1) {
		this.resp1 = resp1;
	}

	public String getResp2() {
		return resp2;
	}

	public void setResp2(String resp2) {
		this.resp2 = resp2;
	}

	public String getResp3() {
		return resp3;
	}

	public void setResp3(String resp3) {
		this.resp3 = resp3;
	}
	
	public String getResp4() {
		return resp4;
	}

	public void setResp4(String resp4) {
		this.resp3 = resp4;
	}
	
}
