package basic;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    private Map<Long, Product> productTable = new HashMap<Long, Product>();


    public Product findByBarcode(String barcode) {
        Product foundProduct = findProductByBarcodeFromProductTable(barcode);

        if (foundProduct == null) {
            throw new ProductNotFoundException("Cannot find product with barcode: " + barcode);
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
}
