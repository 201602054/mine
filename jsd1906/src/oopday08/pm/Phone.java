package oopday08.pm;

public class Phone {

	String brand;//品牌
	String type;//型号
	int price;
	
	public Phone() {
	}

	public Phone(String brand, String type, int price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	
	public void call() {
		System.out.println("接通了电话");
	}
	
}
