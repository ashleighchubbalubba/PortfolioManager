package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.Stocks;
import java.util.Collection;

public interface StockService {
    Collection<Stocks> getAllSymbols();
    Stocks findBySymbol(String symbol);
    Stocks save(Stocks newStock);
    void deleteBySymbol(String symbol);
    Stocks findTop5Gainers();
    Stocks findTop5Losers();
}
