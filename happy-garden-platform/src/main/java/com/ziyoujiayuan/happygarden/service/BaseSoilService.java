package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.BaseSoilQueryParam;
import com.ziyoujiayuan.happygarden.param.BaseSoilSaveParam;
import com.ziyoujiayuan.happygarden.result.PubSelResult;

import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface BaseSoilService {

    /**
     * 查询
     *
     * @param baseSoilQueryParam
     * @return
     */
    PageInfo query(BaseSoilQueryParam baseSoilQueryParam);

    /**
     * 保存
     *
     * @param baseSoilSaveParam
     * @return
     */
    String save(BaseSoilSaveParam baseSoilSaveParam);

    /**
     * 删除
     *
     * @param baseSoilId
     * @return
     */
    String del(String baseSoilId);

    /**
     * 公共下拉选
     *
     * @return
     */
    List<PubSelResult> pubsel();
}
