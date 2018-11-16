package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.dao.auto.ReplaceSoilRecordDAO;
import com.ziyoujiayuan.happygarden.dao.def.ReplaceSoilRecordDefDAO;
import com.ziyoujiayuan.happygarden.entity.auto.ReplaceSoilRecordPO;
import com.ziyoujiayuan.happygarden.entity.def.ApplyFertilizerRecordDefPO;
import com.ziyoujiayuan.happygarden.entity.def.ReplaceSoilRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.ReplaceSoilQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.ReplaceSoilSaveParam;
import com.ziyoujiayuan.happygarden.service.ReplaceSoilManageService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Service
public class ReplaceSoilManageServiceImpl implements ReplaceSoilManageService{

    @Resource
    private ReplaceSoilRecordDefDAO replaceSoilRecordDefDAO;
    @Resource
    private ReplaceSoilRecordDAO replaceSoilRecordDAO;

    @Override
    public PageInfo query(ReplaceSoilQueryParam replaceSoilQueryParam) {
        PagerHandler.limitPage(replaceSoilQueryParam.getStart(), replaceSoilQueryParam.getLength());

        List<ReplaceSoilRecordDefPO> replaceSoilRecordDefPOList = replaceSoilRecordDefDAO.listByCondition(replaceSoilQueryParam);
        return new PageInfo(replaceSoilRecordDefPOList);
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public String save(ReplaceSoilSaveParam replaceSoilSaveParam) {
        String recordId = UuidUtils.getUUID();
        ReplaceSoilRecordPO replaceSoilRecordPO = new ReplaceSoilRecordPO();
        BeanUtils.copyProperties(replaceSoilSaveParam, replaceSoilRecordPO);

        replaceSoilRecordPO.setRecordId(recordId);
        replaceSoilRecordPO.setCreateTime(new Date());
        replaceSoilRecordPO.setUpdateTime(new Date());
        replaceSoilRecordDAO.insertSelective(replaceSoilRecordPO);

        return recordId;
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public void del(String recordId) {
        replaceSoilRecordDAO.deleteByPrimaryKey(recordId);
    }
}
