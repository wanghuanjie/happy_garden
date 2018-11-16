package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.core.base.BaseService;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.dao.auto.FeedbackRecordDAO;
import com.ziyoujiayuan.happygarden.entity.auto.FeedbackRecordPO;
import com.ziyoujiayuan.happygarden.param.FeedbackQueryParam;
import com.ziyoujiayuan.happygarden.param.FeedbackSaveParam;
import com.ziyoujiayuan.happygarden.service.FeedbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author wanghjbuf
 * @date 2018/11/14
 */
@Slf4j
@Service
public class FeedbackServiceImpl extends BaseService implements FeedbackService {

    @Resource
    private FeedbackRecordDAO feedbackRecordDAO;

    @Override
    public PageInfo query(FeedbackQueryParam feedbackQueryParam) {
        return null;
    }

    @Override
    public String save(FeedbackSaveParam feedbackSaveParam) {

        String feedbackId = UuidUtils.getUUID();
        FeedbackRecordPO feedbackRecordPO = new FeedbackRecordPO();
        BeanUtils.copyProperties(feedbackSaveParam, feedbackRecordPO);
        feedbackRecordPO.setFeedbackId(feedbackId);
        feedbackRecordPO.setCreateTime(new Date());
        feedbackRecordPO.setUpdateTime(new Date());

        log.info("FeedbackService-save:{};", feedbackRecordDAO.insertSelective(feedbackRecordPO));
        return feedbackId;
    }

    @Override
    public String del(String feedbackId) {
        return null;
    }
}
