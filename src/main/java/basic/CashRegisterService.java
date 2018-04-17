package basic;

public class CashRegisterService {

    ProductRepository productRepo;
    HistorySearchRepository historyRepo;
    BarcodeScanner sc;

    CashRegisterService() {
        this.sc = new BarcodeScanner();
        this.productRepo = new ProductRepositoryImpl();
        this.historyRepo = new HistorySearchRepositoryImpl();
    }

    public void searchForItem(String barcode) {

        Product product = productRepo.findByBarcode(barcode);
        if (product == null) {
            System.out.println("Cannot find product ");
            return;
        }
        historyRepo.addPosition(product);
        System.out.println("item found " + product.toString());
    }

    public void showHisory() {
        System.out.println("your search history ");
        historyRepo
                .getUserSearch()
                .stream()
                .forEach(System.out::println);
    }

    BarcodeScanner getScanner() {
        return this.sc;
    }
}
