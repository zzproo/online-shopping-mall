package com.zzproo.base;

import java.util.List;

public interface IBaseDao<T> {

    int insert(T t);

    int deleteByPrimaryKey(Long primaryKey);

    int update(T t);

    T selectByPrimaryKey(Long primaryKey);

    List<T> selectList();
}
