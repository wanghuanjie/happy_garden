package com.ziyoujiayuan.happygarden.entity.def;

import com.hbxhx.runtime.base.db.BasePO;
import lombok.Data;

import java.util.Date;

/**
 * t_base_flower
 * @author 
 */
@Data
public class BaseFlowerDefPO extends BasePO {
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
}