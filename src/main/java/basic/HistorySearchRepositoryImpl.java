package basic;

import java.util.Arrays;
import java.util.List;
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

    public List<?> getUserSearch() {
        return Arrays.asList(history.values());
    }


}
