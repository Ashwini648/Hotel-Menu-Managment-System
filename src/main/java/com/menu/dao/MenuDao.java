package com.menu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.menu.entity.Menu;

public class MenuDao {

	public List<Menu> getAllMenu() {
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3307/advjava193";
		String usname = "root";
		String pwd = "root";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		List<Menu> menuList = new ArrayList<>();

		try {
			Class.forName(path);
			connection = DriverManager.getConnection(url, usname, pwd);
			statement = connection.createStatement();
			String query = "SELECT * FROM advjava193.hotelmenu";
			rs = statement.executeQuery(query);

			while (rs.next()) {
				// Fetching values from ResultSet
				String menuname = rs.getString("menuname");
				String description = rs.getString("description");
				int price = rs.getInt("price");
				String available = rs.getString("available");
				String category = rs.getString("category");

				// Creating a Menu object and setting values
				Menu menu = new Menu();
				menu.setMenuname(menuname);
				menu.setDescription(description);
				menu.setPrice(price);
				menu.setAvailable(available);
				menu.setCategory(category);

				// Adding Menu object to the list
				menuList.add(menu);
			}

		} catch (Exception e) {
			System.out.println("An error occurred during SELECT operation.");
			e.printStackTrace();
		} 

		return menuList;
	}
}
