package com.ziyoujiayuan.happygarden.param;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class BaseFlowerSaveParam extends DefBaseParam {

    private String baseFlowerId;

    private String baseFlowerName;

    private String baseSoilRecipe;

    private String waterRequire;

    private String humidityRequire;

    private String soilRequire;

    private String temperatureRequire;

    private String lightRequire;

    private String ventilationRequire;

}
