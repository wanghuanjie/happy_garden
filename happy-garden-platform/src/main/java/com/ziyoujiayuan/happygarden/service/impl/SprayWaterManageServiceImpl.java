package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.dao.auto.SprayWaterRecordDAO;
import com.ziyoujiayuan.happygarden.dao.def.SprayWaterRecordDefDAO;
import com.ziyoujiayuan.happygarden.entity.auto.SprayWaterRecordPO;
import com.ziyoujiayuan.happygarden.entity.def.ReplaceSoilRecordDefPO;
import com.ziyoujiayuan.happygarden.entity.def.SprayWaterRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.SprayWaterQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.SprayWaterSaveParam;
import com.ziyoujiayuan.happygarden.service.SprayWaterManageService;
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
public class SprayWaterManageServiceImpl implements SprayWaterManageService{

    @Resource
    private SprayWaterRecordDefDAO sprayWaterRecordDefDAO;
    @Resource
    private SprayWaterRecordDAO sprayWaterRecordDAO;

    @Override
    public PageInfo query(SprayWaterQueryParam sprayWaterQueryParam) {
        PagerHandler.limitPage(sprayWaterQueryParam.getStart(), sprayWaterQueryParam.getLength());

        List<SprayWaterRecordDefPO> sprayWaterRecordDefPOList = sprayWaterRecordDefDAO.listByCondition(sprayWaterQueryParam);
        return new PageInfo(sprayWaterRecordDefPOList);
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public String save(SprayWaterSaveParam sprayWaterSaveParam) {

        String recordId = UuidUtils.getUUID();
        SprayWaterRecordPO sprayWaterRecordPO = new SprayWaterRecordPO();
        BeanUtils.copyProperties(sprayWaterSaveParam, sprayWaterRecordPO);

        sprayWaterRecordPO.setRecordId(recordId);
        sprayWaterRecordPO.setCreateTime(new Date());
        sprayWaterRecordPO.setUpdateTime(new Date());
        sprayWaterRecordDAO.insertSelective(sprayWaterRecordPO);

        return recordId;
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public void del(String recordId) {
        sprayWaterRecordDAO.deleteByPrimaryKey(recordId);
    }
}
