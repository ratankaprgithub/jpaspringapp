package com.cts.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.StudentBean;

@Repository
public interface StudentDao extends CrudRepository<StudentBean, Integer> {

}
