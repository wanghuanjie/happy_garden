package com.ziyoujiayuan.happygarden.dao.def;

import com.ziyoujiayuan.happygarden.entity.def.BaseFlowerDefPO;
import com.ziyoujiayuan.happygarden.param.HallQueryParam;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * t_hall_record
 *
 * @author wanghjbuf
 */
@Repository
public interface HallDefDAO {

    /**
     * 根据条件查询
     *
     * @param hallQueryParam
     * @return
     */
    List<BaseFlowerDefPO> listByCondition(HallQueryParam hallQueryParam);
}