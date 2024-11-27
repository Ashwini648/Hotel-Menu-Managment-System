package com.menu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MenuDelete {
	 private static final String DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
	    private static final String DB_URL = "jdbc:mysql://localhost:3307/advjava193";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "root";
	    
	    public boolean deleteMenu(String menuName) {
	        String query = "DELETE FROM hotelmenu WHERE menuname = ?";

	        try {
	            Class.forName(DRIVER_PATH);
	            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
	            PreparedStatement stmt = connection.prepareStatement(query);

	            stmt.setString(1, menuName);

	            int rows = stmt.executeUpdate();
	            stmt.close();
	            connection.close();

	            if (rows > 0) {
	                System.out.println("Menu item deleted successfully.");
	                return true;
	            } else {
	                System.out.println("Menu item not found.");
	                return false;
	            }

	        } catch (Exception e) {
	            System.out.println("An error occurred while deleting the menu item.");
	            e.printStackTrace();
	        }

	        return false;
	    }
}
