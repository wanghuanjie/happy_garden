package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.BaseFertilizerQueryParam;
import com.ziyoujiayuan.happygarden.param.BaseFertilizerSaveParam;
import com.ziyoujiayuan.happygarden.result.PubSelResult;

import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface BaseFertilizerService {

    /**
     * 查询
     *
     * @param baseFertilizerQueryParam
     * @return
     */
    PageInfo query(BaseFertilizerQueryParam baseFertilizerQueryParam);

    /**
     * 保存
     *
     * @param baseFertilizerSaveParam
     * @return
     */
    String save(BaseFertilizerSaveParam baseFertilizerSaveParam);

    /**
     * 删除
     *
     * @param baseFertilizerId
     * @return
     */
    String del(String baseFertilizerId);

    /**
     * 公共下拉选
     *
     * @return
     */
    List<PubSelResult> pubsel();
}
