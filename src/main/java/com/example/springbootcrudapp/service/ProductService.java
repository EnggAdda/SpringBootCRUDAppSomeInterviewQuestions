package com.example.springbootcrudapp.service;




import com.example.springbootcrudapp.entity.Product;

import java.util.List;


public interface ProductService {



    List<Product> findAll();
    List<Product> findAllTopProducts(Integer length);

    Product insertProductIntoDatabase(Product product);

    Product getProductById(int id );

    Product updateProduct(Product product, int id);

    Product deleteProduct(int id);
}
