package service;

import model.Product;
import repository.HistorySearchRepository;
import repository.HistorySearchRepositoryImpl;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

import javax.management.InvalidAttributeValueException;

public class CashRegisterService {

	ProductRepository productRepo;
	HistorySearchRepository historyRepo;
	BarcodeScanner sc;

	public CashRegisterService() {
		this.sc = new BarcodeScanner();
		this.productRepo = new ProductRepositoryImpl();
		this.historyRepo = new HistorySearchRepositoryImpl();
	}

	public void searchForItem(String barcode) throws Exception {

		Product product = productRepo.findByBarcode(barcode);
		if (product == null) {
			throw new InvalidAttributeValueException("Cannot find product");
		}
		historyRepo.addPosition(product);
		System.out.println("item found" + product.toString());
	}

	public void showHisory() {

		System.out.println("your search history ");
		double doub =0;
		
		for (Product product: historyRepo.getUserSearch()) {

			doub += product.getPrice();
			System.out.println(product.toString());
		}

		System.out.println("Sumary for prices -> " + doub);
	}

	public BarcodeScanner getScanner() {
		return this.sc;
	}
}
