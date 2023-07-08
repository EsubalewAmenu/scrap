package com.visionapps.grade12;

public class User {
    public String bank;
    public String deviceid;
    public String email;
    public String field;
    public String fname;
    public String mobileBanking;
    public String oldid;
    public String pay;
    public String phonenumber;
    public String schoolname;

    public User() {
    }

    public User(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.fname = str;
        this.email = str2;
        this.deviceid = str3;
        this.oldid = str4;
        this.schoolname = str5;
        this.field = str6;
        this.pay = str7;
        this.mobileBanking = str8;
        this.bank = str9;
        this.phonenumber = str10;
    }
}
