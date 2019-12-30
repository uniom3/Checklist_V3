package model.entities;

public class Ativo {
	
	private String sim;
	private String nao;
	
	public Ativo() {
		
	}

	public Ativo(String sim, String nao) {
		super();
		this.sim = sim;
		this.nao = nao;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getNao() {
		return nao;
	}

	public void setNao(String nao) {
		this.nao = nao;
	}
	
	
	

}
