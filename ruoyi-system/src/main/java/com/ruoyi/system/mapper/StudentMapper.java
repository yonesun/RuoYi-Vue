package com.ruoyi.system.mapper;
import com.ruoyi.system.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author sunyong
* @description 针对表【student】的数据库操作Mapper
* @createDate 2023-03-09 19:30:15
* @Entity com.yone.domain.Student
*/
@Repository
@Mapper
public interface StudentMapper{
    public Student selectStudent();
}




