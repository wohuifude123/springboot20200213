package com.spring.inter.bean;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

//     @Entity   对实体注释。任何Hibernate映射对象都要有这个注释
//     @Id   声明此属性为主键。该属性值可以通过应该自身创建
//实体类
@Entity
@Table(name = "provinces")
public class Provinces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "provinceid")
    private Integer provinceid;

    @Column(name="province")
    private String province;

    //需要声明无参数的构造函数
    public Provinces(){}

    public Provinces(Integer id, Integer provinceid, String province) {
        this.id = id;
        this.provinceid = provinceid;
        this.province = province;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
