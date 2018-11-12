package com.ziyoujiayuan.happygarden.param;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class FlowerSaveParam extends DefBaseParam {

    private String flowerId;

    private String nickName;

    private String remark;

    private String unit;

    private Integer baseFlowerId;
}
