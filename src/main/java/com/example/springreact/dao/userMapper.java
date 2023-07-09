package com.example.springreact.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface userMapper {
    List<userMapper> getAllDataList();
}
