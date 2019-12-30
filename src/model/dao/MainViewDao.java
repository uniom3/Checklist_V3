package model.dao;

import java.util.List;

import model.entities.MainView;

public interface MainViewDao {

	void insert(MainView obj);
	void update(MainView obj);
	void deleteById(Integer id);
	MainView findById(Integer id);
	MainView findByUser(String usuario, String senha);
	List<MainView> findAll();
}