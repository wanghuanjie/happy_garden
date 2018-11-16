package com.ziyoujiayuan.happygarden.entity.def;

import com.hbxhx.runtime.base.db.BasePO;
import lombok.Data;

import java.util.Date;

/**
 * t_remind_record
 * @author 
 */
@Data
public class SprayWaterRecordDefPO extends BasePO {
    /**
     * 记录ID
     */
    private String recordId;

    /**
     * 植物ID
     */
    private String flowerId;

    /**
     * 基础肥料ID
     */
    private String baseFertilizerId;

    /**
     * 施肥重量
     */
    private String fertilizerQuantity;

    /**
     * 施肥原因
     */
    private String reason;

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
}