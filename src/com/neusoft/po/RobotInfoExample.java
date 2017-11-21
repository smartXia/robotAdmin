package com.neusoft.po;

import java.util.ArrayList;
import java.util.List;

public class RobotInfoExample {
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

	public RobotInfoExample() {
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

		public Criteria andRobotIdIsNull() {
			addCriterion("robot_id is null");
			return (Criteria) this;
		}

		public Criteria andRobotIdIsNotNull() {
			addCriterion("robot_id is not null");
			return (Criteria) this;
		}

		public Criteria andRobotIdEqualTo(Integer value) {
			addCriterion("robot_id =", value, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdNotEqualTo(Integer value) {
			addCriterion("robot_id <>", value, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdGreaterThan(Integer value) {
			addCriterion("robot_id >", value, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("robot_id >=", value, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdLessThan(Integer value) {
			addCriterion("robot_id <", value, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdLessThanOrEqualTo(Integer value) {
			addCriterion("robot_id <=", value, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdIn(List<Integer> values) {
			addCriterion("robot_id in", values, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdNotIn(List<Integer> values) {
			addCriterion("robot_id not in", values, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdBetween(Integer value1, Integer value2) {
			addCriterion("robot_id between", value1, value2, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotIdNotBetween(Integer value1, Integer value2) {
			addCriterion("robot_id not between", value1, value2, "robotId");
			return (Criteria) this;
		}

		public Criteria andRobotNameIsNull() {
			addCriterion("robot_name is null");
			return (Criteria) this;
		}

		public Criteria andRobotNameIsNotNull() {
			addCriterion("robot_name is not null");
			return (Criteria) this;
		}

		public Criteria andRobotNameEqualTo(String value) {
			addCriterion("robot_name =", value, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameNotEqualTo(String value) {
			addCriterion("robot_name <>", value, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameGreaterThan(String value) {
			addCriterion("robot_name >", value, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameGreaterThanOrEqualTo(String value) {
			addCriterion("robot_name >=", value, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameLessThan(String value) {
			addCriterion("robot_name <", value, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameLessThanOrEqualTo(String value) {
			addCriterion("robot_name <=", value, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameLike(String value) {
			addCriterion("robot_name like", value, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameNotLike(String value) {
			addCriterion("robot_name not like", value, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameIn(List<String> values) {
			addCriterion("robot_name in", values, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameNotIn(List<String> values) {
			addCriterion("robot_name not in", values, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameBetween(String value1, String value2) {
			addCriterion("robot_name between", value1, value2, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotNameNotBetween(String value1, String value2) {
			addCriterion("robot_name not between", value1, value2, "robotName");
			return (Criteria) this;
		}

		public Criteria andRobotTypeIsNull() {
			addCriterion("robot_type is null");
			return (Criteria) this;
		}

		public Criteria andRobotTypeIsNotNull() {
			addCriterion("robot_type is not null");
			return (Criteria) this;
		}

		public Criteria andRobotTypeEqualTo(String value) {
			addCriterion("robot_type =", value, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeNotEqualTo(String value) {
			addCriterion("robot_type <>", value, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeGreaterThan(String value) {
			addCriterion("robot_type >", value, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeGreaterThanOrEqualTo(String value) {
			addCriterion("robot_type >=", value, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeLessThan(String value) {
			addCriterion("robot_type <", value, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeLessThanOrEqualTo(String value) {
			addCriterion("robot_type <=", value, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeLike(String value) {
			addCriterion("robot_type like", value, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeNotLike(String value) {
			addCriterion("robot_type not like", value, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeIn(List<String> values) {
			addCriterion("robot_type in", values, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeNotIn(List<String> values) {
			addCriterion("robot_type not in", values, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeBetween(String value1, String value2) {
			addCriterion("robot_type between", value1, value2, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotTypeNotBetween(String value1, String value2) {
			addCriterion("robot_type not between", value1, value2, "robotType");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyIsNull() {
			addCriterion("robot_company is null");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyIsNotNull() {
			addCriterion("robot_company is not null");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyEqualTo(String value) {
			addCriterion("robot_company =", value, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyNotEqualTo(String value) {
			addCriterion("robot_company <>", value, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyGreaterThan(String value) {
			addCriterion("robot_company >", value, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyGreaterThanOrEqualTo(String value) {
			addCriterion("robot_company >=", value, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyLessThan(String value) {
			addCriterion("robot_company <", value, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyLessThanOrEqualTo(String value) {
			addCriterion("robot_company <=", value, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyLike(String value) {
			addCriterion("robot_company like", value, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyNotLike(String value) {
			addCriterion("robot_company not like", value, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyIn(List<String> values) {
			addCriterion("robot_company in", values, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyNotIn(List<String> values) {
			addCriterion("robot_company not in", values, "robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyBetween(String value1, String value2) {
			addCriterion("robot_company between", value1, value2,
					"robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotCompanyNotBetween(String value1, String value2) {
			addCriterion("robot_company not between", value1, value2,
					"robotCompany");
			return (Criteria) this;
		}

		public Criteria andRobotPriceIsNull() {
			addCriterion("robot_price is null");
			return (Criteria) this;
		}

		public Criteria andRobotPriceIsNotNull() {
			addCriterion("robot_price is not null");
			return (Criteria) this;
		}

		public Criteria andRobotPriceEqualTo(String value) {
			addCriterion("robot_price =", value, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceNotEqualTo(String value) {
			addCriterion("robot_price <>", value, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceGreaterThan(String value) {
			addCriterion("robot_price >", value, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceGreaterThanOrEqualTo(String value) {
			addCriterion("robot_price >=", value, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceLessThan(String value) {
			addCriterion("robot_price <", value, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceLessThanOrEqualTo(String value) {
			addCriterion("robot_price <=", value, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceLike(String value) {
			addCriterion("robot_price like", value, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceNotLike(String value) {
			addCriterion("robot_price not like", value, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceIn(List<String> values) {
			addCriterion("robot_price in", values, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceNotIn(List<String> values) {
			addCriterion("robot_price not in", values, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceBetween(String value1, String value2) {
			addCriterion("robot_price between", value1, value2, "robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotPriceNotBetween(String value1, String value2) {
			addCriterion("robot_price not between", value1, value2,
					"robotPrice");
			return (Criteria) this;
		}

		public Criteria andRobotImageIsNull() {
			addCriterion("robot_image is null");
			return (Criteria) this;
		}

		public Criteria andRobotImageIsNotNull() {
			addCriterion("robot_image is not null");
			return (Criteria) this;
		}

		public Criteria andRobotImageEqualTo(String value) {
			addCriterion("robot_image =", value, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageNotEqualTo(String value) {
			addCriterion("robot_image <>", value, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageGreaterThan(String value) {
			addCriterion("robot_image >", value, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageGreaterThanOrEqualTo(String value) {
			addCriterion("robot_image >=", value, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageLessThan(String value) {
			addCriterion("robot_image <", value, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageLessThanOrEqualTo(String value) {
			addCriterion("robot_image <=", value, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageLike(String value) {
			addCriterion("robot_image like", value, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageNotLike(String value) {
			addCriterion("robot_image not like", value, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageIn(List<String> values) {
			addCriterion("robot_image in", values, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageNotIn(List<String> values) {
			addCriterion("robot_image not in", values, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageBetween(String value1, String value2) {
			addCriterion("robot_image between", value1, value2, "robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotImageNotBetween(String value1, String value2) {
			addCriterion("robot_image not between", value1, value2,
					"robotImage");
			return (Criteria) this;
		}

		public Criteria andRobotCommitIsNull() {
			addCriterion("robot_commit is null");
			return (Criteria) this;
		}

		public Criteria andRobotCommitIsNotNull() {
			addCriterion("robot_commit is not null");
			return (Criteria) this;
		}

		public Criteria andRobotCommitEqualTo(String value) {
			addCriterion("robot_commit =", value, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitNotEqualTo(String value) {
			addCriterion("robot_commit <>", value, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitGreaterThan(String value) {
			addCriterion("robot_commit >", value, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitGreaterThanOrEqualTo(String value) {
			addCriterion("robot_commit >=", value, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitLessThan(String value) {
			addCriterion("robot_commit <", value, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitLessThanOrEqualTo(String value) {
			addCriterion("robot_commit <=", value, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitLike(String value) {
			addCriterion("robot_commit like", value, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitNotLike(String value) {
			addCriterion("robot_commit not like", value, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitIn(List<String> values) {
			addCriterion("robot_commit in", values, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitNotIn(List<String> values) {
			addCriterion("robot_commit not in", values, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitBetween(String value1, String value2) {
			addCriterion("robot_commit between", value1, value2, "robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCommitNotBetween(String value1, String value2) {
			addCriterion("robot_commit not between", value1, value2,
					"robotCommit");
			return (Criteria) this;
		}

		public Criteria andRobotCountIsNull() {
			addCriterion("robot_count is null");
			return (Criteria) this;
		}

		public Criteria andRobotCountIsNotNull() {
			addCriterion("robot_count is not null");
			return (Criteria) this;
		}

		public Criteria andRobotCountEqualTo(Integer value) {
			addCriterion("robot_count =", value, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountNotEqualTo(Integer value) {
			addCriterion("robot_count <>", value, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountGreaterThan(Integer value) {
			addCriterion("robot_count >", value, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("robot_count >=", value, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountLessThan(Integer value) {
			addCriterion("robot_count <", value, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountLessThanOrEqualTo(Integer value) {
			addCriterion("robot_count <=", value, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountIn(List<Integer> values) {
			addCriterion("robot_count in", values, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountNotIn(List<Integer> values) {
			addCriterion("robot_count not in", values, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountBetween(Integer value1, Integer value2) {
			addCriterion("robot_count between", value1, value2, "robotCount");
			return (Criteria) this;
		}

		public Criteria andRobotCountNotBetween(Integer value1, Integer value2) {
			addCriterion("robot_count not between", value1, value2,
					"robotCount");
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