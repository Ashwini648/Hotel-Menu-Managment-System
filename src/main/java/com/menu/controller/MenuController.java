package com.menu.controller;

import java.util.ArrayList;
import java.util.List;

import com.menu.entity.Menu;
import com.menu.service.MenuService;

public class MenuController {

	private MenuService service = new MenuService();

	// Method to fetch all menu items
	public List<Menu> getAllMenu() {
		return service.getAllMenu();
	}

	// Method to insert a new menu item
	public void insertMenu(String menuName, int price, String category) {
		service.insertMenu(menuName, price, category);
	}

	// Method to update an existing menu item's price
	public void updateMenu(String menuName, int newPrice) {
		service.updateMenu(menuName, newPrice);
	}

	// Method to delete a menu item
	public void deleteMenu(String menuName) {
		service.deleteMenu(menuName);
	}

	// Method to fetch all Main Course items
	public List<Menu> getAllMainCourse() {
		List<Menu> allMenu = service.getAllMenu();
		List<Menu> mainCourseItems = new ArrayList<>();
		for (Menu menu : allMenu) {
			if ("Main Course".equalsIgnoreCase(menu.getCategory())) {
				mainCourseItems.add(menu);
			}
		}
		return mainCourseItems;
	}

	// Method to fetch all Dessert items
	public List<Menu> getAllDesserts() {
		List<Menu> allMenu = service.getAllMenu();
		List<Menu> dessertItems = new ArrayList<>();
		for (Menu menu : allMenu) {
			if ("Dessert".equalsIgnoreCase(menu.getCategory())) {
				dessertItems.add(menu);
			}
		}
		return dessertItems;
	}

	// Method to fetch all Beverages items
	public List<Menu> getAllBeverages() {
		List<Menu> allMenu = service.getAllMenu();
		List<Menu> beverages = new ArrayList<>();
		for (Menu menu : allMenu) {
			if ("Beverages".equalsIgnoreCase(menu.getCategory())) {
				beverages.add(menu);
			}
		}
		return beverages;
	}

	// Method to fetch all Chinese items
	public List<Menu> getAllChinese() {
		List<Menu> allMenu = service.getAllMenu();
		List<Menu> chinese = new ArrayList<>();
		for (Menu menu : allMenu) {
			if ("Chinese".equalsIgnoreCase(menu.getCategory())) {
				chinese.add(menu);
			}
		}
		return chinese;
	}

	// Method to fetch all Starter items
	public List<Menu> getAllStarter() {
		List<Menu> allMenu = service.getAllMenu();
		List<Menu> starter = new ArrayList<>();
		for (Menu menu : allMenu) {
			if ("Starter".equalsIgnoreCase(menu.getCategory())) {
				starter.add(menu);
			}
		}
		return starter;
	}

	// Method to fetch all Bread items
	public List<Menu> getAllBread() {
		List<Menu> allMenu = service.getAllMenu();
		List<Menu> bread = new ArrayList<>();
		for (Menu menu : allMenu) {
			if ("Bread".equalsIgnoreCase(menu.getCategory())) {
				bread.add(menu);
			}
		}
		return bread;
	}

	// Method to fetch all North Indian items
	public List<Menu> getAllNorthIndian() {
		List<Menu> allMenu = service.getAllMenu();
		List<Menu> northIndian = new ArrayList<>();
		for (Menu menu : allMenu) {
			if ("North Indian".equalsIgnoreCase(menu.getCategory())) {
				northIndian.add(menu);
			}
		}
		return northIndian;
	}

	// Method to fetch all Soup items
	public List<Menu> getAllSoup() {
		List<Menu> allMenu = service.getAllMenu();
		List<Menu> soup = new ArrayList<>();
		for (Menu menu : allMenu) {
			if ("Soup".equalsIgnoreCase(menu.getCategory())) {
				soup.add(menu);
			}
		}
		return soup;
	}

	public boolean isDishAvailable(String dishName) {
		List<Menu> allMenu = service.getAllMenu();
		for (Menu menu : allMenu) {
			if (dishName.equalsIgnoreCase(menu.getMenuname()) && 
					"True".equalsIgnoreCase(menu.getAvailable())) {
				return true;
			}
		}
		return false;
	}
}

