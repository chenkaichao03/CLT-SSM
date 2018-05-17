package cn.clt.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExchangeBalanceFlowDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExchangeBalanceFlowDetailExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(String value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(String value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(String value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(String value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(String value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLike(String value) {
            addCriterion("flow_id like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotLike(String value) {
            addCriterion("flow_id not like", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<String> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<String> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(String value1, String value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(String value1, String value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNull() {
            addCriterion("exchange_id is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNotNull() {
            addCriterion("exchange_id is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdEqualTo(String value) {
            addCriterion("exchange_id =", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotEqualTo(String value) {
            addCriterion("exchange_id <>", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThan(String value) {
            addCriterion("exchange_id >", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_id >=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThan(String value) {
            addCriterion("exchange_id <", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThanOrEqualTo(String value) {
            addCriterion("exchange_id <=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLike(String value) {
            addCriterion("exchange_id like", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotLike(String value) {
            addCriterion("exchange_id not like", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIn(List<String> values) {
            addCriterion("exchange_id in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotIn(List<String> values) {
            addCriterion("exchange_id not in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdBetween(String value1, String value2) {
            addCriterion("exchange_id between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotBetween(String value1, String value2) {
            addCriterion("exchange_id not between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNull() {
            addCriterion("exchange_type is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNotNull() {
            addCriterion("exchange_type is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeEqualTo(String value) {
            addCriterion("exchange_type =", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotEqualTo(String value) {
            addCriterion("exchange_type <>", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThan(String value) {
            addCriterion("exchange_type >", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_type >=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThan(String value) {
            addCriterion("exchange_type <", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThanOrEqualTo(String value) {
            addCriterion("exchange_type <=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLike(String value) {
            addCriterion("exchange_type like", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotLike(String value) {
            addCriterion("exchange_type not like", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIn(List<String> values) {
            addCriterion("exchange_type in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotIn(List<String> values) {
            addCriterion("exchange_type not in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeBetween(String value1, String value2) {
            addCriterion("exchange_type between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotBetween(String value1, String value2) {
            addCriterion("exchange_type not between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeNameIsNull() {
            addCriterion("exchange_name is null");
            return (Criteria) this;
        }

        public Criteria andExchangeNameIsNotNull() {
            addCriterion("exchange_name is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeNameEqualTo(String value) {
            addCriterion("exchange_name =", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameNotEqualTo(String value) {
            addCriterion("exchange_name <>", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameGreaterThan(String value) {
            addCriterion("exchange_name >", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_name >=", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameLessThan(String value) {
            addCriterion("exchange_name <", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameLessThanOrEqualTo(String value) {
            addCriterion("exchange_name <=", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameLike(String value) {
            addCriterion("exchange_name like", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameNotLike(String value) {
            addCriterion("exchange_name not like", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameIn(List<String> values) {
            addCriterion("exchange_name in", values, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameNotIn(List<String> values) {
            addCriterion("exchange_name not in", values, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameBetween(String value1, String value2) {
            addCriterion("exchange_name between", value1, value2, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameNotBetween(String value1, String value2) {
            addCriterion("exchange_name not between", value1, value2, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeIsNull() {
            addCriterion("exchange_money_before is null");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeIsNotNull() {
            addCriterion("exchange_money_before is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeEqualTo(BigDecimal value) {
            addCriterion("exchange_money_before =", value, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("exchange_money_before <>", value, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeGreaterThan(BigDecimal value) {
            addCriterion("exchange_money_before >", value, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_money_before >=", value, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeLessThan(BigDecimal value) {
            addCriterion("exchange_money_before <", value, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_money_before <=", value, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeIn(List<BigDecimal> values) {
            addCriterion("exchange_money_before in", values, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("exchange_money_before not in", values, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_money_before between", value1, value2, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_money_before not between", value1, value2, "exchangeMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterIsNull() {
            addCriterion("exchange_money_after is null");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterIsNotNull() {
            addCriterion("exchange_money_after is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterEqualTo(BigDecimal value) {
            addCriterion("exchange_money_after =", value, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterNotEqualTo(BigDecimal value) {
            addCriterion("exchange_money_after <>", value, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterGreaterThan(BigDecimal value) {
            addCriterion("exchange_money_after >", value, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_money_after >=", value, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterLessThan(BigDecimal value) {
            addCriterion("exchange_money_after <", value, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_money_after <=", value, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterIn(List<BigDecimal> values) {
            addCriterion("exchange_money_after in", values, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterNotIn(List<BigDecimal> values) {
            addCriterion("exchange_money_after not in", values, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_money_after between", value1, value2, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_money_after not between", value1, value2, "exchangeMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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