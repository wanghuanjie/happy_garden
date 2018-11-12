package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.BaseDrugQueryParam;
import com.ziyoujiayuan.happygarden.param.BaseDrugSaveParam;
import com.ziyoujiayuan.happygarden.result.PubSelResult;

import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface BaseDrugService {

    /**
     * 查询
     *
     * @param baseDrugQueryParam
     * @return
     */
    PageInfo query(BaseDrugQueryParam baseDrugQueryParam);

    /**
     * 保存
     *
     * @param baseDrugSaveParam
     * @return
     */
    String save(BaseDrugSaveParam baseDrugSaveParam);

    /**
     * 删除
     *
     * @param baseDrugId
     * @return
     */
    String del(String baseDrugId);

    /**
     * 公共下拉选
     *
     * @return
     */
    List<PubSelResult> pubsel();
}
