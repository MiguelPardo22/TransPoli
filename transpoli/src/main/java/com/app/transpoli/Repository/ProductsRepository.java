package com.app.transpoli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.transpoli.Models.Product;

public interface ProductsRepository extends JpaRepository<Product ,Long>{
    
}
