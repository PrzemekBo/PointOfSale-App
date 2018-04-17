package repository;

import model.Product;

import java.util.ArrayList;

public interface HistorySearchRepository {

	void addPosition(Product product);
	ArrayList<Product> getUserSearch();
}
