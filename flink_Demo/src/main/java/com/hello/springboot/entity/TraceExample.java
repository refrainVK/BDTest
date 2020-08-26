package com.hello.springboot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraceExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNull() {
            addCriterion("strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIsNotNull() {
            addCriterion("strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyIdEqualTo(Long value) {
            addCriterion("strategy_id =", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotEqualTo(Long value) {
            addCriterion("strategy_id <>", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThan(Long value) {
            addCriterion("strategy_id >", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("strategy_id >=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThan(Long value) {
            addCriterion("strategy_id <", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdLessThanOrEqualTo(Long value) {
            addCriterion("strategy_id <=", value, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdIn(List<Long> values) {
            addCriterion("strategy_id in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotIn(List<Long> values) {
            addCriterion("strategy_id not in", values, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdBetween(Long value1, Long value2) {
            addCriterion("strategy_id between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyIdNotBetween(Long value1, Long value2) {
            addCriterion("strategy_id not between", value1, value2, "strategyId");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIsNull() {
            addCriterion("strategy_name is null");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIsNotNull() {
            addCriterion("strategy_name is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyNameEqualTo(String value) {
            addCriterion("strategy_name =", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotEqualTo(String value) {
            addCriterion("strategy_name <>", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameGreaterThan(String value) {
            addCriterion("strategy_name >", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_name >=", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLessThan(String value) {
            addCriterion("strategy_name <", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLessThanOrEqualTo(String value) {
            addCriterion("strategy_name <=", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLike(String value) {
            addCriterion("strategy_name like", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotLike(String value) {
            addCriterion("strategy_name not like", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIn(List<String> values) {
            addCriterion("strategy_name in", values, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotIn(List<String> values) {
            addCriterion("strategy_name not in", values, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameBetween(String value1, String value2) {
            addCriterion("strategy_name between", value1, value2, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotBetween(String value1, String value2) {
            addCriterion("strategy_name not between", value1, value2, "strategyName");
            return (Criteria) this;
        }

        public Criteria andFelidsIsNull() {
            addCriterion("felids is null");
            return (Criteria) this;
        }

        public Criteria andFelidsIsNotNull() {
            addCriterion("felids is not null");
            return (Criteria) this;
        }

        public Criteria andFelidsEqualTo(String value) {
            addCriterion("felids =", value, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsNotEqualTo(String value) {
            addCriterion("felids <>", value, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsGreaterThan(String value) {
            addCriterion("felids >", value, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsGreaterThanOrEqualTo(String value) {
            addCriterion("felids >=", value, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsLessThan(String value) {
            addCriterion("felids <", value, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsLessThanOrEqualTo(String value) {
            addCriterion("felids <=", value, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsLike(String value) {
            addCriterion("felids like", value, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsNotLike(String value) {
            addCriterion("felids not like", value, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsIn(List<String> values) {
            addCriterion("felids in", values, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsNotIn(List<String> values) {
            addCriterion("felids not in", values, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsBetween(String value1, String value2) {
            addCriterion("felids between", value1, value2, "felids");
            return (Criteria) this;
        }

        public Criteria andFelidsNotBetween(String value1, String value2) {
            addCriterion("felids not between", value1, value2, "felids");
            return (Criteria) this;
        }

        public Criteria andSubcommandIsNull() {
            addCriterion("subcommand is null");
            return (Criteria) this;
        }

        public Criteria andSubcommandIsNotNull() {
            addCriterion("subcommand is not null");
            return (Criteria) this;
        }

        public Criteria andSubcommandEqualTo(String value) {
            addCriterion("subcommand =", value, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandNotEqualTo(String value) {
            addCriterion("subcommand <>", value, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandGreaterThan(String value) {
            addCriterion("subcommand >", value, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandGreaterThanOrEqualTo(String value) {
            addCriterion("subcommand >=", value, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandLessThan(String value) {
            addCriterion("subcommand <", value, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandLessThanOrEqualTo(String value) {
            addCriterion("subcommand <=", value, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandLike(String value) {
            addCriterion("subcommand like", value, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandNotLike(String value) {
            addCriterion("subcommand not like", value, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandIn(List<String> values) {
            addCriterion("subcommand in", values, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandNotIn(List<String> values) {
            addCriterion("subcommand not in", values, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandBetween(String value1, String value2) {
            addCriterion("subcommand between", value1, value2, "subcommand");
            return (Criteria) this;
        }

        public Criteria andSubcommandNotBetween(String value1, String value2) {
            addCriterion("subcommand not between", value1, value2, "subcommand");
            return (Criteria) this;
        }

        public Criteria andFelidsValueIsNull() {
            addCriterion("felids_value is null");
            return (Criteria) this;
        }

        public Criteria andFelidsValueIsNotNull() {
            addCriterion("felids_value is not null");
            return (Criteria) this;
        }

        public Criteria andFelidsValueEqualTo(String value) {
            addCriterion("felids_value =", value, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueNotEqualTo(String value) {
            addCriterion("felids_value <>", value, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueGreaterThan(String value) {
            addCriterion("felids_value >", value, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueGreaterThanOrEqualTo(String value) {
            addCriterion("felids_value >=", value, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueLessThan(String value) {
            addCriterion("felids_value <", value, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueLessThanOrEqualTo(String value) {
            addCriterion("felids_value <=", value, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueLike(String value) {
            addCriterion("felids_value like", value, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueNotLike(String value) {
            addCriterion("felids_value not like", value, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueIn(List<String> values) {
            addCriterion("felids_value in", values, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueNotIn(List<String> values) {
            addCriterion("felids_value not in", values, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueBetween(String value1, String value2) {
            addCriterion("felids_value between", value1, value2, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andFelidsValueNotBetween(String value1, String value2) {
            addCriterion("felids_value not between", value1, value2, "felidsValue");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentIsNull() {
            addCriterion("suspect_percent is null");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentIsNotNull() {
            addCriterion("suspect_percent is not null");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentEqualTo(BigDecimal value) {
            addCriterion("suspect_percent =", value, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentNotEqualTo(BigDecimal value) {
            addCriterion("suspect_percent <>", value, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentGreaterThan(BigDecimal value) {
            addCriterion("suspect_percent >", value, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("suspect_percent >=", value, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentLessThan(BigDecimal value) {
            addCriterion("suspect_percent <", value, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("suspect_percent <=", value, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentIn(List<BigDecimal> values) {
            addCriterion("suspect_percent in", values, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentNotIn(List<BigDecimal> values) {
            addCriterion("suspect_percent not in", values, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suspect_percent between", value1, value2, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andSuspectPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("suspect_percent not between", value1, value2, "suspectPercent");
            return (Criteria) this;
        }

        public Criteria andCntIsNull() {
            addCriterion("cnt is null");
            return (Criteria) this;
        }

        public Criteria andCntIsNotNull() {
            addCriterion("cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCntEqualTo(Long value) {
            addCriterion("cnt =", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntNotEqualTo(Long value) {
            addCriterion("cnt <>", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntGreaterThan(Long value) {
            addCriterion("cnt >", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntGreaterThanOrEqualTo(Long value) {
            addCriterion("cnt >=", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntLessThan(Long value) {
            addCriterion("cnt <", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntLessThanOrEqualTo(Long value) {
            addCriterion("cnt <=", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntIn(List<Long> values) {
            addCriterion("cnt in", values, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntNotIn(List<Long> values) {
            addCriterion("cnt not in", values, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntBetween(Long value1, Long value2) {
            addCriterion("cnt between", value1, value2, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntNotBetween(Long value1, Long value2) {
            addCriterion("cnt not between", value1, value2, "cnt");
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