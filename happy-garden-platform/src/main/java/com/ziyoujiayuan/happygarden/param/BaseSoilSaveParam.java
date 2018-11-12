package com.ziyoujiayuan.happygarden.param;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class BaseSoilSaveParam extends DefBaseParam {

    private String baseSoilId;

    private String baseSoilName;

    private String baseSoilRecipe;

    private Integer isRecommend;
}
