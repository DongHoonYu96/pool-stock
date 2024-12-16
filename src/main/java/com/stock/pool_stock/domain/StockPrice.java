package com.stock.pool_stock.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// Entity
@Entity
@Table(name = "stock_prices")
@Getter
@NoArgsConstructor()
public class StockPrice {
    @Id @GeneratedValue
    private Long id;
    private LocalDateTime dt;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Long volume;
    private Double amount;
    private Integer closeKrw;

    @Builder
    public StockPrice(LocalDateTime dt, Double open, Double high, Double low,
                      Double close, Long volume, Double amount, Integer closeKrw) {
        this.dt = dt;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.amount = amount;
        this.closeKrw = closeKrw;
    }
}