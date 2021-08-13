package StockPortfolioManager.src.main.java.com.citi.training.StockPortfolioManager.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.DateTimeException;
import java.util.Date;

@Entity
@Table(name="bac_stocks")
public class Stocks implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Date")
    private Date date;

    @Column(name="Open")
    private float Open;
    @Column(name="High")
    private float High;
    @Column(name="Low")
    private float Low;
    @Column(name="Close")
    private float Close;
    @Column(name="Adj_Close")
    private float Adj_Close;
    @Column(name="Volume")
    private float Volume;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getOpen() {
        return Open;
    }

    public void setOpen(float open) {
        Open = open;
    }

    public float getHigh() {
        return High;
    }

    public void setHigh(float high) {
        High = high;
    }

    public float getLow() {
        return Low;
    }

    public void setLow(float low) {
        Low = low;
    }

    public float getClose() {
        return Close;
    }

    public void setClose(float close) {
        Close = close;
    }

    public float getAdj_Close() {
        return Adj_Close;
    }

    public void setAdj_Close(float adj_Close) {
        Adj_Close = adj_Close;
    }

    public float getVolume() {
        return Volume;
    }

    public void setVolume(float volume) {
        Volume = volume;
    }
}
