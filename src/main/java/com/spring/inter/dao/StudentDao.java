package com.spring.inter.dao;

import com.spring.inter.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,Integer> {

    Student findById(int id);

    List<Student> findByName(String name);

    void deleteById(int id);
}
