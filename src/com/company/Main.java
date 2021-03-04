package com.company;

public class Main {


    public static void main(String[] args) {
        UserRegistration u1 = new UserRegistration("Arnob", "arnobifrad@gmail.com", "SterbenSenor", "12345678");

        u1.passwordLengthChecker("12345678");
        u1.showinfo();
    }
}