package model.dao;

import db.DB;
import model.dao.impl.ColaboradorDaoJDBC;

public class DaoFactory {

	public static ColaboradorDao createColaboradorDao() {
		return new ColaboradorDaoJDBC(DB.getConnection());
	}
	
}
