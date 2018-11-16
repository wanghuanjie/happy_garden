package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.cultivate.SpreadDrugQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.SpreadDrugSaveParam;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface SpreadDrugManageService {

    /**
     * 查询
     *
     * @param spreadDrugQueryParam
     * @return
     */
    PageInfo query(SpreadDrugQueryParam spreadDrugQueryParam);

    /**
     *  保存
     *
     * @param spreadDrugSaveParam
     * @return
     */
    String save(SpreadDrugSaveParam spreadDrugSaveParam);

    /**
     * 删除
     *
     * @param recordId
     * @return
     */
    void del(String recordId);
}
