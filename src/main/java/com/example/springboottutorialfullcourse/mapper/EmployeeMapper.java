package com.example.springboottutorialfullcourse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboottutorialfullcourse.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
