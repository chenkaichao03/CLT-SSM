package cn.clt.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExchangeBalanceAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExchangeBalanceAccountExample() {
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

        public Criteria andFansExchangeNumberIsNull() {
            addCriterion("fans_exchange_number is null");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberIsNotNull() {
            addCriterion("fans_exchange_number is not null");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberEqualTo(Integer value) {
            addCriterion("fans_exchange_number =", value, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberNotEqualTo(Integer value) {
            addCriterion("fans_exchange_number <>", value, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberGreaterThan(Integer value) {
            addCriterion("fans_exchange_number >", value, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_exchange_number >=", value, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberLessThan(Integer value) {
            addCriterion("fans_exchange_number <", value, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("fans_exchange_number <=", value, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberIn(List<Integer> values) {
            addCriterion("fans_exchange_number in", values, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberNotIn(List<Integer> values) {
            addCriterion("fans_exchange_number not in", values, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberBetween(Integer value1, Integer value2) {
            addCriterion("fans_exchange_number between", value1, value2, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansExchangeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_exchange_number not between", value1, value2, "fansExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceIsNull() {
            addCriterion("fans_before_balance is null");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceIsNotNull() {
            addCriterion("fans_before_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceEqualTo(Integer value) {
            addCriterion("fans_before_balance =", value, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceNotEqualTo(Integer value) {
            addCriterion("fans_before_balance <>", value, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceGreaterThan(Integer value) {
            addCriterion("fans_before_balance >", value, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_before_balance >=", value, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceLessThan(Integer value) {
            addCriterion("fans_before_balance <", value, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("fans_before_balance <=", value, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceIn(List<Integer> values) {
            addCriterion("fans_before_balance in", values, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceNotIn(List<Integer> values) {
            addCriterion("fans_before_balance not in", values, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceBetween(Integer value1, Integer value2) {
            addCriterion("fans_before_balance between", value1, value2, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansBeforeBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_before_balance not between", value1, value2, "fansBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceIsNull() {
            addCriterion("fans_after_balance is null");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceIsNotNull() {
            addCriterion("fans_after_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceEqualTo(Integer value) {
            addCriterion("fans_after_balance =", value, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceNotEqualTo(Integer value) {
            addCriterion("fans_after_balance <>", value, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceGreaterThan(Integer value) {
            addCriterion("fans_after_balance >", value, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_after_balance >=", value, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceLessThan(Integer value) {
            addCriterion("fans_after_balance <", value, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("fans_after_balance <=", value, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceIn(List<Integer> values) {
            addCriterion("fans_after_balance in", values, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceNotIn(List<Integer> values) {
            addCriterion("fans_after_balance not in", values, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceBetween(Integer value1, Integer value2) {
            addCriterion("fans_after_balance between", value1, value2, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFansAfterBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_after_balance not between", value1, value2, "fansAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberIsNull() {
            addCriterion("browse_exchange_number is null");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberIsNotNull() {
            addCriterion("browse_exchange_number is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberEqualTo(Integer value) {
            addCriterion("browse_exchange_number =", value, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberNotEqualTo(Integer value) {
            addCriterion("browse_exchange_number <>", value, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberGreaterThan(Integer value) {
            addCriterion("browse_exchange_number >", value, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_exchange_number >=", value, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberLessThan(Integer value) {
            addCriterion("browse_exchange_number <", value, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("browse_exchange_number <=", value, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberIn(List<Integer> values) {
            addCriterion("browse_exchange_number in", values, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberNotIn(List<Integer> values) {
            addCriterion("browse_exchange_number not in", values, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberBetween(Integer value1, Integer value2) {
            addCriterion("browse_exchange_number between", value1, value2, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseExchangeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_exchange_number not between", value1, value2, "browseExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceIsNull() {
            addCriterion("browse_before_balance is null");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceIsNotNull() {
            addCriterion("browse_before_balance is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceEqualTo(Integer value) {
            addCriterion("browse_before_balance =", value, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceNotEqualTo(Integer value) {
            addCriterion("browse_before_balance <>", value, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceGreaterThan(Integer value) {
            addCriterion("browse_before_balance >", value, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_before_balance >=", value, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceLessThan(Integer value) {
            addCriterion("browse_before_balance <", value, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("browse_before_balance <=", value, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceIn(List<Integer> values) {
            addCriterion("browse_before_balance in", values, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceNotIn(List<Integer> values) {
            addCriterion("browse_before_balance not in", values, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceBetween(Integer value1, Integer value2) {
            addCriterion("browse_before_balance between", value1, value2, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseBeforeBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_before_balance not between", value1, value2, "browseBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceIsNull() {
            addCriterion("browse_after_balance is null");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceIsNotNull() {
            addCriterion("browse_after_balance is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceEqualTo(Integer value) {
            addCriterion("browse_after_balance =", value, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceNotEqualTo(Integer value) {
            addCriterion("browse_after_balance <>", value, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceGreaterThan(Integer value) {
            addCriterion("browse_after_balance >", value, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_after_balance >=", value, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceLessThan(Integer value) {
            addCriterion("browse_after_balance <", value, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("browse_after_balance <=", value, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceIn(List<Integer> values) {
            addCriterion("browse_after_balance in", values, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceNotIn(List<Integer> values) {
            addCriterion("browse_after_balance not in", values, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceBetween(Integer value1, Integer value2) {
            addCriterion("browse_after_balance between", value1, value2, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andBrowseAfterBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_after_balance not between", value1, value2, "browseAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberIsNull() {
            addCriterion("fabulous_exchange_number is null");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberIsNotNull() {
            addCriterion("fabulous_exchange_number is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberEqualTo(Integer value) {
            addCriterion("fabulous_exchange_number =", value, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberNotEqualTo(Integer value) {
            addCriterion("fabulous_exchange_number <>", value, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberGreaterThan(Integer value) {
            addCriterion("fabulous_exchange_number >", value, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous_exchange_number >=", value, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberLessThan(Integer value) {
            addCriterion("fabulous_exchange_number <", value, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous_exchange_number <=", value, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberIn(List<Integer> values) {
            addCriterion("fabulous_exchange_number in", values, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberNotIn(List<Integer> values) {
            addCriterion("fabulous_exchange_number not in", values, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_exchange_number between", value1, value2, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousExchangeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_exchange_number not between", value1, value2, "fabulousExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceIsNull() {
            addCriterion("fabulous_before_balance is null");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceIsNotNull() {
            addCriterion("fabulous_before_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceEqualTo(Integer value) {
            addCriterion("fabulous_before_balance =", value, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceNotEqualTo(Integer value) {
            addCriterion("fabulous_before_balance <>", value, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceGreaterThan(Integer value) {
            addCriterion("fabulous_before_balance >", value, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous_before_balance >=", value, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceLessThan(Integer value) {
            addCriterion("fabulous_before_balance <", value, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous_before_balance <=", value, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceIn(List<Integer> values) {
            addCriterion("fabulous_before_balance in", values, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceNotIn(List<Integer> values) {
            addCriterion("fabulous_before_balance not in", values, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_before_balance between", value1, value2, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousBeforeBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_before_balance not between", value1, value2, "fabulousBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceIsNull() {
            addCriterion("fabulous_after_balance is null");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceIsNotNull() {
            addCriterion("fabulous_after_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceEqualTo(Integer value) {
            addCriterion("fabulous_after_balance =", value, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceNotEqualTo(Integer value) {
            addCriterion("fabulous_after_balance <>", value, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceGreaterThan(Integer value) {
            addCriterion("fabulous_after_balance >", value, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous_after_balance >=", value, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceLessThan(Integer value) {
            addCriterion("fabulous_after_balance <", value, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous_after_balance <=", value, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceIn(List<Integer> values) {
            addCriterion("fabulous_after_balance in", values, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceNotIn(List<Integer> values) {
            addCriterion("fabulous_after_balance not in", values, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_after_balance between", value1, value2, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andFabulousAfterBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_after_balance not between", value1, value2, "fabulousAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberIsNull() {
            addCriterion("comment_exchange_number is null");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberIsNotNull() {
            addCriterion("comment_exchange_number is not null");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberEqualTo(Integer value) {
            addCriterion("comment_exchange_number =", value, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberNotEqualTo(Integer value) {
            addCriterion("comment_exchange_number <>", value, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberGreaterThan(Integer value) {
            addCriterion("comment_exchange_number >", value, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_exchange_number >=", value, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberLessThan(Integer value) {
            addCriterion("comment_exchange_number <", value, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("comment_exchange_number <=", value, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberIn(List<Integer> values) {
            addCriterion("comment_exchange_number in", values, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberNotIn(List<Integer> values) {
            addCriterion("comment_exchange_number not in", values, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberBetween(Integer value1, Integer value2) {
            addCriterion("comment_exchange_number between", value1, value2, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentExchangeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_exchange_number not between", value1, value2, "commentExchangeNumber");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceIsNull() {
            addCriterion("comment_before_balance is null");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceIsNotNull() {
            addCriterion("comment_before_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceEqualTo(Integer value) {
            addCriterion("comment_before_balance =", value, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceNotEqualTo(Integer value) {
            addCriterion("comment_before_balance <>", value, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceGreaterThan(Integer value) {
            addCriterion("comment_before_balance >", value, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_before_balance >=", value, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceLessThan(Integer value) {
            addCriterion("comment_before_balance <", value, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("comment_before_balance <=", value, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceIn(List<Integer> values) {
            addCriterion("comment_before_balance in", values, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceNotIn(List<Integer> values) {
            addCriterion("comment_before_balance not in", values, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceBetween(Integer value1, Integer value2) {
            addCriterion("comment_before_balance between", value1, value2, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentBeforeBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_before_balance not between", value1, value2, "commentBeforeBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceIsNull() {
            addCriterion("comment_after_balance is null");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceIsNotNull() {
            addCriterion("comment_after_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceEqualTo(Integer value) {
            addCriterion("comment_after_balance =", value, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceNotEqualTo(Integer value) {
            addCriterion("comment_after_balance <>", value, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceGreaterThan(Integer value) {
            addCriterion("comment_after_balance >", value, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_after_balance >=", value, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceLessThan(Integer value) {
            addCriterion("comment_after_balance <", value, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("comment_after_balance <=", value, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceIn(List<Integer> values) {
            addCriterion("comment_after_balance in", values, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceNotIn(List<Integer> values) {
            addCriterion("comment_after_balance not in", values, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceBetween(Integer value1, Integer value2) {
            addCriterion("comment_after_balance between", value1, value2, "commentAfterBalance");
            return (Criteria) this;
        }

        public Criteria andCommentAfterBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_after_balance not between", value1, value2, "commentAfterBalance");
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