package org.example;

import java.util.*;

public class RobotState {
    private List<Integer> position;
    private String direction;
    private int shields;
    private int shots;
    private String status; //The robot is trapped!

    public RobotState() { //Returns when successful
        this.position = new ArrayList<>(List.of(2, 4));
        this.direction = "NORTH";
        this.shields = 33;
        this.shots = 23;
        this.status = "NORMAL";
    }

    public List<Integer> getPosition() {
        return position;
    }

    public String getDirection() {
        return direction;
    }

    public int getShields() {
        return shields;
    }

    public int getShots() {
        return shots;
    }

    public String getOpStatus() {
        return status;
    }

    public void setPosition(List<Integer> position) {
        this.position = position;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setShields(int shields) {
        this.shields = shields;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public void setOpStatus(String opStatus) {
        this.status = opStatus;
    }
}
