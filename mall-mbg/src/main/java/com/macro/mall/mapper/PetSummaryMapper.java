package com.macro.mall.mapper;

import com.macro.mall.model.PetSummary;
import com.macro.mall.model.PetSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetSummaryMapper {
    long countByExample(PetSummaryExample example);

    int deleteByExample(PetSummaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PetSummary record);

    int insertSelective(PetSummary record);

    List<PetSummary> selectByExample(PetSummaryExample example);

    PetSummary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PetSummary record, @Param("example") PetSummaryExample example);

    int updateByExample(@Param("record") PetSummary record, @Param("example") PetSummaryExample example);

    int updateByPrimaryKeySelective(PetSummary record);

    int updateByPrimaryKey(PetSummary record);
}