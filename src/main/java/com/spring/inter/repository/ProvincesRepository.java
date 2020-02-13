package com.spring.inter.repository;


import com.spring.inter.bean.Provinces;
import com.spring.inter.bean.LoginBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvincesRepository extends JpaRepository<Provinces, Integer>{
    /*
     * 查询全部
     * */
    @Query("select t from provinces t")
    List<Provinces> findAll();

}
