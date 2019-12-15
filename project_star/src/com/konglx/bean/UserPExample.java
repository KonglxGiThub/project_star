package com.konglx.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdIsNull() {
            addCriterion("BUSINESS_POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdIsNotNull() {
            addCriterion("BUSINESS_POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdEqualTo(String value) {
            addCriterion("BUSINESS_POSITION_ID =", value, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdNotEqualTo(String value) {
            addCriterion("BUSINESS_POSITION_ID <>", value, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdGreaterThan(String value) {
            addCriterion("BUSINESS_POSITION_ID >", value, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_POSITION_ID >=", value, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdLessThan(String value) {
            addCriterion("BUSINESS_POSITION_ID <", value, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_POSITION_ID <=", value, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdLike(String value) {
            addCriterion("BUSINESS_POSITION_ID like", value, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdNotLike(String value) {
            addCriterion("BUSINESS_POSITION_ID not like", value, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdIn(List<String> values) {
            addCriterion("BUSINESS_POSITION_ID in", values, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdNotIn(List<String> values) {
            addCriterion("BUSINESS_POSITION_ID not in", values, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdBetween(String value1, String value2) {
            addCriterion("BUSINESS_POSITION_ID between", value1, value2, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andBusinessPositionIdNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_POSITION_ID not between", value1, value2, "businessPositionId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPyCodeIsNull() {
            addCriterion("PY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPyCodeIsNotNull() {
            addCriterion("PY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPyCodeEqualTo(String value) {
            addCriterion("PY_CODE =", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeNotEqualTo(String value) {
            addCriterion("PY_CODE <>", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeGreaterThan(String value) {
            addCriterion("PY_CODE >", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PY_CODE >=", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeLessThan(String value) {
            addCriterion("PY_CODE <", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeLessThanOrEqualTo(String value) {
            addCriterion("PY_CODE <=", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeLike(String value) {
            addCriterion("PY_CODE like", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeNotLike(String value) {
            addCriterion("PY_CODE not like", value, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeIn(List<String> values) {
            addCriterion("PY_CODE in", values, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeNotIn(List<String> values) {
            addCriterion("PY_CODE not in", values, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeBetween(String value1, String value2) {
            addCriterion("PY_CODE between", value1, value2, "pyCode");
            return (Criteria) this;
        }

        public Criteria andPyCodeNotBetween(String value1, String value2) {
            addCriterion("PY_CODE not between", value1, value2, "pyCode");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDutyDeptIsNull() {
            addCriterion("DUTY_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDutyDeptIsNotNull() {
            addCriterion("DUTY_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDutyDeptEqualTo(String value) {
            addCriterion("DUTY_DEPT =", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptNotEqualTo(String value) {
            addCriterion("DUTY_DEPT <>", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptGreaterThan(String value) {
            addCriterion("DUTY_DEPT >", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_DEPT >=", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptLessThan(String value) {
            addCriterion("DUTY_DEPT <", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptLessThanOrEqualTo(String value) {
            addCriterion("DUTY_DEPT <=", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptLike(String value) {
            addCriterion("DUTY_DEPT like", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptNotLike(String value) {
            addCriterion("DUTY_DEPT not like", value, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptIn(List<String> values) {
            addCriterion("DUTY_DEPT in", values, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptNotIn(List<String> values) {
            addCriterion("DUTY_DEPT not in", values, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptBetween(String value1, String value2) {
            addCriterion("DUTY_DEPT between", value1, value2, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyDeptNotBetween(String value1, String value2) {
            addCriterion("DUTY_DEPT not between", value1, value2, "dutyDept");
            return (Criteria) this;
        }

        public Criteria andDutyLevelIsNull() {
            addCriterion("DUTY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDutyLevelIsNotNull() {
            addCriterion("DUTY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDutyLevelEqualTo(String value) {
            addCriterion("DUTY_LEVEL =", value, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelNotEqualTo(String value) {
            addCriterion("DUTY_LEVEL <>", value, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelGreaterThan(String value) {
            addCriterion("DUTY_LEVEL >", value, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_LEVEL >=", value, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelLessThan(String value) {
            addCriterion("DUTY_LEVEL <", value, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelLessThanOrEqualTo(String value) {
            addCriterion("DUTY_LEVEL <=", value, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelLike(String value) {
            addCriterion("DUTY_LEVEL like", value, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelNotLike(String value) {
            addCriterion("DUTY_LEVEL not like", value, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelIn(List<String> values) {
            addCriterion("DUTY_LEVEL in", values, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelNotIn(List<String> values) {
            addCriterion("DUTY_LEVEL not in", values, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelBetween(String value1, String value2) {
            addCriterion("DUTY_LEVEL between", value1, value2, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andDutyLevelNotBetween(String value1, String value2) {
            addCriterion("DUTY_LEVEL not between", value1, value2, "dutyLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("USER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("USER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("USER_LEVEL =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("USER_LEVEL <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("USER_LEVEL >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_LEVEL >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("USER_LEVEL <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("USER_LEVEL <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("USER_LEVEL in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("USER_LEVEL not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("USER_LEVEL between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_LEVEL not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andCnoteIsNull() {
            addCriterion("CNOTE is null");
            return (Criteria) this;
        }

        public Criteria andCnoteIsNotNull() {
            addCriterion("CNOTE is not null");
            return (Criteria) this;
        }

        public Criteria andCnoteEqualTo(String value) {
            addCriterion("CNOTE =", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteNotEqualTo(String value) {
            addCriterion("CNOTE <>", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteGreaterThan(String value) {
            addCriterion("CNOTE >", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteGreaterThanOrEqualTo(String value) {
            addCriterion("CNOTE >=", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteLessThan(String value) {
            addCriterion("CNOTE <", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteLessThanOrEqualTo(String value) {
            addCriterion("CNOTE <=", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteLike(String value) {
            addCriterion("CNOTE like", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteNotLike(String value) {
            addCriterion("CNOTE not like", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteIn(List<String> values) {
            addCriterion("CNOTE in", values, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteNotIn(List<String> values) {
            addCriterion("CNOTE not in", values, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteBetween(String value1, String value2) {
            addCriterion("CNOTE between", value1, value2, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteNotBetween(String value1, String value2) {
            addCriterion("CNOTE not between", value1, value2, "cnote");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("IS_USE is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("IS_USE is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(String value) {
            addCriterion("IS_USE =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(String value) {
            addCriterion("IS_USE <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(String value) {
            addCriterion("IS_USE >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_USE >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(String value) {
            addCriterion("IS_USE <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(String value) {
            addCriterion("IS_USE <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLike(String value) {
            addCriterion("IS_USE like", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotLike(String value) {
            addCriterion("IS_USE not like", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<String> values) {
            addCriterion("IS_USE in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<String> values) {
            addCriterion("IS_USE not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(String value1, String value2) {
            addCriterion("IS_USE between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(String value1, String value2) {
            addCriterion("IS_USE not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsChangePassIsNull() {
            addCriterion("IS_CHANGE_PASS is null");
            return (Criteria) this;
        }

        public Criteria andIsChangePassIsNotNull() {
            addCriterion("IS_CHANGE_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangePassEqualTo(String value) {
            addCriterion("IS_CHANGE_PASS =", value, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassNotEqualTo(String value) {
            addCriterion("IS_CHANGE_PASS <>", value, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassGreaterThan(String value) {
            addCriterion("IS_CHANGE_PASS >", value, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHANGE_PASS >=", value, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassLessThan(String value) {
            addCriterion("IS_CHANGE_PASS <", value, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassLessThanOrEqualTo(String value) {
            addCriterion("IS_CHANGE_PASS <=", value, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassLike(String value) {
            addCriterion("IS_CHANGE_PASS like", value, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassNotLike(String value) {
            addCriterion("IS_CHANGE_PASS not like", value, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassIn(List<String> values) {
            addCriterion("IS_CHANGE_PASS in", values, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassNotIn(List<String> values) {
            addCriterion("IS_CHANGE_PASS not in", values, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassBetween(String value1, String value2) {
            addCriterion("IS_CHANGE_PASS between", value1, value2, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsChangePassNotBetween(String value1, String value2) {
            addCriterion("IS_CHANGE_PASS not between", value1, value2, "isChangePass");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(String value) {
            addCriterion("IS_ONLINE =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(String value) {
            addCriterion("IS_ONLINE <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(String value) {
            addCriterion("IS_ONLINE >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ONLINE >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(String value) {
            addCriterion("IS_ONLINE <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(String value) {
            addCriterion("IS_ONLINE <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLike(String value) {
            addCriterion("IS_ONLINE like", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotLike(String value) {
            addCriterion("IS_ONLINE not like", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<String> values) {
            addCriterion("IS_ONLINE in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<String> values) {
            addCriterion("IS_ONLINE not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(String value1, String value2) {
            addCriterion("IS_ONLINE between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(String value1, String value2) {
            addCriterion("IS_ONLINE not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andCurStationIsNull() {
            addCriterion("CUR_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCurStationIsNotNull() {
            addCriterion("CUR_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCurStationEqualTo(String value) {
            addCriterion("CUR_STATION =", value, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationNotEqualTo(String value) {
            addCriterion("CUR_STATION <>", value, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationGreaterThan(String value) {
            addCriterion("CUR_STATION >", value, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_STATION >=", value, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationLessThan(String value) {
            addCriterion("CUR_STATION <", value, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationLessThanOrEqualTo(String value) {
            addCriterion("CUR_STATION <=", value, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationLike(String value) {
            addCriterion("CUR_STATION like", value, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationNotLike(String value) {
            addCriterion("CUR_STATION not like", value, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationIn(List<String> values) {
            addCriterion("CUR_STATION in", values, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationNotIn(List<String> values) {
            addCriterion("CUR_STATION not in", values, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationBetween(String value1, String value2) {
            addCriterion("CUR_STATION between", value1, value2, "curStation");
            return (Criteria) this;
        }

        public Criteria andCurStationNotBetween(String value1, String value2) {
            addCriterion("CUR_STATION not between", value1, value2, "curStation");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Long value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Long value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Long value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Long value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Long> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Long> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Long value1, Long value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNull() {
            addCriterion("LOGIN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNotNull() {
            addCriterion("LOGIN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNumEqualTo(Integer value) {
            addCriterion("LOGIN_NUM =", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotEqualTo(Integer value) {
            addCriterion("LOGIN_NUM <>", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThan(Integer value) {
            addCriterion("LOGIN_NUM >", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGIN_NUM >=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThan(Integer value) {
            addCriterion("LOGIN_NUM <", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThanOrEqualTo(Integer value) {
            addCriterion("LOGIN_NUM <=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumIn(List<Integer> values) {
            addCriterion("LOGIN_NUM in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotIn(List<Integer> values) {
            addCriterion("LOGIN_NUM not in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumBetween(Integer value1, Integer value2) {
            addCriterion("LOGIN_NUM between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGIN_NUM not between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("LOGIN_TIME =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("LOGIN_TIME <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("LOGIN_TIME >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGIN_TIME >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("LOGIN_TIME <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGIN_TIME <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("LOGIN_TIME in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("LOGIN_TIME not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LOGIN_TIME between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGIN_TIME not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andRealpIsNull() {
            addCriterion("REALP is null");
            return (Criteria) this;
        }

        public Criteria andRealpIsNotNull() {
            addCriterion("REALP is not null");
            return (Criteria) this;
        }

        public Criteria andRealpEqualTo(String value) {
            addCriterion("REALP =", value, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpNotEqualTo(String value) {
            addCriterion("REALP <>", value, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpGreaterThan(String value) {
            addCriterion("REALP >", value, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpGreaterThanOrEqualTo(String value) {
            addCriterion("REALP >=", value, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpLessThan(String value) {
            addCriterion("REALP <", value, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpLessThanOrEqualTo(String value) {
            addCriterion("REALP <=", value, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpLike(String value) {
            addCriterion("REALP like", value, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpNotLike(String value) {
            addCriterion("REALP not like", value, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpIn(List<String> values) {
            addCriterion("REALP in", values, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpNotIn(List<String> values) {
            addCriterion("REALP not in", values, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpBetween(String value1, String value2) {
            addCriterion("REALP between", value1, value2, "realp");
            return (Criteria) this;
        }

        public Criteria andRealpNotBetween(String value1, String value2) {
            addCriterion("REALP not between", value1, value2, "realp");
            return (Criteria) this;
        }

        public Criteria andSuperUserIsNull() {
            addCriterion("SUPER_USER is null");
            return (Criteria) this;
        }

        public Criteria andSuperUserIsNotNull() {
            addCriterion("SUPER_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSuperUserEqualTo(Boolean value) {
            addCriterion("SUPER_USER =", value, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserNotEqualTo(Boolean value) {
            addCriterion("SUPER_USER <>", value, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserGreaterThan(Boolean value) {
            addCriterion("SUPER_USER >", value, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SUPER_USER >=", value, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserLessThan(Boolean value) {
            addCriterion("SUPER_USER <", value, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserLessThanOrEqualTo(Boolean value) {
            addCriterion("SUPER_USER <=", value, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserIn(List<Boolean> values) {
            addCriterion("SUPER_USER in", values, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserNotIn(List<Boolean> values) {
            addCriterion("SUPER_USER not in", values, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserBetween(Boolean value1, Boolean value2) {
            addCriterion("SUPER_USER between", value1, value2, "superUser");
            return (Criteria) this;
        }

        public Criteria andSuperUserNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SUPER_USER not between", value1, value2, "superUser");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsIsNull() {
            addCriterion("IS_SEND_SMS is null");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsIsNotNull() {
            addCriterion("IS_SEND_SMS is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsEqualTo(String value) {
            addCriterion("IS_SEND_SMS =", value, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsNotEqualTo(String value) {
            addCriterion("IS_SEND_SMS <>", value, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsGreaterThan(String value) {
            addCriterion("IS_SEND_SMS >", value, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEND_SMS >=", value, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsLessThan(String value) {
            addCriterion("IS_SEND_SMS <", value, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsLessThanOrEqualTo(String value) {
            addCriterion("IS_SEND_SMS <=", value, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsLike(String value) {
            addCriterion("IS_SEND_SMS like", value, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsNotLike(String value) {
            addCriterion("IS_SEND_SMS not like", value, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsIn(List<String> values) {
            addCriterion("IS_SEND_SMS in", values, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsNotIn(List<String> values) {
            addCriterion("IS_SEND_SMS not in", values, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsBetween(String value1, String value2) {
            addCriterion("IS_SEND_SMS between", value1, value2, "isSendSms");
            return (Criteria) this;
        }

        public Criteria andIsSendSmsNotBetween(String value1, String value2) {
            addCriterion("IS_SEND_SMS not between", value1, value2, "isSendSms");
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