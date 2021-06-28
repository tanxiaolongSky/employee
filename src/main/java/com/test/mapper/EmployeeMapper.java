package com.test.mapper;

import com.test.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {
    // 查询所有员工信息
    Employee employeeQry();
}
