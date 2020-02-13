package com.spring.inter.repository;


import java.util.List;

import com.spring.inter.bean.LoginBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LoginRepository extends JpaRepository<LoginBean, Integer>{

//    @Query(value = "select username, password from user_login",nativeQuery = true)
//    List<LoginBean> selectUsers();

    List<LoginBean> findByName(String name);
    @Query("SELECT ul FROM user_login ul where ul.name like %?1% order by id desc ")
    List<LoginBean> search(String name);
}