package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.entities.Login;



public class MainViewDaoJDBC {
	
	
	private Connection conn;
	private String usuario1;
	private String senha1;
	Login obj;
	PreparedStatement st = null;
	ResultSet rs = null;
	
	public MainViewDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	public String getUsuario() {
		return usuario1;
	}

	public void setUsuario(String usuario) {
		this.usuario1 = usuario;
	}

	public String getSenha() {
		return senha1;
	}

	public void setSenha(String senha) {
		this.senha1 = senha;
	}

	public Login getObj() {
		return obj;
	}

	public void setObj(Login obj) {
		this.obj = obj;
	}



	private Login instantiateLogin(ResultSet rs) {
		Login obj = new Login();
		try {
			obj.setUsuario(rs.getString("login"));
			obj.setSenha(rs.getString("senha"));
		} catch (SQLException e) {
			e.getMessage();
		}

		return obj;
	}
	
	

	public void verificar(String usuario, String senha) {
			try {
			st = conn.prepareStatement("select * from tb_usuario where login = '?' and senha = '?'");
			st.setString(1, usuario);
			st.setString(2, senha);
			System.out.println(st);
			rs = st.executeQuery();
			rs.next();
			obj = instantiateLogin(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
