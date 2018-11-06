package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.BaseSoilPO;
import com.ziyoujiayuan.happygarden.entity.auto.BaseSoilPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseSoilDAO {
    long countByExample(BaseSoilPOExample example);

    int deleteByExample(BaseSoilPOExample example);

    int deleteByPrimaryKey(String baseSoilId);

    int insert(BaseSoilPO record);

    int insertSelective(BaseSoilPO record);

    List<BaseSoilPO> selectByExample(BaseSoilPOExample example);

    BaseSoilPO selectByPrimaryKey(String baseSoilId);

    int updateByExampleSelective(@Param("record") BaseSoilPO record, @Param("example") BaseSoilPOExample example);

    int updateByExample(@Param("record") BaseSoilPO record, @Param("example") BaseSoilPOExample example);

    int updateByPrimaryKeySelective(BaseSoilPO record);

    int updateByPrimaryKey(BaseSoilPO record);
}