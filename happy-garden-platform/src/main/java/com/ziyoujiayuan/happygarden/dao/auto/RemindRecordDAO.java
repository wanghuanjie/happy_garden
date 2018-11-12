package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.RemindRecordPO;
import com.ziyoujiayuan.happygarden.entity.auto.RemindRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RemindRecordDAO {
    long countByExample(RemindRecordPOExample example);

    int deleteByExample(RemindRecordPOExample example);

    int deleteByPrimaryKey(String recordId);

    int insert(RemindRecordPO record);

    int insertSelective(RemindRecordPO record);

    List<RemindRecordPO> selectByExample(RemindRecordPOExample example);

    RemindRecordPO selectByPrimaryKey(String recordId);

    int updateByExampleSelective(@Param("record") RemindRecordPO record, @Param("example") RemindRecordPOExample example);

    int updateByExample(@Param("record") RemindRecordPO record, @Param("example") RemindRecordPOExample example);

    int updateByPrimaryKeySelective(RemindRecordPO record);

    int updateByPrimaryKey(RemindRecordPO record);
}