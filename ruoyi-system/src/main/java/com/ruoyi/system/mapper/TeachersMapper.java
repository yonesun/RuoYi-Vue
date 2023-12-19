package com.ruoyi.system.mapper;


import com.ruoyi.system.domain.Teachers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author sunyong
* @description 针对表【teachers】的数据库操作Mapper
* @createDate 2023-03-09 19:28:41
* @Entity com.ruoyi.system.domain.Teachers
*/
@Repository
@Mapper
public interface TeachersMapper {

    public List<Teachers> selectAll();
}




