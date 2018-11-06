package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.BaseFlowerPO;
import com.ziyoujiayuan.happygarden.entity.auto.BaseFlowerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseFlowerDAO {
    long countByExample(BaseFlowerPOExample example);

    int deleteByExample(BaseFlowerPOExample example);

    int deleteByPrimaryKey(String baseFlowerId);

    int insert(BaseFlowerPO record);

    int insertSelective(BaseFlowerPO record);

    List<BaseFlowerPO> selectByExample(BaseFlowerPOExample example);

    BaseFlowerPO selectByPrimaryKey(String baseFlowerId);

    int updateByExampleSelective(@Param("record") BaseFlowerPO record, @Param("example") BaseFlowerPOExample example);

    int updateByExample(@Param("record") BaseFlowerPO record, @Param("example") BaseFlowerPOExample example);

    int updateByPrimaryKeySelective(BaseFlowerPO record);

    int updateByPrimaryKey(BaseFlowerPO record);
}