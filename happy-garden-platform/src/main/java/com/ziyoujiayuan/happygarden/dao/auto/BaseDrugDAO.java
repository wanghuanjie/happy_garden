package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.BaseDrugPO;
import com.ziyoujiayuan.happygarden.entity.auto.BaseDrugPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseDrugDAO {
    long countByExample(BaseDrugPOExample example);

    int deleteByExample(BaseDrugPOExample example);

    int deleteByPrimaryKey(String baseDrugId);

    int insert(BaseDrugPO record);

    int insertSelective(BaseDrugPO record);

    List<BaseDrugPO> selectByExample(BaseDrugPOExample example);

    BaseDrugPO selectByPrimaryKey(String baseDrugId);

    int updateByExampleSelective(@Param("record") BaseDrugPO record, @Param("example") BaseDrugPOExample example);

    int updateByExample(@Param("record") BaseDrugPO record, @Param("example") BaseDrugPOExample example);

    int updateByPrimaryKeySelective(BaseDrugPO record);

    int updateByPrimaryKey(BaseDrugPO record);
}