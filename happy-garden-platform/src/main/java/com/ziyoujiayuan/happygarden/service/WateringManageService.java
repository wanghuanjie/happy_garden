package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.cultivate.WateringQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.WateringSaveParam;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface WateringManageService {

    /**
     * 查询
     *
     * @param wateringQueryParam
     * @return
     */
    PageInfo query(WateringQueryParam wateringQueryParam);

    /**
     *  保存
     *
     * @param wateringSaveParam
     * @return
     */
    String save(WateringSaveParam wateringSaveParam);

    /**
     * 删除
     *
     * @param recordId
     * @return
     */
    void del(String recordId);
}
