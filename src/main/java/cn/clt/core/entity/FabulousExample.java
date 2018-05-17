package cn.clt.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FabulousExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FabulousExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(String value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(String value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(String value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(String value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(String value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLike(String value) {
            addCriterion("article_id like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotLike(String value) {
            addCriterion("article_id not like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<String> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<String> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(String value1, String value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(String value1, String value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdIsNull() {
            addCriterion("fabulous_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdIsNotNull() {
            addCriterion("fabulous_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdEqualTo(String value) {
            addCriterion("fabulous_user_id =", value, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdNotEqualTo(String value) {
            addCriterion("fabulous_user_id <>", value, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdGreaterThan(String value) {
            addCriterion("fabulous_user_id >", value, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("fabulous_user_id >=", value, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdLessThan(String value) {
            addCriterion("fabulous_user_id <", value, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdLessThanOrEqualTo(String value) {
            addCriterion("fabulous_user_id <=", value, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdLike(String value) {
            addCriterion("fabulous_user_id like", value, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdNotLike(String value) {
            addCriterion("fabulous_user_id not like", value, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdIn(List<String> values) {
            addCriterion("fabulous_user_id in", values, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdNotIn(List<String> values) {
            addCriterion("fabulous_user_id not in", values, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdBetween(String value1, String value2) {
            addCriterion("fabulous_user_id between", value1, value2, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserIdNotBetween(String value1, String value2) {
            addCriterion("fabulous_user_id not between", value1, value2, "fabulousUserId");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameIsNull() {
            addCriterion("fabulous_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameIsNotNull() {
            addCriterion("fabulous_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameEqualTo(String value) {
            addCriterion("fabulous_user_name =", value, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameNotEqualTo(String value) {
            addCriterion("fabulous_user_name <>", value, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameGreaterThan(String value) {
            addCriterion("fabulous_user_name >", value, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("fabulous_user_name >=", value, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameLessThan(String value) {
            addCriterion("fabulous_user_name <", value, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameLessThanOrEqualTo(String value) {
            addCriterion("fabulous_user_name <=", value, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameLike(String value) {
            addCriterion("fabulous_user_name like", value, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameNotLike(String value) {
            addCriterion("fabulous_user_name not like", value, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameIn(List<String> values) {
            addCriterion("fabulous_user_name in", values, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameNotIn(List<String> values) {
            addCriterion("fabulous_user_name not in", values, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameBetween(String value1, String value2) {
            addCriterion("fabulous_user_name between", value1, value2, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserNameNotBetween(String value1, String value2) {
            addCriterion("fabulous_user_name not between", value1, value2, "fabulousUserName");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureIsNull() {
            addCriterion("fabulous_user_picture is null");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureIsNotNull() {
            addCriterion("fabulous_user_picture is not null");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureEqualTo(String value) {
            addCriterion("fabulous_user_picture =", value, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureNotEqualTo(String value) {
            addCriterion("fabulous_user_picture <>", value, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureGreaterThan(String value) {
            addCriterion("fabulous_user_picture >", value, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureGreaterThanOrEqualTo(String value) {
            addCriterion("fabulous_user_picture >=", value, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureLessThan(String value) {
            addCriterion("fabulous_user_picture <", value, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureLessThanOrEqualTo(String value) {
            addCriterion("fabulous_user_picture <=", value, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureLike(String value) {
            addCriterion("fabulous_user_picture like", value, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureNotLike(String value) {
            addCriterion("fabulous_user_picture not like", value, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureIn(List<String> values) {
            addCriterion("fabulous_user_picture in", values, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureNotIn(List<String> values) {
            addCriterion("fabulous_user_picture not in", values, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureBetween(String value1, String value2) {
            addCriterion("fabulous_user_picture between", value1, value2, "fabulousUserPicture");
            return (Criteria) this;
        }

        public Criteria andFabulousUserPictureNotBetween(String value1, String value2) {
            addCriterion("fabulous_user_picture not between", value1, value2, "fabulousUserPicture");
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

        public Criteria andCareateTimeIsNull() {
            addCriterion("careate_time is null");
            return (Criteria) this;
        }

        public Criteria andCareateTimeIsNotNull() {
            addCriterion("careate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCareateTimeEqualTo(Date value) {
            addCriterion("careate_time =", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeNotEqualTo(Date value) {
            addCriterion("careate_time <>", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeGreaterThan(Date value) {
            addCriterion("careate_time >", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("careate_time >=", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeLessThan(Date value) {
            addCriterion("careate_time <", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeLessThanOrEqualTo(Date value) {
            addCriterion("careate_time <=", value, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeIn(List<Date> values) {
            addCriterion("careate_time in", values, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeNotIn(List<Date> values) {
            addCriterion("careate_time not in", values, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeBetween(Date value1, Date value2) {
            addCriterion("careate_time between", value1, value2, "careateTime");
            return (Criteria) this;
        }

        public Criteria andCareateTimeNotBetween(Date value1, Date value2) {
            addCriterion("careate_time not between", value1, value2, "careateTime");
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