package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.dao.auto.SpreadDrugRecordDAO;
import com.ziyoujiayuan.happygarden.dao.def.SpreadDrugRecordDefDAO;
import com.ziyoujiayuan.happygarden.entity.auto.SpreadDrugRecordPO;
import com.ziyoujiayuan.happygarden.entity.def.SprayWaterRecordDefPO;
import com.ziyoujiayuan.happygarden.entity.def.SpreadDrugRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.SpreadDrugQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.SpreadDrugSaveParam;
import com.ziyoujiayuan.happygarden.service.SpreadDrugManageService;
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
public class SpreadDrugManageServiceImpl implements SpreadDrugManageService{

    @Resource
    private SpreadDrugRecordDefDAO spreadDrugRecordDefDAO;
    @Resource
    private SpreadDrugRecordDAO spreadDrugRecordDAO;

    @Override
    public PageInfo query(SpreadDrugQueryParam spreadDrugQueryParam) {

        PagerHandler.limitPage(spreadDrugQueryParam.getStart(), spreadDrugQueryParam.getLength());

        List<SpreadDrugRecordDefPO> spreadDrugRecordDefPOList = spreadDrugRecordDefDAO.listByCondition(spreadDrugQueryParam);
        return new PageInfo(spreadDrugRecordDefPOList);
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public String save(SpreadDrugSaveParam spreadDrugSaveParam) {
        String recordId = UuidUtils.getUUID();
        SpreadDrugRecordPO spreadDrugRecordPO = new SpreadDrugRecordPO();

        spreadDrugRecordPO.setRecordId(recordId);
        spreadDrugRecordPO.setCreateTime(new Date());
        spreadDrugRecordPO.setUpdateTime(new Date());
        spreadDrugRecordDAO.insertSelective(spreadDrugRecordPO);

        return recordId;
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public void del(String recordId) {

        spreadDrugRecordDAO.deleteByPrimaryKey(recordId);
    }
}
