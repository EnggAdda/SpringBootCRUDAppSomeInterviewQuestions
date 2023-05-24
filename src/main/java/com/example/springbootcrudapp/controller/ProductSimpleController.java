package com.example.springbootcrudapp.controller;

import com.example.springbootcrudapp.entity.Product;
import com.example.springbootcrudapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductSimpleController {

   /* @Autowired
    private ProductService  productService;

    @GetMapping("/products")
    List<Product> getAllProducts(){
      return   productService.findAll();
    }*/
}
