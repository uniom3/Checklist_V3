package model.dao.impl;

import java.sql.Connection;
import java.util.List;
import model.dao.PrincipalDao;
import model.entities.Principal;


public class PrincipalDaoJDBC implements PrincipalDao {

	private Connection conn;
	
	public PrincipalDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Principal obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Principal obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Principal findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Principal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
