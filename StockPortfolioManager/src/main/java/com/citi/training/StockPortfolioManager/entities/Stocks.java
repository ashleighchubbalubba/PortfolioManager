package com.citi.training.StockPortfolioManager.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.DateTimeException;
import java.util.Date;

@Entity
@Table(name="sandp")
public class Stocks implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Symbol")
    private String symbol;

    @Column(name="Name")
    private String name;
    @Column(name="Sector")
    private String sector;
    @Column(name="Price")
    private float price;
    @Column(name="Earnings")
    private float price_earning;
    @Column(name="Share")
    private float earning_share;
    public Stocks(){

    }

    public Stocks(String symbol, String name, String sector, float price, float price_earning, float earning_share, float weekHigh52, float weekLow52) {
        this.symbol = symbol;
        this.name = name;
        this.sector = sector;
        this.price = price;
        this.price_earning = price_earning;
        this.earning_share = earning_share;
        this.weekHigh52 = weekHigh52;
        this.weekLow52 = weekLow52;
    }

    @Column(name="High")
    private float weekHigh52;
    @Column(name="Low")
    private float weekLow52;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice_earning() {
        return price_earning;
    }

    public void setPrice_earning(float price_earning) {
        this.price_earning = price_earning;
    }

    public float getEarning_share() {
        return earning_share;
    }

    public void setEarning_share(float earning_share) {
        this.earning_share = earning_share;
    }

    public float getWeekHigh52() {
        return weekHigh52;
    }

    public void setWeekHigh52(float weekHigh52) {
        this.weekHigh52 = weekHigh52;
    }

    public float getWeekLow52() {
        return weekLow52;
    }

    public void setWeekLow52(float weekLow52) {
        this.weekLow52 = weekLow52;
    }
}
