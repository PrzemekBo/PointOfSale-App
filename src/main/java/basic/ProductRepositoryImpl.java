package basic;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductRepositoryImpl implements ProductRepository {
    private Map<Long, Product> productTable = new HashMap();

    ProductRepositoryImpl() {
        productTable.put((long) 1, new Product((long)1, "Phone", "547890345", new BigDecimal(3.99)));
        productTable.put((long) 2, new Product((long)2, "Radio", "123897232", new BigDecimal(399.99)));
        productTable.put((long) 3, new Product((long)3, "Watch", "989239123", new BigDecimal(6.75)));
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
