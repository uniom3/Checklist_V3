package model.entities;

import java.util.Date;

public class Documentos {
	
	private Integer codigo;
	private boolean or;
	private boolean os;
	private Integer documentoCodCliente;
	private String documentoNomCliente;
	private Integer classeCodDocumento;
	private String classeDocumento;
	private String descricao;
	private String documentoAntigo;
	private String diretorio;
	private String descricaoFinal;
	private String elaborado;
	private String aprovado;
	private boolean bAprovado;
	private boolean bAndamento;
	private boolean bParcConcluido;
	private boolean bConcluido;
	private Date data;
	
	public Documentos() {
		
	}

	

	public Documentos(Integer codigo, boolean or, boolean os, Integer documentoCodCliente, String documentoNomCliente,
			Integer classeCodDocumento, String classeDocumento, String descricao, String documentoAntigo,
			String diretorio, String descricaoFinal, String elaborado, String aprovado, boolean bAprovado,
			boolean bAndamento, boolean bParcConcluido, boolean bConcluido, Date data) {
		this.codigo = codigo;
		this.or = or;
		this.os = os;
		this.documentoCodCliente = documentoCodCliente;
		this.documentoNomCliente = documentoNomCliente;
		this.classeCodDocumento = classeCodDocumento;
		this.classeDocumento = classeDocumento;
		this.descricao = descricao;
		this.documentoAntigo = documentoAntigo;
		this.diretorio = diretorio;
		this.descricaoFinal = descricaoFinal;
		this.elaborado = elaborado;
		this.aprovado = aprovado;
		this.bAprovado = bAprovado;
		this.bAndamento = bAndamento;
		this.bParcConcluido = bParcConcluido;
		this.bConcluido = bConcluido;
		this.data = data;
	}



	
	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public boolean isOr() {
		return or;
	}

	public void setOr(boolean or) {
		this.or = or;
	}

	public boolean isOs() {
		return os;
	}

	public void setOs(boolean os) {
		this.os = os;
	}

	public Integer getDocumentoCodCliente() {
		return documentoCodCliente;
	}

	public void setDocumentoCodCliente(Integer documentoCodCliente) {
		this.documentoCodCliente = documentoCodCliente;
	}

	public String getDocumentoNomCliente() {
		return documentoNomCliente;
	}

	public void setDocumentoNomCliente(String documentoNomCliente) {
		this.documentoNomCliente = documentoNomCliente;
	}

	public Integer getClasseCodDocumento() {
		return classeCodDocumento;
	}

	public void setClasseCodDocumento(Integer classeCodDocumento) {
		this.classeCodDocumento = classeCodDocumento;
	}

	public String getClasseDocumento() {
		return classeDocumento;
	}

	public void setClasseDocumento(String classeDocumento) {
		this.classeDocumento = classeDocumento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDocumentoAntigo() {
		return documentoAntigo;
	}

	public void setDocumentoAntigo(String documentoAntigo) {
		this.documentoAntigo = documentoAntigo;
	}

	public String getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}

	public String getDescricaoFinal() {
		return descricaoFinal;
	}

	public void setDescricaoFinal(String descricaoFinal) {
		this.descricaoFinal = descricaoFinal;
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

	public boolean isbAprovado() {
		return bAprovado;
	}

	public void setbAprovado(boolean bAprovado) {
		this.bAprovado = bAprovado;
	}

	public boolean isbAndamento() {
		return bAndamento;
	}

	public void setbAndamento(boolean bAndamento) {
		this.bAndamento = bAndamento;
	}

	public boolean isbParcConcluido() {
		return bParcConcluido;
	}

	public void setbParcConcluido(boolean bParcConcluido) {
		this.bParcConcluido = bParcConcluido;
	}

	public boolean isbConcluido() {
		return bConcluido;
	}

	public void setbConcluido(boolean bConcluido) {
		this.bConcluido = bConcluido;
	}
	
	
	
	
	
	

}
