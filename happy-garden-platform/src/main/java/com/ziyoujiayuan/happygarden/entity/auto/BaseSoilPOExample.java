package com.ziyoujiayuan.happygarden.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseSoilPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public BaseSoilPOExample() {
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

        public Criteria andBaseSoilIdIsNull() {
            addCriterion("base_soil_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdIsNotNull() {
            addCriterion("base_soil_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdEqualTo(String value) {
            addCriterion("base_soil_id =", value, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdNotEqualTo(String value) {
            addCriterion("base_soil_id <>", value, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdGreaterThan(String value) {
            addCriterion("base_soil_id >", value, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdGreaterThanOrEqualTo(String value) {
            addCriterion("base_soil_id >=", value, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdLessThan(String value) {
            addCriterion("base_soil_id <", value, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdLessThanOrEqualTo(String value) {
            addCriterion("base_soil_id <=", value, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdLike(String value) {
            addCriterion("base_soil_id like", value, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdNotLike(String value) {
            addCriterion("base_soil_id not like", value, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdIn(List<String> values) {
            addCriterion("base_soil_id in", values, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdNotIn(List<String> values) {
            addCriterion("base_soil_id not in", values, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdBetween(String value1, String value2) {
            addCriterion("base_soil_id between", value1, value2, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilIdNotBetween(String value1, String value2) {
            addCriterion("base_soil_id not between", value1, value2, "baseSoilId");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameIsNull() {
            addCriterion("base_soil_name is null");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameIsNotNull() {
            addCriterion("base_soil_name is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameEqualTo(String value) {
            addCriterion("base_soil_name =", value, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameNotEqualTo(String value) {
            addCriterion("base_soil_name <>", value, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameGreaterThan(String value) {
            addCriterion("base_soil_name >", value, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameGreaterThanOrEqualTo(String value) {
            addCriterion("base_soil_name >=", value, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameLessThan(String value) {
            addCriterion("base_soil_name <", value, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameLessThanOrEqualTo(String value) {
            addCriterion("base_soil_name <=", value, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameLike(String value) {
            addCriterion("base_soil_name like", value, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameNotLike(String value) {
            addCriterion("base_soil_name not like", value, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameIn(List<String> values) {
            addCriterion("base_soil_name in", values, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameNotIn(List<String> values) {
            addCriterion("base_soil_name not in", values, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameBetween(String value1, String value2) {
            addCriterion("base_soil_name between", value1, value2, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilNameNotBetween(String value1, String value2) {
            addCriterion("base_soil_name not between", value1, value2, "baseSoilName");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeIsNull() {
            addCriterion("base_soil_recipe is null");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeIsNotNull() {
            addCriterion("base_soil_recipe is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeEqualTo(String value) {
            addCriterion("base_soil_recipe =", value, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeNotEqualTo(String value) {
            addCriterion("base_soil_recipe <>", value, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeGreaterThan(String value) {
            addCriterion("base_soil_recipe >", value, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeGreaterThanOrEqualTo(String value) {
            addCriterion("base_soil_recipe >=", value, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeLessThan(String value) {
            addCriterion("base_soil_recipe <", value, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeLessThanOrEqualTo(String value) {
            addCriterion("base_soil_recipe <=", value, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeLike(String value) {
            addCriterion("base_soil_recipe like", value, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeNotLike(String value) {
            addCriterion("base_soil_recipe not like", value, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeIn(List<String> values) {
            addCriterion("base_soil_recipe in", values, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeNotIn(List<String> values) {
            addCriterion("base_soil_recipe not in", values, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeBetween(String value1, String value2) {
            addCriterion("base_soil_recipe between", value1, value2, "baseSoilRecipe");
            return (Criteria) this;
        }

        public Criteria andBaseSoilRecipeNotBetween(String value1, String value2) {
            addCriterion("base_soil_recipe not between", value1, value2, "baseSoilRecipe");
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