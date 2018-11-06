package com.ziyoujiayuan.happygarden.entity.auto;

import com.hbxhx.runtime.base.db.BasePO;
import java.util.Date;

/**
 * t_base_flower
 * @author 
 */
public class BaseFlowerPO extends BasePO {
    /**
     * 植物ID
     */
    private String baseFlowerId;

    /**
     * 植物名称
     */
    private String baseFlowerName;

    /**
     * 浇水要求
     */
    private String waterRequire;

    /**
     * 湿度要求
     */
    private String humidityRequire;

    /**
     * 土壤要求
     */
    private String soilRequire;

    /**
     * 温度要求
     */
    private String temperatureRequire;

    /**
     * 光照要求
     */
    private String lightRequire;

    /**
     * 通风要求
     */
    private String ventilationRequire;

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

    public String getBaseFlowerId() {
        return baseFlowerId;
    }

    public void setBaseFlowerId(String baseFlowerId) {
        this.baseFlowerId = baseFlowerId == null ? null : baseFlowerId.trim();
    }

    public String getBaseFlowerName() {
        return baseFlowerName;
    }

    public void setBaseFlowerName(String baseFlowerName) {
        this.baseFlowerName = baseFlowerName == null ? null : baseFlowerName.trim();
    }

    public String getWaterRequire() {
        return waterRequire;
    }

    public void setWaterRequire(String waterRequire) {
        this.waterRequire = waterRequire == null ? null : waterRequire.trim();
    }

    public String getHumidityRequire() {
        return humidityRequire;
    }

    public void setHumidityRequire(String humidityRequire) {
        this.humidityRequire = humidityRequire == null ? null : humidityRequire.trim();
    }

    public String getSoilRequire() {
        return soilRequire;
    }

    public void setSoilRequire(String soilRequire) {
        this.soilRequire = soilRequire == null ? null : soilRequire.trim();
    }

    public String getTemperatureRequire() {
        return temperatureRequire;
    }

    public void setTemperatureRequire(String temperatureRequire) {
        this.temperatureRequire = temperatureRequire == null ? null : temperatureRequire.trim();
    }

    public String getLightRequire() {
        return lightRequire;
    }

    public void setLightRequire(String lightRequire) {
        this.lightRequire = lightRequire == null ? null : lightRequire.trim();
    }

    public String getVentilationRequire() {
        return ventilationRequire;
    }

    public void setVentilationRequire(String ventilationRequire) {
        this.ventilationRequire = ventilationRequire == null ? null : ventilationRequire.trim();
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
        BaseFlowerPO other = (BaseFlowerPO) that;
        return (this.getBaseFlowerId() == null ? other.getBaseFlowerId() == null : this.getBaseFlowerId().equals(other.getBaseFlowerId()))
            && (this.getBaseFlowerName() == null ? other.getBaseFlowerName() == null : this.getBaseFlowerName().equals(other.getBaseFlowerName()))
            && (this.getWaterRequire() == null ? other.getWaterRequire() == null : this.getWaterRequire().equals(other.getWaterRequire()))
            && (this.getHumidityRequire() == null ? other.getHumidityRequire() == null : this.getHumidityRequire().equals(other.getHumidityRequire()))
            && (this.getSoilRequire() == null ? other.getSoilRequire() == null : this.getSoilRequire().equals(other.getSoilRequire()))
            && (this.getTemperatureRequire() == null ? other.getTemperatureRequire() == null : this.getTemperatureRequire().equals(other.getTemperatureRequire()))
            && (this.getLightRequire() == null ? other.getLightRequire() == null : this.getLightRequire().equals(other.getLightRequire()))
            && (this.getVentilationRequire() == null ? other.getVentilationRequire() == null : this.getVentilationRequire().equals(other.getVentilationRequire()))
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
        result = prime * result + ((getBaseFlowerId() == null) ? 0 : getBaseFlowerId().hashCode());
        result = prime * result + ((getBaseFlowerName() == null) ? 0 : getBaseFlowerName().hashCode());
        result = prime * result + ((getWaterRequire() == null) ? 0 : getWaterRequire().hashCode());
        result = prime * result + ((getHumidityRequire() == null) ? 0 : getHumidityRequire().hashCode());
        result = prime * result + ((getSoilRequire() == null) ? 0 : getSoilRequire().hashCode());
        result = prime * result + ((getTemperatureRequire() == null) ? 0 : getTemperatureRequire().hashCode());
        result = prime * result + ((getLightRequire() == null) ? 0 : getLightRequire().hashCode());
        result = prime * result + ((getVentilationRequire() == null) ? 0 : getVentilationRequire().hashCode());
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
        sb.append(", baseFlowerId=").append(baseFlowerId);
        sb.append(", baseFlowerName=").append(baseFlowerName);
        sb.append(", waterRequire=").append(waterRequire);
        sb.append(", humidityRequire=").append(humidityRequire);
        sb.append(", soilRequire=").append(soilRequire);
        sb.append(", temperatureRequire=").append(temperatureRequire);
        sb.append(", lightRequire=").append(lightRequire);
        sb.append(", ventilationRequire=").append(ventilationRequire);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", regenerator=").append(regenerator);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", isDel=").append(isDel);
        sb.append("]");
        return sb.toString();
    }
}