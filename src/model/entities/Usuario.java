package model.entities;

public class Usuario {
private Integer codigo;
private boolean ativo;
private Integer codigoColaborador;
private String nomeColaborador;
private String grupoUsuario;
private String login;
private String senha;

public Usuario() {
	
}

public Usuario(Integer codigo, boolean ativo, Integer codigoColaborador, String nomeColaborador, String grupoUsuario,
		String login, String senha) {
	this.codigo = codigo;
	this.ativo = ativo;
	this.codigoColaborador = codigoColaborador;
	this.nomeColaborador = nomeColaborador;
	this.grupoUsuario = grupoUsuario;
	this.login = login;
	this.senha = senha;
}

public Integer getCodigo() {
	return codigo;
}

public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}

public boolean isAtivo() {
	return ativo;
}

public void setAtivo(boolean ativo) {
	this.ativo = ativo;
}

public Integer getCodigoColaborador() {
	return codigoColaborador;
}

public void setCodigoColaborador(Integer codigoColaborador) {
	this.codigoColaborador = codigoColaborador;
}

public String getNomeColaborador() {
	return nomeColaborador;
}

public void setNomeColaborador(String nomeColaborador) {
	this.nomeColaborador = nomeColaborador;
}

public String getGrupoUsuario() {
	return grupoUsuario;
}

public void setGrupoUsuario(String grupoUsuario) {
	this.grupoUsuario = grupoUsuario;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
	result = prime * result + ((codigoColaborador == null) ? 0 : codigoColaborador.hashCode());
	result = prime * result + ((login == null) ? 0 : login.hashCode());
	result = prime * result + ((nomeColaborador == null) ? 0 : nomeColaborador.hashCode());
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
	Usuario other = (Usuario) obj;
	if (codigo == null) {
		if (other.codigo != null)
			return false;
	} else if (!codigo.equals(other.codigo))
		return false;
	if (codigoColaborador == null) {
		if (other.codigoColaborador != null)
			return false;
	} else if (!codigoColaborador.equals(other.codigoColaborador))
		return false;
	if (login == null) {
		if (other.login != null)
			return false;
	} else if (!login.equals(other.login))
		return false;
	if (nomeColaborador == null) {
		if (other.nomeColaborador != null)
			return false;
	} else if (!nomeColaborador.equals(other.nomeColaborador))
		return false;
	return true;
}




	
}
