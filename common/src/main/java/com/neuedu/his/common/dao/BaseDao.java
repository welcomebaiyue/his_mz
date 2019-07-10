package com.neuedu.his.common.dao;

import com.neuedu.his.common.bean.BaseBean;

import java.util.List;

public interface BaseDao<T extends BaseBean> {
    void insert(T t);
    void update(T t);
    void delete(T condition);//condition作为删除的条件对象
    void deleteById(String id);
    //批量
    void insertBatch(List<T> list);
    T findById(String id);//根据ID查询
    T find(T condition);//根据条件查询
    List<T> findList(T condition);//根据条件查询
    List<T> findAll();
}
