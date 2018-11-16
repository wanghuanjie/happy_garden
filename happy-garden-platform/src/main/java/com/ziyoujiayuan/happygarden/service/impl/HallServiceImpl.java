package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.core.base.BaseService;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.ziyoujiayuan.happygarden.dao.def.HallDefDAO;
import com.ziyoujiayuan.happygarden.entity.def.BaseFlowerDefPO;
import com.ziyoujiayuan.happygarden.param.HallQueryParam;
import com.ziyoujiayuan.happygarden.service.HallService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/14
 */
@Service
public class HallServiceImpl extends BaseService implements HallService {

    @Resource
    private HallDefDAO hallDefDAO;

    @Override
    public PageInfo query(HallQueryParam hallQueryParam) {
        PagerHandler.limitPage(hallQueryParam.getStart(), hallQueryParam.getLength());

        List<BaseFlowerDefPO> baseFlowerDefPOList = hallDefDAO.listByCondition(hallQueryParam);
        return new PageInfo(baseFlowerDefPOList);
    }
}
