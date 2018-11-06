package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.WateringRecordPO;
import com.ziyoujiayuan.happygarden.entity.auto.WateringRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WateringRecordDAO {
    long countByExample(WateringRecordPOExample example);

    int deleteByExample(WateringRecordPOExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(WateringRecordPO record);

    int insertSelective(WateringRecordPO record);

    List<WateringRecordPO> selectByExample(WateringRecordPOExample example);

    WateringRecordPO selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") WateringRecordPO record, @Param("example") WateringRecordPOExample example);

    int updateByExample(@Param("record") WateringRecordPO record, @Param("example") WateringRecordPOExample example);

    int updateByPrimaryKeySelective(WateringRecordPO record);

    int updateByPrimaryKey(WateringRecordPO record);
}