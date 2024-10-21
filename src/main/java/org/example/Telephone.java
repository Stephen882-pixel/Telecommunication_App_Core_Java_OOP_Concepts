package org.example;

public interface Telephone {
    // powerOn
    // dialNumber
    // answerPhoneCall
    // callAnotherPhone
    // isRinging
    void powerOn();
    void dialNumber(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
