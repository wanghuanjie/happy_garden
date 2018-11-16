package com.ziyoujiayuan.happygarden.dao.def;

import com.ziyoujiayuan.happygarden.entity.def.SpreadDrugRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.SpreadDrugQueryParam;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_spread_drug_record
 *
 * @author wanghjbuf
 */
@Repository
public interface SpreadDrugRecordDefDAO {

    /**
     * 根据条件查询
     *
     * @param spreadDrugQueryParam
     * @return
     */
    List<SpreadDrugRecordDefPO> listByCondition(SpreadDrugQueryParam spreadDrugQueryParam);
}