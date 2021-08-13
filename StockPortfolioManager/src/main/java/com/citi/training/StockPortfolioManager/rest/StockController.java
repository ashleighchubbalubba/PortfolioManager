package StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.rest;

import StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.entities.Stocks;
import StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/stocks")
public class StockController {

    private static Map<String, Stocks> stocks = new HashMap<String, Stocks>();
    static {
        stocks.put("ABC", new Stocks("APPL", "Apple", "FRUIT", 399.99F, 1.34F, 155.22F, 2.45F,34.33F));
    }


    @Autowired
    private StockService stockService;

    @GetMapping
    public Collection<Stocks> getStocks() {
        return stockService.getAllSymbols();
    }

    @PutMapping
    public void addStock(@RequestBody Stocks s) {
        if (stocks.containsKey(s.getSymbol())) {
            stocks.put(s.getSymbol(), s);
        }
    }

}





