# HotelMenuHub
**HotelMenuHub** is a robust Menu Management System designed to manage a hotel's menu items, allowing staff to add, update, view, and delete menu items. The system categorizes dishes based on their type (e.g., Main Course, Desserts, Beverages) and provides detailed search and management capabilities. It uses JDBC for database connectivity and Maven for dependency management.

# Features
**Menu Item Management:**
- 1.Add new menu items with details such as name, price, and category (e.g., Main Course, Desserts, Beverages).
- 2.View all menu items or filter based on specific categories.
- 3.Update details of existing menu items (e.g., name, price, category).
- 4.Delete menu items by name.

**Category-wise Viewing:**
- Retrieve dishes categorized as Main Course, Desserts, Beverages, Starters, etc.

**Database Integration:**
- The system uses MySQL to store and retrieve menu data efficiently.

# Tech Stack
- **Java:** Primary language for backend development.
- **JDBC:** Used for database connectivity and operations.
- **MySQL:** Database for storing menu item details.
- **Maven:** Dependency management and project build tool.
- **Collections Framework:** Used to manage menu items dynamically in Java.

# Project Structure
- **HotelMenuHub/
├── src/
│   ├── com/
│   │   ├── controller/
│   │   │   └── MenuController.java
│   │   ├── dao/
│   │   │   └── MenuDAO.java
│   │   ├── entity/
│   │   │   └── Menu.java
│   │   ├── service/
│   │   │   └── MenuService.java
│   │   └── utility/
│   │       └── DatabaseConnection.java
├── pom.xml
├── README.md**

- **com.controller:** Handles business logic for menu operations (add, update, delete, view).
- **com.entity:** Represents the Menu entity with fields like name, price, and category.
- **com.dao**Responsible for performing CRUD operations with the database using JDBC.
- **com.service:** Contains the business logic to interact with the DAO layer and ensure smooth operations.
- **com.utility:** Includes database connection utilities and other helper classes.

# Key Functionalities
- **1. Add a New Menu Item**
Users can add new items by providing the name, price, and category.

Example Input:
Name: Pasta Alfredo  
Price: 250  
Category: Main Course  
Output:
Menu item added successfully!

- **2. Update Menu Item**
Users can update details like price or category for an existing menu item.

- **3. Delete Menu Item**
Items can be removed from the menu using their name or unique identifier.

- **4. View Menu**
View all menu items.
Filter by category (e.g., view only desserts or beverages).
Example Input:
Select category: Desserts
Output:
1. Chocolate Cake - ₹150  
2. Ice Cream Sundae - ₹200  
5. Find the Highest Priced Dish
Fetch the menu item with the highest price for special recommendations.

Output:
Lobster Thermidor - ₹1500
Sample Use Case
Add a Menu Item:
plaintext
Copy code
Input:  
Name: "Pasta Alfredo"  
Price: 250  
Category: "Main Course"  
Output:
Menu item added successfully!
Fetch the Highest Priced Dish:
Output:
Lobster Thermidor - ₹1500

This project offers a streamlined and efficient approach to managing hotel menu items, ensuring that operations remain organized and scalable.

**For any questions or feedback, feel free to reach out to **bondreashwini648@gmail.com****
