package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.FlowerPO;
import com.ziyoujiayuan.happygarden.entity.auto.FlowerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerDAO {
    long countByExample(FlowerPOExample example);

    int deleteByExample(FlowerPOExample example);

    int deleteByPrimaryKey(String flowerId);

    int insert(FlowerPO record);

    int insertSelective(FlowerPO record);

    List<FlowerPO> selectByExample(FlowerPOExample example);

    FlowerPO selectByPrimaryKey(String flowerId);

    int updateByExampleSelective(@Param("record") FlowerPO record, @Param("example") FlowerPOExample example);

    int updateByExample(@Param("record") FlowerPO record, @Param("example") FlowerPOExample example);

    int updateByPrimaryKeySelective(FlowerPO record);

    int updateByPrimaryKey(FlowerPO record);
}