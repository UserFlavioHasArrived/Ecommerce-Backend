package com.senai.ecommerce.repository;

import com.senai.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.name = :name")
    public Product findByName(String name);


}
