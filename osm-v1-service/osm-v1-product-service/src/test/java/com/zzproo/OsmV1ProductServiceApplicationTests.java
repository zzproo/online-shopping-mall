package com.zzproo;

import com.zzproo.mapper.TProductTypeMapper;
import com.zzproo.product.IProductTypeService;
import com.zzproo.service.ProductTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OsmV1ProductServiceApplicationTests {


    @Resource
    private TProductTypeMapper tProductTypeMapper;

   

}
