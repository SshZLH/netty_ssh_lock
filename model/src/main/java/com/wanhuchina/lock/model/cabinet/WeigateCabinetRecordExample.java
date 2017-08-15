package com.wanhuchina.lock.model.cabinet;

import com.wanhuchina.lock.model.base.BaseDO;

import java.util.ArrayList;
import java.util.List;

public class WeigateCabinetRecordExample extends BaseDO {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeigateCabinetRecordExample() {
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

        public Criteria andCareIdIsNull() {
            addCriterion("CARE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCareIdIsNotNull() {
            addCriterion("CARE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCareIdEqualTo(String value) {
            addCriterion("CARE_ID =", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdNotEqualTo(String value) {
            addCriterion("CARE_ID <>", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdGreaterThan(String value) {
            addCriterion("CARE_ID >", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_ID >=", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdLessThan(String value) {
            addCriterion("CARE_ID <", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdLessThanOrEqualTo(String value) {
            addCriterion("CARE_ID <=", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdLike(String value) {
            addCriterion("CARE_ID like", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdNotLike(String value) {
            addCriterion("CARE_ID not like", value, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdIn(List<String> values) {
            addCriterion("CARE_ID in", values, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdNotIn(List<String> values) {
            addCriterion("CARE_ID not in", values, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdBetween(String value1, String value2) {
            addCriterion("CARE_ID between", value1, value2, "careId");
            return (Criteria) this;
        }

        public Criteria andCareIdNotBetween(String value1, String value2) {
            addCriterion("CARE_ID not between", value1, value2, "careId");
            return (Criteria) this;
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

        public Criteria andCabinetIdIsNull() {
            addCriterion("CABINET_ID is null");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIsNotNull() {
            addCriterion("CABINET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetIdEqualTo(String value) {
            addCriterion("CABINET_ID =", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotEqualTo(String value) {
            addCriterion("CABINET_ID <>", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdGreaterThan(String value) {
            addCriterion("CABINET_ID >", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_ID >=", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLessThan(String value) {
            addCriterion("CABINET_ID <", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLessThanOrEqualTo(String value) {
            addCriterion("CABINET_ID <=", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLike(String value) {
            addCriterion("CABINET_ID like", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotLike(String value) {
            addCriterion("CABINET_ID not like", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIn(List<String> values) {
            addCriterion("CABINET_ID in", values, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotIn(List<String> values) {
            addCriterion("CABINET_ID not in", values, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdBetween(String value1, String value2) {
            addCriterion("CABINET_ID between", value1, value2, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotBetween(String value1, String value2) {
            addCriterion("CABINET_ID not between", value1, value2, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeIsNull() {
            addCriterion("CARE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeIsNotNull() {
            addCriterion("CARE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeEqualTo(String value) {
            addCriterion("CARE_CREATE_TIME =", value, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeNotEqualTo(String value) {
            addCriterion("CARE_CREATE_TIME <>", value, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeGreaterThan(String value) {
            addCriterion("CARE_CREATE_TIME >", value, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_CREATE_TIME >=", value, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeLessThan(String value) {
            addCriterion("CARE_CREATE_TIME <", value, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_CREATE_TIME <=", value, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeLike(String value) {
            addCriterion("CARE_CREATE_TIME like", value, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeNotLike(String value) {
            addCriterion("CARE_CREATE_TIME not like", value, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeIn(List<String> values) {
            addCriterion("CARE_CREATE_TIME in", values, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeNotIn(List<String> values) {
            addCriterion("CARE_CREATE_TIME not in", values, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeBetween(String value1, String value2) {
            addCriterion("CARE_CREATE_TIME between", value1, value2, "careCreateTime");
            return (Criteria) this;
        }

        public Criteria andCareCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_CREATE_TIME not between", value1, value2, "careCreateTime");
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

        public Criteria andCareQueryTimeIsNull() {
            addCriterion("CARE_QUERY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeIsNotNull() {
            addCriterion("CARE_QUERY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeEqualTo(String value) {
            addCriterion("CARE_QUERY_TIME =", value, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeNotEqualTo(String value) {
            addCriterion("CARE_QUERY_TIME <>", value, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeGreaterThan(String value) {
            addCriterion("CARE_QUERY_TIME >", value, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_QUERY_TIME >=", value, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeLessThan(String value) {
            addCriterion("CARE_QUERY_TIME <", value, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_QUERY_TIME <=", value, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeLike(String value) {
            addCriterion("CARE_QUERY_TIME like", value, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeNotLike(String value) {
            addCriterion("CARE_QUERY_TIME not like", value, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeIn(List<String> values) {
            addCriterion("CARE_QUERY_TIME in", values, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeNotIn(List<String> values) {
            addCriterion("CARE_QUERY_TIME not in", values, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeBetween(String value1, String value2) {
            addCriterion("CARE_QUERY_TIME between", value1, value2, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareQueryTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_QUERY_TIME not between", value1, value2, "careQueryTime");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusIsNull() {
            addCriterion("CARE_CABINET_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusIsNotNull() {
            addCriterion("CARE_CABINET_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusEqualTo(String value) {
            addCriterion("CARE_CABINET_STATUS =", value, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusNotEqualTo(String value) {
            addCriterion("CARE_CABINET_STATUS <>", value, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusGreaterThan(String value) {
            addCriterion("CARE_CABINET_STATUS >", value, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_CABINET_STATUS >=", value, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusLessThan(String value) {
            addCriterion("CARE_CABINET_STATUS <", value, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusLessThanOrEqualTo(String value) {
            addCriterion("CARE_CABINET_STATUS <=", value, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusLike(String value) {
            addCriterion("CARE_CABINET_STATUS like", value, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusNotLike(String value) {
            addCriterion("CARE_CABINET_STATUS not like", value, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusIn(List<String> values) {
            addCriterion("CARE_CABINET_STATUS in", values, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusNotIn(List<String> values) {
            addCriterion("CARE_CABINET_STATUS not in", values, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusBetween(String value1, String value2) {
            addCriterion("CARE_CABINET_STATUS between", value1, value2, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareCabinetStatusNotBetween(String value1, String value2) {
            addCriterion("CARE_CABINET_STATUS not between", value1, value2, "careCabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCareOperatorIsNull() {
            addCriterion("CARE_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andCareOperatorIsNotNull() {
            addCriterion("CARE_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCareOperatorEqualTo(String value) {
            addCriterion("CARE_OPERATOR =", value, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorNotEqualTo(String value) {
            addCriterion("CARE_OPERATOR <>", value, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorGreaterThan(String value) {
            addCriterion("CARE_OPERATOR >", value, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_OPERATOR >=", value, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorLessThan(String value) {
            addCriterion("CARE_OPERATOR <", value, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorLessThanOrEqualTo(String value) {
            addCriterion("CARE_OPERATOR <=", value, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorLike(String value) {
            addCriterion("CARE_OPERATOR like", value, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorNotLike(String value) {
            addCriterion("CARE_OPERATOR not like", value, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorIn(List<String> values) {
            addCriterion("CARE_OPERATOR in", values, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorNotIn(List<String> values) {
            addCriterion("CARE_OPERATOR not in", values, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorBetween(String value1, String value2) {
            addCriterion("CARE_OPERATOR between", value1, value2, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareOperatorNotBetween(String value1, String value2) {
            addCriterion("CARE_OPERATOR not between", value1, value2, "careOperator");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeIsNull() {
            addCriterion("CARE_RETURN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeIsNotNull() {
            addCriterion("CARE_RETURN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeEqualTo(String value) {
            addCriterion("CARE_RETURN_TIME =", value, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeNotEqualTo(String value) {
            addCriterion("CARE_RETURN_TIME <>", value, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeGreaterThan(String value) {
            addCriterion("CARE_RETURN_TIME >", value, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_RETURN_TIME >=", value, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeLessThan(String value) {
            addCriterion("CARE_RETURN_TIME <", value, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_RETURN_TIME <=", value, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeLike(String value) {
            addCriterion("CARE_RETURN_TIME like", value, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeNotLike(String value) {
            addCriterion("CARE_RETURN_TIME not like", value, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeIn(List<String> values) {
            addCriterion("CARE_RETURN_TIME in", values, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeNotIn(List<String> values) {
            addCriterion("CARE_RETURN_TIME not in", values, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeBetween(String value1, String value2) {
            addCriterion("CARE_RETURN_TIME between", value1, value2, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_RETURN_TIME not between", value1, value2, "careReturnTime");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusIsNull() {
            addCriterion("CARE_RETURN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusIsNotNull() {
            addCriterion("CARE_RETURN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusEqualTo(String value) {
            addCriterion("CARE_RETURN_STATUS =", value, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusNotEqualTo(String value) {
            addCriterion("CARE_RETURN_STATUS <>", value, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusGreaterThan(String value) {
            addCriterion("CARE_RETURN_STATUS >", value, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_RETURN_STATUS >=", value, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusLessThan(String value) {
            addCriterion("CARE_RETURN_STATUS <", value, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusLessThanOrEqualTo(String value) {
            addCriterion("CARE_RETURN_STATUS <=", value, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusLike(String value) {
            addCriterion("CARE_RETURN_STATUS like", value, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusNotLike(String value) {
            addCriterion("CARE_RETURN_STATUS not like", value, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusIn(List<String> values) {
            addCriterion("CARE_RETURN_STATUS in", values, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusNotIn(List<String> values) {
            addCriterion("CARE_RETURN_STATUS not in", values, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusBetween(String value1, String value2) {
            addCriterion("CARE_RETURN_STATUS between", value1, value2, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareReturnStatusNotBetween(String value1, String value2) {
            addCriterion("CARE_RETURN_STATUS not between", value1, value2, "careReturnStatus");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeIsNull() {
            addCriterion("CARE_OPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeIsNotNull() {
            addCriterion("CARE_OPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeEqualTo(String value) {
            addCriterion("CARE_OPEN_TIME =", value, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeNotEqualTo(String value) {
            addCriterion("CARE_OPEN_TIME <>", value, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeGreaterThan(String value) {
            addCriterion("CARE_OPEN_TIME >", value, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_OPEN_TIME >=", value, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeLessThan(String value) {
            addCriterion("CARE_OPEN_TIME <", value, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_OPEN_TIME <=", value, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeLike(String value) {
            addCriterion("CARE_OPEN_TIME like", value, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeNotLike(String value) {
            addCriterion("CARE_OPEN_TIME not like", value, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeIn(List<String> values) {
            addCriterion("CARE_OPEN_TIME in", values, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeNotIn(List<String> values) {
            addCriterion("CARE_OPEN_TIME not in", values, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeBetween(String value1, String value2) {
            addCriterion("CARE_OPEN_TIME between", value1, value2, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareOpenTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_OPEN_TIME not between", value1, value2, "careOpenTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeIsNull() {
            addCriterion("CARE_CLOS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeIsNotNull() {
            addCriterion("CARE_CLOS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeEqualTo(String value) {
            addCriterion("CARE_CLOS_TIME =", value, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeNotEqualTo(String value) {
            addCriterion("CARE_CLOS_TIME <>", value, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeGreaterThan(String value) {
            addCriterion("CARE_CLOS_TIME >", value, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_CLOS_TIME >=", value, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeLessThan(String value) {
            addCriterion("CARE_CLOS_TIME <", value, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeLessThanOrEqualTo(String value) {
            addCriterion("CARE_CLOS_TIME <=", value, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeLike(String value) {
            addCriterion("CARE_CLOS_TIME like", value, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeNotLike(String value) {
            addCriterion("CARE_CLOS_TIME not like", value, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeIn(List<String> values) {
            addCriterion("CARE_CLOS_TIME in", values, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeNotIn(List<String> values) {
            addCriterion("CARE_CLOS_TIME not in", values, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeBetween(String value1, String value2) {
            addCriterion("CARE_CLOS_TIME between", value1, value2, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareClosTimeNotBetween(String value1, String value2) {
            addCriterion("CARE_CLOS_TIME not between", value1, value2, "careClosTime");
            return (Criteria) this;
        }

        public Criteria andCareStateLockIsNull() {
            addCriterion("CARE_STATE_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andCareStateLockIsNotNull() {
            addCriterion("CARE_STATE_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andCareStateLockEqualTo(String value) {
            addCriterion("CARE_STATE_LOCK =", value, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockNotEqualTo(String value) {
            addCriterion("CARE_STATE_LOCK <>", value, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockGreaterThan(String value) {
            addCriterion("CARE_STATE_LOCK >", value, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockGreaterThanOrEqualTo(String value) {
            addCriterion("CARE_STATE_LOCK >=", value, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockLessThan(String value) {
            addCriterion("CARE_STATE_LOCK <", value, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockLessThanOrEqualTo(String value) {
            addCriterion("CARE_STATE_LOCK <=", value, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockLike(String value) {
            addCriterion("CARE_STATE_LOCK like", value, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockNotLike(String value) {
            addCriterion("CARE_STATE_LOCK not like", value, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockIn(List<String> values) {
            addCriterion("CARE_STATE_LOCK in", values, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockNotIn(List<String> values) {
            addCriterion("CARE_STATE_LOCK not in", values, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockBetween(String value1, String value2) {
            addCriterion("CARE_STATE_LOCK between", value1, value2, "careStateLock");
            return (Criteria) this;
        }

        public Criteria andCareStateLockNotBetween(String value1, String value2) {
            addCriterion("CARE_STATE_LOCK not between", value1, value2, "careStateLock");
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