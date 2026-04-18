package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Request {
    @JsonProperty
    private String robot;

    @JsonProperty
    private String command;

    @JsonProperty
    private List<Integer> arguments;

    public Request() {}

    public Request(String robot, String command, List<Integer> arguments) {
        this.robot = robot;
        this.command = command;
        this.arguments = arguments;
    }

    public String getRobot() {
        return robot;
    }

    public String getCommand() {
        return command;
    }

    public List<Integer> getArguments() {
        return arguments;
    }

    public void setRobot(String robot) {
        this.robot = robot;
    }
    public void setCommand(String command) {
        this.command = command;
    }

    public void setArguments(List<Integer> arguments) {
        this.arguments = arguments;
    }
}
