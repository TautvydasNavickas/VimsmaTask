package com.example.visma.entity;

import java.util.ArrayList;
import java.util.List;

public class Meetings {

    private List<Meeting> metingList;

    public List<Meeting> getMetingList() {
        if(metingList == null) {
            metingList = new ArrayList<>();
        }
        return metingList;
    }

    public void setEmployeeList(List<Meeting> meetingsList) {
        this.metingList = meetingsList;
    }


}
