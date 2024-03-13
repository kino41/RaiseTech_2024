package com.raisetech8.mybatisdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NationalFlowerMapper {

    @Select("SELECT * FROM national_flower WHERE name = #{name}")
    List<NationalFlower> findByName(String name);

    @Select("SELECT * FROM national_flower WHERE id = #{id}")
    Optional<NationalFlower> findById(int id);
}
