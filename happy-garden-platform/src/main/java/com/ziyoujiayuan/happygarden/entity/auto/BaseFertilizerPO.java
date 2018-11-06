package com.ziyoujiayuan.happygarden.entity.auto;

import com.hbxhx.runtime.base.db.BasePO;
import java.util.Date;

/**
 * t_base_fertilizer
 * @author 
 */
public class BaseFertilizerPO extends BasePO {
    /**
     * 肥料ID
     */
    private String baseFertilizerId;

    /**
     * 肥料名称
     */
    private String baseFertilizerName;

    /**
     * 肥料配方
     */
    private String baseFertilizerRecipe;

    /**
     * 单位
     */
    private String unit;

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

    public String getBaseFertilizerId() {
        return baseFertilizerId;
    }

    public void setBaseFertilizerId(String baseFertilizerId) {
        this.baseFertilizerId = baseFertilizerId == null ? null : baseFertilizerId.trim();
    }

    public String getBaseFertilizerName() {
        return baseFertilizerName;
    }

    public void setBaseFertilizerName(String baseFertilizerName) {
        this.baseFertilizerName = baseFertilizerName == null ? null : baseFertilizerName.trim();
    }

    public String getBaseFertilizerRecipe() {
        return baseFertilizerRecipe;
    }

    public void setBaseFertilizerRecipe(String baseFertilizerRecipe) {
        this.baseFertilizerRecipe = baseFertilizerRecipe == null ? null : baseFertilizerRecipe.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
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
        BaseFertilizerPO other = (BaseFertilizerPO) that;
        return (this.getBaseFertilizerId() == null ? other.getBaseFertilizerId() == null : this.getBaseFertilizerId().equals(other.getBaseFertilizerId()))
            && (this.getBaseFertilizerName() == null ? other.getBaseFertilizerName() == null : this.getBaseFertilizerName().equals(other.getBaseFertilizerName()))
            && (this.getBaseFertilizerRecipe() == null ? other.getBaseFertilizerRecipe() == null : this.getBaseFertilizerRecipe().equals(other.getBaseFertilizerRecipe()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
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
        result = prime * result + ((getBaseFertilizerId() == null) ? 0 : getBaseFertilizerId().hashCode());
        result = prime * result + ((getBaseFertilizerName() == null) ? 0 : getBaseFertilizerName().hashCode());
        result = prime * result + ((getBaseFertilizerRecipe() == null) ? 0 : getBaseFertilizerRecipe().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
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
        sb.append(", baseFertilizerId=").append(baseFertilizerId);
        sb.append(", baseFertilizerName=").append(baseFertilizerName);
        sb.append(", baseFertilizerRecipe=").append(baseFertilizerRecipe);
        sb.append(", unit=").append(unit);
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