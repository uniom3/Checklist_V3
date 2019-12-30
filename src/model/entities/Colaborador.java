package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Colaborador implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private	 Integer    id   	;
	private	 String    nome    	;
	private	Boolean ativo 	;
	private	Boolean usuarioSistema 	;
	private	String cpf	;
	private	String nacionalidade 	;
	private	String naturalidade 	;
	private	String sexo 	;
	private	Date dataNascimento 	;
	private	String estadocivil 	;
	private	String rg 	;
	private	String orgaoemissor 	;
	private	Date dataemissao 	;
	private	String tituloeleitor 	;
	private	String cid 	;
	private	String cnh 	;
	private	String cnpj 	;
	private	String razaosocial 	;
	private	String cts 	;
	private	String seriects 	;
	private	Date emissaocts 	;
	private	String nis 	;
	private	String reservista 	;
	private	String cartasus 	;
	private	String esposa 	;
	private	String dependente 	;
	private	String dependente2 	;
	private	String dependente3 	;
	private	String cargo 	;
	private	String setor 	;
	private	Date admissao 	;
	private	String grau 	;
	private	String curso 	;
	private	String conclusao 	;
	private	String grau1 	;
	private	String curso1 	;
	private	String conclusao1 	;
	private	Date afastamento  	;
	private	String motivoafastamento 	;
	private	Date retorno 	;
	private	Date vencimentocontrato 	;
	private	Date prorrogacaocontrato  	;
	private	String formapagamento 	;
	private	Date demissao  	;
	private	String tipoconta 	;
	private	String banco 	;
	private	String agencia 	;
	private String conta 	;
	private	String digito 	;
	private	String tipoPessoa 	;
	private	String incricaoEstadual 	;
	private	String inscricaoMunicipal 	;
	private	String orgaoExpedidor   	;
	private	String email 	;
	private	String celular1 	;
	private	String celular2 	;
	private	 String endereco 	;
	private	String numero 	;
	private	 String complemento 	;
	private	 String bairro 	;
	private	 String uf 	;
	private	 String  cidade 	;
	private	 String CEP 	;
	private	 String pais;
	
	public Colaborador() {
		
	}

	public Colaborador(Integer id, String nome, Boolean ativo, Boolean usuarioSistema, String cpf, String nacionalidade,
			String naturalidade, String sexo, Date dataNascimento, String estadocivil, String rg, String orgaoemissor,
			Date dataemissao, String tituloeleitor, String cid, String cnh, String cnpj, String razaosocial, String cts,
			String seriects, Date emissaocts, String nis, String reservista, String cartasus, String esposa,
			String dependente, String dependente2, String dependente3, String cargo, String setor, Date admissao,
			String grau, String curso, String conclusao, String grau1, String curso1, String conclusao1,
			Date afastamento, String motivoafastamento, Date retorno, Date vencimentocontrato, Date prorrogacaocontrato,
			String formapagamento, Date demissao, String tipoconta, String banco, String agencia, String conta,
			String digito, String tipoPessoa, String incricaoEstadual, String inscricaoMunicipal, String orgaoExpedidor,
			String email, String celular1, String celular2, String endereco, String numero, String complemento,
			String bairro, String uf, String cidade, String cEP, String pais) {
		super();
		this.id = id;
		this.nome = nome;
		this.ativo = ativo;
		this.usuarioSistema = usuarioSistema;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.estadocivil = estadocivil;
		this.rg = rg;
		this.orgaoemissor = orgaoemissor;
		this.dataemissao = dataemissao;
		this.tituloeleitor = tituloeleitor;
		this.cid = cid;
		this.cnh = cnh;
		this.cnpj = cnpj;
		this.razaosocial = razaosocial;
		this.cts = cts;
		this.seriects = seriects;
		this.emissaocts = emissaocts;
		this.nis = nis;
		this.reservista = reservista;
		this.cartasus = cartasus;
		this.esposa = esposa;
		this.dependente = dependente;
		this.dependente2 = dependente2;
		this.dependente3 = dependente3;
		this.cargo = cargo;
		this.setor = setor;
		this.admissao = admissao;
		this.grau = grau;
		this.curso = curso;
		this.conclusao = conclusao;
		this.grau1 = grau1;
		this.curso1 = curso1;
		this.conclusao1 = conclusao1;
		this.afastamento = afastamento;
		this.motivoafastamento = motivoafastamento;
		this.retorno = retorno;
		this.vencimentocontrato = vencimentocontrato;
		this.prorrogacaocontrato = prorrogacaocontrato;
		this.formapagamento = formapagamento;
		this.demissao = demissao;
		this.tipoconta = tipoconta;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.digito = digito;
		this.tipoPessoa = tipoPessoa;
		this.incricaoEstadual = incricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.orgaoExpedidor = orgaoExpedidor;
		this.email = email;
		this.celular1 = celular1;
		this.celular2 = celular2;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.uf = uf;
		this.cidade = cidade;
		CEP = cEP;
		this.pais = pais;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Boolean getUsuarioSistema() {
		return usuarioSistema;
	}

	public void setUsuarioSistema(Boolean usuarioSistema) {
		this.usuarioSistema = usuarioSistema;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoemissor() {
		return orgaoemissor;
	}

	public void setOrgaoemissor(String orgaoemissor) {
		this.orgaoemissor = orgaoemissor;
	}

	public Date getDataemissao() {
		return dataemissao;
	}

	public void setDataemissao(Date dataemissao) {
		this.dataemissao = dataemissao;
	}

	public String getTituloeleitor() {
		return tituloeleitor;
	}

	public void setTituloeleitor(String tituloeleitor) {
		this.tituloeleitor = tituloeleitor;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getCts() {
		return cts;
	}

	public void setCts(String cts) {
		this.cts = cts;
	}

	public String getSeriects() {
		return seriects;
	}

	public void setSeriects(String seriects) {
		this.seriects = seriects;
	}

	public Date getEmissaocts() {
		return emissaocts;
	}

	public void setEmissaocts(Date emissaocts) {
		this.emissaocts = emissaocts;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getReservista() {
		return reservista;
	}

	public void setReservista(String reservista) {
		this.reservista = reservista;
	}

	public String getCartasus() {
		return cartasus;
	}

	public void setCartasus(String cartasus) {
		this.cartasus = cartasus;
	}

	public String getEsposa() {
		return esposa;
	}

	public void setEsposa(String esposa) {
		this.esposa = esposa;
	}

	public String getDependente() {
		return dependente;
	}

	public void setDependente(String dependente) {
		this.dependente = dependente;
	}

	public String getDependente2() {
		return dependente2;
	}

	public void setDependente2(String dependente2) {
		this.dependente2 = dependente2;
	}

	public String getDependente3() {
		return dependente3;
	}

	public void setDependente3(String dependente3) {
		this.dependente3 = dependente3;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getConclusao() {
		return conclusao;
	}

	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}

	public String getGrau1() {
		return grau1;
	}

	public void setGrau1(String grau1) {
		this.grau1 = grau1;
	}

	public String getCurso1() {
		return curso1;
	}

	public void setCurso1(String curso1) {
		this.curso1 = curso1;
	}

	public String getConclusao1() {
		return conclusao1;
	}

	public void setConclusao1(String conclusao1) {
		this.conclusao1 = conclusao1;
	}

	public Date getAfastamento() {
		return afastamento;
	}

	public void setAfastamento(Date afastamento) {
		this.afastamento = afastamento;
	}

	public String getMotivoafastamento() {
		return motivoafastamento;
	}

	public void setMotivoafastamento(String motivoafastamento) {
		this.motivoafastamento = motivoafastamento;
	}

	public Date getRetorno() {
		return retorno;
	}

	public void setRetorno(Date retorno) {
		this.retorno = retorno;
	}

	public Date getVencimentocontrato() {
		return vencimentocontrato;
	}

	public void setVencimentocontrato(Date vencimentocontrato) {
		this.vencimentocontrato = vencimentocontrato;
	}

	public Date getProrrogacaocontrato() {
		return prorrogacaocontrato;
	}

	public void setProrrogacaocontrato(Date prorrogacaocontrato) {
		this.prorrogacaocontrato = prorrogacaocontrato;
	}

	public String getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}

	public Date getDemissao() {
		return demissao;
	}

	public void setDemissao(Date demissao) {
		this.demissao = demissao;
	}

	public String getTipoconta() {
		return tipoconta;
	}

	public void setTipoconta(String tipoconta) {
		this.tipoconta = tipoconta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getIncricaoEstadual() {
		return incricaoEstadual;
	}

	public void setIncricaoEstadual(String incricaoEstadual) {
		this.incricaoEstadual = incricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colaborador other = (Colaborador) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
}


