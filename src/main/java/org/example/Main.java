package org.example;

public class Main {
    public static void main(String[] args) {
        DeskPhone myDeskPhone = new DeskPhone("123456");
        mobilePhone myMobilePhone = new mobilePhone("12345");
        myMobilePhone.powerOn();
        myMobilePhone.callPhone("12345");
        myMobilePhone.answer();
//        myPhone.powerOn();
//        myPhone.callPhone("123456");
//        myPhone.answer();
    }
}