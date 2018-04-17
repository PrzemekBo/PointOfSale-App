package repository;

import model.Product;

public interface ProductRepository {
	Product findByBarcode(String barcode);
}
