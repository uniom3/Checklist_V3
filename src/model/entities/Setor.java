package model.entities;

public class Setor {
	
	private Integer numeral;
	private String equipamento;
	
	public Setor() {
		
	}

	public Setor(Integer numeral, String equipamento) {
		this.numeral = numeral;
		this.equipamento = equipamento;
	}

	public Integer getNumeral() {
		return numeral;
	}

	public void setNumeral(Integer numeral) {
		this.numeral = numeral;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	
	

}
