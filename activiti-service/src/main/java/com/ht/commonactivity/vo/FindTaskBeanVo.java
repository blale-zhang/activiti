package com.ht.commonactivity.vo;


import  java.util.List;
import java.util.Map;

public class FindTaskBeanVo {
    /**
     * 用户名
     */
    private String assignee;

    private String sysCode;

    public String getCandidateUser() {
        return candidateUser;
    }

    public void setCandidateUser(String candidateUser) {
        this.candidateUser = candidateUser;
    }

    /**
     * 候选人
     */
    private String candidateUser ;

    private String taskDefinId;

    private List<ProcessDefinitionKey> processDefinitionKey;

    private int firstResult;

    private int maxResults;

    private List<Map<String,Object>> paramMap;

    /**
     * 候选组
     */
    private List<String> candidateGroup;

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public List<String> getCandidateGroup() {
        return candidateGroup;
    }

    public void setCandidateGroup(List<String> candidateGroup) {
        this.candidateGroup = candidateGroup;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getTaskDefinId() {
        return taskDefinId;
    }

    public void setTaskDefinId(String taskDefinId) {
        this.taskDefinId = taskDefinId;
    }

    public List<ProcessDefinitionKey> getProcessDefinitionKey() {
        return processDefinitionKey;
    }

    public void setProcessDefinitionKey(List<ProcessDefinitionKey> processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public List<Map<String, Object>> getParamMap() {
        return paramMap;
    }

    public void setParamMap( List<Map<String, Object>> paramMap ) {
        this.paramMap = paramMap;
    }

}
