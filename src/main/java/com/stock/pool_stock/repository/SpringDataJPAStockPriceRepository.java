package com.stock.pool_stock.repository;

import com.stock.pool_stock.domain.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJPAStockPriceRepository extends JpaRepository<StockPrice, Long> {
}
