// Create a class Product to hold products, which have name (string) and price
// (decimal number). Read from a text file named "Products.txt" a list of
// product with prices and keep them in a list of products. Each product will be
// in format name + space + price. You should hold the products in objects of
// class Product. Read from a text file named "Order.txt" an order of products
// with quantities. Each order line will be in format product + space +
// quantity. Calculate and print in a text file "Output.txt" the total price of
// the order. Ensure you close correctly all used resources.

package java_loops_methods_classes_homework;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class _10_OrderOfProducts {

	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.ROOT);
		ArrayList<Product> products = new ArrayList<>();
		try (Scanner input = new Scanner(new FileReader("Products.txt"))) {
			while (input.hasNextLine()) {
				products.add(new Product(input.next(), input.nextDouble()));
			}
		}

		double result = 0;
		try (Scanner input = new Scanner(new FileReader("Order.txt"))) {
			while (input.hasNextLine()) {
				double quantity = input.nextDouble();
				String currentProduct = input.next();
				for (Product product : products) {
					if (product.getName().equals(currentProduct)) {
						result += quantity * product.getPrice();
					}
				}
			}
		}

		try (BufferedWriter output = new BufferedWriter(new FileWriter(
				"_10_Output.txt"))) {
			output.write(String.format("%.2f", result));
		}
	}
}
