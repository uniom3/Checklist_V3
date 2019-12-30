package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.MainViewDao;
//import model.entities.Login;
import model.entities.MainView;



public class MainViewDaoJDBC implements MainViewDao {
	
	
	private Connection conn;
	private String usuario1;
	private String senha1;
	MainView obj;
	
	
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

	public MainView getObj() {
		return obj;
	}

	public void setObj(MainView obj) {
		this.obj = obj;
	}



	private MainView instantiateLogin(ResultSet rs) {
		MainView obj = new MainView();
		try {
			obj.setUsuario(rs.getString("login"));
			obj.setSenha(rs.getString("senha"));
		
		} catch (SQLException e) {
			e.getMessage();
		}
		return obj;
		
	
		
	}
	
	

	public Object verificar(String usuario, String senha) {
			
			return null;

	}

	@Override
	public void insert(MainView obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MainView obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MainView findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MainView> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MainView findByUser(String usuario, String senha) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {	
			st =  conn.prepareStatement("select * from tb_usuario where login = '?' and senha = '?'");
			st.setString(1, usuario);
			st.setString(2, senha);
			System.out.println(st);
			rs = st.executeQuery();
			rs.next();
			obj = instantiateMainView(rs);
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
	
	private MainView instantiateMainView(ResultSet rs) throws SQLException {
		MainView obj = new MainView();
		obj.setId(rs.getInt("Id"));
		obj.setUsuario(rs.getString("usuario"));
		obj.setSenha(rs.getString("senha"));
		return obj;
	}

}
