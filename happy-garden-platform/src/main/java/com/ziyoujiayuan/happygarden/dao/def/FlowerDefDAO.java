package com.ziyoujiayuan.happygarden.dao.def;

import com.ziyoujiayuan.happygarden.entity.def.FlowerDefPO;
import com.ziyoujiayuan.happygarden.param.FlowerQueryParam;
import com.ziyoujiayuan.happygarden.result.PubSelResult;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_remind_record
 *
 * @author wanghjbuf
 */
@Repository
public interface FlowerDefDAO {

    /**
     * 根据条件查询
     *
     * @param flowerQueryParam
     * @return
     */
    List<FlowerDefPO> listByCondition(FlowerQueryParam flowerQueryParam);

    /**
     * 下拉选查询
     *
     * @param flowerQueryParam
     * @return
     */
    List<PubSelResult> listPubByCondition(FlowerQueryParam flowerQueryParam);
}