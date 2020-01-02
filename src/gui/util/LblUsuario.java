package gui.util;

import java.sql.Connection;

import model.dao.impl.MainViewDaoJDBC;

public class LblUsuario {
	
	private static String usuario;
	private Connection conn;
	
	public LblUsuario() {
		
	}
	
	
	public LblUsuario(String usuario) {		
		LblUsuario.usuario = usuario;
		setUsuario(usuario);
		
	}
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		LblUsuario.usuario = usuario;
	}
	
	
}
