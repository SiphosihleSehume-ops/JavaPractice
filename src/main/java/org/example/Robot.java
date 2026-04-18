package org.example;

import java.util.*;

public class Robot {
    private List<Integer> position;
    private int visibility;
    private double reload;
    private double repair;
    private int hits;

    public Robot() {
        this.position = new ArrayList<>(List.of(3, 6));
        this.visibility = 3;
        this.reload = 0.23;
        this.repair = 0.30;
        this.hits = 2;
    }

    public List<Integer> getPosition() {
        return position;
    }

    public int getVisibility() {
        return visibility;
    }

    public double getReload() {
        return reload;
    }

    public double getRepair() {
        return repair;
    }

    public int getHits() {
        return hits;
    }

    public void setPosition(List<Integer> position) {
        this.position = position;
    }
    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public void setReload(double reload) {
        this.reload = reload;
    }

    public void setRepair(double repair) {
        this.repair = repair;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
