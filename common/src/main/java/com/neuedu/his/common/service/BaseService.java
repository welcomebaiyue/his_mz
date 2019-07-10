package com.neuedu.his.common.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.his.common.bean.BaseBean;
import com.neuedu.his.common.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//把前面的T传入basedao的T
public class BaseService<T extends BaseBean,D extends BaseDao<T>> {

    @Autowired
    private D dao;

    public void insert(T t){
        dao.insert(t);
    }
    public void insertBatch(List<T> list){
        dao.insertBatch(list);
    }
    public void update(T t){
        //更新update
        t.preUpdate();
        dao.update(t);
    }
    public void delete(T condition){
        dao.delete(condition);
    }
    public void deleteById(String id){
        dao.deleteById(id);
    }
    public T findById(String id){
        return dao.findById(id);
    }
    public T find(T condition){
        return dao.find(condition);
    }
    public List<T> findList(T condition){
        return dao.findList(condition);
    }
    public List<T> findAll(){
        return dao.findAll();
    }

    public void save(T t){
        if(t.getId()!=null && !t.getId().equals("")){
            update(t);
        }else{
            insert(t);
        }
    }

    public PageInfo<T> getPage(T condition,Integer pageNumber,Integer pagesize){
        return PageHelper.startPage(pageNumber,pagesize).doSelectPageInfo(()->dao.findList(condition));
    }

}
