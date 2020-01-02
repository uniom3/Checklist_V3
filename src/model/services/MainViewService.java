package model.services;

import gui.MainViewController;
import model.dao.DaoFactory;
import model.dao.MainViewDao;
import model.dao.impl.MainViewDaoJDBC;
import model.entities.MainView;

public class MainViewService {
	
MainViewController mainView = new MainViewController();

public void saveOrUpdate (MainView obj) {
	private MainViewDao dao = DaoFactory.createMainViewDao();
	
	if (obj.getId() == null) {
		dao.insert(obj);
	}
	else {
		dao.update(obj);
	}
}

	
}
