package com.ziyoujiayuan.happygarden.dao.def;

import com.ziyoujiayuan.happygarden.entity.def.ReplaceSoilRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.ReplaceSoilQueryParam;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_replace_soil_record
 *
 * @author wanghjbuf
 */
@Repository
public interface ReplaceSoilRecordDefDAO {

    /**
     * 根据条件查询
     *
     * @param replaceSoilQueryParam
     * @return
     */
    List<ReplaceSoilRecordDefPO> listByCondition(ReplaceSoilQueryParam replaceSoilQueryParam);
}