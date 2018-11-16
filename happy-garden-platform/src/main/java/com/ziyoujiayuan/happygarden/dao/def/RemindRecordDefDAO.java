package com.ziyoujiayuan.happygarden.dao.def;

import com.ziyoujiayuan.happygarden.entity.def.RemindRecordDefPO;
import com.ziyoujiayuan.happygarden.param.RemindQueryParam;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_remind_record
 *
 * @author wanghjbuf
 */
@Repository
public interface RemindRecordDefDAO {

    /**
     * 根据条件查询
     *
     * @param remindQueryParam
     * @return
     */
    List<RemindRecordDefPO> listByCondition(RemindQueryParam remindQueryParam);
}