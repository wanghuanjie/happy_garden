package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.FlowerQueryParam;
import com.ziyoujiayuan.happygarden.param.FlowerSaveParam;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface FlowerService {

    /**
     * 查询
     *
     * @param flowerQueryParam
     * @return
     */
    PageInfo query(FlowerQueryParam flowerQueryParam);

    /**
     * 保存
     *
     * @param flowerSaveParam
     * @return
     */
    String save(FlowerSaveParam flowerSaveParam);

    /**
     * 删除
     *
     * @param flowerId
     * @return
     */
    void del(String flowerId);

    /**
     * 查询publist
     *
     * @param flowerQueryParam
     * @return
     */
    PageInfo queryPub(FlowerQueryParam flowerQueryParam);
}
