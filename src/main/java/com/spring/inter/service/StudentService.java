package com.spring.inter.service;

import com.spring.inter.bean.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {

    /**
     * 添加
     * @param student
     * @return
     */
    Student save(Student student);

    /**
     * 修改
     * @param student
     * @return
     */
    Student update(Student student);

    /**
     * 删除
     * @param id
     */
    void delete(int id);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    Student findById(int id);

    /**
     * 同过姓名查询
     * @param name
     * @return
     */
    List<Student> findByName(String name);

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */

    Page<Student> finAll(int page, int pageSize);


}

