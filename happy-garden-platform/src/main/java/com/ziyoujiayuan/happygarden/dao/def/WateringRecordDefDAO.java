package com.ziyoujiayuan.happygarden.dao.def;

import com.ziyoujiayuan.happygarden.entity.def.WateringRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.WateringQueryParam;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_watering_record
 *
 * @author wanghjbuf
 */
@Repository
public interface WateringRecordDefDAO {

    /**
     * 根据条件查询
     *
     * @param wateringQueryParam
     * @return
     */
    List<WateringRecordDefPO> listByCondition(WateringQueryParam wateringQueryParam);
}