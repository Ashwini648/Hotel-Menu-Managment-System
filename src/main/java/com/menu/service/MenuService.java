package com.menu.service;

import java.util.List;

import com.menu.dao.MenuDao;
import com.menu.dao.MenuDelete;
import com.menu.dao.MenuInsert;
import com.menu.dao.MenuUpdate;
import com.menu.entity.Menu;

public class MenuService {
	MenuDao dao;
	public List<Menu> getAllMenu(){
		//		System.out.println("we are in service class...");
		dao= new MenuDao();
		List<Menu> allMenu = dao.getAllMenu();
		return allMenu;
	}
	public List<Menu> insertMenu(){
		//		System.out.println("we are in service class...");
		MenuInsert insert= new MenuInsert();
		List<Menu> allMenu = insert.insertMenu();
		return allMenu;
	}

	public void updateMenu(String menuName, int newPrice){
		//		System.out.println("we are in service class...");
		MenuUpdate update= new MenuUpdate();
		update.updateMenu(menuName, newPrice);

	}

	public void deleteMenu(String menuName){
		//		System.out.println("we are in service class...");
		MenuDelete delete= new MenuDelete();
		delete.deleteMenu(menuName);
	}
	public void insertMenu(String menuName, int price, String category) {
		MenuInsert insert= new MenuInsert();
		List<Menu> allMenu = insert.insertMenu();
		return ;
	}
}

