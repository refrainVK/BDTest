package com.hello.springboot.dao;

import com.hello.springboot.entity.DataSource;
import com.hello.springboot.entity.DataSourceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Mapper
public interface DataSourceMapper {
    long countByExample(DataSourceExample example);

    int deleteByExample(DataSourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DataSource record);

    int insertSelective(DataSource record);

    List<DataSource> selectByExample(DataSourceExample example);

    DataSource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DataSource record, @Param("example") DataSourceExample example);

    int updateByExample(@Param("record") DataSource record, @Param("example") DataSourceExample example);

    int updateByPrimaryKeySelective(DataSource record);

    int updateByPrimaryKey(DataSource record);
}