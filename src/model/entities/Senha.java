package model.entities;

public class Senha {
	private String novaSenha;
	private String novaSenhaConfirmacao;
	public Senha(String novaSenha, String novaSenhaConfirmacao) {
		this.novaSenha = novaSenha;
		this.novaSenhaConfirmacao = novaSenhaConfirmacao;
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
