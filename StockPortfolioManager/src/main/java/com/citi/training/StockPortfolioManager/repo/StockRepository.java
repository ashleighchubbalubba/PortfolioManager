package com.citi.training.StockPortfolioManager.repo;

import java.util.Collection;
import com.citi.training.StockPortfolioManager.entities.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StockRepository extends JpaRepository<Stocks, Integer>, Repository<Stocks, Integer> {
//    Collection<Stocks> findByTitle(String title);

    Stocks findBySymbol(String symbol);
    Stocks save(Stocks stock);
    void deleteBySymbol(String symbol);
    Stocks findTop5ByOrderByEarningsAsc();
    Stocks findTop5ByOrderByEarningsDesc();
}
