package com.menu.client;

import java.util.List;
import java.util.Scanner;
import com.menu.controller.MenuController;
import com.menu.entity.Menu;

public class MenuClient {

    public static void main(String[] args) {
        MenuController controller = new MenuController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- Menu ---");
            System.out.println("1. View All Menu Items");
            System.out.println("2. Insert New Menu Item");
            System.out.println("3. Update Menu Item");
            System.out.println("4. Delete Menu Item");
            System.out.println("5. View Main Course Items");
            System.out.println("6. View Dessert Items");
            System.out.println("7. View Beverages Items");
            System.out.println("8. View Chinese Items");
            System.out.println("9. View Starter Items");
            System.out.println("10. View Bread Items");
            System.out.println("11. View North Indian Items");
            System.out.println("12. View Soup Items");
            System.out.println("13.Dish avalible or not");
            System.out.println("14........Exit.........");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    List<Menu> allMenu = controller.getAllMenu();
                    for (Menu menu : allMenu) {
                        System.out.println(menu);
                    }
                    break;
                case 2:
                    System.out.print("Enter the name of the new menu item: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter the price of the new menu item: ");
                    int itemPrice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter the category (e.g., Main Course/Dessert): ");
                    String itemCategory = scanner.nextLine();

                    controller.insertMenu(itemName, itemPrice, itemCategory);
                    break;
                case 3:
                    System.out.print("Enter the name of the menu item to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter the new price: ");
                    int newPrice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    controller.updateMenu(updateName, newPrice);
                    break;
                case 4:
                    System.out.print("Enter the name of the menu item to delete: ");
                    String deleteName = scanner.nextLine();

                    controller.deleteMenu(deleteName);
                    break;
                case 5:
                    System.out.println("--- Main Course Items ---");
                    List<Menu> mainCourseItems = controller.getAllMainCourse();
                    for (Menu menu : mainCourseItems) {
                        System.out.println(menu);
                    }
                    break;
                case 6:
                    System.out.println("--- Dessert Items ---");
                    List<Menu> dessertItems = controller.getAllDesserts();
                    for (Menu menu : dessertItems) {
                        System.out.println(menu);
                    }
                    break;
                case 7:
                    System.out.println("--- Beverages Items ---");
                    List<Menu> beverages = controller.getAllBeverages();
                    for (Menu menu : beverages) {
                        System.out.println(menu);
                    }
                    break;
                case 8:
                    System.out.println("--- Chinese Items ---");
                    List<Menu> chinese = controller.getAllChinese();
                    for (Menu menu : chinese) {
                        System.out.println(menu);
                    }
                    break;
                case 9:
                    System.out.println("--- Starter Items ---");
                    List<Menu> starter = controller.getAllStarter();
                    for (Menu menu : starter) {
                        System.out.println(menu);
                    }
                    break;
                case 10:
                    System.out.println("--- Bread Items ---");
                    List<Menu> bread = controller.getAllBread();
                    for (Menu menu : bread) {
                        System.out.println(menu);
                    }
                    break;
                case 11:
                    System.out.println("--- North Indian Items ---");
                    List<Menu> northIndian = controller.getAllNorthIndian();
                    for (Menu menu : northIndian) {
                        System.out.println(menu);
                    }
                    break;
                case 12:
                    System.out.println("--- Soup Items ---");
                    List<Menu> soup = controller.getAllSoup();
                    for (Menu menu : soup) {
                        System.out.println(menu);
                    }
                    break;
                case 13:
                    System.out.print("Enter the name of the dish to check availability: ");
                    String dishName = scanner.nextLine();
                    boolean isAvailable = controller.isDishAvailable(dishName);
                    if (isAvailable) {
                        System.out.println("The dish is available.");
                    } else {
                        System.out.println("The dish is not available.");
                    }
                 break;
                case 14:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
