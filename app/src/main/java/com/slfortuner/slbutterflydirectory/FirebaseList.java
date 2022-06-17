package com.slfortuner.slbutterflydirectory;

public class FirebaseList {

    String butterflyId;
    String butterflyName;
    String butterflyLongitude;
    String butterflyLatitude;
    String time;
    String date;
    String notice;

    public FirebaseList(String butterflyId, String butterflyName, String butterflyLongitude, String butterflyLatitude, String time, String date, String notice) {
        this.butterflyId = butterflyId;
        this.butterflyName = butterflyName;
        this.butterflyLongitude = butterflyLongitude;
        this.butterflyLatitude= butterflyLatitude;
        this.time=time;
        this.date=date;
        this.notice=notice;
    }

    public String getButterflyId() {
        return butterflyId;
    }

    public String getButterflyName() {
        return butterflyName;
    }

    public String getButterflyLongitude() {
        return butterflyLongitude;
    }

    public String getButterflyLatitude() {
        return butterflyLatitude;
    }
    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getNotice() {
        return notice;
    }
}
