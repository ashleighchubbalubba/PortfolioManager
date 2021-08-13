package StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.rest;

import StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.entities.Stocks;
import StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/movies")
public class StockController {

    @Autowired
    private StockService movieService;


    @GetMapping
    public Collection<Stocks> getMovies() {
        return movieService.getAllStocks();
    }

}





