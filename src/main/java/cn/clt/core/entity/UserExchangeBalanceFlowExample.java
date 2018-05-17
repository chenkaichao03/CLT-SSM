package cn.clt.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExchangeBalanceFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExchangeBalanceFlowExample() {
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

        public Criteria andCommentBalanceBeforeIsNull() {
            addCriterion("comment_balance_before is null");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeIsNotNull() {
            addCriterion("comment_balance_before is not null");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeEqualTo(Integer value) {
            addCriterion("comment_balance_before =", value, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeNotEqualTo(Integer value) {
            addCriterion("comment_balance_before <>", value, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeGreaterThan(Integer value) {
            addCriterion("comment_balance_before >", value, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_balance_before >=", value, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeLessThan(Integer value) {
            addCriterion("comment_balance_before <", value, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("comment_balance_before <=", value, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeIn(List<Integer> values) {
            addCriterion("comment_balance_before in", values, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeNotIn(List<Integer> values) {
            addCriterion("comment_balance_before not in", values, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeBetween(Integer value1, Integer value2) {
            addCriterion("comment_balance_before between", value1, value2, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_balance_before not between", value1, value2, "commentBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterIsNull() {
            addCriterion("comment_balance_after is null");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterIsNotNull() {
            addCriterion("comment_balance_after is not null");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterEqualTo(Integer value) {
            addCriterion("comment_balance_after =", value, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterNotEqualTo(Integer value) {
            addCriterion("comment_balance_after <>", value, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterGreaterThan(Integer value) {
            addCriterion("comment_balance_after >", value, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_balance_after >=", value, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterLessThan(Integer value) {
            addCriterion("comment_balance_after <", value, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterLessThanOrEqualTo(Integer value) {
            addCriterion("comment_balance_after <=", value, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterIn(List<Integer> values) {
            addCriterion("comment_balance_after in", values, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterNotIn(List<Integer> values) {
            addCriterion("comment_balance_after not in", values, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterBetween(Integer value1, Integer value2) {
            addCriterion("comment_balance_after between", value1, value2, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andCommentBalanceAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_balance_after not between", value1, value2, "commentBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeIsNull() {
            addCriterion("fans_balance_before is null");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeIsNotNull() {
            addCriterion("fans_balance_before is not null");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeEqualTo(Integer value) {
            addCriterion("fans_balance_before =", value, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeNotEqualTo(Integer value) {
            addCriterion("fans_balance_before <>", value, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeGreaterThan(Integer value) {
            addCriterion("fans_balance_before >", value, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_balance_before >=", value, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeLessThan(Integer value) {
            addCriterion("fans_balance_before <", value, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("fans_balance_before <=", value, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeIn(List<Integer> values) {
            addCriterion("fans_balance_before in", values, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeNotIn(List<Integer> values) {
            addCriterion("fans_balance_before not in", values, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeBetween(Integer value1, Integer value2) {
            addCriterion("fans_balance_before between", value1, value2, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_balance_before not between", value1, value2, "fansBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterIsNull() {
            addCriterion("fans_balance_after is null");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterIsNotNull() {
            addCriterion("fans_balance_after is not null");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterEqualTo(Integer value) {
            addCriterion("fans_balance_after =", value, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterNotEqualTo(Integer value) {
            addCriterion("fans_balance_after <>", value, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterGreaterThan(Integer value) {
            addCriterion("fans_balance_after >", value, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_balance_after >=", value, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterLessThan(Integer value) {
            addCriterion("fans_balance_after <", value, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterLessThanOrEqualTo(Integer value) {
            addCriterion("fans_balance_after <=", value, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterIn(List<Integer> values) {
            addCriterion("fans_balance_after in", values, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterNotIn(List<Integer> values) {
            addCriterion("fans_balance_after not in", values, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterBetween(Integer value1, Integer value2) {
            addCriterion("fans_balance_after between", value1, value2, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFansBalanceAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_balance_after not between", value1, value2, "fansBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeIsNull() {
            addCriterion("browse_balance_before is null");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeIsNotNull() {
            addCriterion("browse_balance_before is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeEqualTo(Integer value) {
            addCriterion("browse_balance_before =", value, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeNotEqualTo(Integer value) {
            addCriterion("browse_balance_before <>", value, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeGreaterThan(Integer value) {
            addCriterion("browse_balance_before >", value, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_balance_before >=", value, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeLessThan(Integer value) {
            addCriterion("browse_balance_before <", value, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("browse_balance_before <=", value, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeIn(List<Integer> values) {
            addCriterion("browse_balance_before in", values, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeNotIn(List<Integer> values) {
            addCriterion("browse_balance_before not in", values, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeBetween(Integer value1, Integer value2) {
            addCriterion("browse_balance_before between", value1, value2, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_balance_before not between", value1, value2, "browseBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterIsNull() {
            addCriterion("browse_balance_after is null");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterIsNotNull() {
            addCriterion("browse_balance_after is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterEqualTo(Integer value) {
            addCriterion("browse_balance_after =", value, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterNotEqualTo(Integer value) {
            addCriterion("browse_balance_after <>", value, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterGreaterThan(Integer value) {
            addCriterion("browse_balance_after >", value, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_balance_after >=", value, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterLessThan(Integer value) {
            addCriterion("browse_balance_after <", value, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterLessThanOrEqualTo(Integer value) {
            addCriterion("browse_balance_after <=", value, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterIn(List<Integer> values) {
            addCriterion("browse_balance_after in", values, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterNotIn(List<Integer> values) {
            addCriterion("browse_balance_after not in", values, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterBetween(Integer value1, Integer value2) {
            addCriterion("browse_balance_after between", value1, value2, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andBrowseBalanceAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_balance_after not between", value1, value2, "browseBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeIsNull() {
            addCriterion("exchange_cout_before is null");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeIsNotNull() {
            addCriterion("exchange_cout_before is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeEqualTo(Integer value) {
            addCriterion("exchange_cout_before =", value, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeNotEqualTo(Integer value) {
            addCriterion("exchange_cout_before <>", value, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeGreaterThan(Integer value) {
            addCriterion("exchange_cout_before >", value, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_cout_before >=", value, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeLessThan(Integer value) {
            addCriterion("exchange_cout_before <", value, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_cout_before <=", value, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeIn(List<Integer> values) {
            addCriterion("exchange_cout_before in", values, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeNotIn(List<Integer> values) {
            addCriterion("exchange_cout_before not in", values, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeBetween(Integer value1, Integer value2) {
            addCriterion("exchange_cout_before between", value1, value2, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCoutBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_cout_before not between", value1, value2, "exchangeCoutBefore");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterIsNull() {
            addCriterion("exchange_count_after is null");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterIsNotNull() {
            addCriterion("exchange_count_after is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterEqualTo(Integer value) {
            addCriterion("exchange_count_after =", value, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterNotEqualTo(Integer value) {
            addCriterion("exchange_count_after <>", value, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterGreaterThan(Integer value) {
            addCriterion("exchange_count_after >", value, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_count_after >=", value, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterLessThan(Integer value) {
            addCriterion("exchange_count_after <", value, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_count_after <=", value, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterIn(List<Integer> values) {
            addCriterion("exchange_count_after in", values, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterNotIn(List<Integer> values) {
            addCriterion("exchange_count_after not in", values, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterBetween(Integer value1, Integer value2) {
            addCriterion("exchange_count_after between", value1, value2, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andExchangeCountAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_count_after not between", value1, value2, "exchangeCountAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeIsNull() {
            addCriterion("fabulous_balance_before is null");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeIsNotNull() {
            addCriterion("fabulous_balance_before is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeEqualTo(Integer value) {
            addCriterion("fabulous_balance_before =", value, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeNotEqualTo(Integer value) {
            addCriterion("fabulous_balance_before <>", value, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeGreaterThan(Integer value) {
            addCriterion("fabulous_balance_before >", value, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous_balance_before >=", value, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeLessThan(Integer value) {
            addCriterion("fabulous_balance_before <", value, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous_balance_before <=", value, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeIn(List<Integer> values) {
            addCriterion("fabulous_balance_before in", values, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeNotIn(List<Integer> values) {
            addCriterion("fabulous_balance_before not in", values, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_balance_before between", value1, value2, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceBeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_balance_before not between", value1, value2, "fabulousBalanceBefore");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterIsNull() {
            addCriterion("fabulous_balance_after is null");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterIsNotNull() {
            addCriterion("fabulous_balance_after is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterEqualTo(Integer value) {
            addCriterion("fabulous_balance_after =", value, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterNotEqualTo(Integer value) {
            addCriterion("fabulous_balance_after <>", value, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterGreaterThan(Integer value) {
            addCriterion("fabulous_balance_after >", value, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterGreaterThanOrEqualTo(Integer value) {
            addCriterion("fabulous_balance_after >=", value, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterLessThan(Integer value) {
            addCriterion("fabulous_balance_after <", value, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterLessThanOrEqualTo(Integer value) {
            addCriterion("fabulous_balance_after <=", value, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterIn(List<Integer> values) {
            addCriterion("fabulous_balance_after in", values, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterNotIn(List<Integer> values) {
            addCriterion("fabulous_balance_after not in", values, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_balance_after between", value1, value2, "fabulousBalanceAfter");
            return (Criteria) this;
        }

        public Criteria andFabulousBalanceAfterNotBetween(Integer value1, Integer value2) {
            addCriterion("fabulous_balance_after not between", value1, value2, "fabulousBalanceAfter");
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