package cn.clt.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExchangeExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNull() {
            addCriterion("user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("user_real_name =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("user_real_name <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("user_real_name >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_name >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("user_real_name <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("user_real_name <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("user_real_name like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("user_real_name not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("user_real_name in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("user_real_name not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("user_real_name between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("user_real_name not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
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

        public Criteria andExchangeRateNumberEqualTo(BigDecimal value) {
            addCriterion("exchange_rate_number =", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate_number <>", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate_number >", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate_number >=", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberLessThan(BigDecimal value) {
            addCriterion("exchange_rate_number <", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate_number <=", value, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberIn(List<BigDecimal> values) {
            addCriterion("exchange_rate_number in", values, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate_number not in", values, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate_number between", value1, value2, "exchangeRateNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNumberNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andExchangeRateMoneyEqualTo(BigDecimal value) {
            addCriterion("exchange_rate_money =", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate_money <>", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate_money >", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate_money >=", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyLessThan(BigDecimal value) {
            addCriterion("exchange_rate_money <", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate_money <=", value, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyIn(List<BigDecimal> values) {
            addCriterion("exchange_rate_money in", values, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate_money not in", values, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate_money between", value1, value2, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeRateMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate_money not between", value1, value2, "exchangeRateMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberIsNull() {
            addCriterion("exchange_amount_number is null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberIsNotNull() {
            addCriterion("exchange_amount_number is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberEqualTo(BigDecimal value) {
            addCriterion("exchange_amount_number =", value, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberNotEqualTo(BigDecimal value) {
            addCriterion("exchange_amount_number <>", value, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberGreaterThan(BigDecimal value) {
            addCriterion("exchange_amount_number >", value, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_amount_number >=", value, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberLessThan(BigDecimal value) {
            addCriterion("exchange_amount_number <", value, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_amount_number <=", value, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberIn(List<BigDecimal> values) {
            addCriterion("exchange_amount_number in", values, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberNotIn(List<BigDecimal> values) {
            addCriterion("exchange_amount_number not in", values, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_amount_number between", value1, value2, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_amount_number not between", value1, value2, "exchangeAmountNumber");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyIsNull() {
            addCriterion("exchange_amount_money is null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyIsNotNull() {
            addCriterion("exchange_amount_money is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyEqualTo(BigDecimal value) {
            addCriterion("exchange_amount_money =", value, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyNotEqualTo(BigDecimal value) {
            addCriterion("exchange_amount_money <>", value, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyGreaterThan(BigDecimal value) {
            addCriterion("exchange_amount_money >", value, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_amount_money >=", value, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyLessThan(BigDecimal value) {
            addCriterion("exchange_amount_money <", value, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_amount_money <=", value, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyIn(List<BigDecimal> values) {
            addCriterion("exchange_amount_money in", values, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyNotIn(List<BigDecimal> values) {
            addCriterion("exchange_amount_money not in", values, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_amount_money between", value1, value2, "exchangeAmountMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_amount_money not between", value1, value2, "exchangeAmountMoney");
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