package com.zjt.manager.mapper;

import com.zjt.manager.pojo.Authority;
import com.zjt.manager.pojo.AuthorityExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityMapper {
    int countByExample(AuthorityExample example);

    int deleteByExample(AuthorityExample example);

    int deleteByPrimaryKey(Integer auid);

    int insert(Authority record);

    int insertSelective(Authority record);

    List<Authority> selectByExample(AuthorityExample example);

    Authority selectByPrimaryKey(Integer auid);

    int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityExample example);

    int updateByExample(@Param("record") Authority record, @Param("example") AuthorityExample example);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}