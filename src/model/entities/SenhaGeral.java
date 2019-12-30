package model.entities;

public class SenhaGeral {
	private String senhaColaborador;
	private String novaSenha;
	private String novaSenhaConfirmacao;
	
	
	public SenhaGeral() {
		
	}


	public SenhaGeral(String senhaColaborador, String novaSenha, String novaSenhaConfirmacao) {
		this.senhaColaborador = senhaColaborador;
		this.novaSenha = novaSenha;
		this.novaSenhaConfirmacao = novaSenhaConfirmacao;
	}


	public String getSenhaColaborador() {
		return senhaColaborador;
	}


	public void setSenhaColaborador(String senhaColaborador) {
		this.senhaColaborador = senhaColaborador;
	}


	public String getNovaSenha() {
		return novaSenha;
	}


	public void setNovaSenha(String novaSenha) {
		this.novaSenha = novaSenha;
	}


	public String getNovaSenhaConfirmacao() {
		return novaSenhaConfirmacao;
	}


	public void setNovaSenhaConfirmacao(String novaSenhaConfirmacao) {
		this.novaSenhaConfirmacao = novaSenhaConfirmacao;
	}
	
	
	

}
