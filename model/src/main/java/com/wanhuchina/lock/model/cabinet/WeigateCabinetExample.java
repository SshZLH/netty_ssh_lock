package com.wanhuchina.lock.model.cabinet;

import com.wanhuchina.lock.model.base.BaseDO;

import java.util.ArrayList;
import java.util.List;

public class WeigateCabinetExample extends BaseDO {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeigateCabinetExample() {
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

        public Criteria andCabinetNoIsNull() {
            addCriterion("CABINET_NO is null");
            return (Criteria) this;
        }

        public Criteria andCabinetNoIsNotNull() {
            addCriterion("CABINET_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetNoEqualTo(String value) {
            addCriterion("CABINET_NO =", value, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoNotEqualTo(String value) {
            addCriterion("CABINET_NO <>", value, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoGreaterThan(String value) {
            addCriterion("CABINET_NO >", value, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_NO >=", value, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoLessThan(String value) {
            addCriterion("CABINET_NO <", value, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoLessThanOrEqualTo(String value) {
            addCriterion("CABINET_NO <=", value, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoLike(String value) {
            addCriterion("CABINET_NO like", value, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoNotLike(String value) {
            addCriterion("CABINET_NO not like", value, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoIn(List<String> values) {
            addCriterion("CABINET_NO in", values, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoNotIn(List<String> values) {
            addCriterion("CABINET_NO not in", values, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoBetween(String value1, String value2) {
            addCriterion("CABINET_NO between", value1, value2, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetNoNotBetween(String value1, String value2) {
            addCriterion("CABINET_NO not between", value1, value2, "cabinetNo");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusIsNull() {
            addCriterion("CABINET_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusIsNotNull() {
            addCriterion("CABINET_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusEqualTo(String value) {
            addCriterion("CABINET_STATUS =", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusNotEqualTo(String value) {
            addCriterion("CABINET_STATUS <>", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusGreaterThan(String value) {
            addCriterion("CABINET_STATUS >", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_STATUS >=", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusLessThan(String value) {
            addCriterion("CABINET_STATUS <", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusLessThanOrEqualTo(String value) {
            addCriterion("CABINET_STATUS <=", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusLike(String value) {
            addCriterion("CABINET_STATUS like", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusNotLike(String value) {
            addCriterion("CABINET_STATUS not like", value, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusIn(List<String> values) {
            addCriterion("CABINET_STATUS in", values, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusNotIn(List<String> values) {
            addCriterion("CABINET_STATUS not in", values, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusBetween(String value1, String value2) {
            addCriterion("CABINET_STATUS between", value1, value2, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetStatusNotBetween(String value1, String value2) {
            addCriterion("CABINET_STATUS not between", value1, value2, "cabinetStatus");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelIsNull() {
            addCriterion("CABINET_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelIsNotNull() {
            addCriterion("CABINET_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelEqualTo(String value) {
            addCriterion("CABINET_ISDEL =", value, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelNotEqualTo(String value) {
            addCriterion("CABINET_ISDEL <>", value, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelGreaterThan(String value) {
            addCriterion("CABINET_ISDEL >", value, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_ISDEL >=", value, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelLessThan(String value) {
            addCriterion("CABINET_ISDEL <", value, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelLessThanOrEqualTo(String value) {
            addCriterion("CABINET_ISDEL <=", value, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelLike(String value) {
            addCriterion("CABINET_ISDEL like", value, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelNotLike(String value) {
            addCriterion("CABINET_ISDEL not like", value, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelIn(List<String> values) {
            addCriterion("CABINET_ISDEL in", values, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelNotIn(List<String> values) {
            addCriterion("CABINET_ISDEL not in", values, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelBetween(String value1, String value2) {
            addCriterion("CABINET_ISDEL between", value1, value2, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetIsdelNotBetween(String value1, String value2) {
            addCriterion("CABINET_ISDEL not between", value1, value2, "cabinetIsdel");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordIsNull() {
            addCriterion("CABINET_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordIsNotNull() {
            addCriterion("CABINET_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordEqualTo(String value) {
            addCriterion("CABINET_PASSWORD =", value, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordNotEqualTo(String value) {
            addCriterion("CABINET_PASSWORD <>", value, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordGreaterThan(String value) {
            addCriterion("CABINET_PASSWORD >", value, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_PASSWORD >=", value, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordLessThan(String value) {
            addCriterion("CABINET_PASSWORD <", value, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordLessThanOrEqualTo(String value) {
            addCriterion("CABINET_PASSWORD <=", value, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordLike(String value) {
            addCriterion("CABINET_PASSWORD like", value, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordNotLike(String value) {
            addCriterion("CABINET_PASSWORD not like", value, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordIn(List<String> values) {
            addCriterion("CABINET_PASSWORD in", values, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordNotIn(List<String> values) {
            addCriterion("CABINET_PASSWORD not in", values, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordBetween(String value1, String value2) {
            addCriterion("CABINET_PASSWORD between", value1, value2, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetPasswordNotBetween(String value1, String value2) {
            addCriterion("CABINET_PASSWORD not between", value1, value2, "cabinetPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoIsNull() {
            addCriterion("CABINET_DOOR_NO is null");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoIsNotNull() {
            addCriterion("CABINET_DOOR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoEqualTo(String value) {
            addCriterion("CABINET_DOOR_NO =", value, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoNotEqualTo(String value) {
            addCriterion("CABINET_DOOR_NO <>", value, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoGreaterThan(String value) {
            addCriterion("CABINET_DOOR_NO >", value, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_DOOR_NO >=", value, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoLessThan(String value) {
            addCriterion("CABINET_DOOR_NO <", value, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoLessThanOrEqualTo(String value) {
            addCriterion("CABINET_DOOR_NO <=", value, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoLike(String value) {
            addCriterion("CABINET_DOOR_NO like", value, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoNotLike(String value) {
            addCriterion("CABINET_DOOR_NO not like", value, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoIn(List<String> values) {
            addCriterion("CABINET_DOOR_NO in", values, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoNotIn(List<String> values) {
            addCriterion("CABINET_DOOR_NO not in", values, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoBetween(String value1, String value2) {
            addCriterion("CABINET_DOOR_NO between", value1, value2, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andCabinetDoorNoNotBetween(String value1, String value2) {
            addCriterion("CABINET_DOOR_NO not between", value1, value2, "cabinetDoorNo");
            return (Criteria) this;
        }

        public Criteria andWahoIdIsNull() {
            addCriterion("WAHO_ID is null");
            return (Criteria) this;
        }

        public Criteria andWahoIdIsNotNull() {
            addCriterion("WAHO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWahoIdEqualTo(String value) {
            addCriterion("WAHO_ID =", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotEqualTo(String value) {
            addCriterion("WAHO_ID <>", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdGreaterThan(String value) {
            addCriterion("WAHO_ID >", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAHO_ID >=", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLessThan(String value) {
            addCriterion("WAHO_ID <", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLessThanOrEqualTo(String value) {
            addCriterion("WAHO_ID <=", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdLike(String value) {
            addCriterion("WAHO_ID like", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotLike(String value) {
            addCriterion("WAHO_ID not like", value, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdIn(List<String> values) {
            addCriterion("WAHO_ID in", values, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotIn(List<String> values) {
            addCriterion("WAHO_ID not in", values, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdBetween(String value1, String value2) {
            addCriterion("WAHO_ID between", value1, value2, "wahoId");
            return (Criteria) this;
        }

        public Criteria andWahoIdNotBetween(String value1, String value2) {
            addCriterion("WAHO_ID not between", value1, value2, "wahoId");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordIsNull() {
            addCriterion("CABINET_SUPPER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordIsNotNull() {
            addCriterion("CABINET_SUPPER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordEqualTo(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD =", value, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordNotEqualTo(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD <>", value, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordGreaterThan(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD >", value, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD >=", value, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordLessThan(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD <", value, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordLessThanOrEqualTo(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD <=", value, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordLike(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD like", value, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordNotLike(String value) {
            addCriterion("CABINET_SUPPER_PASSWORD not like", value, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordIn(List<String> values) {
            addCriterion("CABINET_SUPPER_PASSWORD in", values, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordNotIn(List<String> values) {
            addCriterion("CABINET_SUPPER_PASSWORD not in", values, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordBetween(String value1, String value2) {
            addCriterion("CABINET_SUPPER_PASSWORD between", value1, value2, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabinetSupperPasswordNotBetween(String value1, String value2) {
            addCriterion("CABINET_SUPPER_PASSWORD not between", value1, value2, "cabinetSupperPassword");
            return (Criteria) this;
        }

        public Criteria andCabiIdIsNull() {
            addCriterion("CABI_ID is null");
            return (Criteria) this;
        }

        public Criteria andCabiIdIsNotNull() {
            addCriterion("CABI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCabiIdEqualTo(String value) {
            addCriterion("CABI_ID =", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdNotEqualTo(String value) {
            addCriterion("CABI_ID <>", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdGreaterThan(String value) {
            addCriterion("CABI_ID >", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdGreaterThanOrEqualTo(String value) {
            addCriterion("CABI_ID >=", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdLessThan(String value) {
            addCriterion("CABI_ID <", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdLessThanOrEqualTo(String value) {
            addCriterion("CABI_ID <=", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdLike(String value) {
            addCriterion("CABI_ID like", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdNotLike(String value) {
            addCriterion("CABI_ID not like", value, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdIn(List<String> values) {
            addCriterion("CABI_ID in", values, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdNotIn(List<String> values) {
            addCriterion("CABI_ID not in", values, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdBetween(String value1, String value2) {
            addCriterion("CABI_ID between", value1, value2, "cabiId");
            return (Criteria) this;
        }

        public Criteria andCabiIdNotBetween(String value1, String value2) {
            addCriterion("CABI_ID not between", value1, value2, "cabiId");
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

        public Criteria andCabinetOpenTimeIsNull() {
            addCriterion("CABINET_OPEN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeIsNotNull() {
            addCriterion("CABINET_OPEN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeEqualTo(String value) {
            addCriterion("CABINET_OPEN_TIME =", value, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeNotEqualTo(String value) {
            addCriterion("CABINET_OPEN_TIME <>", value, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeGreaterThan(String value) {
            addCriterion("CABINET_OPEN_TIME >", value, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_OPEN_TIME >=", value, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeLessThan(String value) {
            addCriterion("CABINET_OPEN_TIME <", value, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("CABINET_OPEN_TIME <=", value, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeLike(String value) {
            addCriterion("CABINET_OPEN_TIME like", value, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeNotLike(String value) {
            addCriterion("CABINET_OPEN_TIME not like", value, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeIn(List<String> values) {
            addCriterion("CABINET_OPEN_TIME in", values, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeNotIn(List<String> values) {
            addCriterion("CABINET_OPEN_TIME not in", values, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeBetween(String value1, String value2) {
            addCriterion("CABINET_OPEN_TIME between", value1, value2, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetOpenTimeNotBetween(String value1, String value2) {
            addCriterion("CABINET_OPEN_TIME not between", value1, value2, "cabinetOpenTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeIsNull() {
            addCriterion("CABINET_CLOS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeIsNotNull() {
            addCriterion("CABINET_CLOS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeEqualTo(String value) {
            addCriterion("CABINET_CLOS_TIME =", value, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeNotEqualTo(String value) {
            addCriterion("CABINET_CLOS_TIME <>", value, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeGreaterThan(String value) {
            addCriterion("CABINET_CLOS_TIME >", value, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_CLOS_TIME >=", value, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeLessThan(String value) {
            addCriterion("CABINET_CLOS_TIME <", value, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeLessThanOrEqualTo(String value) {
            addCriterion("CABINET_CLOS_TIME <=", value, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeLike(String value) {
            addCriterion("CABINET_CLOS_TIME like", value, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeNotLike(String value) {
            addCriterion("CABINET_CLOS_TIME not like", value, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeIn(List<String> values) {
            addCriterion("CABINET_CLOS_TIME in", values, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeNotIn(List<String> values) {
            addCriterion("CABINET_CLOS_TIME not in", values, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeBetween(String value1, String value2) {
            addCriterion("CABINET_CLOS_TIME between", value1, value2, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetClosTimeNotBetween(String value1, String value2) {
            addCriterion("CABINET_CLOS_TIME not between", value1, value2, "cabinetClosTime");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockIsNull() {
            addCriterion("CABINET_STATE_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockIsNotNull() {
            addCriterion("CABINET_STATE_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockEqualTo(String value) {
            addCriterion("CABINET_STATE_LOCK =", value, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockNotEqualTo(String value) {
            addCriterion("CABINET_STATE_LOCK <>", value, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockGreaterThan(String value) {
            addCriterion("CABINET_STATE_LOCK >", value, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockGreaterThanOrEqualTo(String value) {
            addCriterion("CABINET_STATE_LOCK >=", value, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockLessThan(String value) {
            addCriterion("CABINET_STATE_LOCK <", value, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockLessThanOrEqualTo(String value) {
            addCriterion("CABINET_STATE_LOCK <=", value, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockLike(String value) {
            addCriterion("CABINET_STATE_LOCK like", value, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockNotLike(String value) {
            addCriterion("CABINET_STATE_LOCK not like", value, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockIn(List<String> values) {
            addCriterion("CABINET_STATE_LOCK in", values, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockNotIn(List<String> values) {
            addCriterion("CABINET_STATE_LOCK not in", values, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockBetween(String value1, String value2) {
            addCriterion("CABINET_STATE_LOCK between", value1, value2, "cabinetStateLock");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLockNotBetween(String value1, String value2) {
            addCriterion("CABINET_STATE_LOCK not between", value1, value2, "cabinetStateLock");
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