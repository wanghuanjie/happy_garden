package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.BaseFertilizerPO;
import com.ziyoujiayuan.happygarden.entity.auto.BaseFertilizerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseFertilizerDAO {
    long countByExample(BaseFertilizerPOExample example);

    int deleteByExample(BaseFertilizerPOExample example);

    int deleteByPrimaryKey(String baseFertilizerId);

    int insert(BaseFertilizerPO record);

    int insertSelective(BaseFertilizerPO record);

    List<BaseFertilizerPO> selectByExample(BaseFertilizerPOExample example);

    BaseFertilizerPO selectByPrimaryKey(String baseFertilizerId);

    int updateByExampleSelective(@Param("record") BaseFertilizerPO record, @Param("example") BaseFertilizerPOExample example);

    int updateByExample(@Param("record") BaseFertilizerPO record, @Param("example") BaseFertilizerPOExample example);

    int updateByPrimaryKeySelective(BaseFertilizerPO record);

    int updateByPrimaryKey(BaseFertilizerPO record);
}