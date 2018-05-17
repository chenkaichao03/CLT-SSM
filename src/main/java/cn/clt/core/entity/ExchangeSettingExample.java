package cn.clt.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExchangeSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeSettingExample() {
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

        public Criteria andExchangeTypeNameIsNull() {
            addCriterion("exchange_type_name is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameIsNotNull() {
            addCriterion("exchange_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameEqualTo(String value) {
            addCriterion("exchange_type_name =", value, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameNotEqualTo(String value) {
            addCriterion("exchange_type_name <>", value, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameGreaterThan(String value) {
            addCriterion("exchange_type_name >", value, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_type_name >=", value, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameLessThan(String value) {
            addCriterion("exchange_type_name <", value, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameLessThanOrEqualTo(String value) {
            addCriterion("exchange_type_name <=", value, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameLike(String value) {
            addCriterion("exchange_type_name like", value, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameNotLike(String value) {
            addCriterion("exchange_type_name not like", value, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameIn(List<String> values) {
            addCriterion("exchange_type_name in", values, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameNotIn(List<String> values) {
            addCriterion("exchange_type_name not in", values, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameBetween(String value1, String value2) {
            addCriterion("exchange_type_name between", value1, value2, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNameNotBetween(String value1, String value2) {
            addCriterion("exchange_type_name not between", value1, value2, "exchangeTypeName");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberIsNull() {
            addCriterion("exchange_rate_number is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberIsNotNull() {
            addCriterion("exchange_rate_number is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberEqualTo(Integer value) {
            addCriterion("exchange_rate_number =", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberNotEqualTo(Integer value) {
            addCriterion("exchange_rate_number <>", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberGreaterThan(Integer value) {
            addCriterion("exchange_rate_number >", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_rate_number >=", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberLessThan(Integer value) {
            addCriterion("exchange_rate_number <", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_rate_number <=", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberIn(List<Integer> values) {
            addCriterion("exchange_rate_number in", values, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberNotIn(List<Integer> values) {
            addCriterion("exchange_rate_number not in", values, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberBetween(Integer value1, Integer value2) {
            addCriterion("exchange_rate_number between", value1, value2, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_rate_number not between", value1, value2, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyIsNull() {
            addCriterion("exchange_rate_money is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyIsNotNull() {
            addCriterion("exchange_rate_money is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyEqualTo(Integer value) {
            addCriterion("exchange_rate_money =", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyNotEqualTo(Integer value) {
            addCriterion("exchange_rate_money <>", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyGreaterThan(Integer value) {
            addCriterion("exchange_rate_money >", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_rate_money >=", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyLessThan(Integer value) {
            addCriterion("exchange_rate_money <", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_rate_money <=", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyIn(List<Integer> values) {
            addCriterion("exchange_rate_money in", values, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyNotIn(List<Integer> values) {
            addCriterion("exchange_rate_money not in", values, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyBetween(Integer value1, Integer value2) {
            addCriterion("exchange_rate_money between", value1, value2, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_rate_money not between", value1, value2, "exchangeRateMoney");
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

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("create_user_id like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("create_user_id not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
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

        public Criteria andModifyUserIdIsNull() {
            addCriterion("modify_user_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNotNull() {
            addCriterion("modify_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdEqualTo(String value) {
            addCriterion("modify_user_id =", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotEqualTo(String value) {
            addCriterion("modify_user_id <>", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThan(String value) {
            addCriterion("modify_user_id >", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user_id >=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThan(String value) {
            addCriterion("modify_user_id <", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThanOrEqualTo(String value) {
            addCriterion("modify_user_id <=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLike(String value) {
            addCriterion("modify_user_id like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotLike(String value) {
            addCriterion("modify_user_id not like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIn(List<String> values) {
            addCriterion("modify_user_id in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotIn(List<String> values) {
            addCriterion("modify_user_id not in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdBetween(String value1, String value2) {
            addCriterion("modify_user_id between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotBetween(String value1, String value2) {
            addCriterion("modify_user_id not between", value1, value2, "modifyUserId");
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