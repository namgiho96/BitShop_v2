package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {

	public void crateAdmin();

	public ArrayList<AdminBean> alllistAdmin();

	public ArrayList<AdminBean> findbyAuth(String auth);

	public AdminBean findByName(String name);

	public int countAdmin();

	public boolean existAdmin(String id,String pass);

	public void update();

	public void delete(String name,String pass);
}
