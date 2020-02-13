package com.spring.inter.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//     @Entity   对实体注释。任何Hibernate映射对象都要有这个注释
//     @Id   声明此属性为主键。该属性值可以通过应该自身创建
//实体类
@Entity
@Table(name = "user_login")
public class LoginBean {

    @Id
    private Integer id;
    private String username;
    private String password;

    public LoginBean(Integer id, String username,String password) {
        this.id=id;
        this.username = username;
        this.password=password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setusername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}