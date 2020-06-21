package com.zzproo.base;

import java.util.List;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    public abstract IBaseDao<T> getBaseDao();

    @Override
    public int insert(T t) {
        return getBaseDao().insert(t);
    }

    @Override
    public int deleteByPrimaryKey(Long primaryKey) {
        return getBaseDao().deleteByPrimaryKey(primaryKey);
    }

    @Override
    public int update(T t) {
        return getBaseDao().update(t);
    }

    @Override
    public T selectByPrimaryKey(Long primaryKey) {
        return getBaseDao().selectByPrimaryKey(primaryKey);
    }

    @Override
    public List<T> selectList() {
        return getBaseDao().selectList();
    }
}
