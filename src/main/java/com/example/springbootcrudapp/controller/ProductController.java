package com.example.springbootcrudapp.controller;
import com.example.springbootcrudapp.entity.Product;
import com.example.springbootcrudapp.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products")
@Tag(
        name = "Product Controller All CRUD API",
        description = "this is the class that implements all the CRUD api related to " +
                "products management"
)
public class ProductController {
   /* @Autowired
    private ProductService productService;


    @Operation(
      summary = "finding all products from db ",
            description = "getting all products from db using this api"
    )
    @ApiResponse(
            responseCode = "200",
            description = "HTTP status 200 OK"
    )
    @GetMapping("/findAll")
    public List<Product> getAll() {
        return  productService.findAll();
    }

    @GetMapping("/findAllPathVariable/{length}")
    public List<Product> getAllProducts(@PathVariable Integer length) {
        return  productService.findAllTopProducts(length);
    }

    @GetMapping("/findAllRequestParam")
    public List<Product> getAllProductsrequestParam(@RequestParam(value = "length", required = false) Integer length) {
        if(length == null){
            length =2 ;
        }
         return  productService.findAllTopProducts(length);
    }


    @PostMapping("/insert")
    public Product insertProductInDb(@RequestBody Product product) {
        return  productService.insertProductIntoDatabase(product);
    }

    @GetMapping("/find/{id}")
    public Product getProductById(@PathVariable int id) {
        return  productService.getProductById(id);
    }

     @PutMapping("/update/{id}")
     Product updateProductById(@RequestBody Product product,@PathVariable int id ){
        return productService.updateProduct(product,id);
     }
    @DeleteMapping("/delete")
    public Product deleteProductById(@PathVariable int id) {
       return productService.deleteProduct(id);
    }*/
}
