package com.example.springbootcrudapp.controller;

import com.example.springbootcrudapp.entity.Product;
import com.example.springbootcrudapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductControllerClass1 {

    @Autowired
    private ProductService productService;

    @GetMapping("/findAllProducts")
    @ResponseBody List<Product> findAllProducts(){
        return productService.findAll();
    }
}
