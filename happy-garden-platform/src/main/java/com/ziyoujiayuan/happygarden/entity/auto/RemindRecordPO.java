package com.ziyoujiayuan.happygarden.entity.auto;

import com.hbxhx.runtime.base.db.BasePO;
import java.util.Date;

/**
 * t_remind_record
 * @author 
 */
public class RemindRecordPO extends BasePO {
    /**
     * 记录ID
     */
    private String recordId;

    /**
     * 类型-施肥,撒药,浇水,喷水
     */
    private String type;

    /**
     * 模式-0:at,1:年,2:月,3:日
     */
    private Byte mode;

    /**
     * 单位
     */
    private Byte unit;

    /**
     * 原始时间
     */
    private Date originTime;

    /**
     * next
     */
    private Date nextTime;

    /**
     * 实体ID
     */
    private String entityId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态-0:初始化,1:启用,2:停用
     */
    private Byte status;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String regenerator;

    /**
     * 新增时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 删除状态-0:未删除,1已删除
     */
    private Byte isDel;

    /**
     * 邮件通知次数 默认0
     */
    private Byte emailNotifyCnt;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getMode() {
        return mode;
    }

    public void setMode(Byte mode) {
        this.mode = mode;
    }

    public Byte getUnit() {
        return unit;
    }

    public void setUnit(Byte unit) {
        this.unit = unit;
    }

    public Date getOriginTime() {
        return originTime;
    }

    public void setOriginTime(Date originTime) {
        this.originTime = originTime;
    }

    public Date getNextTime() {
        return nextTime;
    }

    public void setNextTime(Date nextTime) {
        this.nextTime = nextTime;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId == null ? null : entityId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRegenerator() {
        return regenerator;
    }

    public void setRegenerator(String regenerator) {
        this.regenerator = regenerator == null ? null : regenerator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public Byte getEmailNotifyCnt() {
        return emailNotifyCnt;
    }

    public void setEmailNotifyCnt(Byte emailNotifyCnt) {
        this.emailNotifyCnt = emailNotifyCnt;
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
        RemindRecordPO other = (RemindRecordPO) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getMode() == null ? other.getMode() == null : this.getMode().equals(other.getMode()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getOriginTime() == null ? other.getOriginTime() == null : this.getOriginTime().equals(other.getOriginTime()))
            && (this.getNextTime() == null ? other.getNextTime() == null : this.getNextTime().equals(other.getNextTime()))
            && (this.getEntityId() == null ? other.getEntityId() == null : this.getEntityId().equals(other.getEntityId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRegenerator() == null ? other.getRegenerator() == null : this.getRegenerator().equals(other.getRegenerator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getEmailNotifyCnt() == null ? other.getEmailNotifyCnt() == null : this.getEmailNotifyCnt().equals(other.getEmailNotifyCnt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getMode() == null) ? 0 : getMode().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getOriginTime() == null) ? 0 : getOriginTime().hashCode());
        result = prime * result + ((getNextTime() == null) ? 0 : getNextTime().hashCode());
        result = prime * result + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRegenerator() == null) ? 0 : getRegenerator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getEmailNotifyCnt() == null) ? 0 : getEmailNotifyCnt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", type=").append(type);
        sb.append(", mode=").append(mode);
        sb.append(", unit=").append(unit);
        sb.append(", originTime=").append(originTime);
        sb.append(", nextTime=").append(nextTime);
        sb.append(", entityId=").append(entityId);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", regenerator=").append(regenerator);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", isDel=").append(isDel);
        sb.append(", emailNotifyCnt=").append(emailNotifyCnt);
        sb.append("]");
        return sb.toString();
    }
}