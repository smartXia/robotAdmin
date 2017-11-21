package com.neusoft.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommitTopicExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageSize;

	/**
	 * @return the startRow
	 */
	public int getStartRow() {
		return startRow;
	}

	/**
	 * @param startRow
	 *            the startRow to set
	 */
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 *            the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	protected List<Criteria> oredCriteria;

	public CommitTopicExample() {
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

		public Criteria andCommitIdIsNull() {
			addCriterion("commit_id is null");
			return (Criteria) this;
		}

		public Criteria andCommitIdIsNotNull() {
			addCriterion("commit_id is not null");
			return (Criteria) this;
		}

		public Criteria andCommitIdEqualTo(Integer value) {
			addCriterion("commit_id =", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdNotEqualTo(Integer value) {
			addCriterion("commit_id <>", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdGreaterThan(Integer value) {
			addCriterion("commit_id >", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("commit_id >=", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdLessThan(Integer value) {
			addCriterion("commit_id <", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdLessThanOrEqualTo(Integer value) {
			addCriterion("commit_id <=", value, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdIn(List<Integer> values) {
			addCriterion("commit_id in", values, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdNotIn(List<Integer> values) {
			addCriterion("commit_id not in", values, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdBetween(Integer value1, Integer value2) {
			addCriterion("commit_id between", value1, value2, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitIdNotBetween(Integer value1, Integer value2) {
			addCriterion("commit_id not between", value1, value2, "commitId");
			return (Criteria) this;
		}

		public Criteria andCommitTopicIsNull() {
			addCriterion("commit_topic is null");
			return (Criteria) this;
		}

		public Criteria andCommitTopicIsNotNull() {
			addCriterion("commit_topic is not null");
			return (Criteria) this;
		}

		public Criteria andCommitTopicEqualTo(Integer value) {
			addCriterion("commit_topic =", value, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicNotEqualTo(Integer value) {
			addCriterion("commit_topic <>", value, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicGreaterThan(Integer value) {
			addCriterion("commit_topic >", value, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicGreaterThanOrEqualTo(Integer value) {
			addCriterion("commit_topic >=", value, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicLessThan(Integer value) {
			addCriterion("commit_topic <", value, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicLessThanOrEqualTo(Integer value) {
			addCriterion("commit_topic <=", value, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicIn(List<Integer> values) {
			addCriterion("commit_topic in", values, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicNotIn(List<Integer> values) {
			addCriterion("commit_topic not in", values, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicBetween(Integer value1, Integer value2) {
			addCriterion("commit_topic between", value1, value2, "commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitTopicNotBetween(Integer value1, Integer value2) {
			addCriterion("commit_topic not between", value1, value2,
					"commitTopic");
			return (Criteria) this;
		}

		public Criteria andCommitUserIsNull() {
			addCriterion("commit_user is null");
			return (Criteria) this;
		}

		public Criteria andCommitUserIsNotNull() {
			addCriterion("commit_user is not null");
			return (Criteria) this;
		}

		public Criteria andCommitUserEqualTo(String value) {
			addCriterion("commit_user =", value, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserNotEqualTo(String value) {
			addCriterion("commit_user <>", value, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserGreaterThan(String value) {
			addCriterion("commit_user >", value, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserGreaterThanOrEqualTo(String value) {
			addCriterion("commit_user >=", value, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserLessThan(String value) {
			addCriterion("commit_user <", value, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserLessThanOrEqualTo(String value) {
			addCriterion("commit_user <=", value, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserLike(String value) {
			addCriterion("commit_user like", value, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserNotLike(String value) {
			addCriterion("commit_user not like", value, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserIn(List<String> values) {
			addCriterion("commit_user in", values, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserNotIn(List<String> values) {
			addCriterion("commit_user not in", values, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserBetween(String value1, String value2) {
			addCriterion("commit_user between", value1, value2, "commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitUserNotBetween(String value1, String value2) {
			addCriterion("commit_user not between", value1, value2,
					"commitUser");
			return (Criteria) this;
		}

		public Criteria andCommitTimeIsNull() {
			addCriterion("commit_time is null");
			return (Criteria) this;
		}

		public Criteria andCommitTimeIsNotNull() {
			addCriterion("commit_time is not null");
			return (Criteria) this;
		}

		public Criteria andCommitTimeEqualTo(Date value) {
			addCriterion("commit_time =", value, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeNotEqualTo(Date value) {
			addCriterion("commit_time <>", value, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeGreaterThan(Date value) {
			addCriterion("commit_time >", value, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("commit_time >=", value, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeLessThan(Date value) {
			addCriterion("commit_time <", value, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeLessThanOrEqualTo(Date value) {
			addCriterion("commit_time <=", value, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeIn(List<Date> values) {
			addCriterion("commit_time in", values, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeNotIn(List<Date> values) {
			addCriterion("commit_time not in", values, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeBetween(Date value1, Date value2) {
			addCriterion("commit_time between", value1, value2, "commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitTimeNotBetween(Date value1, Date value2) {
			addCriterion("commit_time not between", value1, value2,
					"commitTime");
			return (Criteria) this;
		}

		public Criteria andCommitContextIsNull() {
			addCriterion("commit_context is null");
			return (Criteria) this;
		}

		public Criteria andCommitContextIsNotNull() {
			addCriterion("commit_context is not null");
			return (Criteria) this;
		}

		public Criteria andCommitContextEqualTo(String value) {
			addCriterion("commit_context =", value, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextNotEqualTo(String value) {
			addCriterion("commit_context <>", value, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextGreaterThan(String value) {
			addCriterion("commit_context >", value, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextGreaterThanOrEqualTo(String value) {
			addCriterion("commit_context >=", value, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextLessThan(String value) {
			addCriterion("commit_context <", value, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextLessThanOrEqualTo(String value) {
			addCriterion("commit_context <=", value, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextLike(String value) {
			addCriterion("commit_context like", value, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextNotLike(String value) {
			addCriterion("commit_context not like", value, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextIn(List<String> values) {
			addCriterion("commit_context in", values, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextNotIn(List<String> values) {
			addCriterion("commit_context not in", values, "commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextBetween(String value1, String value2) {
			addCriterion("commit_context between", value1, value2,
					"commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitContextNotBetween(String value1, String value2) {
			addCriterion("commit_context not between", value1, value2,
					"commitContext");
			return (Criteria) this;
		}

		public Criteria andCommitLoveIsNull() {
			addCriterion("commit_love is null");
			return (Criteria) this;
		}

		public Criteria andCommitLoveIsNotNull() {
			addCriterion("commit_love is not null");
			return (Criteria) this;
		}

		public Criteria andCommitLoveEqualTo(Integer value) {
			addCriterion("commit_love =", value, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveNotEqualTo(Integer value) {
			addCriterion("commit_love <>", value, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveGreaterThan(Integer value) {
			addCriterion("commit_love >", value, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveGreaterThanOrEqualTo(Integer value) {
			addCriterion("commit_love >=", value, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveLessThan(Integer value) {
			addCriterion("commit_love <", value, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveLessThanOrEqualTo(Integer value) {
			addCriterion("commit_love <=", value, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveIn(List<Integer> values) {
			addCriterion("commit_love in", values, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveNotIn(List<Integer> values) {
			addCriterion("commit_love not in", values, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveBetween(Integer value1, Integer value2) {
			addCriterion("commit_love between", value1, value2, "commitLove");
			return (Criteria) this;
		}

		public Criteria andCommitLoveNotBetween(Integer value1, Integer value2) {
			addCriterion("commit_love not between", value1, value2,
					"commitLove");
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