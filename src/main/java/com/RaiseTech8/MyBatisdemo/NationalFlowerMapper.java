package com.raisetech8.mybatisdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NationalFlowerMapper {
    @Select("SELECT * FROM national_flower")
    List<NationalFlower> getAll();

    @Select("SELECT * FROM national_flower WHERE name = #{name}")
    Optional<NationalFlower> findByName(String name);
}
