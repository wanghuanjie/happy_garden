package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.core.base.BaseService;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.ziyoujiayuan.happygarden.dao.def.RemindRecordDefDAO;
import com.ziyoujiayuan.happygarden.entity.def.RemindRecordDefPO;
import com.ziyoujiayuan.happygarden.param.RemindQueryParam;
import com.ziyoujiayuan.happygarden.param.RemindSaveParam;
import com.ziyoujiayuan.happygarden.service.RemindService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/10
 */
@Service
public class RemindServiceImpl extends BaseService implements RemindService{

    @Resource
    private RemindRecordDefDAO remindRecordDefDAO;

    @Override
    public PageInfo query(RemindQueryParam remindQueryParam) {
        PagerHandler.limitPage(remindQueryParam.getStart(), remindQueryParam.getLength());

        List<RemindRecordDefPO> remindRecordDefPOList = remindRecordDefDAO.listByCondition(remindQueryParam);
        return new PageInfo(remindRecordDefPOList);
    }

    @Override
    public String save(RemindSaveParam remindSaveParam) {
        return null;
    }

    @Override
    public String del(String recordId) {
        return null;
    }
}
