package com.ziyoujiayuan.happygarden.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseFlowerPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public BaseFlowerPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    public void setForUpdate(Boolean forUpdate) {
        this.forUpdate = forUpdate;
    }

    public Boolean getForUpdate() {
        return forUpdate;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBaseFlowerIdIsNull() {
            addCriterion("base_flower_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdIsNotNull() {
            addCriterion("base_flower_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdEqualTo(String value) {
            addCriterion("base_flower_id =", value, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdNotEqualTo(String value) {
            addCriterion("base_flower_id <>", value, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdGreaterThan(String value) {
            addCriterion("base_flower_id >", value, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("base_flower_id >=", value, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdLessThan(String value) {
            addCriterion("base_flower_id <", value, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdLessThanOrEqualTo(String value) {
            addCriterion("base_flower_id <=", value, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdLike(String value) {
            addCriterion("base_flower_id like", value, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdNotLike(String value) {
            addCriterion("base_flower_id not like", value, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdIn(List<String> values) {
            addCriterion("base_flower_id in", values, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdNotIn(List<String> values) {
            addCriterion("base_flower_id not in", values, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdBetween(String value1, String value2) {
            addCriterion("base_flower_id between", value1, value2, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerIdNotBetween(String value1, String value2) {
            addCriterion("base_flower_id not between", value1, value2, "baseFlowerId");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameIsNull() {
            addCriterion("base_flower_name is null");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameIsNotNull() {
            addCriterion("base_flower_name is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameEqualTo(String value) {
            addCriterion("base_flower_name =", value, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameNotEqualTo(String value) {
            addCriterion("base_flower_name <>", value, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameGreaterThan(String value) {
            addCriterion("base_flower_name >", value, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("base_flower_name >=", value, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameLessThan(String value) {
            addCriterion("base_flower_name <", value, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameLessThanOrEqualTo(String value) {
            addCriterion("base_flower_name <=", value, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameLike(String value) {
            addCriterion("base_flower_name like", value, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameNotLike(String value) {
            addCriterion("base_flower_name not like", value, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameIn(List<String> values) {
            addCriterion("base_flower_name in", values, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameNotIn(List<String> values) {
            addCriterion("base_flower_name not in", values, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameBetween(String value1, String value2) {
            addCriterion("base_flower_name between", value1, value2, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andBaseFlowerNameNotBetween(String value1, String value2) {
            addCriterion("base_flower_name not between", value1, value2, "baseFlowerName");
            return (Criteria) this;
        }

        public Criteria andWaterRequireIsNull() {
            addCriterion("water_require is null");
            return (Criteria) this;
        }

        public Criteria andWaterRequireIsNotNull() {
            addCriterion("water_require is not null");
            return (Criteria) this;
        }

        public Criteria andWaterRequireEqualTo(String value) {
            addCriterion("water_require =", value, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireNotEqualTo(String value) {
            addCriterion("water_require <>", value, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireGreaterThan(String value) {
            addCriterion("water_require >", value, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireGreaterThanOrEqualTo(String value) {
            addCriterion("water_require >=", value, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireLessThan(String value) {
            addCriterion("water_require <", value, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireLessThanOrEqualTo(String value) {
            addCriterion("water_require <=", value, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireLike(String value) {
            addCriterion("water_require like", value, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireNotLike(String value) {
            addCriterion("water_require not like", value, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireIn(List<String> values) {
            addCriterion("water_require in", values, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireNotIn(List<String> values) {
            addCriterion("water_require not in", values, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireBetween(String value1, String value2) {
            addCriterion("water_require between", value1, value2, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andWaterRequireNotBetween(String value1, String value2) {
            addCriterion("water_require not between", value1, value2, "waterRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireIsNull() {
            addCriterion("humidity_require is null");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireIsNotNull() {
            addCriterion("humidity_require is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireEqualTo(String value) {
            addCriterion("humidity_require =", value, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireNotEqualTo(String value) {
            addCriterion("humidity_require <>", value, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireGreaterThan(String value) {
            addCriterion("humidity_require >", value, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireGreaterThanOrEqualTo(String value) {
            addCriterion("humidity_require >=", value, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireLessThan(String value) {
            addCriterion("humidity_require <", value, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireLessThanOrEqualTo(String value) {
            addCriterion("humidity_require <=", value, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireLike(String value) {
            addCriterion("humidity_require like", value, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireNotLike(String value) {
            addCriterion("humidity_require not like", value, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireIn(List<String> values) {
            addCriterion("humidity_require in", values, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireNotIn(List<String> values) {
            addCriterion("humidity_require not in", values, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireBetween(String value1, String value2) {
            addCriterion("humidity_require between", value1, value2, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andHumidityRequireNotBetween(String value1, String value2) {
            addCriterion("humidity_require not between", value1, value2, "humidityRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireIsNull() {
            addCriterion("soil_require is null");
            return (Criteria) this;
        }

        public Criteria andSoilRequireIsNotNull() {
            addCriterion("soil_require is not null");
            return (Criteria) this;
        }

        public Criteria andSoilRequireEqualTo(String value) {
            addCriterion("soil_require =", value, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireNotEqualTo(String value) {
            addCriterion("soil_require <>", value, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireGreaterThan(String value) {
            addCriterion("soil_require >", value, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireGreaterThanOrEqualTo(String value) {
            addCriterion("soil_require >=", value, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireLessThan(String value) {
            addCriterion("soil_require <", value, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireLessThanOrEqualTo(String value) {
            addCriterion("soil_require <=", value, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireLike(String value) {
            addCriterion("soil_require like", value, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireNotLike(String value) {
            addCriterion("soil_require not like", value, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireIn(List<String> values) {
            addCriterion("soil_require in", values, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireNotIn(List<String> values) {
            addCriterion("soil_require not in", values, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireBetween(String value1, String value2) {
            addCriterion("soil_require between", value1, value2, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andSoilRequireNotBetween(String value1, String value2) {
            addCriterion("soil_require not between", value1, value2, "soilRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireIsNull() {
            addCriterion("temperature_require is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireIsNotNull() {
            addCriterion("temperature_require is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireEqualTo(String value) {
            addCriterion("temperature_require =", value, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireNotEqualTo(String value) {
            addCriterion("temperature_require <>", value, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireGreaterThan(String value) {
            addCriterion("temperature_require >", value, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireGreaterThanOrEqualTo(String value) {
            addCriterion("temperature_require >=", value, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireLessThan(String value) {
            addCriterion("temperature_require <", value, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireLessThanOrEqualTo(String value) {
            addCriterion("temperature_require <=", value, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireLike(String value) {
            addCriterion("temperature_require like", value, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireNotLike(String value) {
            addCriterion("temperature_require not like", value, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireIn(List<String> values) {
            addCriterion("temperature_require in", values, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireNotIn(List<String> values) {
            addCriterion("temperature_require not in", values, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireBetween(String value1, String value2) {
            addCriterion("temperature_require between", value1, value2, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andTemperatureRequireNotBetween(String value1, String value2) {
            addCriterion("temperature_require not between", value1, value2, "temperatureRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireIsNull() {
            addCriterion("light_require is null");
            return (Criteria) this;
        }

        public Criteria andLightRequireIsNotNull() {
            addCriterion("light_require is not null");
            return (Criteria) this;
        }

        public Criteria andLightRequireEqualTo(String value) {
            addCriterion("light_require =", value, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireNotEqualTo(String value) {
            addCriterion("light_require <>", value, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireGreaterThan(String value) {
            addCriterion("light_require >", value, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireGreaterThanOrEqualTo(String value) {
            addCriterion("light_require >=", value, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireLessThan(String value) {
            addCriterion("light_require <", value, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireLessThanOrEqualTo(String value) {
            addCriterion("light_require <=", value, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireLike(String value) {
            addCriterion("light_require like", value, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireNotLike(String value) {
            addCriterion("light_require not like", value, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireIn(List<String> values) {
            addCriterion("light_require in", values, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireNotIn(List<String> values) {
            addCriterion("light_require not in", values, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireBetween(String value1, String value2) {
            addCriterion("light_require between", value1, value2, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andLightRequireNotBetween(String value1, String value2) {
            addCriterion("light_require not between", value1, value2, "lightRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireIsNull() {
            addCriterion("ventilation_require is null");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireIsNotNull() {
            addCriterion("ventilation_require is not null");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireEqualTo(String value) {
            addCriterion("ventilation_require =", value, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireNotEqualTo(String value) {
            addCriterion("ventilation_require <>", value, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireGreaterThan(String value) {
            addCriterion("ventilation_require >", value, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireGreaterThanOrEqualTo(String value) {
            addCriterion("ventilation_require >=", value, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireLessThan(String value) {
            addCriterion("ventilation_require <", value, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireLessThanOrEqualTo(String value) {
            addCriterion("ventilation_require <=", value, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireLike(String value) {
            addCriterion("ventilation_require like", value, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireNotLike(String value) {
            addCriterion("ventilation_require not like", value, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireIn(List<String> values) {
            addCriterion("ventilation_require in", values, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireNotIn(List<String> values) {
            addCriterion("ventilation_require not in", values, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireBetween(String value1, String value2) {
            addCriterion("ventilation_require between", value1, value2, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andVentilationRequireNotBetween(String value1, String value2) {
            addCriterion("ventilation_require not between", value1, value2, "ventilationRequire");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRegeneratorIsNull() {
            addCriterion("regenerator is null");
            return (Criteria) this;
        }

        public Criteria andRegeneratorIsNotNull() {
            addCriterion("regenerator is not null");
            return (Criteria) this;
        }

        public Criteria andRegeneratorEqualTo(String value) {
            addCriterion("regenerator =", value, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorNotEqualTo(String value) {
            addCriterion("regenerator <>", value, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorGreaterThan(String value) {
            addCriterion("regenerator >", value, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorGreaterThanOrEqualTo(String value) {
            addCriterion("regenerator >=", value, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorLessThan(String value) {
            addCriterion("regenerator <", value, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorLessThanOrEqualTo(String value) {
            addCriterion("regenerator <=", value, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorLike(String value) {
            addCriterion("regenerator like", value, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorNotLike(String value) {
            addCriterion("regenerator not like", value, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorIn(List<String> values) {
            addCriterion("regenerator in", values, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorNotIn(List<String> values) {
            addCriterion("regenerator not in", values, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorBetween(String value1, String value2) {
            addCriterion("regenerator between", value1, value2, "regenerator");
            return (Criteria) this;
        }

        public Criteria andRegeneratorNotBetween(String value1, String value2) {
            addCriterion("regenerator not between", value1, value2, "regenerator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Byte value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Byte value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Byte value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Byte value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Byte> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Byte> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Byte value1, Byte value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}