import model.Product;
import org.junit.Assert;
import org.junit.Test;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

public class ProductRepositoryTest {
	
	ProductRepository repo = new ProductRepositoryImpl();
	
	@Test
	public void searchForEmptyBarcode(){
		Product product = repo.findByBarcode("");
		Assert.assertNull(product);
	}
	
	@Test
	public void searchWithToLongBarcode(){
		Product product = repo.findByBarcode("9892391231");
		Assert.assertNull(product);
	}
	
	@Test
	public void searchWithInvalidBarcodeCharacters(){
		Product product = repo.findByBarcode("9!92#91z1");
		Assert.assertNull(product);
	}
	
	@Test
	public void searchForExistingProduct(){
		Product product = repo.findByBarcode("547890345");
		Assert.assertEquals(product ,repo.findByBarcode("547890345"));
	}
}
