package com.neusoft.po;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
	protected String orderByClause;

	protected boolean distinct;
	protected int pageSize;
	protected int startRow;

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

	protected List<Criteria> oredCriteria;

	public UsersExample() {
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
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

		public Criteria andUserPwdIsNull() {
			addCriterion("user_pwd is null");
			return (Criteria) this;
		}

		public Criteria andUserPwdIsNotNull() {
			addCriterion("user_pwd is not null");
			return (Criteria) this;
		}

		public Criteria andUserPwdEqualTo(String value) {
			addCriterion("user_pwd =", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotEqualTo(String value) {
			addCriterion("user_pwd <>", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdGreaterThan(String value) {
			addCriterion("user_pwd >", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
			addCriterion("user_pwd >=", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLessThan(String value) {
			addCriterion("user_pwd <", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLessThanOrEqualTo(String value) {
			addCriterion("user_pwd <=", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLike(String value) {
			addCriterion("user_pwd like", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotLike(String value) {
			addCriterion("user_pwd not like", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdIn(List<String> values) {
			addCriterion("user_pwd in", values, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotIn(List<String> values) {
			addCriterion("user_pwd not in", values, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdBetween(String value1, String value2) {
			addCriterion("user_pwd between", value1, value2, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotBetween(String value1, String value2) {
			addCriterion("user_pwd not between", value1, value2, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserImageIsNull() {
			addCriterion("user_image is null");
			return (Criteria) this;
		}

		public Criteria andUserImageIsNotNull() {
			addCriterion("user_image is not null");
			return (Criteria) this;
		}

		public Criteria andUserImageEqualTo(String value) {
			addCriterion("user_image =", value, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageNotEqualTo(String value) {
			addCriterion("user_image <>", value, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageGreaterThan(String value) {
			addCriterion("user_image >", value, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageGreaterThanOrEqualTo(String value) {
			addCriterion("user_image >=", value, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageLessThan(String value) {
			addCriterion("user_image <", value, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageLessThanOrEqualTo(String value) {
			addCriterion("user_image <=", value, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageLike(String value) {
			addCriterion("user_image like", value, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageNotLike(String value) {
			addCriterion("user_image not like", value, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageIn(List<String> values) {
			addCriterion("user_image in", values, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageNotIn(List<String> values) {
			addCriterion("user_image not in", values, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageBetween(String value1, String value2) {
			addCriterion("user_image between", value1, value2, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserImageNotBetween(String value1, String value2) {
			addCriterion("user_image not between", value1, value2, "userImage");
			return (Criteria) this;
		}

		public Criteria andUserEmailIsNull() {
			addCriterion("user_email is null");
			return (Criteria) this;
		}

		public Criteria andUserEmailIsNotNull() {
			addCriterion("user_email is not null");
			return (Criteria) this;
		}

		public Criteria andUserEmailEqualTo(String value) {
			addCriterion("user_email =", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotEqualTo(String value) {
			addCriterion("user_email <>", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailGreaterThan(String value) {
			addCriterion("user_email >", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
			addCriterion("user_email >=", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLessThan(String value) {
			addCriterion("user_email <", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLessThanOrEqualTo(String value) {
			addCriterion("user_email <=", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLike(String value) {
			addCriterion("user_email like", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotLike(String value) {
			addCriterion("user_email not like", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailIn(List<String> values) {
			addCriterion("user_email in", values, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotIn(List<String> values) {
			addCriterion("user_email not in", values, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailBetween(String value1, String value2) {
			addCriterion("user_email between", value1, value2, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotBetween(String value1, String value2) {
			addCriterion("user_email not between", value1, value2, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserAddressIsNull() {
			addCriterion("user_address is null");
			return (Criteria) this;
		}

		public Criteria andUserAddressIsNotNull() {
			addCriterion("user_address is not null");
			return (Criteria) this;
		}

		public Criteria andUserAddressEqualTo(String value) {
			addCriterion("user_address =", value, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressNotEqualTo(String value) {
			addCriterion("user_address <>", value, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressGreaterThan(String value) {
			addCriterion("user_address >", value, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
			addCriterion("user_address >=", value, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressLessThan(String value) {
			addCriterion("user_address <", value, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressLessThanOrEqualTo(String value) {
			addCriterion("user_address <=", value, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressLike(String value) {
			addCriterion("user_address like", value, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressNotLike(String value) {
			addCriterion("user_address not like", value, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressIn(List<String> values) {
			addCriterion("user_address in", values, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressNotIn(List<String> values) {
			addCriterion("user_address not in", values, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressBetween(String value1, String value2) {
			addCriterion("user_address between", value1, value2, "userAddress");
			return (Criteria) this;
		}

		public Criteria andUserAddressNotBetween(String value1, String value2) {
			addCriterion("user_address not between", value1, value2,
					"userAddress");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIsNull() {
			addCriterion("user_phone is null");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIsNotNull() {
			addCriterion("user_phone is not null");
			return (Criteria) this;
		}

		public Criteria andUserPhoneEqualTo(String value) {
			addCriterion("user_phone =", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotEqualTo(String value) {
			addCriterion("user_phone <>", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneGreaterThan(String value) {
			addCriterion("user_phone >", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("user_phone >=", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLessThan(String value) {
			addCriterion("user_phone <", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLessThanOrEqualTo(String value) {
			addCriterion("user_phone <=", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneLike(String value) {
			addCriterion("user_phone like", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotLike(String value) {
			addCriterion("user_phone not like", value, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneIn(List<String> values) {
			addCriterion("user_phone in", values, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotIn(List<String> values) {
			addCriterion("user_phone not in", values, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneBetween(String value1, String value2) {
			addCriterion("user_phone between", value1, value2, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserPhoneNotBetween(String value1, String value2) {
			addCriterion("user_phone not between", value1, value2, "userPhone");
			return (Criteria) this;
		}

		public Criteria andUserMoneyIsNull() {
			addCriterion("user_money is null");
			return (Criteria) this;
		}

		public Criteria andUserMoneyIsNotNull() {
			addCriterion("user_money is not null");
			return (Criteria) this;
		}

		public Criteria andUserMoneyEqualTo(String value) {
			addCriterion("user_money =", value, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyNotEqualTo(String value) {
			addCriterion("user_money <>", value, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyGreaterThan(String value) {
			addCriterion("user_money >", value, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyGreaterThanOrEqualTo(String value) {
			addCriterion("user_money >=", value, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyLessThan(String value) {
			addCriterion("user_money <", value, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyLessThanOrEqualTo(String value) {
			addCriterion("user_money <=", value, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyLike(String value) {
			addCriterion("user_money like", value, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyNotLike(String value) {
			addCriterion("user_money not like", value, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyIn(List<String> values) {
			addCriterion("user_money in", values, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyNotIn(List<String> values) {
			addCriterion("user_money not in", values, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyBetween(String value1, String value2) {
			addCriterion("user_money between", value1, value2, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserMoneyNotBetween(String value1, String value2) {
			addCriterion("user_money not between", value1, value2, "userMoney");
			return (Criteria) this;
		}

		public Criteria andUserSexIsNull() {
			addCriterion("user_sex is null");
			return (Criteria) this;
		}

		public Criteria andUserSexIsNotNull() {
			addCriterion("user_sex is not null");
			return (Criteria) this;
		}

		public Criteria andUserSexEqualTo(String value) {
			addCriterion("user_sex =", value, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexNotEqualTo(String value) {
			addCriterion("user_sex <>", value, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexGreaterThan(String value) {
			addCriterion("user_sex >", value, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexGreaterThanOrEqualTo(String value) {
			addCriterion("user_sex >=", value, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexLessThan(String value) {
			addCriterion("user_sex <", value, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexLessThanOrEqualTo(String value) {
			addCriterion("user_sex <=", value, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexLike(String value) {
			addCriterion("user_sex like", value, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexNotLike(String value) {
			addCriterion("user_sex not like", value, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexIn(List<String> values) {
			addCriterion("user_sex in", values, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexNotIn(List<String> values) {
			addCriterion("user_sex not in", values, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexBetween(String value1, String value2) {
			addCriterion("user_sex between", value1, value2, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserSexNotBetween(String value1, String value2) {
			addCriterion("user_sex not between", value1, value2, "userSex");
			return (Criteria) this;
		}

		public Criteria andUserBirthIsNull() {
			addCriterion("user_birth is null");
			return (Criteria) this;
		}

		public Criteria andUserBirthIsNotNull() {
			addCriterion("user_birth is not null");
			return (Criteria) this;
		}

		public Criteria andUserBirthEqualTo(String value) {
			addCriterion("user_birth =", value, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthNotEqualTo(String value) {
			addCriterion("user_birth <>", value, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthGreaterThan(String value) {
			addCriterion("user_birth >", value, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthGreaterThanOrEqualTo(String value) {
			addCriterion("user_birth >=", value, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthLessThan(String value) {
			addCriterion("user_birth <", value, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthLessThanOrEqualTo(String value) {
			addCriterion("user_birth <=", value, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthLike(String value) {
			addCriterion("user_birth like", value, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthNotLike(String value) {
			addCriterion("user_birth not like", value, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthIn(List<String> values) {
			addCriterion("user_birth in", values, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthNotIn(List<String> values) {
			addCriterion("user_birth not in", values, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthBetween(String value1, String value2) {
			addCriterion("user_birth between", value1, value2, "userBirth");
			return (Criteria) this;
		}

		public Criteria andUserBirthNotBetween(String value1, String value2) {
			addCriterion("user_birth not between", value1, value2, "userBirth");
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