package com.menu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.menu.entity.Menu;

public class MenuInsert {

	public List<Menu> insertMenu() {
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3307/advjava193";
		String usname = "root";
		String pwd = "root";

		String query = "INSERT INTO hotelmenu (menuname, description, price, available, category) VALUES (?, ?, ?, ?, ?)";
		List<Menu> menuList = new ArrayList<>();

		try {
			Class.forName(path);
			System.out.println("Driver loaded.");

			Connection connection = DriverManager.getConnection(url, usname, pwd);
			PreparedStatement stmt = connection.prepareStatement(query); 

			System.out.println("Connected to the database.");

			stmt.setString(1, "Kachori");
			stmt.setString(2, "Kachori is a popular Indian deep-fried snack filled with a variety of flavorful fillings");
			stmt.setInt(3, 100);
			stmt.setBoolean(4, true); 
			stmt.setString(5, "Snack");

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Data inserted successfully.");
			} else {
				System.out.println("Data not inserted.");
			}


			Menu menu = new Menu();
			menuList.add(menu);

		} catch (Exception e) {
			System.out.println("An error occurred while inserting the menu item.");
			e.printStackTrace();
		}

		return menuList; 
	}
}