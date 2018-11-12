package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.BaseFlowerQueryParam;
import com.ziyoujiayuan.happygarden.param.BaseFlowerSaveParam;
import com.ziyoujiayuan.happygarden.result.PubSelResult;

import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface BaseFlowerService {

    /**
     * 查询
     *
     * @param baseFlowerQueryParam
     * @return
     */
    PageInfo query(BaseFlowerQueryParam baseFlowerQueryParam);

    /**
     * 保存
     *
     * @param baseFlowerSaveParam
     * @return
     */
    String save(BaseFlowerSaveParam baseFlowerSaveParam);

    /**
     * 删除
     *
     * @param baseFlowerId
     * @return
     */
    String del(String baseFlowerId);

    /**
     * 公共下拉选
     *
     * @return
     */
    List<PubSelResult> pubsel();
}
