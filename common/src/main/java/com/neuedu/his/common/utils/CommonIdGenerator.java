package com.neuedu.his.common.utils;

import java.util.UUID;

public class CommonIdGenerator {
    public static String gen(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
