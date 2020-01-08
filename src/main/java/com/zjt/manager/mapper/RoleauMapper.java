package com.zjt.manager.mapper;

import com.zjt.manager.pojo.Roleau;
import com.zjt.manager.pojo.RoleauExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleauMapper {
    int countByExample(RoleauExample example);

    int deleteByExample(RoleauExample example);

    int insert(Roleau record);

    int insertSelective(Roleau record);

    List<Roleau> selectByExample(RoleauExample example);

    int updateByExampleSelective(@Param("record") Roleau record, @Param("example") RoleauExample example);

    int updateByExample(@Param("record") Roleau record, @Param("example") RoleauExample example);
}