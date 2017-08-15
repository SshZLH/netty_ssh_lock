package com.wanhuchina.lock.model.order;

import com.wanhuchina.lock.model.base.BaseDO;

import java.util.ArrayList;
import java.util.List;

public class WhcOrderExample  extends BaseDO {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WhcOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIsNull() {
            addCriterion("WAHOCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIsNotNull() {
            addCriterion("WAHOCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWahoceIdEqualTo(String value) {
            addCriterion("WAHOCE_ID =", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotEqualTo(String value) {
            addCriterion("WAHOCE_ID <>", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdGreaterThan(String value) {
            addCriterion("WAHOCE_ID >", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHOCE_ID >=", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLessThan(String value) {
            addCriterion("WAHOCE_ID <", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLessThanOrEqualTo(String value) {
            addCriterion("WAHOCE_ID <=", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdLike(String value) {
            addCriterion("WAHOCE_ID like", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotLike(String value) {
            addCriterion("WAHOCE_ID not like", value, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdIn(List<String> values) {
            addCriterion("WAHOCE_ID in", values, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotIn(List<String> values) {
            addCriterion("WAHOCE_ID not in", values, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdBetween(String value1, String value2) {
            addCriterion("WAHOCE_ID between", value1, value2, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andWahoceIdNotBetween(String value1, String value2) {
            addCriterion("WAHOCE_ID not between", value1, value2, "wahoceId");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateIsNull() {
            addCriterion("ORDER_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateIsNotNull() {
            addCriterion("ORDER_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateEqualTo(String value) {
            addCriterion("ORDER_START_DATE =", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateNotEqualTo(String value) {
            addCriterion("ORDER_START_DATE <>", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateGreaterThan(String value) {
            addCriterion("ORDER_START_DATE >", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_START_DATE >=", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateLessThan(String value) {
            addCriterion("ORDER_START_DATE <", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_START_DATE <=", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateLike(String value) {
            addCriterion("ORDER_START_DATE like", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateNotLike(String value) {
            addCriterion("ORDER_START_DATE not like", value, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateIn(List<String> values) {
            addCriterion("ORDER_START_DATE in", values, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateNotIn(List<String> values) {
            addCriterion("ORDER_START_DATE not in", values, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateBetween(String value1, String value2) {
            addCriterion("ORDER_START_DATE between", value1, value2, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderStartDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_START_DATE not between", value1, value2, "orderStartDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateIsNull() {
            addCriterion("ORDER_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateIsNotNull() {
            addCriterion("ORDER_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateEqualTo(String value) {
            addCriterion("ORDER_END_DATE =", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateNotEqualTo(String value) {
            addCriterion("ORDER_END_DATE <>", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateGreaterThan(String value) {
            addCriterion("ORDER_END_DATE >", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_END_DATE >=", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateLessThan(String value) {
            addCriterion("ORDER_END_DATE <", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_END_DATE <=", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateLike(String value) {
            addCriterion("ORDER_END_DATE like", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateNotLike(String value) {
            addCriterion("ORDER_END_DATE not like", value, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateIn(List<String> values) {
            addCriterion("ORDER_END_DATE in", values, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateNotIn(List<String> values) {
            addCriterion("ORDER_END_DATE not in", values, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateBetween(String value1, String value2) {
            addCriterion("ORDER_END_DATE between", value1, value2, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderEndDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_END_DATE not between", value1, value2, "orderEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoIsNull() {
            addCriterion("ORDER_CUSE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoIsNotNull() {
            addCriterion("ORDER_CUSE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoEqualTo(String value) {
            addCriterion("ORDER_CUSE_MEMO =", value, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoNotEqualTo(String value) {
            addCriterion("ORDER_CUSE_MEMO <>", value, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoGreaterThan(String value) {
            addCriterion("ORDER_CUSE_MEMO >", value, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUSE_MEMO >=", value, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoLessThan(String value) {
            addCriterion("ORDER_CUSE_MEMO <", value, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUSE_MEMO <=", value, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoLike(String value) {
            addCriterion("ORDER_CUSE_MEMO like", value, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoNotLike(String value) {
            addCriterion("ORDER_CUSE_MEMO not like", value, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoIn(List<String> values) {
            addCriterion("ORDER_CUSE_MEMO in", values, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoNotIn(List<String> values) {
            addCriterion("ORDER_CUSE_MEMO not in", values, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoBetween(String value1, String value2) {
            addCriterion("ORDER_CUSE_MEMO between", value1, value2, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCuseMemoNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUSE_MEMO not between", value1, value2, "orderCuseMemo");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(String value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(String value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(String value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(String value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLike(String value) {
            addCriterion("ORDER_AMOUNT like", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotLike(String value) {
            addCriterion("ORDER_AMOUNT not like", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<String> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<String> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andPersIdIsNull() {
            addCriterion("PERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersIdIsNotNull() {
            addCriterion("PERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersIdEqualTo(String value) {
            addCriterion("PERS_ID =", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotEqualTo(String value) {
            addCriterion("PERS_ID <>", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdGreaterThan(String value) {
            addCriterion("PERS_ID >", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERS_ID >=", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLessThan(String value) {
            addCriterion("PERS_ID <", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLessThanOrEqualTo(String value) {
            addCriterion("PERS_ID <=", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLike(String value) {
            addCriterion("PERS_ID like", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotLike(String value) {
            addCriterion("PERS_ID not like", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdIn(List<String> values) {
            addCriterion("PERS_ID in", values, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotIn(List<String> values) {
            addCriterion("PERS_ID not in", values, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdBetween(String value1, String value2) {
            addCriterion("PERS_ID between", value1, value2, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotBetween(String value1, String value2) {
            addCriterion("PERS_ID not between", value1, value2, "persId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("ORDER_TYPE like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("ORDER_TYPE not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNull() {
            addCriterion("ORDER_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNotNull() {
            addCriterion("ORDER_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateEqualTo(String value) {
            addCriterion("ORDER_CREATE_DATE =", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotEqualTo(String value) {
            addCriterion("ORDER_CREATE_DATE <>", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThan(String value) {
            addCriterion("ORDER_CREATE_DATE >", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CREATE_DATE >=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThan(String value) {
            addCriterion("ORDER_CREATE_DATE <", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CREATE_DATE <=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLike(String value) {
            addCriterion("ORDER_CREATE_DATE like", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotLike(String value) {
            addCriterion("ORDER_CREATE_DATE not like", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIn(List<String> values) {
            addCriterion("ORDER_CREATE_DATE in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotIn(List<String> values) {
            addCriterion("ORDER_CREATE_DATE not in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateBetween(String value1, String value2) {
            addCriterion("ORDER_CREATE_DATE between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_CREATE_DATE not between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeIsNull() {
            addCriterion("ORDER_PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeIsNotNull() {
            addCriterion("ORDER_PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeEqualTo(String value) {
            addCriterion("ORDER_PAY_TYPE =", value, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeNotEqualTo(String value) {
            addCriterion("ORDER_PAY_TYPE <>", value, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeGreaterThan(String value) {
            addCriterion("ORDER_PAY_TYPE >", value, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PAY_TYPE >=", value, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeLessThan(String value) {
            addCriterion("ORDER_PAY_TYPE <", value, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PAY_TYPE <=", value, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeLike(String value) {
            addCriterion("ORDER_PAY_TYPE like", value, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeNotLike(String value) {
            addCriterion("ORDER_PAY_TYPE not like", value, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeIn(List<String> values) {
            addCriterion("ORDER_PAY_TYPE in", values, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeNotIn(List<String> values) {
            addCriterion("ORDER_PAY_TYPE not in", values, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeBetween(String value1, String value2) {
            addCriterion("ORDER_PAY_TYPE between", value1, value2, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderPayTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_PAY_TYPE not between", value1, value2, "orderPayType");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoIsNull() {
            addCriterion("ORDER_CUST_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoIsNotNull() {
            addCriterion("ORDER_CUST_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoEqualTo(String value) {
            addCriterion("ORDER_CUST_MEMO =", value, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoNotEqualTo(String value) {
            addCriterion("ORDER_CUST_MEMO <>", value, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoGreaterThan(String value) {
            addCriterion("ORDER_CUST_MEMO >", value, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_MEMO >=", value, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoLessThan(String value) {
            addCriterion("ORDER_CUST_MEMO <", value, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_MEMO <=", value, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoLike(String value) {
            addCriterion("ORDER_CUST_MEMO like", value, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoNotLike(String value) {
            addCriterion("ORDER_CUST_MEMO not like", value, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoIn(List<String> values) {
            addCriterion("ORDER_CUST_MEMO in", values, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoNotIn(List<String> values) {
            addCriterion("ORDER_CUST_MEMO not in", values, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_MEMO between", value1, value2, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustMemoNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_MEMO not between", value1, value2, "orderCustMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoIsNull() {
            addCriterion("ORDER_SALE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoIsNotNull() {
            addCriterion("ORDER_SALE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoEqualTo(String value) {
            addCriterion("ORDER_SALE_MEMO =", value, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoNotEqualTo(String value) {
            addCriterion("ORDER_SALE_MEMO <>", value, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoGreaterThan(String value) {
            addCriterion("ORDER_SALE_MEMO >", value, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SALE_MEMO >=", value, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoLessThan(String value) {
            addCriterion("ORDER_SALE_MEMO <", value, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SALE_MEMO <=", value, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoLike(String value) {
            addCriterion("ORDER_SALE_MEMO like", value, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoNotLike(String value) {
            addCriterion("ORDER_SALE_MEMO not like", value, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoIn(List<String> values) {
            addCriterion("ORDER_SALE_MEMO in", values, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoNotIn(List<String> values) {
            addCriterion("ORDER_SALE_MEMO not in", values, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoBetween(String value1, String value2) {
            addCriterion("ORDER_SALE_MEMO between", value1, value2, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderSaleMemoNotBetween(String value1, String value2) {
            addCriterion("ORDER_SALE_MEMO not between", value1, value2, "orderSaleMemo");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameIsNull() {
            addCriterion("ORDER_CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameIsNotNull() {
            addCriterion("ORDER_CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameEqualTo(String value) {
            addCriterion("ORDER_CUST_NAME =", value, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameNotEqualTo(String value) {
            addCriterion("ORDER_CUST_NAME <>", value, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameGreaterThan(String value) {
            addCriterion("ORDER_CUST_NAME >", value, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_NAME >=", value, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameLessThan(String value) {
            addCriterion("ORDER_CUST_NAME <", value, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_NAME <=", value, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameLike(String value) {
            addCriterion("ORDER_CUST_NAME like", value, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameNotLike(String value) {
            addCriterion("ORDER_CUST_NAME not like", value, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameIn(List<String> values) {
            addCriterion("ORDER_CUST_NAME in", values, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameNotIn(List<String> values) {
            addCriterion("ORDER_CUST_NAME not in", values, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_NAME between", value1, value2, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustNameNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_NAME not between", value1, value2, "orderCustName");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelIsNull() {
            addCriterion("ORDER_CUST_TEL is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelIsNotNull() {
            addCriterion("ORDER_CUST_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelEqualTo(String value) {
            addCriterion("ORDER_CUST_TEL =", value, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelNotEqualTo(String value) {
            addCriterion("ORDER_CUST_TEL <>", value, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelGreaterThan(String value) {
            addCriterion("ORDER_CUST_TEL >", value, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_TEL >=", value, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelLessThan(String value) {
            addCriterion("ORDER_CUST_TEL <", value, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_TEL <=", value, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelLike(String value) {
            addCriterion("ORDER_CUST_TEL like", value, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelNotLike(String value) {
            addCriterion("ORDER_CUST_TEL not like", value, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelIn(List<String> values) {
            addCriterion("ORDER_CUST_TEL in", values, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelNotIn(List<String> values) {
            addCriterion("ORDER_CUST_TEL not in", values, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_TEL between", value1, value2, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustTelNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_TEL not between", value1, value2, "orderCustTel");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrIsNull() {
            addCriterion("ORDER_CUST_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrIsNotNull() {
            addCriterion("ORDER_CUST_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrEqualTo(String value) {
            addCriterion("ORDER_CUST_ADDR =", value, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrNotEqualTo(String value) {
            addCriterion("ORDER_CUST_ADDR <>", value, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrGreaterThan(String value) {
            addCriterion("ORDER_CUST_ADDR >", value, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_ADDR >=", value, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrLessThan(String value) {
            addCriterion("ORDER_CUST_ADDR <", value, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CUST_ADDR <=", value, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrLike(String value) {
            addCriterion("ORDER_CUST_ADDR like", value, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrNotLike(String value) {
            addCriterion("ORDER_CUST_ADDR not like", value, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrIn(List<String> values) {
            addCriterion("ORDER_CUST_ADDR in", values, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrNotIn(List<String> values) {
            addCriterion("ORDER_CUST_ADDR not in", values, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_ADDR between", value1, value2, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderCustAddrNotBetween(String value1, String value2) {
            addCriterion("ORDER_CUST_ADDR not between", value1, value2, "orderCustAddr");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("ORDER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("ORDER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("ORDER_SOURCE =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("ORDER_SOURCE <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("ORDER_SOURCE >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SOURCE >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("ORDER_SOURCE <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SOURCE <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("ORDER_SOURCE like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("ORDER_SOURCE not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("ORDER_SOURCE in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("ORDER_SOURCE not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("ORDER_SOURCE between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("ORDER_SOURCE not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberIsNull() {
            addCriterion("ORDER_ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberIsNotNull() {
            addCriterion("ORDER_ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberEqualTo(String value) {
            addCriterion("ORDER_ID_NUMBER =", value, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberNotEqualTo(String value) {
            addCriterion("ORDER_ID_NUMBER <>", value, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberGreaterThan(String value) {
            addCriterion("ORDER_ID_NUMBER >", value, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID_NUMBER >=", value, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberLessThan(String value) {
            addCriterion("ORDER_ID_NUMBER <", value, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID_NUMBER <=", value, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberLike(String value) {
            addCriterion("ORDER_ID_NUMBER like", value, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberNotLike(String value) {
            addCriterion("ORDER_ID_NUMBER not like", value, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberIn(List<String> values) {
            addCriterion("ORDER_ID_NUMBER in", values, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberNotIn(List<String> values) {
            addCriterion("ORDER_ID_NUMBER not in", values, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberBetween(String value1, String value2) {
            addCriterion("ORDER_ID_NUMBER between", value1, value2, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIdNumberNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID_NUMBER not between", value1, value2, "orderIdNumber");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1IsNull() {
            addCriterion("ORDER_DEPOSIT1 is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1IsNotNull() {
            addCriterion("ORDER_DEPOSIT1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1EqualTo(String value) {
            addCriterion("ORDER_DEPOSIT1 =", value, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1NotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT1 <>", value, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1GreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT1 >", value, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT1 >=", value, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1LessThan(String value) {
            addCriterion("ORDER_DEPOSIT1 <", value, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1LessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT1 <=", value, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1Like(String value) {
            addCriterion("ORDER_DEPOSIT1 like", value, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1NotLike(String value) {
            addCriterion("ORDER_DEPOSIT1 not like", value, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1In(List<String> values) {
            addCriterion("ORDER_DEPOSIT1 in", values, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1NotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT1 not in", values, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1Between(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT1 between", value1, value2, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderDeposit1NotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT1 not between", value1, value2, "orderDeposit1");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNull() {
            addCriterion("ORDER_TOTAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNotNull() {
            addCriterion("ORDER_TOTAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT =", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <>", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThan(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT >", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT >=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThan(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT <=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLike(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT like", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotLike(String value) {
            addCriterion("ORDER_TOTAL_AMOUNT not like", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIn(List<String> values) {
            addCriterion("ORDER_TOTAL_AMOUNT in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotIn(List<String> values) {
            addCriterion("ORDER_TOTAL_AMOUNT not in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountBetween(String value1, String value2) {
            addCriterion("ORDER_TOTAL_AMOUNT between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotBetween(String value1, String value2) {
            addCriterion("ORDER_TOTAL_AMOUNT not between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeIsNull() {
            addCriterion("ORDER_AMOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeIsNotNull() {
            addCriterion("ORDER_AMOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_TYPE =", value, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeNotEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_TYPE <>", value, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeGreaterThan(String value) {
            addCriterion("ORDER_AMOUNT_TYPE >", value, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_TYPE >=", value, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeLessThan(String value) {
            addCriterion("ORDER_AMOUNT_TYPE <", value, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_TYPE <=", value, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeLike(String value) {
            addCriterion("ORDER_AMOUNT_TYPE like", value, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeNotLike(String value) {
            addCriterion("ORDER_AMOUNT_TYPE not like", value, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_TYPE in", values, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeNotIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_TYPE not in", values, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_TYPE between", value1, value2, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_TYPE not between", value1, value2, "orderAmountType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyIsNull() {
            addCriterion("ORDER_TYPE_MOENY is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyIsNotNull() {
            addCriterion("ORDER_TYPE_MOENY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyEqualTo(String value) {
            addCriterion("ORDER_TYPE_MOENY =", value, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyNotEqualTo(String value) {
            addCriterion("ORDER_TYPE_MOENY <>", value, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyGreaterThan(String value) {
            addCriterion("ORDER_TYPE_MOENY >", value, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE_MOENY >=", value, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyLessThan(String value) {
            addCriterion("ORDER_TYPE_MOENY <", value, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE_MOENY <=", value, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyLike(String value) {
            addCriterion("ORDER_TYPE_MOENY like", value, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyNotLike(String value) {
            addCriterion("ORDER_TYPE_MOENY not like", value, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyIn(List<String> values) {
            addCriterion("ORDER_TYPE_MOENY in", values, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyNotIn(List<String> values) {
            addCriterion("ORDER_TYPE_MOENY not in", values, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE_MOENY between", value1, value2, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andOrderTypeMoenyNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE_MOENY not between", value1, value2, "orderTypeMoeny");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeIsNull() {
            addCriterion("ORDER_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeIsNotNull() {
            addCriterion("ORDER_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeEqualTo(String value) {
            addCriterion("ORDER_CERT_TYPE =", value, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeNotEqualTo(String value) {
            addCriterion("ORDER_CERT_TYPE <>", value, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeGreaterThan(String value) {
            addCriterion("ORDER_CERT_TYPE >", value, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_TYPE >=", value, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeLessThan(String value) {
            addCriterion("ORDER_CERT_TYPE <", value, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_TYPE <=", value, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeLike(String value) {
            addCriterion("ORDER_CERT_TYPE like", value, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeNotLike(String value) {
            addCriterion("ORDER_CERT_TYPE not like", value, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeIn(List<String> values) {
            addCriterion("ORDER_CERT_TYPE in", values, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeNotIn(List<String> values) {
            addCriterion("ORDER_CERT_TYPE not in", values, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_TYPE between", value1, value2, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andOrderCertTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_TYPE not between", value1, value2, "orderCertType");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNull() {
            addCriterion("CONTRACT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNotNull() {
            addCriterion("CONTRACT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andContractCodeEqualTo(String value) {
            addCriterion("CONTRACT_CODE =", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotEqualTo(String value) {
            addCriterion("CONTRACT_CODE <>", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThan(String value) {
            addCriterion("CONTRACT_CODE >", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CODE >=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThan(String value) {
            addCriterion("CONTRACT_CODE <", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CODE <=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLike(String value) {
            addCriterion("CONTRACT_CODE like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotLike(String value) {
            addCriterion("CONTRACT_CODE not like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIn(List<String> values) {
            addCriterion("CONTRACT_CODE in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotIn(List<String> values) {
            addCriterion("CONTRACT_CODE not in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeBetween(String value1, String value2) {
            addCriterion("CONTRACT_CODE between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_CODE not between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoIsNull() {
            addCriterion("ORDER_DEPOSIT_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoIsNotNull() {
            addCriterion("ORDER_DEPOSIT_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO =", value, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO <>", value, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoGreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO >", value, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO >=", value, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoLessThan(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO <", value, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO <=", value, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoLike(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO like", value, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoNotLike(String value) {
            addCriterion("ORDER_DEPOSIT_MEMO not like", value, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_MEMO in", values, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_MEMO not in", values, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_MEMO between", value1, value2, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositMemoNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_MEMO not between", value1, value2, "orderDepositMemo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusIsNull() {
            addCriterion("ORDER_DEPOSIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusIsNotNull() {
            addCriterion("ORDER_DEPOSIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS =", value, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS <>", value, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusGreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS >", value, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS >=", value, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusLessThan(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS <", value, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS <=", value, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusLike(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS like", value, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusNotLike(String value) {
            addCriterion("ORDER_DEPOSIT_STATUS not like", value, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_STATUS in", values, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_STATUS not in", values, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_STATUS between", value1, value2, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_STATUS not between", value1, value2, "orderDepositStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountIsNull() {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountIsNotNull() {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountEqualTo(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT =", value, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT <>", value, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountGreaterThan(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT >", value, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT >=", value, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountLessThan(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT <", value, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT <=", value, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountLike(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT like", value, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountNotLike(String value) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT not like", value, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountIn(List<String> values) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT in", values, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT not in", values, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT between", value1, value2, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositpayAccountNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSITPAY_ACCOUNT not between", value1, value2, "orderDepositpayAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountIsNull() {
            addCriterion("ORDER_REFUND_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountIsNotNull() {
            addCriterion("ORDER_REFUND_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountEqualTo(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT =", value, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountNotEqualTo(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT <>", value, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountGreaterThan(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT >", value, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT >=", value, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountLessThan(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT <", value, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT <=", value, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountLike(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT like", value, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountNotLike(String value) {
            addCriterion("ORDER_REFUND_ACCOUNT not like", value, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountIn(List<String> values) {
            addCriterion("ORDER_REFUND_ACCOUNT in", values, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountNotIn(List<String> values) {
            addCriterion("ORDER_REFUND_ACCOUNT not in", values, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountBetween(String value1, String value2) {
            addCriterion("ORDER_REFUND_ACCOUNT between", value1, value2, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderRefundAccountNotBetween(String value1, String value2) {
            addCriterion("ORDER_REFUND_ACCOUNT not between", value1, value2, "orderRefundAccount");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNull() {
            addCriterion("ORDER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNotNull() {
            addCriterion("ORDER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneEqualTo(String value) {
            addCriterion("ORDER_PHONE =", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotEqualTo(String value) {
            addCriterion("ORDER_PHONE <>", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThan(String value) {
            addCriterion("ORDER_PHONE >", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PHONE >=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThan(String value) {
            addCriterion("ORDER_PHONE <", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PHONE <=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLike(String value) {
            addCriterion("ORDER_PHONE like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotLike(String value) {
            addCriterion("ORDER_PHONE not like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIn(List<String> values) {
            addCriterion("ORDER_PHONE in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotIn(List<String> values) {
            addCriterion("ORDER_PHONE not in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneBetween(String value1, String value2) {
            addCriterion("ORDER_PHONE between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotBetween(String value1, String value2) {
            addCriterion("ORDER_PHONE not between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountIsNull() {
            addCriterion("ORDER_EXE_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountIsNotNull() {
            addCriterion("ORDER_EXE_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountEqualTo(String value) {
            addCriterion("ORDER_EXE_ACCOUNT =", value, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountNotEqualTo(String value) {
            addCriterion("ORDER_EXE_ACCOUNT <>", value, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountGreaterThan(String value) {
            addCriterion("ORDER_EXE_ACCOUNT >", value, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_EXE_ACCOUNT >=", value, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountLessThan(String value) {
            addCriterion("ORDER_EXE_ACCOUNT <", value, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_EXE_ACCOUNT <=", value, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountLike(String value) {
            addCriterion("ORDER_EXE_ACCOUNT like", value, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountNotLike(String value) {
            addCriterion("ORDER_EXE_ACCOUNT not like", value, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountIn(List<String> values) {
            addCriterion("ORDER_EXE_ACCOUNT in", values, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountNotIn(List<String> values) {
            addCriterion("ORDER_EXE_ACCOUNT not in", values, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountBetween(String value1, String value2) {
            addCriterion("ORDER_EXE_ACCOUNT between", value1, value2, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderExeAccountNotBetween(String value1, String value2) {
            addCriterion("ORDER_EXE_ACCOUNT not between", value1, value2, "orderExeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoIsNull() {
            addCriterion("ORDER_DEPOSIT_REMEMO is null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoIsNotNull() {
            addCriterion("ORDER_DEPOSIT_REMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO =", value, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO <>", value, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoGreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO >", value, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO >=", value, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoLessThan(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO <", value, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO <=", value, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoLike(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO like", value, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoNotLike(String value) {
            addCriterion("ORDER_DEPOSIT_REMEMO not like", value, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_REMEMO in", values, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_REMEMO not in", values, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_REMEMO between", value1, value2, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositRememoNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_REMEMO not between", value1, value2, "orderDepositRememo");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnIsNull() {
            addCriterion("ORDER_DEPOSIT_RETURN is null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnIsNotNull() {
            addCriterion("ORDER_DEPOSIT_RETURN is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN =", value, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnNotEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN <>", value, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnGreaterThan(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN >", value, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN >=", value, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnLessThan(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN <", value, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN <=", value, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnLike(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN like", value, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnNotLike(String value) {
            addCriterion("ORDER_DEPOSIT_RETURN not like", value, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_RETURN in", values, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnNotIn(List<String> values) {
            addCriterion("ORDER_DEPOSIT_RETURN not in", values, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_RETURN between", value1, value2, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderDepositReturnNotBetween(String value1, String value2) {
            addCriterion("ORDER_DEPOSIT_RETURN not between", value1, value2, "orderDepositReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnIsNull() {
            addCriterion("ORDER_AMOUNT_RETURN is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnIsNotNull() {
            addCriterion("ORDER_AMOUNT_RETURN is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_RETURN =", value, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnNotEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_RETURN <>", value, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnGreaterThan(String value) {
            addCriterion("ORDER_AMOUNT_RETURN >", value, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_RETURN >=", value, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnLessThan(String value) {
            addCriterion("ORDER_AMOUNT_RETURN <", value, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnLessThanOrEqualTo(String value) {
            addCriterion("ORDER_AMOUNT_RETURN <=", value, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnLike(String value) {
            addCriterion("ORDER_AMOUNT_RETURN like", value, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnNotLike(String value) {
            addCriterion("ORDER_AMOUNT_RETURN not like", value, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_RETURN in", values, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnNotIn(List<String> values) {
            addCriterion("ORDER_AMOUNT_RETURN not in", values, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_RETURN between", value1, value2, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderAmountReturnNotBetween(String value1, String value2) {
            addCriterion("ORDER_AMOUNT_RETURN not between", value1, value2, "orderAmountReturn");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateIsNull() {
            addCriterion("ORDER_OVER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateIsNotNull() {
            addCriterion("ORDER_OVER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateEqualTo(String value) {
            addCriterion("ORDER_OVER_DATE =", value, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateNotEqualTo(String value) {
            addCriterion("ORDER_OVER_DATE <>", value, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateGreaterThan(String value) {
            addCriterion("ORDER_OVER_DATE >", value, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_OVER_DATE >=", value, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateLessThan(String value) {
            addCriterion("ORDER_OVER_DATE <", value, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_OVER_DATE <=", value, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateLike(String value) {
            addCriterion("ORDER_OVER_DATE like", value, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateNotLike(String value) {
            addCriterion("ORDER_OVER_DATE not like", value, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateIn(List<String> values) {
            addCriterion("ORDER_OVER_DATE in", values, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateNotIn(List<String> values) {
            addCriterion("ORDER_OVER_DATE not in", values, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateBetween(String value1, String value2) {
            addCriterion("ORDER_OVER_DATE between", value1, value2, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderOverDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_OVER_DATE not between", value1, value2, "orderOverDate");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageIsNull() {
            addCriterion("ORDER_CERT_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageIsNotNull() {
            addCriterion("ORDER_CERT_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE =", value, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageNotEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE <>", value, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageGreaterThan(String value) {
            addCriterion("ORDER_CERT_IMAGE >", value, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE >=", value, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageLessThan(String value) {
            addCriterion("ORDER_CERT_IMAGE <", value, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE <=", value, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageLike(String value) {
            addCriterion("ORDER_CERT_IMAGE like", value, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageNotLike(String value) {
            addCriterion("ORDER_CERT_IMAGE not like", value, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageIn(List<String> values) {
            addCriterion("ORDER_CERT_IMAGE in", values, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageNotIn(List<String> values) {
            addCriterion("ORDER_CERT_IMAGE not in", values, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_IMAGE between", value1, value2, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImageNotBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_IMAGE not between", value1, value2, "orderCertImage");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1IsNull() {
            addCriterion("ORDER_CERT_IMAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1IsNotNull() {
            addCriterion("ORDER_CERT_IMAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1EqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE1 =", value, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1NotEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE1 <>", value, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1GreaterThan(String value) {
            addCriterion("ORDER_CERT_IMAGE1 >", value, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1GreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE1 >=", value, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1LessThan(String value) {
            addCriterion("ORDER_CERT_IMAGE1 <", value, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1LessThanOrEqualTo(String value) {
            addCriterion("ORDER_CERT_IMAGE1 <=", value, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1Like(String value) {
            addCriterion("ORDER_CERT_IMAGE1 like", value, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1NotLike(String value) {
            addCriterion("ORDER_CERT_IMAGE1 not like", value, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1In(List<String> values) {
            addCriterion("ORDER_CERT_IMAGE1 in", values, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1NotIn(List<String> values) {
            addCriterion("ORDER_CERT_IMAGE1 not in", values, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1Between(String value1, String value2) {
            addCriterion("ORDER_CERT_IMAGE1 between", value1, value2, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderCertImage1NotBetween(String value1, String value2) {
            addCriterion("ORDER_CERT_IMAGE1 not between", value1, value2, "orderCertImage1");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderIsNull() {
            addCriterion("ORDER_NEXT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderIsNotNull() {
            addCriterion("ORDER_NEXT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderEqualTo(String value) {
            addCriterion("ORDER_NEXT_ORDER =", value, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderNotEqualTo(String value) {
            addCriterion("ORDER_NEXT_ORDER <>", value, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderGreaterThan(String value) {
            addCriterion("ORDER_NEXT_ORDER >", value, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_ORDER >=", value, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderLessThan(String value) {
            addCriterion("ORDER_NEXT_ORDER <", value, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_ORDER <=", value, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderLike(String value) {
            addCriterion("ORDER_NEXT_ORDER like", value, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderNotLike(String value) {
            addCriterion("ORDER_NEXT_ORDER not like", value, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderIn(List<String> values) {
            addCriterion("ORDER_NEXT_ORDER in", values, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderNotIn(List<String> values) {
            addCriterion("ORDER_NEXT_ORDER not in", values, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_ORDER between", value1, value2, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextOrderNotBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_ORDER not between", value1, value2, "orderNextOrder");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateIsNull() {
            addCriterion("ORDER_NEXT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateIsNotNull() {
            addCriterion("ORDER_NEXT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateEqualTo(String value) {
            addCriterion("ORDER_NEXT_END_DATE =", value, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateNotEqualTo(String value) {
            addCriterion("ORDER_NEXT_END_DATE <>", value, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateGreaterThan(String value) {
            addCriterion("ORDER_NEXT_END_DATE >", value, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_END_DATE >=", value, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateLessThan(String value) {
            addCriterion("ORDER_NEXT_END_DATE <", value, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_END_DATE <=", value, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateLike(String value) {
            addCriterion("ORDER_NEXT_END_DATE like", value, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateNotLike(String value) {
            addCriterion("ORDER_NEXT_END_DATE not like", value, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateIn(List<String> values) {
            addCriterion("ORDER_NEXT_END_DATE in", values, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateNotIn(List<String> values) {
            addCriterion("ORDER_NEXT_END_DATE not in", values, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_END_DATE between", value1, value2, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextEndDateNotBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_END_DATE not between", value1, value2, "orderNextEndDate");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountIsNull() {
            addCriterion("ORDER_NEXT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountIsNotNull() {
            addCriterion("ORDER_NEXT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountEqualTo(String value) {
            addCriterion("ORDER_NEXT_AMOUNT =", value, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountNotEqualTo(String value) {
            addCriterion("ORDER_NEXT_AMOUNT <>", value, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountGreaterThan(String value) {
            addCriterion("ORDER_NEXT_AMOUNT >", value, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_AMOUNT >=", value, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountLessThan(String value) {
            addCriterion("ORDER_NEXT_AMOUNT <", value, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NEXT_AMOUNT <=", value, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountLike(String value) {
            addCriterion("ORDER_NEXT_AMOUNT like", value, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountNotLike(String value) {
            addCriterion("ORDER_NEXT_AMOUNT not like", value, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountIn(List<String> values) {
            addCriterion("ORDER_NEXT_AMOUNT in", values, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountNotIn(List<String> values) {
            addCriterion("ORDER_NEXT_AMOUNT not in", values, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_AMOUNT between", value1, value2, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNextAmountNotBetween(String value1, String value2) {
            addCriterion("ORDER_NEXT_AMOUNT not between", value1, value2, "orderNextAmount");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeIsNull() {
            addCriterion("ORDER_RETURN_CELL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeIsNotNull() {
            addCriterion("ORDER_RETURN_CELL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeEqualTo(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME =", value, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeNotEqualTo(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME <>", value, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeGreaterThan(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME >", value, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME >=", value, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeLessThan(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME <", value, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME <=", value, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeLike(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME like", value, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeNotLike(String value) {
            addCriterion("ORDER_RETURN_CELL_TIME not like", value, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeIn(List<String> values) {
            addCriterion("ORDER_RETURN_CELL_TIME in", values, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeNotIn(List<String> values) {
            addCriterion("ORDER_RETURN_CELL_TIME not in", values, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeBetween(String value1, String value2) {
            addCriterion("ORDER_RETURN_CELL_TIME between", value1, value2, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderReturnCellTimeNotBetween(String value1, String value2) {
            addCriterion("ORDER_RETURN_CELL_TIME not between", value1, value2, "orderReturnCellTime");
            return (Criteria) this;
        }

        public Criteria andOrderUnitIsNull() {
            addCriterion("ORDER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andOrderUnitIsNotNull() {
            addCriterion("ORDER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUnitEqualTo(String value) {
            addCriterion("ORDER_UNIT =", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotEqualTo(String value) {
            addCriterion("ORDER_UNIT <>", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitGreaterThan(String value) {
            addCriterion("ORDER_UNIT >", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_UNIT >=", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitLessThan(String value) {
            addCriterion("ORDER_UNIT <", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitLessThanOrEqualTo(String value) {
            addCriterion("ORDER_UNIT <=", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitLike(String value) {
            addCriterion("ORDER_UNIT like", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotLike(String value) {
            addCriterion("ORDER_UNIT not like", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitIn(List<String> values) {
            addCriterion("ORDER_UNIT in", values, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotIn(List<String> values) {
            addCriterion("ORDER_UNIT not in", values, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitBetween(String value1, String value2) {
            addCriterion("ORDER_UNIT between", value1, value2, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotBetween(String value1, String value2) {
            addCriterion("ORDER_UNIT not between", value1, value2, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("ORDER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("ORDER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("ORDER_NUMBER =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("ORDER_NUMBER <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("ORDER_NUMBER >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NUMBER >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("ORDER_NUMBER <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NUMBER <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("ORDER_NUMBER like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("ORDER_NUMBER not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("ORDER_NUMBER in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("ORDER_NUMBER not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("ORDER_NUMBER between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("ORDER_NUMBER not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayIsNull() {
            addCriterion("ORDER_IS_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayIsNotNull() {
            addCriterion("ORDER_IS_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayEqualTo(String value) {
            addCriterion("ORDER_IS_DISPLAY =", value, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayNotEqualTo(String value) {
            addCriterion("ORDER_IS_DISPLAY <>", value, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayGreaterThan(String value) {
            addCriterion("ORDER_IS_DISPLAY >", value, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_IS_DISPLAY >=", value, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayLessThan(String value) {
            addCriterion("ORDER_IS_DISPLAY <", value, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayLessThanOrEqualTo(String value) {
            addCriterion("ORDER_IS_DISPLAY <=", value, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayLike(String value) {
            addCriterion("ORDER_IS_DISPLAY like", value, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayNotLike(String value) {
            addCriterion("ORDER_IS_DISPLAY not like", value, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayIn(List<String> values) {
            addCriterion("ORDER_IS_DISPLAY in", values, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayNotIn(List<String> values) {
            addCriterion("ORDER_IS_DISPLAY not in", values, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayBetween(String value1, String value2) {
            addCriterion("ORDER_IS_DISPLAY between", value1, value2, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderIsDisplayNotBetween(String value1, String value2) {
            addCriterion("ORDER_IS_DISPLAY not between", value1, value2, "orderIsDisplay");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordIsNull() {
            addCriterion("ORDER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordIsNotNull() {
            addCriterion("ORDER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordEqualTo(String value) {
            addCriterion("ORDER_PASSWORD =", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordNotEqualTo(String value) {
            addCriterion("ORDER_PASSWORD <>", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordGreaterThan(String value) {
            addCriterion("ORDER_PASSWORD >", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PASSWORD >=", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordLessThan(String value) {
            addCriterion("ORDER_PASSWORD <", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PASSWORD <=", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordLike(String value) {
            addCriterion("ORDER_PASSWORD like", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordNotLike(String value) {
            addCriterion("ORDER_PASSWORD not like", value, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordIn(List<String> values) {
            addCriterion("ORDER_PASSWORD in", values, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordNotIn(List<String> values) {
            addCriterion("ORDER_PASSWORD not in", values, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordBetween(String value1, String value2) {
            addCriterion("ORDER_PASSWORD between", value1, value2, "orderPassword");
            return (Criteria) this;
        }

        public Criteria andOrderPasswordNotBetween(String value1, String value2) {
            addCriterion("ORDER_PASSWORD not between", value1, value2, "orderPassword");
            return (Criteria) this;
        }
    }

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