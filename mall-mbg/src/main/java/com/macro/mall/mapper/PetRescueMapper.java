package com.macro.mall.mapper;

import com.macro.mall.model.PetRescue;
import com.macro.mall.model.PetRescueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetRescueMapper {
    long countByExample(PetRescueExample example);

    int deleteByExample(PetRescueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PetRescue record);

    int insertSelective(PetRescue record);

    List<PetRescue> selectByExampleWithBLOBs(PetRescueExample example);

    List<PetRescue> selectByExample(PetRescueExample example);

    PetRescue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PetRescue record, @Param("example") PetRescueExample example);

    int updateByExampleWithBLOBs(@Param("record") PetRescue record, @Param("example") PetRescueExample example);

    int updateByExample(@Param("record") PetRescue record, @Param("example") PetRescueExample example);

    int updateByPrimaryKeySelective(PetRescue record);

    int updateByPrimaryKeyWithBLOBs(PetRescue record);

    int updateByPrimaryKey(PetRescue record);
}