package com.example.demo.service;

import com.example.demo.entity.Department;
import java.util.List;

public interface DepartmentService {
    // save operation
    Department saveDepartment(Department department);

    // read operation
    /*Esto es una prueba de que hay mas issues misma cobertura
    sdfsdfsdfsdf
    sdf
    sdf
    sdf
    sdf
    sdf
    sdf
    sf
    sd
    f
    */
    List<Department> fetchDepartmentList();

    // update operation
    Department updateDepartment(Department department, Long departmentId);

    // delete operation
    void deleteDepartmentById(Long departmentId);
}
