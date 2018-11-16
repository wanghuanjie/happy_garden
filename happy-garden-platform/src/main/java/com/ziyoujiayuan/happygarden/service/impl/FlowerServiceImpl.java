package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.dao.auto.FlowerDAO;
import com.ziyoujiayuan.happygarden.dao.def.FlowerDefDAO;
import com.ziyoujiayuan.happygarden.entity.auto.FlowerPO;
import com.ziyoujiayuan.happygarden.entity.def.FlowerDefPO;
import com.ziyoujiayuan.happygarden.param.FlowerQueryParam;
import com.ziyoujiayuan.happygarden.param.FlowerSaveParam;
import com.ziyoujiayuan.happygarden.result.PubSelResult;
import com.ziyoujiayuan.happygarden.service.FlowerService;
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
public class FlowerServiceImpl implements FlowerService{

    @Resource
    private FlowerDefDAO flowerDefDAO;
    @Resource
    private FlowerDAO flowerDAO;

    @Override
    public PageInfo query(FlowerQueryParam flowerQueryParam) {
        PagerHandler.limitPage(flowerQueryParam.getStart(), flowerQueryParam.getLength());

        List<FlowerDefPO> flowerDefPOList = flowerDefDAO.listByCondition(flowerQueryParam);
        return new PageInfo(flowerDefPOList);
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public String save(FlowerSaveParam flowerSaveParam) {
        String flowerId = UuidUtils.getUUID();

        FlowerPO flowerPO = new FlowerPO();
        BeanUtils.copyProperties(flowerSaveParam, flowerPO);

        flowerPO.setFlowerId(flowerId);
        flowerPO.setCreateTime(new Date());
        flowerPO.setUpdateTime(new Date());
        flowerDAO.insertSelective(flowerPO);

        return flowerId;
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public void del(String flowerId) {
        flowerDAO.deleteByPrimaryKey(flowerId);
    }

    @Override
    public PageInfo queryPub(FlowerQueryParam flowerQueryParam) {
        PagerHandler.limitPage(flowerQueryParam.getStart(), flowerQueryParam.getLength());

        List<PubSelResult> flowerDefPOList = flowerDefDAO.listPubByCondition(flowerQueryParam);
        return new PageInfo(flowerDefPOList);
    }
}
