package com.zjt.manager.mapper;

import com.zjt.manager.pojo.Score;
import com.zjt.manager.pojo.ScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    int countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    Score selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}