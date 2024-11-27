package com.menu.entity;

public class Menu {

	private String menuname;
	private String description;
	private int price;
	private String available;
	private String category;
	
	public Menu() {
		super();
	}

	public Menu(String menuname, String description, int price, String available, String category) {
		super();
		this.menuname = menuname;
		this.description = description;
		this.price = price;
		this.available = available;
		this.category = category;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String b) {
		this.available = b;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Menu [menuname=" + menuname + ", description=" + description + ", price=" + price + ", available="
				+ available + ", category=" + category + "]";
	}
	
	
}
