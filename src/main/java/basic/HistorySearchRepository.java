package basic;

import java.util.List;

public interface HistorySearchRepository {

    void addPosition(Product product);
    List<?> getUserSearch();
}
