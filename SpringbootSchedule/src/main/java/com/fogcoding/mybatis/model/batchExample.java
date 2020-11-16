package com.fogcoding.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class batchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public batchExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEnvIsNull() {
            addCriterion("_env is null");
            return (Criteria) this;
        }

        public Criteria andEnvIsNotNull() {
            addCriterion("_env is not null");
            return (Criteria) this;
        }

        public Criteria andEnvEqualTo(String value) {
            addCriterion("_env =", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotEqualTo(String value) {
            addCriterion("_env <>", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThan(String value) {
            addCriterion("_env >", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThanOrEqualTo(String value) {
            addCriterion("_env >=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThan(String value) {
            addCriterion("_env <", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThanOrEqualTo(String value) {
            addCriterion("_env <=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLike(String value) {
            addCriterion("_env like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotLike(String value) {
            addCriterion("_env not like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvIn(List<String> values) {
            addCriterion("_env in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotIn(List<String> values) {
            addCriterion("_env not in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvBetween(String value1, String value2) {
            addCriterion("_env between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotBetween(String value1, String value2) {
            addCriterion("_env not between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andSysIsNull() {
            addCriterion("_sys is null");
            return (Criteria) this;
        }

        public Criteria andSysIsNotNull() {
            addCriterion("_sys is not null");
            return (Criteria) this;
        }

        public Criteria andSysEqualTo(String value) {
            addCriterion("_sys =", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotEqualTo(String value) {
            addCriterion("_sys <>", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysGreaterThan(String value) {
            addCriterion("_sys >", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysGreaterThanOrEqualTo(String value) {
            addCriterion("_sys >=", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLessThan(String value) {
            addCriterion("_sys <", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLessThanOrEqualTo(String value) {
            addCriterion("_sys <=", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLike(String value) {
            addCriterion("_sys like", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotLike(String value) {
            addCriterion("_sys not like", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysIn(List<String> values) {
            addCriterion("_sys in", values, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotIn(List<String> values) {
            addCriterion("_sys not in", values, "sys");
            return (Criteria) this;
        }

        public Criteria andSysBetween(String value1, String value2) {
            addCriterion("_sys between", value1, value2, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotBetween(String value1, String value2) {
            addCriterion("_sys not between", value1, value2, "sys");
            return (Criteria) this;
        }

        public Criteria andPreDateIsNull() {
            addCriterion("_pre_date is null");
            return (Criteria) this;
        }

        public Criteria andPreDateIsNotNull() {
            addCriterion("_pre_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreDateEqualTo(Date value) {
            addCriterionForJDBCDate("_pre_date =", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("_pre_date <>", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateGreaterThan(Date value) {
            addCriterionForJDBCDate("_pre_date >", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("_pre_date >=", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateLessThan(Date value) {
            addCriterionForJDBCDate("_pre_date <", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("_pre_date <=", value, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateIn(List<Date> values) {
            addCriterionForJDBCDate("_pre_date in", values, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("_pre_date not in", values, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("_pre_date between", value1, value2, "preDate");
            return (Criteria) this;
        }

        public Criteria andPreDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("_pre_date not between", value1, value2, "preDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateIsNull() {
            addCriterion("_after_date is null");
            return (Criteria) this;
        }

        public Criteria andAfterDateIsNotNull() {
            addCriterion("_after_date is not null");
            return (Criteria) this;
        }

        public Criteria andAfterDateEqualTo(Date value) {
            addCriterionForJDBCDate("_after_date =", value, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("_after_date <>", value, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("_after_date >", value, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("_after_date >=", value, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateLessThan(Date value) {
            addCriterionForJDBCDate("_after_date <", value, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("_after_date <=", value, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateIn(List<Date> values) {
            addCriterionForJDBCDate("_after_date in", values, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("_after_date not in", values, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("_after_date between", value1, value2, "afterDate");
            return (Criteria) this;
        }

        public Criteria andAfterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("_after_date not between", value1, value2, "afterDate");
            return (Criteria) this;
        }

        public Criteria andRequesterIsNull() {
            addCriterion("_requester is null");
            return (Criteria) this;
        }

        public Criteria andRequesterIsNotNull() {
            addCriterion("_requester is not null");
            return (Criteria) this;
        }

        public Criteria andRequesterEqualTo(String value) {
            addCriterion("_requester =", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotEqualTo(String value) {
            addCriterion("_requester <>", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterGreaterThan(String value) {
            addCriterion("_requester >", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterGreaterThanOrEqualTo(String value) {
            addCriterion("_requester >=", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLessThan(String value) {
            addCriterion("_requester <", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLessThanOrEqualTo(String value) {
            addCriterion("_requester <=", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLike(String value) {
            addCriterion("_requester like", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotLike(String value) {
            addCriterion("_requester not like", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterIn(List<String> values) {
            addCriterion("_requester in", values, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotIn(List<String> values) {
            addCriterion("_requester not in", values, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterBetween(String value1, String value2) {
            addCriterion("_requester between", value1, value2, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotBetween(String value1, String value2) {
            addCriterion("_requester not between", value1, value2, "requester");
            return (Criteria) this;
        }

        public Criteria andRequestContentIsNull() {
            addCriterion("_request_content is null");
            return (Criteria) this;
        }

        public Criteria andRequestContentIsNotNull() {
            addCriterion("_request_content is not null");
            return (Criteria) this;
        }

        public Criteria andRequestContentEqualTo(String value) {
            addCriterion("_request_content =", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentNotEqualTo(String value) {
            addCriterion("_request_content <>", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentGreaterThan(String value) {
            addCriterion("_request_content >", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentGreaterThanOrEqualTo(String value) {
            addCriterion("_request_content >=", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentLessThan(String value) {
            addCriterion("_request_content <", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentLessThanOrEqualTo(String value) {
            addCriterion("_request_content <=", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentLike(String value) {
            addCriterion("_request_content like", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentNotLike(String value) {
            addCriterion("_request_content not like", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentIn(List<String> values) {
            addCriterion("_request_content in", values, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentNotIn(List<String> values) {
            addCriterion("_request_content not in", values, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentBetween(String value1, String value2) {
            addCriterion("_request_content between", value1, value2, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentNotBetween(String value1, String value2) {
            addCriterion("_request_content not between", value1, value2, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRunDateIsNull() {
            addCriterion("_run_date is null");
            return (Criteria) this;
        }

        public Criteria andRunDateIsNotNull() {
            addCriterion("_run_date is not null");
            return (Criteria) this;
        }

        public Criteria andRunDateEqualTo(Date value) {
            addCriterionForJDBCDate("_run_date =", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("_run_date <>", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateGreaterThan(Date value) {
            addCriterionForJDBCDate("_run_date >", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("_run_date >=", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateLessThan(Date value) {
            addCriterionForJDBCDate("_run_date <", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("_run_date <=", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateIn(List<Date> values) {
            addCriterionForJDBCDate("_run_date in", values, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("_run_date not in", values, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("_run_date between", value1, value2, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("_run_date not between", value1, value2, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNull() {
            addCriterion("_run_time is null");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNotNull() {
            addCriterion("_run_time is not null");
            return (Criteria) this;
        }

        public Criteria andRunTimeEqualTo(String value) {
            addCriterion("_run_time =", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotEqualTo(String value) {
            addCriterion("_run_time <>", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThan(String value) {
            addCriterion("_run_time >", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThanOrEqualTo(String value) {
            addCriterion("_run_time >=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThan(String value) {
            addCriterion("_run_time <", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThanOrEqualTo(String value) {
            addCriterion("_run_time <=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLike(String value) {
            addCriterion("_run_time like", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotLike(String value) {
            addCriterion("_run_time not like", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeIn(List<String> values) {
            addCriterion("_run_time in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotIn(List<String> values) {
            addCriterion("_run_time not in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeBetween(String value1, String value2) {
            addCriterion("_run_time between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotBetween(String value1, String value2) {
            addCriterion("_run_time not between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("_finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("_finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("_finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("_finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("_finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("_finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("_finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("_finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("_finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("_finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("_operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("_operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("_operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("_operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("_operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("_operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("_operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("_operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("_operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("_operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("_operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("_operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("_operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("_operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("_notice is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("_notice is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(String value) {
            addCriterion("_notice =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(String value) {
            addCriterion("_notice <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(String value) {
            addCriterion("_notice >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("_notice >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(String value) {
            addCriterion("_notice <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(String value) {
            addCriterion("_notice <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLike(String value) {
            addCriterion("_notice like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotLike(String value) {
            addCriterion("_notice not like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<String> values) {
            addCriterion("_notice in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<String> values) {
            addCriterion("_notice not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(String value1, String value2) {
            addCriterion("_notice between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(String value1, String value2) {
            addCriterion("_notice not between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("_state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("_state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("_state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("_state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("_state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("_state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("_state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("_state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("_state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("_state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("_state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("_state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("_state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("_state not between", value1, value2, "state");
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