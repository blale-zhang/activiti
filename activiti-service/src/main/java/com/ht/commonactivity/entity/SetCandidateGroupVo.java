package com.ht.commonactivity.entity;

import java.util.List;

public class SetCandidateGroupVo {

    private String taskId;

    private List<String> candidateUser;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public List<String> getCandidateUser() {
        return candidateUser;
    }

    public void setCandidateUser(List<String> candidateUser) {
        this.candidateUser = candidateUser;
    }
}
