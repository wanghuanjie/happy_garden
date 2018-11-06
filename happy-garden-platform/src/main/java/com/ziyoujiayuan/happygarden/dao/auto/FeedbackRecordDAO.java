package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.FeedbackRecordPO;
import com.ziyoujiayuan.happygarden.entity.auto.FeedbackRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRecordDAO {
    long countByExample(FeedbackRecordPOExample example);

    int deleteByExample(FeedbackRecordPOExample example);

    int deleteByPrimaryKey(String feedbackId);

    int insert(FeedbackRecordPO record);

    int insertSelective(FeedbackRecordPO record);

    List<FeedbackRecordPO> selectByExample(FeedbackRecordPOExample example);

    FeedbackRecordPO selectByPrimaryKey(String feedbackId);

    int updateByExampleSelective(@Param("record") FeedbackRecordPO record, @Param("example") FeedbackRecordPOExample example);

    int updateByExample(@Param("record") FeedbackRecordPO record, @Param("example") FeedbackRecordPOExample example);

    int updateByPrimaryKeySelective(FeedbackRecordPO record);

    int updateByPrimaryKey(FeedbackRecordPO record);
}