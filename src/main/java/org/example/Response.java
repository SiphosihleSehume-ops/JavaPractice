package org.example;

import java.util.*;

public class Response {
    private String result;
    private Robot data; //Assuming Robot name and SCORE
    private RobotState state;

    public Response() {}

    //s
    public Response(String result, Robot data) { //Handles
        this.result = result;
        this.data = data;
    }

    public Response(String result, Robot data, RobotState state) {
        this.result = result;
        this.data = data;
        this.state = state;
    }

    public String getResult() {
        return result;
    }

    public Robot getData() {
        return data;
    }

    public RobotState getState() {
        return state;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setData(Robot data) {
        this.data = data;
    }

    public void setState(RobotState state) {
        this.state = state;
    }
}
