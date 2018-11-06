package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.ApplyFertilizerRecordPO;
import com.ziyoujiayuan.happygarden.entity.auto.ApplyFertilizerRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyFertilizerRecordDAO {
    long countByExample(ApplyFertilizerRecordPOExample example);

    int deleteByExample(ApplyFertilizerRecordPOExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(ApplyFertilizerRecordPO record);

    int insertSelective(ApplyFertilizerRecordPO record);

    List<ApplyFertilizerRecordPO> selectByExample(ApplyFertilizerRecordPOExample example);

    ApplyFertilizerRecordPO selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") ApplyFertilizerRecordPO record, @Param("example") ApplyFertilizerRecordPOExample example);

    int updateByExample(@Param("record") ApplyFertilizerRecordPO record, @Param("example") ApplyFertilizerRecordPOExample example);

    int updateByPrimaryKeySelective(ApplyFertilizerRecordPO record);

    int updateByPrimaryKey(ApplyFertilizerRecordPO record);
}