package model;

public class Product {

	private Long id;
	private String name;
	private String barcode;
	private double price;

	public Product(Long id, String name, String barcode, Double price) {
		this.id = id;
		this.name = name;
		this.barcode = barcode;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBarcode() {
		return barcode;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {

		return "Product name: "+name+'\n'+"Baracode: "+barcode+'\n'+"Price :"+price+'\n'+"Id :"+id;
	}
}