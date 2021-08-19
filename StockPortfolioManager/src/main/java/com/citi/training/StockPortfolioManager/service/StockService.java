package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.Stocks;
import java.util.Collection;

public interface StockService {
    Collection<Stocks> getAllSymbols();
}
