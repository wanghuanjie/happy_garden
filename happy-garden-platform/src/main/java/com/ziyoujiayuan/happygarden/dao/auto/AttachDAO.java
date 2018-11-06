package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.AttachPO;
import com.ziyoujiayuan.happygarden.entity.auto.AttachPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachDAO {
    long countByExample(AttachPOExample example);

    int deleteByExample(AttachPOExample example);

    int deleteByPrimaryKey(String attachId);

    int insert(AttachPO record);

    int insertSelective(AttachPO record);

    List<AttachPO> selectByExample(AttachPOExample example);

    AttachPO selectByPrimaryKey(String attachId);

    int updateByExampleSelective(@Param("record") AttachPO record, @Param("example") AttachPOExample example);

    int updateByExample(@Param("record") AttachPO record, @Param("example") AttachPOExample example);

    int updateByPrimaryKeySelective(AttachPO record);

    int updateByPrimaryKey(AttachPO record);
}