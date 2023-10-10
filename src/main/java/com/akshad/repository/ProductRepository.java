package com.akshad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshad.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
