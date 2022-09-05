package com.ud.pass.model;

public class Password {
    private int passwordlength;
    private String uppercase;
    private String lowercase;
    private String number;
    private String specialcharacter;

    public Password() {
        super();
    }

    public Password(int passwordlength, String uppercase, String lowercase, String number, String specialcharacter) {
        this.passwordlength = passwordlength;
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.number = number;
        this.specialcharacter = specialcharacter;
    }

    public int getPasswordlength() {
        return passwordlength;
    }

    public void setPasswordlength(int passwordlength) {
        this.passwordlength = passwordlength;
    }

    public String getUppercase() {
        return uppercase;
    }

    public void setUppercase(String uppercase) {
        this.uppercase = uppercase;
    }

    public String getLowercase() {
        return lowercase;
    }

    public void setLowercase(String lowercase) {
        this.lowercase = lowercase;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpecialcharacter() {
        return specialcharacter;
    }

    public void setSpecialcharacter(String specialcharacter) {
        this.specialcharacter = specialcharacter;
    }

    @Override
    public String toString() {
        return "Password{" +
                "passwordlength=" + passwordlength +
                ", uppercase='" + uppercase + '\'' +
                ", lowercase='" + lowercase + '\'' +
                ", number='" + number + '\'' +
                ", specialcharacter='" + specialcharacter + '\'' +
                '}';
    }
}
