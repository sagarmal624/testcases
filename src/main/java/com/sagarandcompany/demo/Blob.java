package com.sagarandcompany.demo;

public class Blob {
    private String name;
    private Long lastUpdateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "Blob{" +
                "name='" + name + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                '}';
    }
}
