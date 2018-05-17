package cn.clt.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BadReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BadReviewExample() {
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

        public Criteria andReviewIdIsNull() {
            addCriterion("review_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNotNull() {
            addCriterion("review_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIdEqualTo(String value) {
            addCriterion("review_id =", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotEqualTo(String value) {
            addCriterion("review_id <>", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThan(String value) {
            addCriterion("review_id >", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThanOrEqualTo(String value) {
            addCriterion("review_id >=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThan(String value) {
            addCriterion("review_id <", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThanOrEqualTo(String value) {
            addCriterion("review_id <=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLike(String value) {
            addCriterion("review_id like", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotLike(String value) {
            addCriterion("review_id not like", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdIn(List<String> values) {
            addCriterion("review_id in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotIn(List<String> values) {
            addCriterion("review_id not in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdBetween(String value1, String value2) {
            addCriterion("review_id between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotBetween(String value1, String value2) {
            addCriterion("review_id not between", value1, value2, "reviewId");
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

        public Criteria andBadReviewUserIdIsNull() {
            addCriterion("bad_review_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdIsNotNull() {
            addCriterion("bad_review_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdEqualTo(String value) {
            addCriterion("bad_review_user_id =", value, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdNotEqualTo(String value) {
            addCriterion("bad_review_user_id <>", value, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdGreaterThan(String value) {
            addCriterion("bad_review_user_id >", value, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("bad_review_user_id >=", value, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdLessThan(String value) {
            addCriterion("bad_review_user_id <", value, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdLessThanOrEqualTo(String value) {
            addCriterion("bad_review_user_id <=", value, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdLike(String value) {
            addCriterion("bad_review_user_id like", value, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdNotLike(String value) {
            addCriterion("bad_review_user_id not like", value, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdIn(List<String> values) {
            addCriterion("bad_review_user_id in", values, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdNotIn(List<String> values) {
            addCriterion("bad_review_user_id not in", values, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdBetween(String value1, String value2) {
            addCriterion("bad_review_user_id between", value1, value2, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserIdNotBetween(String value1, String value2) {
            addCriterion("bad_review_user_id not between", value1, value2, "badReviewUserId");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureIsNull() {
            addCriterion("bad_review_user_picture is null");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureIsNotNull() {
            addCriterion("bad_review_user_picture is not null");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureEqualTo(String value) {
            addCriterion("bad_review_user_picture =", value, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureNotEqualTo(String value) {
            addCriterion("bad_review_user_picture <>", value, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureGreaterThan(String value) {
            addCriterion("bad_review_user_picture >", value, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureGreaterThanOrEqualTo(String value) {
            addCriterion("bad_review_user_picture >=", value, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureLessThan(String value) {
            addCriterion("bad_review_user_picture <", value, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureLessThanOrEqualTo(String value) {
            addCriterion("bad_review_user_picture <=", value, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureLike(String value) {
            addCriterion("bad_review_user_picture like", value, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureNotLike(String value) {
            addCriterion("bad_review_user_picture not like", value, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureIn(List<String> values) {
            addCriterion("bad_review_user_picture in", values, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureNotIn(List<String> values) {
            addCriterion("bad_review_user_picture not in", values, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureBetween(String value1, String value2) {
            addCriterion("bad_review_user_picture between", value1, value2, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserPictureNotBetween(String value1, String value2) {
            addCriterion("bad_review_user_picture not between", value1, value2, "badReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameIsNull() {
            addCriterion("bad_review_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameIsNotNull() {
            addCriterion("bad_review_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameEqualTo(String value) {
            addCriterion("bad_review_user_name =", value, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameNotEqualTo(String value) {
            addCriterion("bad_review_user_name <>", value, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameGreaterThan(String value) {
            addCriterion("bad_review_user_name >", value, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("bad_review_user_name >=", value, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameLessThan(String value) {
            addCriterion("bad_review_user_name <", value, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameLessThanOrEqualTo(String value) {
            addCriterion("bad_review_user_name <=", value, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameLike(String value) {
            addCriterion("bad_review_user_name like", value, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameNotLike(String value) {
            addCriterion("bad_review_user_name not like", value, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameIn(List<String> values) {
            addCriterion("bad_review_user_name in", values, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameNotIn(List<String> values) {
            addCriterion("bad_review_user_name not in", values, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameBetween(String value1, String value2) {
            addCriterion("bad_review_user_name between", value1, value2, "badReviewUserName");
            return (Criteria) this;
        }

        public Criteria andBadReviewUserNameNotBetween(String value1, String value2) {
            addCriterion("bad_review_user_name not between", value1, value2, "badReviewUserName");
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