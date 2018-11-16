package com.ziyoujiayuan.happygarden.entity.def;

import com.hbxhx.runtime.base.db.BasePO;
import lombok.Data;

import java.util.Date;

/**
 * t_flower
 * @author 
 */
@Data
public class FlowerDefPO extends BasePO {
    /**
     * 植物ID
     */
    private String flowerId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 基础植物ID
     */
    private String baseFlowerId;

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