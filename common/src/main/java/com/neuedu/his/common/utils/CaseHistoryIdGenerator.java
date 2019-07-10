package com.neuedu.his.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 给病例数据生成主键
 */
public class CaseHistoryIdGenerator {


    private static AtomicInteger seq = new AtomicInteger(0);
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    private static AtomicReference<String> strRef = new AtomicReference<>(sdf.format(new Date()));

    public static String getId(){
        updateTime();
        return strRef.get()+seq.getAndIncrement();
    }
    //判断当前时间是否和dateStr相等，
    private static void updateTime(){
        String curr = sdf.format(new Date());
        if(curr.equals(strRef.get())){
            //更新时间
            strRef.set(curr);
            //重新将seq设置为0
            seq.set(0);
        }
    }



}
