package com.example.restApi.repository;


import com.example.restApi.entity.StockOverviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOverviewRepository extends JpaRepository<StockOverviewEntity, Long> {
}
