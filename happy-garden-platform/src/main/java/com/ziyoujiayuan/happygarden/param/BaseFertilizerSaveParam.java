package com.ziyoujiayuan.happygarden.param;

import com.ziyoujiayuan.happygarden.param.base.DefBaseParam;
import lombok.Data;

/**
 * @author wanghjbuf
 * @date 2018/11/6
 */
@Data
public class BaseFertilizerSaveParam extends DefBaseParam {

    private String baseFertilizerId;

    private String baseFertilizerName;

    private String baseFertilizerRecipe;

    private String unit;

    private Integer isRecommend;

}
