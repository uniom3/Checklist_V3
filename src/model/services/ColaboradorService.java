package model.services;

import java.util.List;

import gui.ColaboradorController;
import model.dao.DaoFactory;
import model.dao.ColaboradorDao;
import model.entities.Colaborador;

public class ColaboradorService {
	
	ColaboradorController controller = new ColaboradorController();
	
	private ColaboradorDao dao = DaoFactory.createColaboradorDao();

	public List<Colaborador> findAll() {
		return dao.findAll();
	}

	public void saveOrUpdate(Colaborador obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
			System.out.println("insert");
		} else {
			dao.update(obj);
			System.out.println("update");
		}
	}

	public void remove(Colaborador obj) {
		dao.deleteById(obj.getId());
	}

}
