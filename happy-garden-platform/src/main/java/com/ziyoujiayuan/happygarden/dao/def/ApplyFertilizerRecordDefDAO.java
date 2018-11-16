package com.ziyoujiayuan.happygarden.dao.def;

import com.ziyoujiayuan.happygarden.entity.def.ApplyFertilizerRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.ApplyFertilizerQueryParam;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_apply_fertilizer_record
 *
 * @author wanghjbuf
 */
@Repository
public interface ApplyFertilizerRecordDefDAO {

    /**
     * 根据条件查询
     *
     * @param applyFertilizerQueryParam
     * @return
     */
    List<ApplyFertilizerRecordDefPO> listByCondition(ApplyFertilizerQueryParam applyFertilizerQueryParam);
}