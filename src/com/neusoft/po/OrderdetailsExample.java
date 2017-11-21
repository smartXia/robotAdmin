package com.neusoft.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderdetailsExample {
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

	public OrderdetailsExample() {
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

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andDetailIdIsNull() {
			addCriterion("detail_id is null");
			return (Criteria) this;
		}

		public Criteria andDetailIdIsNotNull() {
			addCriterion("detail_id is not null");
			return (Criteria) this;
		}

		public Criteria andDetailIdEqualTo(Long value) {
			addCriterion("detail_id =", value, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdNotEqualTo(Long value) {
			addCriterion("detail_id <>", value, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdGreaterThan(Long value) {
			addCriterion("detail_id >", value, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdGreaterThanOrEqualTo(Long value) {
			addCriterion("detail_id >=", value, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdLessThan(Long value) {
			addCriterion("detail_id <", value, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdLessThanOrEqualTo(Long value) {
			addCriterion("detail_id <=", value, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdIn(List<Long> values) {
			addCriterion("detail_id in", values, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdNotIn(List<Long> values) {
			addCriterion("detail_id not in", values, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdBetween(Long value1, Long value2) {
			addCriterion("detail_id between", value1, value2, "detailId");
			return (Criteria) this;
		}

		public Criteria andDetailIdNotBetween(Long value1, Long value2) {
			addCriterion("detail_id not between", value1, value2, "detailId");
			return (Criteria) this;
		}

		public Criteria andOrderIdIsNull() {
			addCriterion("order_id is null");
			return (Criteria) this;
		}

		public Criteria andOrderIdIsNotNull() {
			addCriterion("order_id is not null");
			return (Criteria) this;
		}

		public Criteria andOrderIdEqualTo(String value) {
			addCriterion("order_id =", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotEqualTo(String value) {
			addCriterion("order_id <>", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdGreaterThan(String value) {
			addCriterion("order_id >", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
			addCriterion("order_id >=", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLessThan(String value) {
			addCriterion("order_id <", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLessThanOrEqualTo(String value) {
			addCriterion("order_id <=", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLike(String value) {
			addCriterion("order_id like", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotLike(String value) {
			addCriterion("order_id not like", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdIn(List<String> values) {
			addCriterion("order_id in", values, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotIn(List<String> values) {
			addCriterion("order_id not in", values, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdBetween(String value1, String value2) {
			addCriterion("order_id between", value1, value2, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotBetween(String value1, String value2) {
			addCriterion("order_id not between", value1, value2, "orderId");
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
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return (Criteria) this;
		}

		public Criteria andPaywayIsNull() {
			addCriterion("payway is null");
			return (Criteria) this;
		}

		public Criteria andPaywayIsNotNull() {
			addCriterion("payway is not null");
			return (Criteria) this;
		}

		public Criteria andPaywayEqualTo(String value) {
			addCriterion("payway =", value, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayNotEqualTo(String value) {
			addCriterion("payway <>", value, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayGreaterThan(String value) {
			addCriterion("payway >", value, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayGreaterThanOrEqualTo(String value) {
			addCriterion("payway >=", value, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayLessThan(String value) {
			addCriterion("payway <", value, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayLessThanOrEqualTo(String value) {
			addCriterion("payway <=", value, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayLike(String value) {
			addCriterion("payway like", value, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayNotLike(String value) {
			addCriterion("payway not like", value, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayIn(List<String> values) {
			addCriterion("payway in", values, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayNotIn(List<String> values) {
			addCriterion("payway not in", values, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayBetween(String value1, String value2) {
			addCriterion("payway between", value1, value2, "payway");
			return (Criteria) this;
		}

		public Criteria andPaywayNotBetween(String value1, String value2) {
			addCriterion("payway not between", value1, value2, "payway");
			return (Criteria) this;
		}

		public Criteria andSendwayIsNull() {
			addCriterion("sendway is null");
			return (Criteria) this;
		}

		public Criteria andSendwayIsNotNull() {
			addCriterion("sendway is not null");
			return (Criteria) this;
		}

		public Criteria andSendwayEqualTo(String value) {
			addCriterion("sendway =", value, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayNotEqualTo(String value) {
			addCriterion("sendway <>", value, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayGreaterThan(String value) {
			addCriterion("sendway >", value, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayGreaterThanOrEqualTo(String value) {
			addCriterion("sendway >=", value, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayLessThan(String value) {
			addCriterion("sendway <", value, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayLessThanOrEqualTo(String value) {
			addCriterion("sendway <=", value, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayLike(String value) {
			addCriterion("sendway like", value, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayNotLike(String value) {
			addCriterion("sendway not like", value, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayIn(List<String> values) {
			addCriterion("sendway in", values, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayNotIn(List<String> values) {
			addCriterion("sendway not in", values, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayBetween(String value1, String value2) {
			addCriterion("sendway between", value1, value2, "sendway");
			return (Criteria) this;
		}

		public Criteria andSendwayNotBetween(String value1, String value2) {
			addCriterion("sendway not between", value1, value2, "sendway");
			return (Criteria) this;
		}

		public Criteria andOrderStatuIsNull() {
			addCriterion("order_statu is null");
			return (Criteria) this;
		}

		public Criteria andOrderStatuIsNotNull() {
			addCriterion("order_statu is not null");
			return (Criteria) this;
		}

		public Criteria andOrderStatuEqualTo(String value) {
			addCriterion("order_statu =", value, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuNotEqualTo(String value) {
			addCriterion("order_statu <>", value, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuGreaterThan(String value) {
			addCriterion("order_statu >", value, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuGreaterThanOrEqualTo(String value) {
			addCriterion("order_statu >=", value, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuLessThan(String value) {
			addCriterion("order_statu <", value, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuLessThanOrEqualTo(String value) {
			addCriterion("order_statu <=", value, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuLike(String value) {
			addCriterion("order_statu like", value, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuNotLike(String value) {
			addCriterion("order_statu not like", value, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuIn(List<String> values) {
			addCriterion("order_statu in", values, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuNotIn(List<String> values) {
			addCriterion("order_statu not in", values, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuBetween(String value1, String value2) {
			addCriterion("order_statu between", value1, value2, "orderStatu");
			return (Criteria) this;
		}

		public Criteria andOrderStatuNotBetween(String value1, String value2) {
			addCriterion("order_statu not between", value1, value2,
					"orderStatu");
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