package model.entities;

import java.util.Date;

public class Desenhos {

	private Integer codigo;
	private String desenhoSetor;
	private String desenhoClasse;
	private Date data;
	private String desenhoAntigo;
	private String numero;
	private String descricao;
	private String caminhoArquivo;
	private Integer revisao;
	private String elaborado;
	private String aprovado;
	private String desenhoCliente;
	private Integer desenhoCodCliente;
	
	public Desenhos() {
		
	}

	public Desenhos(Integer codigo, String desenhoSetor, String desenhoClasse, Date data, String desenhoAntigo,
			String numero, String descricao, String caminhoArquivo, Integer revisao, String elaborado, String aprovado,
			String desenhoCliente, Integer desenhoCodCliente) {
		this.codigo = codigo;
		this.desenhoSetor = desenhoSetor;
		this.desenhoClasse = desenhoClasse;
		this.data = data;
		this.desenhoAntigo = desenhoAntigo;
		this.numero = numero;
		this.descricao = descricao;
		this.caminhoArquivo = caminhoArquivo;
		this.revisao = revisao;
		this.elaborado = elaborado;
		this.aprovado = aprovado;
		this.desenhoCliente = desenhoCliente;
		this.desenhoCodCliente = desenhoCodCliente;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDesenhoSetor() {
		return desenhoSetor;
	}

	public void setDesenhoSetor(String desenhoSetor) {
		this.desenhoSetor = desenhoSetor;
	}

	public String getDesenhoClasse() {
		return desenhoClasse;
	}

	public void setDesenhoClasse(String desenhoClasse) {
		this.desenhoClasse = desenhoClasse;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDesenhoAntigo() {
		return desenhoAntigo;
	}

	public void setDesenhoAntigo(String desenhoAntigo) {
		this.desenhoAntigo = desenhoAntigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}

	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}

	public Integer getRevisao() {
		return revisao;
	}

	public void setRevisao(Integer revisao) {
		this.revisao = revisao;
	}

	public String getElaborado() {
		return elaborado;
	}

	public void setElaborado(String elaborado) {
		this.elaborado = elaborado;
	}

	public String getAprovado() {
		return aprovado;
	}

	public void setAprovado(String aprovado) {
		this.aprovado = aprovado;
	}

	public String getDesenhoCliente() {
		return desenhoCliente;
	}

	public void setDesenhoCliente(String desenhoCliente) {
		this.desenhoCliente = desenhoCliente;
	}

	public Integer getDesenhoCodCliente() {
		return desenhoCodCliente;
	}

	public void setDesenhoCodCliente(Integer desenhoCodCliente) {
		this.desenhoCodCliente = desenhoCodCliente;
	}
	
	
	
	
}
