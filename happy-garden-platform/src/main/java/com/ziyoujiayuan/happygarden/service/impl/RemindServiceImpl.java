package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.core.base.BaseService;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.hbxhx.utils.date.DateUtils;
import com.hbxhx.utils.uuid.UuidUtils;
import com.ziyoujiayuan.happygarden.dao.auto.RemindRecordDAO;
import com.ziyoujiayuan.happygarden.dao.def.RemindRecordDefDAO;
import com.ziyoujiayuan.happygarden.entity.auto.RemindRecordPO;
import com.ziyoujiayuan.happygarden.entity.def.RemindRecordDefPO;
import com.ziyoujiayuan.happygarden.enums.RemindUnitEnum;
import com.ziyoujiayuan.happygarden.param.RemindQueryParam;
import com.ziyoujiayuan.happygarden.param.RemindSaveParam;
import com.ziyoujiayuan.happygarden.service.RemindService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/10
 */
@Service
public class RemindServiceImpl extends BaseService implements RemindService{

    @Resource
    private RemindRecordDefDAO remindRecordDefDAO;
    @Resource
    private RemindRecordDAO remindRecordDAO;

    @Override
    public PageInfo query(RemindQueryParam remindQueryParam) {
        PagerHandler.limitPage(remindQueryParam.getStart(), remindQueryParam.getLength());

        List<RemindRecordDefPO> remindRecordDefPOList = remindRecordDefDAO.listByCondition(remindQueryParam);
        return new PageInfo(remindRecordDefPOList);
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public String save(RemindSaveParam remindSaveParam) {
        String recordId = UuidUtils.getUUID();

        RemindRecordPO remindRecordPO = new RemindRecordPO();
        BeanUtils.copyProperties(remindSaveParam, remindRecordPO);

        remindRecordPO.setNextTime(doCalculateNext(remindSaveParam.getNextTime(), remindSaveParam.getUnit()));
        remindRecordPO.setRecordId(recordId);
        remindRecordPO.setCreateTime(new Date());
        remindRecordPO.setUpdateTime(new Date());
        remindRecordDAO.insertSelective(remindRecordPO);

        return recordId;
    }

    @Override
    @Transactional(value = "masterTransactionManager", rollbackFor = RuntimeException.class)
    public void del(String recordId) {
        remindRecordDAO.deleteByPrimaryKey(recordId);
    }

    @Override
    public Date doCalculateNext(Date originTime, Integer unit) {
        Date result = null;
        switch (RemindUnitEnum.getEnumByCode(unit)) {
            case AT:
                result = originTime;
                break;
            case YEAR:
                result = DateUtils.addOneYear(originTime);
                break;
            case MONTH:
                result = DateUtils.addOneMonth(originTime);
                break;
            case DAY:
                result = DateUtils.addOneDay(originTime);
                break;
            default:
        }
        return result;
    }
}
