package com.gelocorp.microservices.repository;


import com.gelocorp.microservices.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }