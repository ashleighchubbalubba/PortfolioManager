package StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.service;

import StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.entities.Stocks;
import java.util.Collection;

public interface StockService {
    Collection<Stocks> getAllStocks();
}
