package StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.service;

import StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.entities.Stocks;
import StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.repo.StockRepository;
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

}
