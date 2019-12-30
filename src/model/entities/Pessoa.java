package model.entities;

public class Pessoa {
	
	private Integer codigo;
	private String nome;
	private String razaoSocial;
	private Double cpf;
	private Double rg;
	private Double cnpj;	
	private Double fone;
	private Double celular1;
	private Double celular2;
	private String email;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;	
	private Double CEP;
	private String pais;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer codigo, String nome, String razaoSocial, Double cpf, Double rg, Double cnpj, Double fone,
			Double celular1, Double celular2, String email, String endereco, String numero, String complemento,
			String bairro, String cidade, String uf, Double cEP, String pais) {
		this.codigo = codigo;
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.cpf = cpf;
		this.rg = rg;
		this.cnpj = cnpj;
		this.fone = fone;
		this.celular1 = celular1;
		this.celular2 = celular2;
		this.email = email;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		CEP = cEP;
		this.pais = pais;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Double getCpf() {
		return cpf;
	}

	public void setCpf(Double cpf) {
		this.cpf = cpf;
	}

	public Double getRg() {
		return rg;
	}

	public void setRg(Double rg) {
		this.rg = rg;
	}

	public Double getCnpj() {
		return cnpj;
	}

	public void setCnpj(Double cnpj) {
		this.cnpj = cnpj;
	}

	public Double getFone() {
		return fone;
	}

	public void setFone(Double fone) {
		this.fone = fone;
	}

	public Double getCelular1() {
		return celular1;
	}

	public void setCelular1(Double celular1) {
		this.celular1 = celular1;
	}

	public Double getCelular2() {
		return celular2;
	}

	public void setCelular2(Double celular2) {
		this.celular2 = celular2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Double getCEP() {
		return CEP;
	}

	public void setCEP(Double cEP) {
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
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		return true;
	}
	
	
	
	

}
