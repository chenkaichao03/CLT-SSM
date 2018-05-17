package cn.clt.core.entity;

import java.util.ArrayList;
import java.util.List;

public class ConcernExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConcernExample() {
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

        public Criteria andConcernUserIsNull() {
            addCriterion("concern_user is null");
            return (Criteria) this;
        }

        public Criteria andConcernUserIsNotNull() {
            addCriterion("concern_user is not null");
            return (Criteria) this;
        }

        public Criteria andConcernUserEqualTo(String value) {
            addCriterion("concern_user =", value, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserNotEqualTo(String value) {
            addCriterion("concern_user <>", value, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserGreaterThan(String value) {
            addCriterion("concern_user >", value, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserGreaterThanOrEqualTo(String value) {
            addCriterion("concern_user >=", value, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserLessThan(String value) {
            addCriterion("concern_user <", value, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserLessThanOrEqualTo(String value) {
            addCriterion("concern_user <=", value, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserLike(String value) {
            addCriterion("concern_user like", value, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserNotLike(String value) {
            addCriterion("concern_user not like", value, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserIn(List<String> values) {
            addCriterion("concern_user in", values, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserNotIn(List<String> values) {
            addCriterion("concern_user not in", values, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserBetween(String value1, String value2) {
            addCriterion("concern_user between", value1, value2, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernUserNotBetween(String value1, String value2) {
            addCriterion("concern_user not between", value1, value2, "concernUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserIsNull() {
            addCriterion("concerned_user is null");
            return (Criteria) this;
        }

        public Criteria andConcernedUserIsNotNull() {
            addCriterion("concerned_user is not null");
            return (Criteria) this;
        }

        public Criteria andConcernedUserEqualTo(String value) {
            addCriterion("concerned_user =", value, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserNotEqualTo(String value) {
            addCriterion("concerned_user <>", value, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserGreaterThan(String value) {
            addCriterion("concerned_user >", value, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserGreaterThanOrEqualTo(String value) {
            addCriterion("concerned_user >=", value, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserLessThan(String value) {
            addCriterion("concerned_user <", value, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserLessThanOrEqualTo(String value) {
            addCriterion("concerned_user <=", value, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserLike(String value) {
            addCriterion("concerned_user like", value, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserNotLike(String value) {
            addCriterion("concerned_user not like", value, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserIn(List<String> values) {
            addCriterion("concerned_user in", values, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserNotIn(List<String> values) {
            addCriterion("concerned_user not in", values, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserBetween(String value1, String value2) {
            addCriterion("concerned_user between", value1, value2, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernedUserNotBetween(String value1, String value2) {
            addCriterion("concerned_user not between", value1, value2, "concernedUser");
            return (Criteria) this;
        }

        public Criteria andConcernTypeIsNull() {
            addCriterion("concern_type is null");
            return (Criteria) this;
        }

        public Criteria andConcernTypeIsNotNull() {
            addCriterion("concern_type is not null");
            return (Criteria) this;
        }

        public Criteria andConcernTypeEqualTo(Integer value) {
            addCriterion("concern_type =", value, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeNotEqualTo(Integer value) {
            addCriterion("concern_type <>", value, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeGreaterThan(Integer value) {
            addCriterion("concern_type >", value, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("concern_type >=", value, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeLessThan(Integer value) {
            addCriterion("concern_type <", value, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeLessThanOrEqualTo(Integer value) {
            addCriterion("concern_type <=", value, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeIn(List<Integer> values) {
            addCriterion("concern_type in", values, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeNotIn(List<Integer> values) {
            addCriterion("concern_type not in", values, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeBetween(Integer value1, Integer value2) {
            addCriterion("concern_type between", value1, value2, "concernType");
            return (Criteria) this;
        }

        public Criteria andConcernTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("concern_type not between", value1, value2, "concernType");
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