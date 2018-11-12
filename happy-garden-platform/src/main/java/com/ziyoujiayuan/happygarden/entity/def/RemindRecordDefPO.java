package com.ziyoujiayuan.happygarden.entity.def;

import com.hbxhx.runtime.base.db.BasePO;
import lombok.Data;

import java.util.Date;

/**
 * t_remind_record
 * @author 
 */
@Data
public class RemindRecordDefPO extends BasePO {
    /**
     * 记录ID
     */
    private String recordId;

    /**
     * 类型-施肥,撒药,浇水,喷水
     */
    private String type;

    /**
     * 模式-cron,at
     */
    private String mode;

    /**
     * 单位-0:at,1:年,2:月,3:日
     */
    private Byte unit;

    /**
     * 原始时间
     */
    private Date orginTime;

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
     * 邮件通知次数 默认0
     */
    private Byte emailNotifyCnt;
}