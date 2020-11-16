package com.fogcoding.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class test_envExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public test_envExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSystemIsNull() {
            addCriterion("system is null");
            return (Criteria) this;
        }

        public Criteria andSystemIsNotNull() {
            addCriterion("system is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEqualTo(String value) {
            addCriterion("system =", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotEqualTo(String value) {
            addCriterion("system <>", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThan(String value) {
            addCriterion("system >", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThanOrEqualTo(String value) {
            addCriterion("system >=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThan(String value) {
            addCriterion("system <", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThanOrEqualTo(String value) {
            addCriterion("system <=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLike(String value) {
            addCriterion("system like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotLike(String value) {
            addCriterion("system not like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemIn(List<String> values) {
            addCriterion("system in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotIn(List<String> values) {
            addCriterion("system not in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemBetween(String value1, String value2) {
            addCriterion("system between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotBetween(String value1, String value2) {
            addCriterion("system not between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andPmIsNull() {
            addCriterion("pm is null");
            return (Criteria) this;
        }

        public Criteria andPmIsNotNull() {
            addCriterion("pm is not null");
            return (Criteria) this;
        }

        public Criteria andPmEqualTo(String value) {
            addCriterion("pm =", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotEqualTo(String value) {
            addCriterion("pm <>", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThan(String value) {
            addCriterion("pm >", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmGreaterThanOrEqualTo(String value) {
            addCriterion("pm >=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThan(String value) {
            addCriterion("pm <", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLessThanOrEqualTo(String value) {
            addCriterion("pm <=", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmLike(String value) {
            addCriterion("pm like", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotLike(String value) {
            addCriterion("pm not like", value, "pm");
            return (Criteria) this;
        }

        public Criteria andPmIn(List<String> values) {
            addCriterion("pm in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotIn(List<String> values) {
            addCriterion("pm not in", values, "pm");
            return (Criteria) this;
        }

        public Criteria andPmBetween(String value1, String value2) {
            addCriterion("pm between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andPmNotBetween(String value1, String value2) {
            addCriterion("pm not between", value1, value2, "pm");
            return (Criteria) this;
        }

        public Criteria andHostaddrIsNull() {
            addCriterion("hostaddr is null");
            return (Criteria) this;
        }

        public Criteria andHostaddrIsNotNull() {
            addCriterion("hostaddr is not null");
            return (Criteria) this;
        }

        public Criteria andHostaddrEqualTo(String value) {
            addCriterion("hostaddr =", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotEqualTo(String value) {
            addCriterion("hostaddr <>", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrGreaterThan(String value) {
            addCriterion("hostaddr >", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrGreaterThanOrEqualTo(String value) {
            addCriterion("hostaddr >=", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLessThan(String value) {
            addCriterion("hostaddr <", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLessThanOrEqualTo(String value) {
            addCriterion("hostaddr <=", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrLike(String value) {
            addCriterion("hostaddr like", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotLike(String value) {
            addCriterion("hostaddr not like", value, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrIn(List<String> values) {
            addCriterion("hostaddr in", values, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotIn(List<String> values) {
            addCriterion("hostaddr not in", values, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrBetween(String value1, String value2) {
            addCriterion("hostaddr between", value1, value2, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostaddrNotBetween(String value1, String value2) {
            addCriterion("hostaddr not between", value1, value2, "hostaddr");
            return (Criteria) this;
        }

        public Criteria andHostuserIsNull() {
            addCriterion("hostuser is null");
            return (Criteria) this;
        }

        public Criteria andHostuserIsNotNull() {
            addCriterion("hostuser is not null");
            return (Criteria) this;
        }

        public Criteria andHostuserEqualTo(String value) {
            addCriterion("hostuser =", value, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserNotEqualTo(String value) {
            addCriterion("hostuser <>", value, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserGreaterThan(String value) {
            addCriterion("hostuser >", value, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserGreaterThanOrEqualTo(String value) {
            addCriterion("hostuser >=", value, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserLessThan(String value) {
            addCriterion("hostuser <", value, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserLessThanOrEqualTo(String value) {
            addCriterion("hostuser <=", value, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserLike(String value) {
            addCriterion("hostuser like", value, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserNotLike(String value) {
            addCriterion("hostuser not like", value, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserIn(List<String> values) {
            addCriterion("hostuser in", values, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserNotIn(List<String> values) {
            addCriterion("hostuser not in", values, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserBetween(String value1, String value2) {
            addCriterion("hostuser between", value1, value2, "hostuser");
            return (Criteria) this;
        }

        public Criteria andHostuserNotBetween(String value1, String value2) {
            addCriterion("hostuser not between", value1, value2, "hostuser");
            return (Criteria) this;
        }

        public Criteria andDbaddrIsNull() {
            addCriterion("dbaddr is null");
            return (Criteria) this;
        }

        public Criteria andDbaddrIsNotNull() {
            addCriterion("dbaddr is not null");
            return (Criteria) this;
        }

        public Criteria andDbaddrEqualTo(String value) {
            addCriterion("dbaddr =", value, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrNotEqualTo(String value) {
            addCriterion("dbaddr <>", value, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrGreaterThan(String value) {
            addCriterion("dbaddr >", value, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrGreaterThanOrEqualTo(String value) {
            addCriterion("dbaddr >=", value, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrLessThan(String value) {
            addCriterion("dbaddr <", value, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrLessThanOrEqualTo(String value) {
            addCriterion("dbaddr <=", value, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrLike(String value) {
            addCriterion("dbaddr like", value, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrNotLike(String value) {
            addCriterion("dbaddr not like", value, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrIn(List<String> values) {
            addCriterion("dbaddr in", values, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrNotIn(List<String> values) {
            addCriterion("dbaddr not in", values, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrBetween(String value1, String value2) {
            addCriterion("dbaddr between", value1, value2, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbaddrNotBetween(String value1, String value2) {
            addCriterion("dbaddr not between", value1, value2, "dbaddr");
            return (Criteria) this;
        }

        public Criteria andDbuserIsNull() {
            addCriterion("dbuser is null");
            return (Criteria) this;
        }

        public Criteria andDbuserIsNotNull() {
            addCriterion("dbuser is not null");
            return (Criteria) this;
        }

        public Criteria andDbuserEqualTo(String value) {
            addCriterion("dbuser =", value, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserNotEqualTo(String value) {
            addCriterion("dbuser <>", value, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserGreaterThan(String value) {
            addCriterion("dbuser >", value, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserGreaterThanOrEqualTo(String value) {
            addCriterion("dbuser >=", value, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserLessThan(String value) {
            addCriterion("dbuser <", value, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserLessThanOrEqualTo(String value) {
            addCriterion("dbuser <=", value, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserLike(String value) {
            addCriterion("dbuser like", value, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserNotLike(String value) {
            addCriterion("dbuser not like", value, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserIn(List<String> values) {
            addCriterion("dbuser in", values, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserNotIn(List<String> values) {
            addCriterion("dbuser not in", values, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserBetween(String value1, String value2) {
            addCriterion("dbuser between", value1, value2, "dbuser");
            return (Criteria) this;
        }

        public Criteria andDbuserNotBetween(String value1, String value2) {
            addCriterion("dbuser not between", value1, value2, "dbuser");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andWebuserIsNull() {
            addCriterion("webuser is null");
            return (Criteria) this;
        }

        public Criteria andWebuserIsNotNull() {
            addCriterion("webuser is not null");
            return (Criteria) this;
        }

        public Criteria andWebuserEqualTo(String value) {
            addCriterion("webuser =", value, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserNotEqualTo(String value) {
            addCriterion("webuser <>", value, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserGreaterThan(String value) {
            addCriterion("webuser >", value, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserGreaterThanOrEqualTo(String value) {
            addCriterion("webuser >=", value, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserLessThan(String value) {
            addCriterion("webuser <", value, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserLessThanOrEqualTo(String value) {
            addCriterion("webuser <=", value, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserLike(String value) {
            addCriterion("webuser like", value, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserNotLike(String value) {
            addCriterion("webuser not like", value, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserIn(List<String> values) {
            addCriterion("webuser in", values, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserNotIn(List<String> values) {
            addCriterion("webuser not in", values, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserBetween(String value1, String value2) {
            addCriterion("webuser between", value1, value2, "webuser");
            return (Criteria) this;
        }

        public Criteria andWebuserNotBetween(String value1, String value2) {
            addCriterion("webuser not between", value1, value2, "webuser");
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