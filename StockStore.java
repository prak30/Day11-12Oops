import java.util.HashSet;
import java.util.Set;

public class StockStore {
	private Set<Stock> stockList = new HashSet<>();

	public Set<Stock> getStockList() {
		return stockList;
	}

	public void add(Stock stock) {
		stockList.add(stock);
	}

	void print(Set<Stock> stockList) {
		for (Stock i : stockList) {
			System.out.println(i);
		}
	}
}


