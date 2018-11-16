package com.ziyoujiayuan.happygarden.param.cultivate;

import com.hbxhx.runtime.base.param.AjaxTableParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class ApplyFertilizerQueryParam extends AjaxTableParam{

    private String flowerId;

    private String creator;
}
