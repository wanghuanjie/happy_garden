package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.param.FeedbackQueryParam;
import com.ziyoujiayuan.happygarden.param.FeedbackSaveParam;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface FeedbackService {

    /**
     * 查询
     *
     * @param feedbackQueryParam
     * @return
     */
    PageInfo query(FeedbackQueryParam feedbackQueryParam);

    /**
     * 保存
     *
     * @param feedbackSaveParam
     * @return
     */
    String save(FeedbackSaveParam feedbackSaveParam);

    /**
     * 删除
     *
     * @param feedbackId
     * @return
     */
    String del(String feedbackId);
}
