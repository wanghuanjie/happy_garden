package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.SpreadDrugRecordPO;
import com.ziyoujiayuan.happygarden.entity.auto.SpreadDrugRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpreadDrugRecordDAO {
    long countByExample(SpreadDrugRecordPOExample example);

    int deleteByExample(SpreadDrugRecordPOExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(SpreadDrugRecordPO record);

    int insertSelective(SpreadDrugRecordPO record);

    List<SpreadDrugRecordPO> selectByExample(SpreadDrugRecordPOExample example);

    SpreadDrugRecordPO selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") SpreadDrugRecordPO record, @Param("example") SpreadDrugRecordPOExample example);

    int updateByExample(@Param("record") SpreadDrugRecordPO record, @Param("example") SpreadDrugRecordPOExample example);

    int updateByPrimaryKeySelective(SpreadDrugRecordPO record);

    int updateByPrimaryKey(SpreadDrugRecordPO record);
}