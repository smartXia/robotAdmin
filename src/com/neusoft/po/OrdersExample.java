package com.neusoft.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(int orderId) {
            addCriterion("order_id =", orderId, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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
            addCriterion("robot_image not between", value1, value2, "robotImage");
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

        public Criteria andRobotPriceEqualTo(Integer value) {
            addCriterion("robot_price =", value, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceNotEqualTo(Integer value) {
            addCriterion("robot_price <>", value, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceGreaterThan(Integer value) {
            addCriterion("robot_price >", value, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("robot_price >=", value, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceLessThan(Integer value) {
            addCriterion("robot_price <", value, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceLessThanOrEqualTo(Integer value) {
            addCriterion("robot_price <=", value, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceIn(List<Integer> values) {
            addCriterion("robot_price in", values, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceNotIn(List<Integer> values) {
            addCriterion("robot_price not in", values, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceBetween(Integer value1, Integer value2) {
            addCriterion("robot_price between", value1, value2, "robotPrice");
            return (Criteria) this;
        }

        public Criteria andRobotPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("robot_price not between", value1, value2, "robotPrice");
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

        public Criteria andRobotComIsNull() {
            addCriterion("robot_com is null");
            return (Criteria) this;
        }

        public Criteria andRobotComIsNotNull() {
            addCriterion("robot_com is not null");
            return (Criteria) this;
        }

        public Criteria andRobotComEqualTo(String value) {
            addCriterion("robot_com =", value, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComNotEqualTo(String value) {
            addCriterion("robot_com <>", value, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComGreaterThan(String value) {
            addCriterion("robot_com >", value, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComGreaterThanOrEqualTo(String value) {
            addCriterion("robot_com >=", value, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComLessThan(String value) {
            addCriterion("robot_com <", value, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComLessThanOrEqualTo(String value) {
            addCriterion("robot_com <=", value, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComLike(String value) {
            addCriterion("robot_com like", value, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComNotLike(String value) {
            addCriterion("robot_com not like", value, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComIn(List<String> values) {
            addCriterion("robot_com in", values, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComNotIn(List<String> values) {
            addCriterion("robot_com not in", values, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComBetween(String value1, String value2) {
            addCriterion("robot_com between", value1, value2, "robotCom");
            return (Criteria) this;
        }

        public Criteria andRobotComNotBetween(String value1, String value2) {
            addCriterion("robot_com not between", value1, value2, "robotCom");
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

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("order_state like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("order_state not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andWaterIsNull() {
            addCriterion("water is null");
            return (Criteria) this;
        }

        public Criteria andWaterIsNotNull() {
            addCriterion("water is not null");
            return (Criteria) this;
        }

        public Criteria andWaterEqualTo(Long value) {
            addCriterion("water =", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotEqualTo(Long value) {
            addCriterion("water <>", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThan(Long value) {
            addCriterion("water >", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThanOrEqualTo(Long value) {
            addCriterion("water >=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThan(Long value) {
            addCriterion("water <", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThanOrEqualTo(Long value) {
            addCriterion("water <=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterIn(List<Long> values) {
            addCriterion("water in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotIn(List<Long> values) {
            addCriterion("water not in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterBetween(Long value1, Long value2) {
            addCriterion("water between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotBetween(Long value1, Long value2) {
            addCriterion("water not between", value1, value2, "water");
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