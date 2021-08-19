package com.citi.training.StockPortfolioManager.repo;

import java.util.Collection;
import com.citi.training.StockPortfolioManager.entities.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stocks, Integer> {
    Collection<Stocks> findBySymbol(String symbol);
}
