package basic;

public interface ProductRepository {
    Product findByBarcode(String barcode);
}
