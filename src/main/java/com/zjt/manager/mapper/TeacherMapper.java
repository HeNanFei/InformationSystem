package com.zjt.manager.mapper;

import com.zjt.manager.pojo.Teacher;
import com.zjt.manager.pojo.TeacherExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}