package com.neuedu.his.common.bean;

import com.neuedu.his.common.utils.CommonIdGenerator;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class BaseBean {
    private String id;
    private Date updateTime;
    private String delFlag;

    /**
     * 插入之前的准备工作
     */
    public void preInsert(){
        //1生成id 2给updatetime赋值
        this.id = CommonIdGenerator.gen();
        this.updateTime = new Date();
    }
    public void preUpdate(){
        //给updateTime赋值
        this.updateTime = new Date();
    }

}
