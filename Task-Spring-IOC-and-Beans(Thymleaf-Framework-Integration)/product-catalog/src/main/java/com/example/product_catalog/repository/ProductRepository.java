package com.example.product_catalog.repository;

import com.example.product_catalog.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByCategory(String category);
}
