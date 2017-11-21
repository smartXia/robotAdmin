package com.neusoft.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
	protected int pageSize;
	protected int startRow;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartRow() {
		return startRow;
	}


	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public NewsInfoExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsContextIsNull() {
            addCriterion("news_context is null");
            return (Criteria) this;
        }

        public Criteria andNewsContextIsNotNull() {
            addCriterion("news_context is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContextEqualTo(String value) {
            addCriterion("news_context =", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextNotEqualTo(String value) {
            addCriterion("news_context <>", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextGreaterThan(String value) {
            addCriterion("news_context >", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextGreaterThanOrEqualTo(String value) {
            addCriterion("news_context >=", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextLessThan(String value) {
            addCriterion("news_context <", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextLessThanOrEqualTo(String value) {
            addCriterion("news_context <=", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextLike(String value) {
            addCriterion("news_context like", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextNotLike(String value) {
            addCriterion("news_context not like", value, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextIn(List<String> values) {
            addCriterion("news_context in", values, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextNotIn(List<String> values) {
            addCriterion("news_context not in", values, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextBetween(String value1, String value2) {
            addCriterion("news_context between", value1, value2, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsContextNotBetween(String value1, String value2) {
            addCriterion("news_context not between", value1, value2, "newsContext");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorIsNull() {
            addCriterion("news_author is null");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorIsNotNull() {
            addCriterion("news_author is not null");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorEqualTo(Integer value) {
            addCriterion("news_author =", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorNotEqualTo(Integer value) {
            addCriterion("news_author <>", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorGreaterThan(Integer value) {
            addCriterion("news_author >", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_author >=", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorLessThan(Integer value) {
            addCriterion("news_author <", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorLessThanOrEqualTo(Integer value) {
            addCriterion("news_author <=", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorIn(List<Integer> values) {
            addCriterion("news_author in", values, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorNotIn(List<Integer> values) {
            addCriterion("news_author not in", values, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorBetween(Integer value1, Integer value2) {
            addCriterion("news_author between", value1, value2, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorNotBetween(Integer value1, Integer value2) {
            addCriterion("news_author not between", value1, value2, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNull() {
            addCriterion("news_type is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNotNull() {
            addCriterion("news_type is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeEqualTo(Integer value) {
            addCriterion("news_type =", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotEqualTo(Integer value) {
            addCriterion("news_type <>", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThan(Integer value) {
            addCriterion("news_type >", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_type >=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThan(Integer value) {
            addCriterion("news_type <", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("news_type <=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIn(List<Integer> values) {
            addCriterion("news_type in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotIn(List<Integer> values) {
            addCriterion("news_type not in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeBetween(Integer value1, Integer value2) {
            addCriterion("news_type between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("news_type not between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNull() {
            addCriterion("news_date is null");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNotNull() {
            addCriterion("news_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDateEqualTo(Date value) {
            addCriterion("news_date =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterion("news_date <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterion("news_date >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("news_date >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterion("news_date <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterion("news_date <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterion("news_date in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterion("news_date not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterion("news_date between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterion("news_date not between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsImagesIsNull() {
            addCriterion("news_images is null");
            return (Criteria) this;
        }

        public Criteria andNewsImagesIsNotNull() {
            addCriterion("news_images is not null");
            return (Criteria) this;
        }

        public Criteria andNewsImagesEqualTo(String value) {
            addCriterion("news_images =", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesNotEqualTo(String value) {
            addCriterion("news_images <>", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesGreaterThan(String value) {
            addCriterion("news_images >", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesGreaterThanOrEqualTo(String value) {
            addCriterion("news_images >=", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesLessThan(String value) {
            addCriterion("news_images <", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesLessThanOrEqualTo(String value) {
            addCriterion("news_images <=", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesLike(String value) {
            addCriterion("news_images like", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesNotLike(String value) {
            addCriterion("news_images not like", value, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesIn(List<String> values) {
            addCriterion("news_images in", values, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesNotIn(List<String> values) {
            addCriterion("news_images not in", values, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesBetween(String value1, String value2) {
            addCriterion("news_images between", value1, value2, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsImagesNotBetween(String value1, String value2) {
            addCriterion("news_images not between", value1, value2, "newsImages");
            return (Criteria) this;
        }

        public Criteria andNewsReadIsNull() {
            addCriterion("news_read is null");
            return (Criteria) this;
        }

        public Criteria andNewsReadIsNotNull() {
            addCriterion("news_read is not null");
            return (Criteria) this;
        }

        public Criteria andNewsReadEqualTo(Integer value) {
            addCriterion("news_read =", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadNotEqualTo(Integer value) {
            addCriterion("news_read <>", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadGreaterThan(Integer value) {
            addCriterion("news_read >", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_read >=", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadLessThan(Integer value) {
            addCriterion("news_read <", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadLessThanOrEqualTo(Integer value) {
            addCriterion("news_read <=", value, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadIn(List<Integer> values) {
            addCriterion("news_read in", values, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadNotIn(List<Integer> values) {
            addCriterion("news_read not in", values, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadBetween(Integer value1, Integer value2) {
            addCriterion("news_read between", value1, value2, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsReadNotBetween(Integer value1, Integer value2) {
            addCriterion("news_read not between", value1, value2, "newsRead");
            return (Criteria) this;
        }

        public Criteria andNewsCommitIsNull() {
            addCriterion("news_commit is null");
            return (Criteria) this;
        }

        public Criteria andNewsCommitIsNotNull() {
            addCriterion("news_commit is not null");
            return (Criteria) this;
        }

        public Criteria andNewsCommitEqualTo(String value) {
            addCriterion("news_commit =", value, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitNotEqualTo(String value) {
            addCriterion("news_commit <>", value, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitGreaterThan(String value) {
            addCriterion("news_commit >", value, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitGreaterThanOrEqualTo(String value) {
            addCriterion("news_commit >=", value, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitLessThan(String value) {
            addCriterion("news_commit <", value, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitLessThanOrEqualTo(String value) {
            addCriterion("news_commit <=", value, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitLike(String value) {
            addCriterion("news_commit like", value, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitNotLike(String value) {
            addCriterion("news_commit not like", value, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitIn(List<String> values) {
            addCriterion("news_commit in", values, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitNotIn(List<String> values) {
            addCriterion("news_commit not in", values, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitBetween(String value1, String value2) {
            addCriterion("news_commit between", value1, value2, "newsCommit");
            return (Criteria) this;
        }

        public Criteria andNewsCommitNotBetween(String value1, String value2) {
            addCriterion("news_commit not between", value1, value2, "newsCommit");
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