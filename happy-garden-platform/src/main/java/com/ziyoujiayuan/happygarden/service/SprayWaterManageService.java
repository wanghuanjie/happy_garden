package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.cultivate.SprayWaterQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.SprayWaterSaveParam;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface SprayWaterManageService {

    /**
     * 查询
     *
     * @param sprayWaterQueryParam
     * @return
     */
    PageInfo query(SprayWaterQueryParam sprayWaterQueryParam);

    /**
     *  保存
     *
     * @param sprayWaterSaveParam
     * @return
     */
    String save(SprayWaterSaveParam sprayWaterSaveParam);

    /**
     * 删除
     *
     * @param recordId
     * @return
     */
    void del(String recordId);
}
