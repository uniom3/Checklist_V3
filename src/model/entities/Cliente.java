package model.entities;

public class Cliente extends Pessoa {
	
	private Integer codigo;
	private boolean ativo;
	private String tipoPessoa;
	private double incricaoEstadual;
	private double inscricaoMunicipal;
	private String orgaoExpedidor;
	private String enderecoCobranca;
	private String numeroCobranca;
	private String complementoCobranca;
	private String bairroCobranca;
	private String paisCobranca;
	private String ufCobranca;
	private String cidadeCobranca;
	private double CEPCobranca;
	private String dadosContato1;
	private String ramalContato1;
	private String fone2Contato1;
	private String faxContato1;
	private String dadosContato2;
	private String foneContato2;
	private String ramalContato2;
	private String fone2Contato2;
	private String emailContato2;
	private String faxContato2;
	
	public Cliente() {
		
	}

	public Cliente(Integer codigo, boolean ativo, String tipoPessoa, double incricaoEstadual, double inscricaoMunicipal,
			String orgaoExpedidor, String enderecoCobranca, String numeroCobranca, String complementoCobranca,
			String bairroCobranca, String paisCobranca, String ufCobranca, String cidadeCobranca, double cEPCobranca,
			String dadosContato1, String ramalContato1, String fone2Contato1, String faxContato1, String dadosContato2,
			String foneContato2, String ramalContato2, String fone2Contato2, String emailContato2, String faxContato2) {
		super();
		this.codigo = codigo;
		this.ativo = ativo;
		this.tipoPessoa = tipoPessoa;
		this.incricaoEstadual = incricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.orgaoExpedidor = orgaoExpedidor;
		this.enderecoCobranca = enderecoCobranca;
		this.numeroCobranca = numeroCobranca;
		this.complementoCobranca = complementoCobranca;
		this.bairroCobranca = bairroCobranca;
		this.paisCobranca = paisCobranca;
		this.ufCobranca = ufCobranca;
		this.cidadeCobranca = cidadeCobranca;
		this.CEPCobranca = cEPCobranca;
		this.dadosContato1 = dadosContato1;
		this.ramalContato1 = ramalContato1;
		this.fone2Contato1 = fone2Contato1;
		this.faxContato1 = faxContato1;
		this.dadosContato2 = dadosContato2;
		this.foneContato2 = foneContato2;
		this.ramalContato2 = ramalContato2;
		this.fone2Contato2 = fone2Contato2;
		this.emailContato2 = emailContato2;
		this.faxContato2 = faxContato2;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public double getIncricaoEstadual() {
		return incricaoEstadual;
	}

	public void setIncricaoEstadual(double incricaoEstadual) {
		this.incricaoEstadual = incricaoEstadual;
	}

	public double getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(double inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	public String getEnderecoCobranca() {
		return enderecoCobranca;
	}

	public void setEnderecoCobranca(String enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}

	public String getNumeroCobranca() {
		return numeroCobranca;
	}

	public void setNumeroCobranca(String numeroCobranca) {
		this.numeroCobranca = numeroCobranca;
	}

	public String getComplementoCobranca() {
		return complementoCobranca;
	}

	public void setComplementoCobranca(String complementoCobranca) {
		this.complementoCobranca = complementoCobranca;
	}

	public String getBairroCobranca() {
		return bairroCobranca;
	}

	public void setBairroCobranca(String bairroCobranca) {
		this.bairroCobranca = bairroCobranca;
	}

	public String getPaisCobranca() {
		return paisCobranca;
	}

	public void setPaisCobranca(String paisCobranca) {
		this.paisCobranca = paisCobranca;
	}

	public String getUfCobranca() {
		return ufCobranca;
	}

	public void setUfCobranca(String ufCobranca) {
		this.ufCobranca = ufCobranca;
	}

	public String getCidadeCobranca() {
		return cidadeCobranca;
	}

	public void setCidadeCobranca(String cidadeCobranca) {
		this.cidadeCobranca = cidadeCobranca;
	}

	public double getCEPCobranca() {
		return CEPCobranca;
	}

	public void setCEPCobranca(double cEPCobranca) {
		CEPCobranca = cEPCobranca;
	}

	public String getDadosContato1() {
		return dadosContato1;
	}

	public void setDadosContato1(String dadosContato1) {
		this.dadosContato1 = dadosContato1;
	}

	public String getRamalContato1() {
		return ramalContato1;
	}

	public void setRamalContato1(String ramalContato1) {
		this.ramalContato1 = ramalContato1;
	}

	public String getFone2Contato1() {
		return fone2Contato1;
	}

	public void setFone2Contato1(String fone2Contato1) {
		this.fone2Contato1 = fone2Contato1;
	}

	public String getFaxContato1() {
		return faxContato1;
	}

	public void setFaxContato1(String faxContato1) {
		this.faxContato1 = faxContato1;
	}

	public String getDadosContato2() {
		return dadosContato2;
	}

	public void setDadosContato2(String dadosContato2) {
		this.dadosContato2 = dadosContato2;
	}

	public String getFoneContato2() {
		return foneContato2;
	}

	public void setFoneContato2(String foneContato2) {
		this.foneContato2 = foneContato2;
	}

	public String getRamalContato2() {
		return ramalContato2;
	}

	public void setRamalContato2(String ramalContato2) {
		this.ramalContato2 = ramalContato2;
	}

	public String getFone2Contato2() {
		return fone2Contato2;
	}

	public void setFone2Contato2(String fone2Contato2) {
		this.fone2Contato2 = fone2Contato2;
	}

	public String getEmailContato2() {
		return emailContato2;
	}

	public void setEmailContato2(String emailContato2) {
		this.emailContato2 = emailContato2;
	}

	public String getFaxContato2() {
		return faxContato2;
	}

	public void setFaxContato2(String faxContato2) {
		this.faxContato2 = faxContato2;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
	
}
