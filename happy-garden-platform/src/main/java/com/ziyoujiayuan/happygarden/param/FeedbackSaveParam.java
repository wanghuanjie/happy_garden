package com.ziyoujiayuan.happygarden.param;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class FeedbackSaveParam extends DefBaseParam {

    private String feedbackId;

    private String title;

    private String content;

    private String contactInfo;

    private Integer status;
}
