package com.example.springbootcrudapp.repository;



import com.example.springbootcrudapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
