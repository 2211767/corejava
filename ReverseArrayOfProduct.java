package com.example.demo.controller;

class Product{

	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class ReverseArrayOfProduct {
	static Product parr[] = new Product[5];

	public static void main(String[] args) {

		parr[0] = new Product(1, "Prod1", 12.5f);
		parr[1] = new Product(2, "Prod2", 9.5f);
		parr[2] = new Product(3, "Prod3", 6.5f);
		parr[3] = new Product(4, "Prod4", 3.5f);
		parr[4] = new Product(5, "Prod5", 11.25f);
		int len = parr.length;
		for (int i = 0; i < len / 2; i++) {
			Product tparr = null;
			tparr = parr[i];
			parr[i] = parr[len - i - 1];
			parr[len - i - 1] = tparr;
		}

		for (Product prod : parr) {
			System.out.println(prod.toString());
		}
	}
}
