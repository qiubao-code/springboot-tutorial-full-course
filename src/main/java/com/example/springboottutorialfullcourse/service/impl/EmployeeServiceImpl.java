package com.example.springboottutorialfullcourse.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboottutorialfullcourse.entity.Employee;
import com.example.springboottutorialfullcourse.mapper.EmployeeMapper;
import com.example.springboottutorialfullcourse.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {


}
