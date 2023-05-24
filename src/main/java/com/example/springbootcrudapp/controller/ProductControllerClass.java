package com.example.springbootcrudapp.controller;

import com.example.springbootcrudapp.entity.Product;
import com.example.springbootcrudapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllerClass {
   @Autowired
   private ProductService  productService;
    @PostMapping("/insert")
    public void insertProduct(@RequestBody Product product) {
      productService.insertProductIntoDatabase(product);
    }
    @GetMapping("/findAll")
    public List<Product> getAll() {
        return  productService.findAll();
    }
}
