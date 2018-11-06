package com.ziyoujiayuan.happygarden.entity.auto;

import com.hbxhx.runtime.base.db.BasePO;
import java.util.Date;

/**
 * t_account
 * @author 
 */
public class AccountPO extends BasePO {
    /**
     * 用户id
     */
    private String accountId;

    /**
     * 用户昵称
     */
    private String accountName;

    private String wechatNickname;

    /**
     * 微信openid
     */
    private String wechatOpenId;

    /**
     * 微信openid
     */
    private String wechatMpOpenId;

    /**
     * 微信unionid
     */
    private String wechatUnionId;

    /**
     * 微信头像
     */
    private String wechatHeader;

    /**
     * 账户归属 0-管理端,1-小程序
     */
    private Byte type;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 新增时间
     */
    private Date createTime;

    /**
     * 删除状态：0未删除,1已删除
     */
    private Byte isDel;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getWechatNickname() {
        return wechatNickname;
    }

    public void setWechatNickname(String wechatNickname) {
        this.wechatNickname = wechatNickname == null ? null : wechatNickname.trim();
    }

    public String getWechatOpenId() {
        return wechatOpenId;
    }

    public void setWechatOpenId(String wechatOpenId) {
        this.wechatOpenId = wechatOpenId == null ? null : wechatOpenId.trim();
    }

    public String getWechatMpOpenId() {
        return wechatMpOpenId;
    }

    public void setWechatMpOpenId(String wechatMpOpenId) {
        this.wechatMpOpenId = wechatMpOpenId == null ? null : wechatMpOpenId.trim();
    }

    public String getWechatUnionId() {
        return wechatUnionId;
    }

    public void setWechatUnionId(String wechatUnionId) {
        this.wechatUnionId = wechatUnionId == null ? null : wechatUnionId.trim();
    }

    public String getWechatHeader() {
        return wechatHeader;
    }

    public void setWechatHeader(String wechatHeader) {
        this.wechatHeader = wechatHeader == null ? null : wechatHeader.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AccountPO other = (AccountPO) that;
        return (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getWechatNickname() == null ? other.getWechatNickname() == null : this.getWechatNickname().equals(other.getWechatNickname()))
            && (this.getWechatOpenId() == null ? other.getWechatOpenId() == null : this.getWechatOpenId().equals(other.getWechatOpenId()))
            && (this.getWechatMpOpenId() == null ? other.getWechatMpOpenId() == null : this.getWechatMpOpenId().equals(other.getWechatMpOpenId()))
            && (this.getWechatUnionId() == null ? other.getWechatUnionId() == null : this.getWechatUnionId().equals(other.getWechatUnionId()))
            && (this.getWechatHeader() == null ? other.getWechatHeader() == null : this.getWechatHeader().equals(other.getWechatHeader()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getWechatNickname() == null) ? 0 : getWechatNickname().hashCode());
        result = prime * result + ((getWechatOpenId() == null) ? 0 : getWechatOpenId().hashCode());
        result = prime * result + ((getWechatMpOpenId() == null) ? 0 : getWechatMpOpenId().hashCode());
        result = prime * result + ((getWechatUnionId() == null) ? 0 : getWechatUnionId().hashCode());
        result = prime * result + ((getWechatHeader() == null) ? 0 : getWechatHeader().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountId=").append(accountId);
        sb.append(", accountName=").append(accountName);
        sb.append(", wechatNickname=").append(wechatNickname);
        sb.append(", wechatOpenId=").append(wechatOpenId);
        sb.append(", wechatMpOpenId=").append(wechatMpOpenId);
        sb.append(", wechatUnionId=").append(wechatUnionId);
        sb.append(", wechatHeader=").append(wechatHeader);
        sb.append(", type=").append(type);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", isDel=").append(isDel);
        sb.append("]");
        return sb.toString();
    }
}