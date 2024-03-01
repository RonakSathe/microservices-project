package com.ronak.departmentservice.service;

import com.ronak.departmentservice.entity.Department;
import com.ronak.departmentservice.repo.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {

        log.info("Inside saveDept of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {

        log.info("Inside saveDept of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
