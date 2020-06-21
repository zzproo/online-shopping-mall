package com.zzproo.controller;

import com.zzproo.entity.TProductType;
import com.zzproo.product.IProductTypeService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Reference
    private IProductTypeService iProductTypeService;

    @GetMapping("/getList")
    public List<TProductType> getList(){
        return iProductTypeService.selectList();
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
