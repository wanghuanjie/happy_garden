package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.cultivate.ApplyFertilizerQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.ApplyFertilizerSaveParam;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface ApplyFertilizerManageService {

    /**
     * 查询
     *
     * @param applyFertilizerQueryParam
     * @return
     */
    PageInfo query(ApplyFertilizerQueryParam applyFertilizerQueryParam);

    /**
     *  保存
     *
     * @param applyFertilizerSaveParam
     * @return
     */
    String save(ApplyFertilizerSaveParam applyFertilizerSaveParam);

    /**
     * 删除
     *
     * @param recordId
     * @return
     */
    void del(String recordId);
}
