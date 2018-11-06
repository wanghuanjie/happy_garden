package com.ziyoujiayuan.happygarden.entity.auto;

import com.hbxhx.runtime.base.db.BasePO;
import java.util.Date;

/**
 * t_attach
 * @author 
 */
public class AttachPO extends BasePO {
    /**
     * 附件ID
     */
    private String attachId;

    /**
     * 类型
     */
    private String type;

    /**
     * 文件关联id
     */
    private String entityId;

    /**
     * 文件内容
     */
    private String attachKey;

    /**
     * 是否是主图 1-是 0-不是
     */
    private Byte isMain;

    /**
     * 显示顺序 先->0->1->2->后
     */
    private Byte sequence;

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
     * 删除状态：0未删除,1已删除
     */
    private Byte isDel;

    public String getAttachId() {
        return attachId;
    }

    public void setAttachId(String attachId) {
        this.attachId = attachId == null ? null : attachId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId == null ? null : entityId.trim();
    }

    public String getAttachKey() {
        return attachKey;
    }

    public void setAttachKey(String attachKey) {
        this.attachKey = attachKey == null ? null : attachKey.trim();
    }

    public Byte getIsMain() {
        return isMain;
    }

    public void setIsMain(Byte isMain) {
        this.isMain = isMain;
    }

    public Byte getSequence() {
        return sequence;
    }

    public void setSequence(Byte sequence) {
        this.sequence = sequence;
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
        AttachPO other = (AttachPO) that;
        return (this.getAttachId() == null ? other.getAttachId() == null : this.getAttachId().equals(other.getAttachId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getEntityId() == null ? other.getEntityId() == null : this.getEntityId().equals(other.getEntityId()))
            && (this.getAttachKey() == null ? other.getAttachKey() == null : this.getAttachKey().equals(other.getAttachKey()))
            && (this.getIsMain() == null ? other.getIsMain() == null : this.getIsMain().equals(other.getIsMain()))
            && (this.getSequence() == null ? other.getSequence() == null : this.getSequence().equals(other.getSequence()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRegenerator() == null ? other.getRegenerator() == null : this.getRegenerator().equals(other.getRegenerator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttachId() == null) ? 0 : getAttachId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        result = prime * result + ((getAttachKey() == null) ? 0 : getAttachKey().hashCode());
        result = prime * result + ((getIsMain() == null) ? 0 : getIsMain().hashCode());
        result = prime * result + ((getSequence() == null) ? 0 : getSequence().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRegenerator() == null) ? 0 : getRegenerator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attachId=").append(attachId);
        sb.append(", type=").append(type);
        sb.append(", entityId=").append(entityId);
        sb.append(", attachKey=").append(attachKey);
        sb.append(", isMain=").append(isMain);
        sb.append(", sequence=").append(sequence);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", regenerator=").append(regenerator);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", isDel=").append(isDel);
        sb.append("]");
        return sb.toString();
    }
}