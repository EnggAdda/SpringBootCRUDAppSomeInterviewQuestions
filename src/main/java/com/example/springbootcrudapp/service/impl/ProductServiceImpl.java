package com.example.springbootcrudapp.service.impl;


import com.example.springbootcrudapp.entity.Product;
import com.example.springbootcrudapp.repository.ProductRepo;
import com.example.springbootcrudapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
   @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public List<Product> findAllTopProducts(Integer length){
      List<Product> products = productRepo.findAll();
      List<Product> topProducts = products.subList(0,Math.min(length, products.size()));
   return topProducts;
    }

    @Override
    public Product insertProductIntoDatabase(Product product) {
        return productRepo.save(product);
    }
    @Override
    public Product getProductById(int id ) {
        return productRepo.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product, int id) {
        Product oldProduct = productRepo.findById(id).get();
        oldProduct.setName(product.getName());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setQuantity(product.getQuantity());
        productRepo.save(oldProduct);
        return oldProduct;
    }

    @Override
    public Product deleteProduct(int id) {
        Product p   = productRepo.findById(id).get();
        productRepo.deleteById(id);
        return p;
    }
}
