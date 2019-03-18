package com.springcloud.demo.product_service.service;

import com.springcloud.demo.product_service.entity.Product;

import java.util.List;

public interface IProductService {

    List<Product> getProductList();

    Product findById(int id);
}
