package com.ziyoujiayuan.happygarden.param.cultivate;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class SpreadDrugSaveParam extends DefBaseParam {

    private String recordId;

    private String flowerId;

    private String reason;
}
