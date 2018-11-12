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

    private String mode;

    private Byte unit;

    private Date orginTime;

    private Date nextTime;

    private String entityId;

    private String remark;

    private Byte status;
}
