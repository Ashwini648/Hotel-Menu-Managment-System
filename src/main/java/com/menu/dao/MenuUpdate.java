package com.menu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MenuUpdate {
	
	 private static final String DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
	    private static final String DB_URL = "jdbc:mysql://localhost:3307/advjava193";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "root";

	public void updateMenu(String menuName, int newPrice) {
        String query = "UPDATE hotelmenu SET price = ? WHERE menuname = ?";

        try {
            Class.forName(DRIVER_PATH);
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setInt(1, newPrice);
            stmt.setString(2, menuName);

            int rows = stmt.executeUpdate();
            stmt.close();
            connection.close();

            if (rows > 0) {
                System.out.println("Menu item updated successfully.");
            } else {
                System.out.println("Menu item not found.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred while updating the menu item.");
            e.printStackTrace();
        }

    }

}
