package com.citi.training.StockPortfolioManager.service;

import com.citi.training.StockPortfolioManager.entities.Stocks;
import com.citi.training.StockPortfolioManager.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Collection<Stocks> getAllSymbols() {
        return stockRepository.findAll();
    }

    @Override
    public Stocks findBySymbol(String symbol){
        return stockRepository.findBySymbol(symbol);
    }

    @Override
    public Stocks save(Stocks stock) {return stockRepository.save(stock);}

    @Override
    public void deleteBySymbol(String symbol) {stockRepository.deleteBySymbol(symbol);}

    @Override
    public Collection<Stocks> findTop5Gainers(){ return stockRepository.findTop5ByOrderByEarningsAsc(); }

    @Override
    public Collection<Stocks> findTop5Losers(){ return stockRepository.findTop5ByOrderByEarningsDesc(); }

}
