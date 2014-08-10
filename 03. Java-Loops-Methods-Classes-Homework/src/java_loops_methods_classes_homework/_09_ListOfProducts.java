// Create a class Product to hold products, which have name (string) and price
// (decimal number). Read from a text file named "Input.txt" a list of products.
// Each product will be in format name + space + price. You should hold the
// products in objects of class Product. Sort the products by price and write
// them in format price + space + name in a file named "Output.txt". Ensure you
// close correctly all used resources.

package java_loops_methods_classes_homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class _09_ListOfProducts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);

		ArrayList<Product> products = new ArrayList<Product>();
		BufferedReader reader;
		Writer writer = null;

		try {
			reader = new BufferedReader(new FileReader("Products.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] splittedLine = line.split(" ");
				products.add(new Product(splittedLine[0], Double
						.parseDouble(splittedLine[1])));
			}
			Collections.sort(products);

			writer = new BufferedWriter(new FileWriter("Output.txt"));
			for (Product product : products) {
				writer.write(product.getPrice() + " " + product.getName()
						+ "\r\n");
			}
		} catch (Exception ex) {
			System.out.println("Error");
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
			}
		}
	}

}
