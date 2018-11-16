package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.dao.auto.ApplyFertilizerRecordDAO;
import com.ziyoujiayuan.happygarden.dao.def.ApplyFertilizerRecordDefDAO;
import com.ziyoujiayuan.happygarden.entity.auto.ApplyFertilizerRecordPO;
import com.ziyoujiayuan.happygarden.entity.def.ApplyFertilizerRecordDefPO;
import com.ziyoujiayuan.happygarden.param.cultivate.ApplyFertilizerQueryParam;
import com.ziyoujiayuan.happygarden.param.cultivate.ApplyFertilizerSaveParam;
import com.ziyoujiayuan.happygarden.service.ApplyFertilizerManageService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/16
 */
@Service
public class ApplyFertilizerManageServiceImpl implements ApplyFertilizerManageService{

    @Resource
    private ApplyFertilizerRecordDefDAO applyFertilizerRecordDefDAO;
    @Resource
    private ApplyFertilizerRecordDAO applyFertilizerRecordDAO;

    @Override
    public PageInfo query(ApplyFertilizerQueryParam applyFertilizerQueryParam) {
        PagerHandler.limitPage(applyFertilizerQueryParam.getStart(), applyFertilizerQueryParam.getLength());

        List<ApplyFertilizerRecordDefPO> applyFertilizerRecordDefPOList = applyFertilizerRecordDefDAO.listByCondition(applyFertilizerQueryParam);
        return new PageInfo(applyFertilizerRecordDefPOList);
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public String save(ApplyFertilizerSaveParam applyFertilizerSaveParam) {
        String recordId = UuidUtils.getUUID();
        ApplyFertilizerRecordPO applyFertilizerRecordPO = new ApplyFertilizerRecordPO();
        BeanUtils.copyProperties(applyFertilizerSaveParam, applyFertilizerRecordPO);

        applyFertilizerRecordPO.setRecordId(recordId);
        applyFertilizerRecordPO.setCreateTime(new Date());
        applyFertilizerRecordPO.setUpdateTime(new Date());
        applyFertilizerRecordDAO.insertSelective(applyFertilizerRecordPO);

        return recordId;
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public void del(String recordId) {
        applyFertilizerRecordDAO.deleteByPrimaryKey(recordId);
    }
}
