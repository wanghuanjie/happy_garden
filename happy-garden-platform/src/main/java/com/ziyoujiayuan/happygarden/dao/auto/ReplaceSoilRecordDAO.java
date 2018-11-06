package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.ReplaceSoilRecordPO;
import com.ziyoujiayuan.happygarden.entity.auto.ReplaceSoilRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplaceSoilRecordDAO {
    long countByExample(ReplaceSoilRecordPOExample example);

    int deleteByExample(ReplaceSoilRecordPOExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(ReplaceSoilRecordPO record);

    int insertSelective(ReplaceSoilRecordPO record);

    List<ReplaceSoilRecordPO> selectByExample(ReplaceSoilRecordPOExample example);

    ReplaceSoilRecordPO selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") ReplaceSoilRecordPO record, @Param("example") ReplaceSoilRecordPOExample example);

    int updateByExample(@Param("record") ReplaceSoilRecordPO record, @Param("example") ReplaceSoilRecordPOExample example);

    int updateByPrimaryKeySelective(ReplaceSoilRecordPO record);

    int updateByPrimaryKey(ReplaceSoilRecordPO record);
}