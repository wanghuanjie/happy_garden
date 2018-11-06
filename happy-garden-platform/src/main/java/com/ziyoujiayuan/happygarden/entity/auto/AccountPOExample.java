package com.ziyoujiayuan.happygarden.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public AccountPOExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameIsNull() {
            addCriterion("wechat_nickname is null");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameIsNotNull() {
            addCriterion("wechat_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameEqualTo(String value) {
            addCriterion("wechat_nickname =", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameNotEqualTo(String value) {
            addCriterion("wechat_nickname <>", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameGreaterThan(String value) {
            addCriterion("wechat_nickname >", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_nickname >=", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameLessThan(String value) {
            addCriterion("wechat_nickname <", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameLessThanOrEqualTo(String value) {
            addCriterion("wechat_nickname <=", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameLike(String value) {
            addCriterion("wechat_nickname like", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameNotLike(String value) {
            addCriterion("wechat_nickname not like", value, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameIn(List<String> values) {
            addCriterion("wechat_nickname in", values, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameNotIn(List<String> values) {
            addCriterion("wechat_nickname not in", values, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameBetween(String value1, String value2) {
            addCriterion("wechat_nickname between", value1, value2, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatNicknameNotBetween(String value1, String value2) {
            addCriterion("wechat_nickname not between", value1, value2, "wechatNickname");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdIsNull() {
            addCriterion("wechat_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdIsNotNull() {
            addCriterion("wechat_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdEqualTo(String value) {
            addCriterion("wechat_open_id =", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdNotEqualTo(String value) {
            addCriterion("wechat_open_id <>", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdGreaterThan(String value) {
            addCriterion("wechat_open_id >", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_open_id >=", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdLessThan(String value) {
            addCriterion("wechat_open_id <", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_open_id <=", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdLike(String value) {
            addCriterion("wechat_open_id like", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdNotLike(String value) {
            addCriterion("wechat_open_id not like", value, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdIn(List<String> values) {
            addCriterion("wechat_open_id in", values, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdNotIn(List<String> values) {
            addCriterion("wechat_open_id not in", values, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdBetween(String value1, String value2) {
            addCriterion("wechat_open_id between", value1, value2, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatOpenIdNotBetween(String value1, String value2) {
            addCriterion("wechat_open_id not between", value1, value2, "wechatOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdIsNull() {
            addCriterion("wechat_mp_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdIsNotNull() {
            addCriterion("wechat_mp_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdEqualTo(String value) {
            addCriterion("wechat_mp_open_id =", value, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdNotEqualTo(String value) {
            addCriterion("wechat_mp_open_id <>", value, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdGreaterThan(String value) {
            addCriterion("wechat_mp_open_id >", value, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_mp_open_id >=", value, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdLessThan(String value) {
            addCriterion("wechat_mp_open_id <", value, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_mp_open_id <=", value, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdLike(String value) {
            addCriterion("wechat_mp_open_id like", value, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdNotLike(String value) {
            addCriterion("wechat_mp_open_id not like", value, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdIn(List<String> values) {
            addCriterion("wechat_mp_open_id in", values, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdNotIn(List<String> values) {
            addCriterion("wechat_mp_open_id not in", values, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdBetween(String value1, String value2) {
            addCriterion("wechat_mp_open_id between", value1, value2, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatMpOpenIdNotBetween(String value1, String value2) {
            addCriterion("wechat_mp_open_id not between", value1, value2, "wechatMpOpenId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdIsNull() {
            addCriterion("wechat_union_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdIsNotNull() {
            addCriterion("wechat_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdEqualTo(String value) {
            addCriterion("wechat_union_id =", value, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdNotEqualTo(String value) {
            addCriterion("wechat_union_id <>", value, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdGreaterThan(String value) {
            addCriterion("wechat_union_id >", value, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_union_id >=", value, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdLessThan(String value) {
            addCriterion("wechat_union_id <", value, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_union_id <=", value, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdLike(String value) {
            addCriterion("wechat_union_id like", value, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdNotLike(String value) {
            addCriterion("wechat_union_id not like", value, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdIn(List<String> values) {
            addCriterion("wechat_union_id in", values, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdNotIn(List<String> values) {
            addCriterion("wechat_union_id not in", values, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdBetween(String value1, String value2) {
            addCriterion("wechat_union_id between", value1, value2, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatUnionIdNotBetween(String value1, String value2) {
            addCriterion("wechat_union_id not between", value1, value2, "wechatUnionId");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderIsNull() {
            addCriterion("wechat_header is null");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderIsNotNull() {
            addCriterion("wechat_header is not null");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderEqualTo(String value) {
            addCriterion("wechat_header =", value, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderNotEqualTo(String value) {
            addCriterion("wechat_header <>", value, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderGreaterThan(String value) {
            addCriterion("wechat_header >", value, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_header >=", value, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderLessThan(String value) {
            addCriterion("wechat_header <", value, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderLessThanOrEqualTo(String value) {
            addCriterion("wechat_header <=", value, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderLike(String value) {
            addCriterion("wechat_header like", value, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderNotLike(String value) {
            addCriterion("wechat_header not like", value, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderIn(List<String> values) {
            addCriterion("wechat_header in", values, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderNotIn(List<String> values) {
            addCriterion("wechat_header not in", values, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderBetween(String value1, String value2) {
            addCriterion("wechat_header between", value1, value2, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andWechatHeaderNotBetween(String value1, String value2) {
            addCriterion("wechat_header not between", value1, value2, "wechatHeader");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
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