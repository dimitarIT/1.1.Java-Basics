package java_loops_methods_classes_homework;

public class Product implements Comparable<Product> {

	private String name;
	private double price;

	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public int compareTo(Product product) {

		double otherPrice = product.getPrice();

		if (this.price > otherPrice) {
			return 1;
		} else if (this.price == otherPrice) {
			return 0;
		} else {
			return -1;
		}
	}

}