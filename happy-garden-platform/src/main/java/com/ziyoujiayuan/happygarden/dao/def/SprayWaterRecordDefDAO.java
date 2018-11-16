package com.ziyoujiayuan.happygarden.dao.def;

import com.ziyoujiayuan.happygarden.entity.def.SprayWaterRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.SprayWaterQueryParam;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_spray_water_record
 *
 * @author wanghjbuf
 */
@Repository
public interface SprayWaterRecordDefDAO {

    /**
     * 根据条件查询
     *
     * @param sprayWaterQueryParam
     * @return
     */
    List<SprayWaterRecordDefPO> listByCondition(SprayWaterQueryParam sprayWaterQueryParam);
}