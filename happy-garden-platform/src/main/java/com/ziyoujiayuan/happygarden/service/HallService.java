package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.HallQueryParam;

/**
 * 大厅服务
 *
 * @author wanghjbuf
 * @date 2018/11/14
 */
public interface HallService {

    /**
     * 查询
     *
     * @param hallQueryParam
     * @return
     */
    PageInfo query(HallQueryParam hallQueryParam);
}
