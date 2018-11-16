package com.ziyoujiayuan.happygarden.service.impl;

import com.github.pagehelper.PageInfo;
import com.hbxhx.runtime.core.base.BaseService;
import com.hbxhx.runtime.mybatis.pager.PagerHandler;
import com.ziyoujiayuan.happygarden.dao.auto.AccountDAO;
import com.ziyoujiayuan.happygarden.dao.def.RemindRecordDefDAO;
import com.ziyoujiayuan.happygarden.entity.auto.AccountPO;
import com.ziyoujiayuan.happygarden.entity.auto.AccountPOExample;
import com.ziyoujiayuan.happygarden.entity.def.RemindRecordDefPO;
import com.ziyoujiayuan.happygarden.param.AccountQueryParam;
import com.ziyoujiayuan.happygarden.param.AccountSaveParam;
import com.ziyoujiayuan.happygarden.param.RemindQueryParam;
import com.ziyoujiayuan.happygarden.param.RemindSaveParam;
import com.ziyoujiayuan.happygarden.result.PubSelResult;
import com.ziyoujiayuan.happygarden.service.AccountService;
import com.ziyoujiayuan.happygarden.service.RemindService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/10
 */
@Service
public class AccountServiceImpl extends BaseService implements AccountService {

    @Resource
    private AccountDAO accountDAO;

    @Override
    public PageInfo query(AccountQueryParam accountQueryParam) {
        return null;
    }

    @Override
    public String save(AccountSaveParam accountSaveParam) {
        return null;
    }

    @Override
    public String del(String accountId) {
        return null;
    }

    @Override
    public List<PubSelResult> pubsel() {
        return null;
    }

    @Override
    public AccountPO getDetails(String mobile) {
        AccountPOExample accountPOExample = new AccountPOExample();
        accountPOExample.createCriteria().andMobileEqualTo(mobile);
        List<AccountPO> accountPOList = accountDAO.selectByExample(accountPOExample);

        int size = accountPOList.size();
        if (size > 1 || size < 1) {
            return null;
        } else {
            return accountPOList.get(0);
        }
    }
}
