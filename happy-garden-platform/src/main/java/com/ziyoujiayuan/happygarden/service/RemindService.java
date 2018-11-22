package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.FlowerQueryParam;
import com.ziyoujiayuan.happygarden.param.FlowerSaveParam;
import com.ziyoujiayuan.happygarden.param.RemindQueryParam;
import com.ziyoujiayuan.happygarden.param.RemindSaveParam;

import java.util.Date;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface RemindService {

    /**
     * 查询
     *
     * @param remindQueryParam
     * @return
     */
    PageInfo query(RemindQueryParam remindQueryParam);

    /**
     * 保存
     *
     * @param remindSaveParam
     * @return
     */
    String save(RemindSaveParam remindSaveParam);

    /**
     * 删除
     *
     * @param recordId
     * @return
     */
    void del(String recordId);

    /**
     * 计算next
     *
     * @param originTime
     * @param mode
     * @param unit
     * @return
     */
     Date doCalculateNext(Date originTime, Integer mode, Integer unit);
}
