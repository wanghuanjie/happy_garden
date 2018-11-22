package com.ziyoujiayuan.happygarden.param;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

import java.util.Date;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class RemindSaveParam extends DefBaseParam {

    private String recordId;

    private String type;

    private Integer mode;

    private Integer unit = 1;

    private Date originTime;

    private Date nextTime;

    private String entityId;

    private String remark;

    private Byte status;
}
