package repository;

import model.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductRepositoryImpl implements ProductRepository {
	private Map<Long, Product> productTable = new HashMap();

	public ProductRepositoryImpl() {
		productTable.put((long) 1, new Product((long)12, "Phone", "547890345", new Double(3.99)));
		productTable.put((long) 2, new Product((long)25, "Radio", "123897232", new Double(399.99)));
		productTable.put((long) 3, new Product((long)31, "Watch", "989239123", new Double(6.66)));
		productTable.put((long) 4, new Product((long)33, "Lamp", "289249123", new Double(20.00)));
		productTable.put((long) 5, new Product((long)34, "Speaker", "089239123", new Double(35.00)));
	}

	public Product findByBarcode(String barcode) {
		Product foundProduct = findProductByBarcodeFromProductTable(barcode);

		if (!barcodeFormat(barcode) || foundProduct == null) {
			foundProduct = null;
		}
		return foundProduct;
	}

	private Product findProductByBarcodeFromProductTable(String barcode) {
		Product foundProduct = null;
		for (Product product : productTable.values()) {
			if (product.getBarcode().equals(barcode)) {
				foundProduct = product;
				break;
			}
		}
		return foundProduct;
	}

	private boolean barcodeFormat(String barcode) {

		Pattern p = Pattern.compile("\\d{9}");
		Matcher m = p.matcher(barcode);

		if (m.find())
			return true;
		else
			return false;
	}
}
