package model.entities;

public class Classificacao {
	
	private Integer codigo;
	private String equipamento;
	
	public Classificacao() {
		
	}

	public Classificacao(Integer codigo, String equipamento) {
		this.codigo = codigo;
		this.equipamento = equipamento;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	
	
	

}
