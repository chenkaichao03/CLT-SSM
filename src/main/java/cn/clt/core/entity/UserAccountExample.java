package cn.clt.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountExample() {
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

        public Criteria andUserAmoutMoneyIsNull() {
            addCriterion("user_amout_money is null");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyIsNotNull() {
            addCriterion("user_amout_money is not null");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyEqualTo(BigDecimal value) {
            addCriterion("user_amout_money =", value, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyNotEqualTo(BigDecimal value) {
            addCriterion("user_amout_money <>", value, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyGreaterThan(BigDecimal value) {
            addCriterion("user_amout_money >", value, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_amout_money >=", value, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyLessThan(BigDecimal value) {
            addCriterion("user_amout_money <", value, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_amout_money <=", value, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyIn(List<BigDecimal> values) {
            addCriterion("user_amout_money in", values, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyNotIn(List<BigDecimal> values) {
            addCriterion("user_amout_money not in", values, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_amout_money between", value1, value2, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmoutMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_amout_money not between", value1, value2, "userAmoutMoney");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernIsNull() {
            addCriterion("user_total_concern is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernIsNotNull() {
            addCriterion("user_total_concern is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernEqualTo(Integer value) {
            addCriterion("user_total_concern =", value, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernNotEqualTo(Integer value) {
            addCriterion("user_total_concern <>", value, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernGreaterThan(Integer value) {
            addCriterion("user_total_concern >", value, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_total_concern >=", value, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernLessThan(Integer value) {
            addCriterion("user_total_concern <", value, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernLessThanOrEqualTo(Integer value) {
            addCriterion("user_total_concern <=", value, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernIn(List<Integer> values) {
            addCriterion("user_total_concern in", values, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernNotIn(List<Integer> values) {
            addCriterion("user_total_concern not in", values, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernBetween(Integer value1, Integer value2) {
            addCriterion("user_total_concern between", value1, value2, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalConcernNotBetween(Integer value1, Integer value2) {
            addCriterion("user_total_concern not between", value1, value2, "userTotalConcern");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansIsNull() {
            addCriterion("user_total_fans is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansIsNotNull() {
            addCriterion("user_total_fans is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansEqualTo(Integer value) {
            addCriterion("user_total_fans =", value, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansNotEqualTo(Integer value) {
            addCriterion("user_total_fans <>", value, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansGreaterThan(Integer value) {
            addCriterion("user_total_fans >", value, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_total_fans >=", value, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansLessThan(Integer value) {
            addCriterion("user_total_fans <", value, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansLessThanOrEqualTo(Integer value) {
            addCriterion("user_total_fans <=", value, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansIn(List<Integer> values) {
            addCriterion("user_total_fans in", values, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansNotIn(List<Integer> values) {
            addCriterion("user_total_fans not in", values, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansBetween(Integer value1, Integer value2) {
            addCriterion("user_total_fans between", value1, value2, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalFansNotBetween(Integer value1, Integer value2) {
            addCriterion("user_total_fans not between", value1, value2, "userTotalFans");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseIsNull() {
            addCriterion("user_total_browse is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseIsNotNull() {
            addCriterion("user_total_browse is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseEqualTo(Integer value) {
            addCriterion("user_total_browse =", value, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseNotEqualTo(Integer value) {
            addCriterion("user_total_browse <>", value, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseGreaterThan(Integer value) {
            addCriterion("user_total_browse >", value, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_total_browse >=", value, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseLessThan(Integer value) {
            addCriterion("user_total_browse <", value, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseLessThanOrEqualTo(Integer value) {
            addCriterion("user_total_browse <=", value, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseIn(List<Integer> values) {
            addCriterion("user_total_browse in", values, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseNotIn(List<Integer> values) {
            addCriterion("user_total_browse not in", values, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseBetween(Integer value1, Integer value2) {
            addCriterion("user_total_browse between", value1, value2, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalBrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("user_total_browse not between", value1, value2, "userTotalBrowse");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentIsNull() {
            addCriterion("user_total_comment is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentIsNotNull() {
            addCriterion("user_total_comment is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentEqualTo(Integer value) {
            addCriterion("user_total_comment =", value, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentNotEqualTo(Integer value) {
            addCriterion("user_total_comment <>", value, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentGreaterThan(Integer value) {
            addCriterion("user_total_comment >", value, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_total_comment >=", value, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentLessThan(Integer value) {
            addCriterion("user_total_comment <", value, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentLessThanOrEqualTo(Integer value) {
            addCriterion("user_total_comment <=", value, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentIn(List<Integer> values) {
            addCriterion("user_total_comment in", values, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentNotIn(List<Integer> values) {
            addCriterion("user_total_comment not in", values, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentBetween(Integer value1, Integer value2) {
            addCriterion("user_total_comment between", value1, value2, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("user_total_comment not between", value1, value2, "userTotalComment");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralIsNull() {
            addCriterion("user_total_integral is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralIsNotNull() {
            addCriterion("user_total_integral is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralEqualTo(BigDecimal value) {
            addCriterion("user_total_integral =", value, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralNotEqualTo(BigDecimal value) {
            addCriterion("user_total_integral <>", value, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralGreaterThan(BigDecimal value) {
            addCriterion("user_total_integral >", value, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_total_integral >=", value, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralLessThan(BigDecimal value) {
            addCriterion("user_total_integral <", value, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_total_integral <=", value, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralIn(List<BigDecimal> values) {
            addCriterion("user_total_integral in", values, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralNotIn(List<BigDecimal> values) {
            addCriterion("user_total_integral not in", values, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_total_integral between", value1, value2, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalIntegralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_total_integral not between", value1, value2, "userTotalIntegral");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeIsNull() {
            addCriterion("user_total_consume is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeIsNotNull() {
            addCriterion("user_total_consume is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeEqualTo(BigDecimal value) {
            addCriterion("user_total_consume =", value, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeNotEqualTo(BigDecimal value) {
            addCriterion("user_total_consume <>", value, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeGreaterThan(BigDecimal value) {
            addCriterion("user_total_consume >", value, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_total_consume >=", value, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeLessThan(BigDecimal value) {
            addCriterion("user_total_consume <", value, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_total_consume <=", value, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeIn(List<BigDecimal> values) {
            addCriterion("user_total_consume in", values, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeNotIn(List<BigDecimal> values) {
            addCriterion("user_total_consume not in", values, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_total_consume between", value1, value2, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalConsumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_total_consume not between", value1, value2, "userTotalConsume");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeIsNull() {
            addCriterion("user_total_recharge is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeIsNotNull() {
            addCriterion("user_total_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeEqualTo(BigDecimal value) {
            addCriterion("user_total_recharge =", value, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeNotEqualTo(BigDecimal value) {
            addCriterion("user_total_recharge <>", value, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeGreaterThan(BigDecimal value) {
            addCriterion("user_total_recharge >", value, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_total_recharge >=", value, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeLessThan(BigDecimal value) {
            addCriterion("user_total_recharge <", value, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_total_recharge <=", value, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeIn(List<BigDecimal> values) {
            addCriterion("user_total_recharge in", values, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeNotIn(List<BigDecimal> values) {
            addCriterion("user_total_recharge not in", values, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_total_recharge between", value1, value2, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalRechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_total_recharge not between", value1, value2, "userTotalRecharge");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousIsNull() {
            addCriterion("user_total_fabulous is null");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousIsNotNull() {
            addCriterion("user_total_fabulous is not null");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousEqualTo(Integer value) {
            addCriterion("user_total_fabulous =", value, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousNotEqualTo(Integer value) {
            addCriterion("user_total_fabulous <>", value, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousGreaterThan(Integer value) {
            addCriterion("user_total_fabulous >", value, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_total_fabulous >=", value, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousLessThan(Integer value) {
            addCriterion("user_total_fabulous <", value, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousLessThanOrEqualTo(Integer value) {
            addCriterion("user_total_fabulous <=", value, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousIn(List<Integer> values) {
            addCriterion("user_total_fabulous in", values, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousNotIn(List<Integer> values) {
            addCriterion("user_total_fabulous not in", values, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousBetween(Integer value1, Integer value2) {
            addCriterion("user_total_fabulous between", value1, value2, "userTotalFabulous");
            return (Criteria) this;
        }

        public Criteria andUserTotalFabulousNotBetween(Integer value1, Integer value2) {
            addCriterion("user_total_fabulous not between", value1, value2, "userTotalFabulous");
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