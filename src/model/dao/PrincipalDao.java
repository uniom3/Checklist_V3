package model.dao;

import java.util.List;

import model.entities.Principal;

public interface PrincipalDao {

	void insert(Principal obj);
	void update(Principal obj);
	void deleteById(Integer id);
	Principal findById(Integer id);
	List<Principal> findAll();
}
