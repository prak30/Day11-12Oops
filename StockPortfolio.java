
import java.util.Scanner;

public class StockPortfolio {
	Stock stock = new Stock();

	public void getStockData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of times you want to buy shares");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter share name");
			stock.setStockName(sc.nextLine());
			System.out.println("Enter number of shares");
			stock.setNumberOfShares(sc.nextInt());
			System.out.println("enter share price");
			stock.setSharePrice(sc.nextInt());
			sc.nextLine();
		}
			StockStore stockStore = new StockStore();
			stockStore.add(stock);
			stockStore.print(stockStore.getStockList());
		
	}

	public void getStockValue() {
		int z = stock.getNumberOfShares() * stock.getSharePrice();
		System.out.println("Portfolio value:" +z);
	}

	public static void main(String[] args) {
		StockPortfolio folio = new StockPortfolio();
		folio.getStockData();
		folio.getStockValue();
	}

}
