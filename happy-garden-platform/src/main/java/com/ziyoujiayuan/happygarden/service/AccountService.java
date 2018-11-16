package com.ziyoujiayuan.happygarden.service;

import com.github.pagehelper.PageInfo;
import com.ziyoujiayuan.happygarden.entity.auto.AccountPO;
import com.ziyoujiayuan.happygarden.param.AccountQueryParam;
import com.ziyoujiayuan.happygarden.param.AccountSaveParam;
import com.ziyoujiayuan.happygarden.result.PubSelResult;

import java.util.List;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
public interface AccountService {

    /**
     * 查询
     *
     * @param accountQueryParam
     * @return
     */
    PageInfo query(AccountQueryParam accountQueryParam);

    /**
     * 保存
     *
     * @param accountSaveParam
     * @return
     */
    String save(AccountSaveParam accountSaveParam);

    /**
     * 删除
     *
     * @param accountId
     * @return
     */
    String del(String accountId);

    /**
     * 公共下拉选
     *
     * @return
     */
    List<PubSelResult> pubsel();

    /**
     * 获取AccountPo
     *
     * @param mobile
     * @return
     */
    AccountPO getDetails(String mobile);
}
