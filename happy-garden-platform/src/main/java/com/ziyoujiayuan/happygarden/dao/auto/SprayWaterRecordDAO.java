package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.SprayWaterRecordPO;
import com.ziyoujiayuan.happygarden.entity.auto.SprayWaterRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SprayWaterRecordDAO {
    long countByExample(SprayWaterRecordPOExample example);

    int deleteByExample(SprayWaterRecordPOExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(SprayWaterRecordPO record);

    int insertSelective(SprayWaterRecordPO record);

    List<SprayWaterRecordPO> selectByExample(SprayWaterRecordPOExample example);

    SprayWaterRecordPO selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") SprayWaterRecordPO record, @Param("example") SprayWaterRecordPOExample example);

    int updateByExample(@Param("record") SprayWaterRecordPO record, @Param("example") SprayWaterRecordPOExample example);

    int updateByPrimaryKeySelective(SprayWaterRecordPO record);

    int updateByPrimaryKey(SprayWaterRecordPO record);
}