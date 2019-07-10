package com.neuedu.his.common.bean;

import lombok.Data;

import java.util.Date;
@Data
public class CaseHistory extends BaseBean {
    private String patientName;
    private String gender;
    private Integer age;
    private Date birthday;
    private String identityCard;
    private String homeAddress;
    private Date attendTime;//看诊日期

    private Department depatment;//看诊科室
    private Employee doctor;//就诊医生
}
