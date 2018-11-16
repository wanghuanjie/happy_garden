package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.cultivate.ReplaceSoilQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.ReplaceSoilSaveParam;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface ReplaceSoilManageService {

    /**
     * 查询
     *
     * @param replaceSoilQueryParam
     * @return
     */
    PageInfo query(ReplaceSoilQueryParam replaceSoilQueryParam);

    /**
     *  保存
     *
     * @param replaceSoilSaveParam
     * @return
     */
    String save(ReplaceSoilSaveParam replaceSoilSaveParam);

    /**
     * 删除
     *
     * @param recordId
     * @return
     */
    void del(String recordId);
}
