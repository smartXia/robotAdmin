package com.neusoft.po;

import java.util.ArrayList;
import java.util.List;

public class TopicExample {
	protected String orderByClause;

	protected boolean distinct;
	protected int pageSize;
	protected int startRow;
	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the startRow
	 */
	public int getStartRow() {
		return startRow;
	}

	/**
	 * @param startRow the startRow to set
	 */
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	protected List<Criteria> oredCriteria;

	public TopicExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andTopicIdIsNull() {
			addCriterion("topic_id is null");
			return (Criteria) this;
		}

		public Criteria andTopicIdIsNotNull() {
			addCriterion("topic_id is not null");
			return (Criteria) this;
		}

		public Criteria andTopicIdEqualTo(Integer value) {
			addCriterion("topic_id =", value, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdNotEqualTo(Integer value) {
			addCriterion("topic_id <>", value, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdGreaterThan(Integer value) {
			addCriterion("topic_id >", value, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("topic_id >=", value, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdLessThan(Integer value) {
			addCriterion("topic_id <", value, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
			addCriterion("topic_id <=", value, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdIn(List<Integer> values) {
			addCriterion("topic_id in", values, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdNotIn(List<Integer> values) {
			addCriterion("topic_id not in", values, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdBetween(Integer value1, Integer value2) {
			addCriterion("topic_id between", value1, value2, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
			addCriterion("topic_id not between", value1, value2, "topicId");
			return (Criteria) this;
		}

		public Criteria andTopicTitleIsNull() {
			addCriterion("topic_title is null");
			return (Criteria) this;
		}

		public Criteria andTopicTitleIsNotNull() {
			addCriterion("topic_title is not null");
			return (Criteria) this;
		}

		public Criteria andTopicTitleEqualTo(String value) {
			addCriterion("topic_title =", value, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleNotEqualTo(String value) {
			addCriterion("topic_title <>", value, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleGreaterThan(String value) {
			addCriterion("topic_title >", value, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleGreaterThanOrEqualTo(String value) {
			addCriterion("topic_title >=", value, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleLessThan(String value) {
			addCriterion("topic_title <", value, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleLessThanOrEqualTo(String value) {
			addCriterion("topic_title <=", value, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleLike(String value) {
			addCriterion("topic_title like", value, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleNotLike(String value) {
			addCriterion("topic_title not like", value, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleIn(List<String> values) {
			addCriterion("topic_title in", values, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleNotIn(List<String> values) {
			addCriterion("topic_title not in", values, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleBetween(String value1, String value2) {
			addCriterion("topic_title between", value1, value2, "topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicTitleNotBetween(String value1, String value2) {
			addCriterion("topic_title not between", value1, value2,
					"topicTitle");
			return (Criteria) this;
		}

		public Criteria andTopicImageIsNull() {
			addCriterion("topic_image is null");
			return (Criteria) this;
		}

		public Criteria andTopicImageIsNotNull() {
			addCriterion("topic_image is not null");
			return (Criteria) this;
		}

		public Criteria andTopicImageEqualTo(String value) {
			addCriterion("topic_image =", value, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageNotEqualTo(String value) {
			addCriterion("topic_image <>", value, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageGreaterThan(String value) {
			addCriterion("topic_image >", value, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageGreaterThanOrEqualTo(String value) {
			addCriterion("topic_image >=", value, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageLessThan(String value) {
			addCriterion("topic_image <", value, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageLessThanOrEqualTo(String value) {
			addCriterion("topic_image <=", value, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageLike(String value) {
			addCriterion("topic_image like", value, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageNotLike(String value) {
			addCriterion("topic_image not like", value, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageIn(List<String> values) {
			addCriterion("topic_image in", values, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageNotIn(List<String> values) {
			addCriterion("topic_image not in", values, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageBetween(String value1, String value2) {
			addCriterion("topic_image between", value1, value2, "topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicImageNotBetween(String value1, String value2) {
			addCriterion("topic_image not between", value1, value2,
					"topicImage");
			return (Criteria) this;
		}

		public Criteria andTopicContextIsNull() {
			addCriterion("topic_context is null");
			return (Criteria) this;
		}

		public Criteria andTopicContextIsNotNull() {
			addCriterion("topic_context is not null");
			return (Criteria) this;
		}

		public Criteria andTopicContextEqualTo(String value) {
			addCriterion("topic_context =", value, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextNotEqualTo(String value) {
			addCriterion("topic_context <>", value, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextGreaterThan(String value) {
			addCriterion("topic_context >", value, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextGreaterThanOrEqualTo(String value) {
			addCriterion("topic_context >=", value, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextLessThan(String value) {
			addCriterion("topic_context <", value, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextLessThanOrEqualTo(String value) {
			addCriterion("topic_context <=", value, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextLike(String value) {
			addCriterion("topic_context like", value, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextNotLike(String value) {
			addCriterion("topic_context not like", value, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextIn(List<String> values) {
			addCriterion("topic_context in", values, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextNotIn(List<String> values) {
			addCriterion("topic_context not in", values, "topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextBetween(String value1, String value2) {
			addCriterion("topic_context between", value1, value2,
					"topicContext");
			return (Criteria) this;
		}

		public Criteria andTopicContextNotBetween(String value1, String value2) {
			addCriterion("topic_context not between", value1, value2,
					"topicContext");
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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