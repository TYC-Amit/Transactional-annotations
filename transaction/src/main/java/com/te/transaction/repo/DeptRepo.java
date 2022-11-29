package com.te.transaction.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.transaction.entity.Dept;

@Repository
public interface DeptRepo extends JpaRepository<Dept, Long>{

}
