import service.BarcodeScanner;
import service.CashRegisterService;

public class Main {
	public static void main(String[] args) {

		CashRegisterService cashService = new CashRegisterService();
		BarcodeScanner sc = cashService.getScanner();
		String input = sc.getInput();

		while (!input.equals("exit")) {
			if (input.equals("exit"))
				break;
			else
				try {
					cashService.searchForItem(input);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			input = sc.getInput();
		}
		cashService.showHisory();
	}
}