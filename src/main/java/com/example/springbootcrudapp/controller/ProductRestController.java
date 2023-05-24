package com.example.springbootcrudapp.controller;

import com.example.springbootcrudapp.entity.Product;
import com.example.springbootcrudapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

   /* @GetMapping("/listOfProducts")
    List<Product> getAllProducts(){
        return productService.findAll();
    }*/


}
