package basic;

public class Main {

    public static void main(String[] args) {

        CashRegisterService cashService = new CashRegisterService();
        BarcodeScanner sc = cashService.getScanner();
        String input = sc.getInput();

        while (!input.equals("exit")) {
            if (input.equals("exit"))
                break;
            else
                cashService.searchForItem(input);

            input = sc.getInput();
        }
        cashService.showHisory();
    }
}