package com.chinasoft.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description TODO
 * @ClassName User
 * @Author Lenovo
 * @Date 2020/4/1 13:39
 * @Version V1.0
 */
@Data
public class UserInfo {
    private Integer id;
    private String name;      //用户名
    private Date createtime; //添加时间
    private String password;    //密码
    private Integer role;   //用户权限 1表示管理员;0表示收费用户

}
