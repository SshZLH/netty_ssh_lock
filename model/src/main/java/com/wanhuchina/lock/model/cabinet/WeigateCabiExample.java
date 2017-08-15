package com.wanhuchina.lock.model.cabinet;

import com.wanhuchina.lock.model.base.BaseDO;

import java.util.ArrayList;
import java.util.List;

public class WeigateCabiExample  extends BaseDO {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeigateCabiExample() {
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

        public Criteria andCabiIsdelIsNull() {
            addCriterion("CABI_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelIsNotNull() {
            addCriterion("CABI_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelEqualTo(String value) {
            addCriterion("CABI_ISDEL =", value, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelNotEqualTo(String value) {
            addCriterion("CABI_ISDEL <>", value, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelGreaterThan(String value) {
            addCriterion("CABI_ISDEL >", value, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("CABI_ISDEL >=", value, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelLessThan(String value) {
            addCriterion("CABI_ISDEL <", value, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelLessThanOrEqualTo(String value) {
            addCriterion("CABI_ISDEL <=", value, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelLike(String value) {
            addCriterion("CABI_ISDEL like", value, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelNotLike(String value) {
            addCriterion("CABI_ISDEL not like", value, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelIn(List<String> values) {
            addCriterion("CABI_ISDEL in", values, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelNotIn(List<String> values) {
            addCriterion("CABI_ISDEL not in", values, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelBetween(String value1, String value2) {
            addCriterion("CABI_ISDEL between", value1, value2, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiIsdelNotBetween(String value1, String value2) {
            addCriterion("CABI_ISDEL not between", value1, value2, "cabiIsdel");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeIsNull() {
            addCriterion("CABI_LAST_ACCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeIsNotNull() {
            addCriterion("CABI_LAST_ACCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeEqualTo(String value) {
            addCriterion("CABI_LAST_ACCESS_TIME =", value, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeNotEqualTo(String value) {
            addCriterion("CABI_LAST_ACCESS_TIME <>", value, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeGreaterThan(String value) {
            addCriterion("CABI_LAST_ACCESS_TIME >", value, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CABI_LAST_ACCESS_TIME >=", value, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeLessThan(String value) {
            addCriterion("CABI_LAST_ACCESS_TIME <", value, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeLessThanOrEqualTo(String value) {
            addCriterion("CABI_LAST_ACCESS_TIME <=", value, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeLike(String value) {
            addCriterion("CABI_LAST_ACCESS_TIME like", value, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeNotLike(String value) {
            addCriterion("CABI_LAST_ACCESS_TIME not like", value, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeIn(List<String> values) {
            addCriterion("CABI_LAST_ACCESS_TIME in", values, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeNotIn(List<String> values) {
            addCriterion("CABI_LAST_ACCESS_TIME not in", values, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeBetween(String value1, String value2) {
            addCriterion("CABI_LAST_ACCESS_TIME between", value1, value2, "cabiLastAccessTime");
            return (Criteria) this;
        }

        public Criteria andCabiLastAccessTimeNotBetween(String value1, String value2) {
            addCriterion("CABI_LAST_ACCESS_TIME not between", value1, value2, "cabiLastAccessTime");
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