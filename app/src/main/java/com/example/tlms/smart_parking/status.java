package com.example.tlms.smart_parking;

public class status {
    Long sensor1,sensor2;

    public status() {
    }

    public status(Long sensor1, Long sensor2) {
        this.sensor1 = sensor1;
        this.sensor2 = sensor2;
    }

    public Long getSensor1() {
        return sensor1;
    }

    public void setSensor1(Long sesor1) {
        this.sensor1 = sesor1;
    }

    public Long getSensor2() {
        return sensor2;
    }

    public void setSensor2(Long sensor2) {
        this.sensor2 = sensor2;
    }
}
