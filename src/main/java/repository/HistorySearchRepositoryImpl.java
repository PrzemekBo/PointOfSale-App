package repository;

import model.Product;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HistorySearchRepositoryImpl implements HistorySearchRepository {
	Map<Long, Product> history = new TreeMap();

	public void addPosition(Product product) {
		long size = history.size();
		
		if(size < 1)
			history.put((long)1, product);
		else {
			history.put(++size, product);
		}
	}

	public ArrayList<Product> getUserSearch() {
		return new ArrayList<Product>(history.values());
	}
}
