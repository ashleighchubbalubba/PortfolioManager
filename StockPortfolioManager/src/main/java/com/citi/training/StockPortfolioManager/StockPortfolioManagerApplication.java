package com.citi.training.StockPortfolioManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StockPortfolioManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPortfolioManagerApplication.class, args);
	}

}
