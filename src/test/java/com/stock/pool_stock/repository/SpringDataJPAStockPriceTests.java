package com.stock.pool_stock.repository;

import com.stock.pool_stock.domain.StockPrice;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
public class SpringDataJPAStockPriceTests {

    @Autowired
    SpringDataJPAStockPriceRepository springDataJPAStockPriceRepository;

    @Test
    void contextLoads() {
        Assertions.assertThat(springDataJPAStockPriceRepository).isNotNull();
    }

    @Test
    void testSpringDataJPAStockPriceRepository() {
        springDataJPAStockPriceRepository.save(new StockPrice(LocalDateTime.now(), 1000.0, 2000.0, 3000.0, 4000.0,
                5000L, 6000.0, 7000));
        Assertions.assertThat(springDataJPAStockPriceRepository.findAll()).isNotEmpty();
    }
}
