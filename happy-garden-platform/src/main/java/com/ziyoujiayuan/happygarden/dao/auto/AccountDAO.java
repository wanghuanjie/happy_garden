package com.ziyoujiayuan.happygarden.dao.auto;

import com.ziyoujiayuan.happygarden.entity.auto.AccountPO;
import com.ziyoujiayuan.happygarden.entity.auto.AccountPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDAO {
    long countByExample(AccountPOExample example);

    int deleteByExample(AccountPOExample example);

    int deleteByPrimaryKey(String accountId);

    int insert(AccountPO record);

    int insertSelective(AccountPO record);

    List<AccountPO> selectByExample(AccountPOExample example);

    AccountPO selectByPrimaryKey(String accountId);

    int updateByExampleSelective(@Param("record") AccountPO record, @Param("example") AccountPOExample example);

    int updateByExample(@Param("record") AccountPO record, @Param("example") AccountPOExample example);

    int updateByPrimaryKeySelective(AccountPO record);

    int updateByPrimaryKey(AccountPO record);
}