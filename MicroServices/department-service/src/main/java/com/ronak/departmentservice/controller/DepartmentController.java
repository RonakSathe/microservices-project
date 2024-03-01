package com.ronak.departmentservice.controller;

import com.ronak.departmentservice.entity.Department;
import com.ronak.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside SaveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department findDepartmentById(@PathVariable Long departmentId){
        log.info("Inside findDepartmentById method of Department Controller");
        return departmentService.findDepartmentById(departmentId);
    }
}
