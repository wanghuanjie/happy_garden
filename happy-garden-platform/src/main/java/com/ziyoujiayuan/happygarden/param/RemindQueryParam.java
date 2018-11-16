package com.ziyoujiayuan.happygarden.param;

import com.hbxhx.runtime.base.param.AjaxTableParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class RemindQueryParam extends AjaxTableParam{

    private String type;

    private String entityId;

    private Integer status;

    private String remark;

    private String creator;
}
