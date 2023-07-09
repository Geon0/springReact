package com.example.springreact.dao;

import java.util.List;
import com.example.springreact.dao.userMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface userMapper {
    List<userMapper> getAllDataList();
}
