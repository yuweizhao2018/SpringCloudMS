package com.springcloud.demo.product_service.controller;

import com.springcloud.demo.product_service.entity.Product;
import com.springcloud.demo.product_service.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private IProductService iProductService;

    @RequestMapping("list")
    public Object getProductList(){
        return iProductService.getProductList();
    }

    @RequestMapping("findById")
    public Object findProductById(@RequestParam("id") int id){
        Product product=iProductService.findById(id);
        Product result= new Product();
        BeanUtils.copyProperties(product,result);
        result.setName(result.getName()+"-data from port:"+port);
        return result;
    }
}

