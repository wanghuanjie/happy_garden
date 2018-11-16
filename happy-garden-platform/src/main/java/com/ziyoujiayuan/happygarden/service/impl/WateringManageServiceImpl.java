package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.dao.auto.WateringRecordDAO;
import com.ziyoujiayuan.happygarden.dao.def.WateringRecordDefDAO;
import com.ziyoujiayuan.happygarden.entity.auto.WateringRecordPO;
import com.ziyoujiayuan.happygarden.entity.def.WateringRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.WateringQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.WateringSaveParam;
import com.ziyoujiayuan.happygarden.service.WateringManageService;
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
public class WateringManageServiceImpl implements WateringManageService{

    @Resource
    private WateringRecordDefDAO wateringRecordDefDAO;
    @Resource
    private WateringRecordDAO wateringRecordDAO;

    @Override
    public PageInfo query(WateringQueryParam wateringQueryParam) {

        PagerHandler.limitPage(wateringQueryParam.getStart(), wateringQueryParam.getLength());

        List<WateringRecordDefPO> wateringRecordDefPOList = wateringRecordDefDAO.listByCondition(wateringQueryParam);
        return new PageInfo(wateringRecordDefPOList);
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public String save(WateringSaveParam wateringSaveParam) {

        String recordId = UuidUtils.getUUID();
        WateringRecordPO wateringRecordPO = new WateringRecordPO();
        BeanUtils.copyProperties(wateringSaveParam, wateringRecordPO);

        wateringRecordPO.setRecordId(recordId);
        wateringRecordPO.setCreateTime(new Date());
        wateringRecordPO.setUpdateTime(new Date());
        wateringRecordDAO.insertSelective(wateringRecordPO);

        return recordId;
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public void del(String recordId) {

        wateringRecordDAO.deleteByPrimaryKey(recordId);
    }
}
