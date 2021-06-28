package com.test.service;

import com.test.entity.Employee;
import com.test.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    public EmployeeMapper employeeMapper;

    public Employee getAllEmployee() {
        log.info("获取员工信息");
        return employeeMapper.employeeQry();
    }
}
