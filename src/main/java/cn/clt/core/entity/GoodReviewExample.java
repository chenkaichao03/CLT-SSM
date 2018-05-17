package cn.clt.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodReviewExample() {
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

        public Criteria andGoodReviewUserIdIsNull() {
            addCriterion("good_review_user_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdIsNotNull() {
            addCriterion("good_review_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdEqualTo(String value) {
            addCriterion("good_review_user_id =", value, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdNotEqualTo(String value) {
            addCriterion("good_review_user_id <>", value, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdGreaterThan(String value) {
            addCriterion("good_review_user_id >", value, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("good_review_user_id >=", value, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdLessThan(String value) {
            addCriterion("good_review_user_id <", value, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdLessThanOrEqualTo(String value) {
            addCriterion("good_review_user_id <=", value, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdLike(String value) {
            addCriterion("good_review_user_id like", value, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdNotLike(String value) {
            addCriterion("good_review_user_id not like", value, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdIn(List<String> values) {
            addCriterion("good_review_user_id in", values, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdNotIn(List<String> values) {
            addCriterion("good_review_user_id not in", values, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdBetween(String value1, String value2) {
            addCriterion("good_review_user_id between", value1, value2, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserIdNotBetween(String value1, String value2) {
            addCriterion("good_review_user_id not between", value1, value2, "goodReviewUserId");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureIsNull() {
            addCriterion("good_review_user_picture is null");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureIsNotNull() {
            addCriterion("good_review_user_picture is not null");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureEqualTo(String value) {
            addCriterion("good_review_user_picture =", value, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureNotEqualTo(String value) {
            addCriterion("good_review_user_picture <>", value, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureGreaterThan(String value) {
            addCriterion("good_review_user_picture >", value, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureGreaterThanOrEqualTo(String value) {
            addCriterion("good_review_user_picture >=", value, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureLessThan(String value) {
            addCriterion("good_review_user_picture <", value, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureLessThanOrEqualTo(String value) {
            addCriterion("good_review_user_picture <=", value, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureLike(String value) {
            addCriterion("good_review_user_picture like", value, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureNotLike(String value) {
            addCriterion("good_review_user_picture not like", value, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureIn(List<String> values) {
            addCriterion("good_review_user_picture in", values, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureNotIn(List<String> values) {
            addCriterion("good_review_user_picture not in", values, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureBetween(String value1, String value2) {
            addCriterion("good_review_user_picture between", value1, value2, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserPictureNotBetween(String value1, String value2) {
            addCriterion("good_review_user_picture not between", value1, value2, "goodReviewUserPicture");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameIsNull() {
            addCriterion("good_review_user_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameIsNotNull() {
            addCriterion("good_review_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameEqualTo(String value) {
            addCriterion("good_review_user_name =", value, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameNotEqualTo(String value) {
            addCriterion("good_review_user_name <>", value, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameGreaterThan(String value) {
            addCriterion("good_review_user_name >", value, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_review_user_name >=", value, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameLessThan(String value) {
            addCriterion("good_review_user_name <", value, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameLessThanOrEqualTo(String value) {
            addCriterion("good_review_user_name <=", value, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameLike(String value) {
            addCriterion("good_review_user_name like", value, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameNotLike(String value) {
            addCriterion("good_review_user_name not like", value, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameIn(List<String> values) {
            addCriterion("good_review_user_name in", values, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameNotIn(List<String> values) {
            addCriterion("good_review_user_name not in", values, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameBetween(String value1, String value2) {
            addCriterion("good_review_user_name between", value1, value2, "goodReviewUserName");
            return (Criteria) this;
        }

        public Criteria andGoodReviewUserNameNotBetween(String value1, String value2) {
            addCriterion("good_review_user_name not between", value1, value2, "goodReviewUserName");
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