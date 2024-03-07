package com.raisetech8.mybatisdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NationalFlowerMapper {
    @Select("SELECT * FROM national_flower")
    List<NationalFlower> findAll();
}
