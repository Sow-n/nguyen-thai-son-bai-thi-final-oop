package BaiThi;

import java.util.Scanner;

public class Product {
	private String id;
	private String name;
	private float price;
	private float discount;
	
	public Product() {
		super();
	}
	
	public Product(String id, String name, float price, float discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public float getFinal() {
		return (this.price * (100 - this.discount)/100);
		
	}
	
	public void add() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập mã: ");
		id = input.nextLine();
		System.out.println("Nhập tên sản phẩm: ");
		name = input.nextLine();
		System.out.println("Nhập giá: ");
		price = input.nextFloat();
		System.out.println("Nhập chiết khấu (%): ");
		discount = input.nextFloat();
	}
	
	public void print() {
		System.out.println("Mã: "+ id);
		System.out.println("Tên sản phẩm: "+ name);
		System.out.println("Giá: " + price);
		System.out.println("Chiết khấu: " + discount);
	}
	
	public void getRealPrice() {
		System.out.println("Giá tiền cuối cùng: "+ (this.price * (100 - this.discount)/100));
	}
}
