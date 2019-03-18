package com.springcloud.demo.product_service.service.impl;

import com.springcloud.demo.product_service.entity.Product;
import com.springcloud.demo.product_service.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements IProductService {
    private static final Map<Integer,Product> daoMap=new HashMap<Integer,Product>();
    static {
        for(int i=0;i<10;i++){
            Product p=new Product(i,"国产空调"+i,String.valueOf(i+"000"),String.valueOf(i));
            daoMap.put(p.getId(),p);
        }
    }

    @Override
    public List<Product> getProductList() {
        Collection<Product> collection = daoMap.values();
        List<Product> list=new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
