package com.zzproo.service;

import com.zzproo.base.BaseServiceImpl;
import com.zzproo.base.IBaseDao;
import com.zzproo.entity.TProductType;
import com.zzproo.mapper.TProductTypeMapper;
import com.zzproo.product.IProductTypeService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Service
public class ProductTypeService extends BaseServiceImpl<TProductType> implements IProductTypeService {

    @Resource
    private TProductTypeMapper productTypeMapper;

    @Override
    public IBaseDao<TProductType> getBaseDao() {
        return productTypeMapper;
    }
}
