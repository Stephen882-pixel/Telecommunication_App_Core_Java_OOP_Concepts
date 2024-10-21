package org.example;

public class mobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public mobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone powered on");
    }

    @Override
    public void dialNumber(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on DeskPhone");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn ){
            System.out.println("Answering the mobilePhone");
            isRinging = false;
        }else{

        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber && isPowerOn ){
            isRinging =  true;
            System.out.println("Phone ringing");
        } else {
            System.out.println("Either wrong number entered or phone is off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
