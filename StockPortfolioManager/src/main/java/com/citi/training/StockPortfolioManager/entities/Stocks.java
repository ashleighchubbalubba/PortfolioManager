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

    //attributes
    @Column(name="Symbol")
    private String symbol;
    @Column(name="Name")
    private String name;
    @Column(name="Sector")
    private String sector;
    @Column(name="Price")
    private float price;
    @Column(name="Earnings")
    private float earnings;
    @Column(name="Share")
    private float share;
    @Column(name="High")
    private float high;
    @Column(name="Low")
    private float low;

    //default constructor
    public Stocks(){

    }

    public Stocks(String symbol, String name, String sector, float price, float earnings, float share, float high, float low) {
        this.symbol = symbol;
        this.name = name;
        this.sector = sector;
        this.price = price;
        this.earnings = earnings;
        this.share = share;
        this.high = high;
        this.low = low;
    }

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

    public float getEarnings() {
        return earnings;
    }

    public void setEarnings(float earnings) {
        this.earnings = earnings;
    }

    public float getShare() {
        return share;
    }

    public void setShare(float share) {
        this.share = share;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }
}
