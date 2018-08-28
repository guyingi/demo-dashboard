package gu.pojo;

import java.util.ArrayList;
import java.util.List;

public class IptableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IptableExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNginxIpIsNull() {
            addCriterion("nginx_ip is null");
            return (Criteria) this;
        }

        public Criteria andNginxIpIsNotNull() {
            addCriterion("nginx_ip is not null");
            return (Criteria) this;
        }

        public Criteria andNginxIpEqualTo(String value) {
            addCriterion("nginx_ip =", value, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpNotEqualTo(String value) {
            addCriterion("nginx_ip <>", value, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpGreaterThan(String value) {
            addCriterion("nginx_ip >", value, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpGreaterThanOrEqualTo(String value) {
            addCriterion("nginx_ip >=", value, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpLessThan(String value) {
            addCriterion("nginx_ip <", value, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpLessThanOrEqualTo(String value) {
            addCriterion("nginx_ip <=", value, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpLike(String value) {
            addCriterion("nginx_ip like", value, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpNotLike(String value) {
            addCriterion("nginx_ip not like", value, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpIn(List<String> values) {
            addCriterion("nginx_ip in", values, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpNotIn(List<String> values) {
            addCriterion("nginx_ip not in", values, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpBetween(String value1, String value2) {
            addCriterion("nginx_ip between", value1, value2, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andNginxIpNotBetween(String value1, String value2) {
            addCriterion("nginx_ip not between", value1, value2, "nginxIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpIsNull() {
            addCriterion("upstream_ip is null");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpIsNotNull() {
            addCriterion("upstream_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpEqualTo(String value) {
            addCriterion("upstream_ip =", value, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpNotEqualTo(String value) {
            addCriterion("upstream_ip <>", value, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpGreaterThan(String value) {
            addCriterion("upstream_ip >", value, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpGreaterThanOrEqualTo(String value) {
            addCriterion("upstream_ip >=", value, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpLessThan(String value) {
            addCriterion("upstream_ip <", value, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpLessThanOrEqualTo(String value) {
            addCriterion("upstream_ip <=", value, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpLike(String value) {
            addCriterion("upstream_ip like", value, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpNotLike(String value) {
            addCriterion("upstream_ip not like", value, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpIn(List<String> values) {
            addCriterion("upstream_ip in", values, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpNotIn(List<String> values) {
            addCriterion("upstream_ip not in", values, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpBetween(String value1, String value2) {
            addCriterion("upstream_ip between", value1, value2, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamIpNotBetween(String value1, String value2) {
            addCriterion("upstream_ip not between", value1, value2, "upstreamIp");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortIsNull() {
            addCriterion("upstream_port is null");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortIsNotNull() {
            addCriterion("upstream_port is not null");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortEqualTo(Integer value) {
            addCriterion("upstream_port =", value, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortNotEqualTo(Integer value) {
            addCriterion("upstream_port <>", value, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortGreaterThan(Integer value) {
            addCriterion("upstream_port >", value, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("upstream_port >=", value, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortLessThan(Integer value) {
            addCriterion("upstream_port <", value, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortLessThanOrEqualTo(Integer value) {
            addCriterion("upstream_port <=", value, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortIn(List<Integer> values) {
            addCriterion("upstream_port in", values, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortNotIn(List<Integer> values) {
            addCriterion("upstream_port not in", values, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortBetween(Integer value1, Integer value2) {
            addCriterion("upstream_port between", value1, value2, "upstreamPort");
            return (Criteria) this;
        }

        public Criteria andUpstreamPortNotBetween(Integer value1, Integer value2) {
            addCriterion("upstream_port not between", value1, value2, "upstreamPort");
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