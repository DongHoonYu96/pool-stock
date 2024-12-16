package com.stock.pool_stock.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class StockRepository {

    private final EntityManager em;

}
