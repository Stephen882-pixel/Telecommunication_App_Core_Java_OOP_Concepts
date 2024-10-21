package org.example;

public class DeskPhone implements Telephone{

    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Deskphone is always powered on");
    }

    @Override
    public void dialNumber(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on DeskPhone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskphone");
            isRinging = false;
        }else{
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber){
           isRinging =  true;
            System.out.println("Phone ringing");
        } else {

            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
