package com.ziyoujiayuan.happygarden.entity.auto;

import com.hbxhx.runtime.base.db.BasePO;
import java.util.Date;

/**
 * t_base_soil
 * @author 
 */
public class BaseSoilPO extends BasePO {
    /**
     * 土壤ID
     */
    private String baseSoilId;

    /**
     * 土壤名称
     */
    private String baseSoilName;

    /**
     * 土壤配方
     */
    private String baseSoilRecipe;

    /**
     * 是否推荐 1-是 0-不是
     */
    private Byte isRecommend;

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

    public String getBaseSoilId() {
        return baseSoilId;
    }

    public void setBaseSoilId(String baseSoilId) {
        this.baseSoilId = baseSoilId == null ? null : baseSoilId.trim();
    }

    public String getBaseSoilName() {
        return baseSoilName;
    }

    public void setBaseSoilName(String baseSoilName) {
        this.baseSoilName = baseSoilName == null ? null : baseSoilName.trim();
    }

    public String getBaseSoilRecipe() {
        return baseSoilRecipe;
    }

    public void setBaseSoilRecipe(String baseSoilRecipe) {
        this.baseSoilRecipe = baseSoilRecipe == null ? null : baseSoilRecipe.trim();
    }

    public Byte getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
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
        BaseSoilPO other = (BaseSoilPO) that;
        return (this.getBaseSoilId() == null ? other.getBaseSoilId() == null : this.getBaseSoilId().equals(other.getBaseSoilId()))
            && (this.getBaseSoilName() == null ? other.getBaseSoilName() == null : this.getBaseSoilName().equals(other.getBaseSoilName()))
            && (this.getBaseSoilRecipe() == null ? other.getBaseSoilRecipe() == null : this.getBaseSoilRecipe().equals(other.getBaseSoilRecipe()))
            && (this.getIsRecommend() == null ? other.getIsRecommend() == null : this.getIsRecommend().equals(other.getIsRecommend()))
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
        result = prime * result + ((getBaseSoilId() == null) ? 0 : getBaseSoilId().hashCode());
        result = prime * result + ((getBaseSoilName() == null) ? 0 : getBaseSoilName().hashCode());
        result = prime * result + ((getBaseSoilRecipe() == null) ? 0 : getBaseSoilRecipe().hashCode());
        result = prime * result + ((getIsRecommend() == null) ? 0 : getIsRecommend().hashCode());
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
        sb.append(", baseSoilId=").append(baseSoilId);
        sb.append(", baseSoilName=").append(baseSoilName);
        sb.append(", baseSoilRecipe=").append(baseSoilRecipe);
        sb.append(", isRecommend=").append(isRecommend);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", regenerator=").append(regenerator);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", isDel=").append(isDel);
        sb.append("]");
        return sb.toString();
    }
}