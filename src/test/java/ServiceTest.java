import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.BarcodeScanner;
import service.CashRegisterService;

import javax.management.InvalidAttributeValueException;

public class ServiceTest {
	CashRegisterService service;
	
	@Before
	public void getService() {
		service = new CashRegisterService();
	}
	
	@Test
	public void getBarcodeScannerNotNull() {
		
		BarcodeScanner sc = service.getScanner();
		Assert.assertNotNull(sc);
	}
	
	@Test(expected = InvalidAttributeValueException.class)
	public void searchingForProductThatsDoesNotExist() throws Exception {
		service.searchForItem("932879432");
	}
	
}
