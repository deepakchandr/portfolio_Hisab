package com.example.porfolio_hisab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.porfolio_hisab.entity.Stock;
@Repository
public interface IStockRepository extends JpaRepository<Stock, Long> {
	List<Stock> findByCategoryId(Long categoryId);
	

}
