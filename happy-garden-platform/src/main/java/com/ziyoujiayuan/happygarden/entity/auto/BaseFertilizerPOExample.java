package com.ziyoujiayuan.happygarden.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseFertilizerPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public BaseFertilizerPOExample() {
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

        public Criteria andBaseFertilizerIdIsNull() {
            addCriterion("base_fertilizer_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdIsNotNull() {
            addCriterion("base_fertilizer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdEqualTo(String value) {
            addCriterion("base_fertilizer_id =", value, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdNotEqualTo(String value) {
            addCriterion("base_fertilizer_id <>", value, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdGreaterThan(String value) {
            addCriterion("base_fertilizer_id >", value, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdGreaterThanOrEqualTo(String value) {
            addCriterion("base_fertilizer_id >=", value, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdLessThan(String value) {
            addCriterion("base_fertilizer_id <", value, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdLessThanOrEqualTo(String value) {
            addCriterion("base_fertilizer_id <=", value, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdLike(String value) {
            addCriterion("base_fertilizer_id like", value, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdNotLike(String value) {
            addCriterion("base_fertilizer_id not like", value, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdIn(List<String> values) {
            addCriterion("base_fertilizer_id in", values, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdNotIn(List<String> values) {
            addCriterion("base_fertilizer_id not in", values, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdBetween(String value1, String value2) {
            addCriterion("base_fertilizer_id between", value1, value2, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerIdNotBetween(String value1, String value2) {
            addCriterion("base_fertilizer_id not between", value1, value2, "baseFertilizerId");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameIsNull() {
            addCriterion("base_fertilizer_name is null");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameIsNotNull() {
            addCriterion("base_fertilizer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameEqualTo(String value) {
            addCriterion("base_fertilizer_name =", value, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameNotEqualTo(String value) {
            addCriterion("base_fertilizer_name <>", value, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameGreaterThan(String value) {
            addCriterion("base_fertilizer_name >", value, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameGreaterThanOrEqualTo(String value) {
            addCriterion("base_fertilizer_name >=", value, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameLessThan(String value) {
            addCriterion("base_fertilizer_name <", value, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameLessThanOrEqualTo(String value) {
            addCriterion("base_fertilizer_name <=", value, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameLike(String value) {
            addCriterion("base_fertilizer_name like", value, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameNotLike(String value) {
            addCriterion("base_fertilizer_name not like", value, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameIn(List<String> values) {
            addCriterion("base_fertilizer_name in", values, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameNotIn(List<String> values) {
            addCriterion("base_fertilizer_name not in", values, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameBetween(String value1, String value2) {
            addCriterion("base_fertilizer_name between", value1, value2, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerNameNotBetween(String value1, String value2) {
            addCriterion("base_fertilizer_name not between", value1, value2, "baseFertilizerName");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeIsNull() {
            addCriterion("base_fertilizer_recipe is null");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeIsNotNull() {
            addCriterion("base_fertilizer_recipe is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeEqualTo(String value) {
            addCriterion("base_fertilizer_recipe =", value, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeNotEqualTo(String value) {
            addCriterion("base_fertilizer_recipe <>", value, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeGreaterThan(String value) {
            addCriterion("base_fertilizer_recipe >", value, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeGreaterThanOrEqualTo(String value) {
            addCriterion("base_fertilizer_recipe >=", value, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeLessThan(String value) {
            addCriterion("base_fertilizer_recipe <", value, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeLessThanOrEqualTo(String value) {
            addCriterion("base_fertilizer_recipe <=", value, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeLike(String value) {
            addCriterion("base_fertilizer_recipe like", value, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeNotLike(String value) {
            addCriterion("base_fertilizer_recipe not like", value, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeIn(List<String> values) {
            addCriterion("base_fertilizer_recipe in", values, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeNotIn(List<String> values) {
            addCriterion("base_fertilizer_recipe not in", values, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeBetween(String value1, String value2) {
            addCriterion("base_fertilizer_recipe between", value1, value2, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseFertilizerRecipeNotBetween(String value1, String value2) {
            addCriterion("base_fertilizer_recipe not between", value1, value2, "baseFertilizerRecipe");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Byte value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Byte value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Byte value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Byte value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Byte value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Byte> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Byte> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Byte value1, Byte value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
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