package com.example.example.spring.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoListExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public TodoListExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIsNull() {
            addCriterion("task_detail is null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIsNotNull() {
            addCriterion("task_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDetailEqualTo(String value) {
            addCriterion("task_detail =", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotEqualTo(String value) {
            addCriterion("task_detail <>", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailGreaterThan(String value) {
            addCriterion("task_detail >", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailGreaterThanOrEqualTo(String value) {
            addCriterion("task_detail >=", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLessThan(String value) {
            addCriterion("task_detail <", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLessThanOrEqualTo(String value) {
            addCriterion("task_detail <=", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailLike(String value) {
            addCriterion("task_detail like", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotLike(String value) {
            addCriterion("task_detail not like", value, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailIn(List<String> values) {
            addCriterion("task_detail in", values, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotIn(List<String> values) {
            addCriterion("task_detail not in", values, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailBetween(String value1, String value2) {
            addCriterion("task_detail between", value1, value2, "taskDetail");
            return (Criteria) this;
        }

        public Criteria andTaskDetailNotBetween(String value1, String value2) {
            addCriterion("task_detail not between", value1, value2, "taskDetail");
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

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNull() {
            addCriterion("limit_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNotNull() {
            addCriterion("limit_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDateEqualTo(Date value) {
            addCriterion("limit_date =", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotEqualTo(Date value) {
            addCriterion("limit_date <>", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThan(Date value) {
            addCriterion("limit_date >", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("limit_date >=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThan(Date value) {
            addCriterion("limit_date <", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThanOrEqualTo(Date value) {
            addCriterion("limit_date <=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateIn(List<Date> values) {
            addCriterion("limit_date in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotIn(List<Date> values) {
            addCriterion("limit_date not in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateBetween(Date value1, Date value2) {
            addCriterion("limit_date between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotBetween(Date value1, Date value2) {
            addCriterion("limit_date not between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateIsNull() {
            addCriterion("lastmodify_date is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateIsNotNull() {
            addCriterion("lastmodify_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateEqualTo(Date value) {
            addCriterion("lastmodify_date =", value, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateNotEqualTo(Date value) {
            addCriterion("lastmodify_date <>", value, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateGreaterThan(Date value) {
            addCriterion("lastmodify_date >", value, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastmodify_date >=", value, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateLessThan(Date value) {
            addCriterion("lastmodify_date <", value, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateLessThanOrEqualTo(Date value) {
            addCriterion("lastmodify_date <=", value, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateIn(List<Date> values) {
            addCriterion("lastmodify_date in", values, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateNotIn(List<Date> values) {
            addCriterion("lastmodify_date not in", values, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateBetween(Date value1, Date value2) {
            addCriterion("lastmodify_date between", value1, value2, "lastmodifyDate");
            return (Criteria) this;
        }

        public Criteria andLastmodifyDateNotBetween(Date value1, Date value2) {
            addCriterion("lastmodify_date not between", value1, value2, "lastmodifyDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table todo_list
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 19 17:14:31 JST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table todo_list
     *
     * @mbg.generated Wed Jul 19 17:14:31 JST 2023
     */
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