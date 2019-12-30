package model.entities;

public class Classe {
	
	private Integer codigo;
	private String classe;
	
	public Classe() {
		
	}

	public Classe(Integer codigo, String classe) {
		this.codigo = codigo;
		this.classe = classe;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	
	

}
