package com.ziyoujiayuan.happygarden.param;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class BaseDrugSaveParam extends DefBaseParam {

    private String baseDrugId;

    private String baseDrugName;

    private String baseDrugRecipe;

    private String unit;

    private Integer isRecommend;
}
