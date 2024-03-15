package com.jeelpatel.stpicalculatorgtu.helper;

public class GTUGrade {
    private String grade;

    public int gradePointSelector() {
        switch (grade) {
            case "AA":
                return 10;
            case "AB":
                return 9;
            case "BB":
                return 8;
            case "BC":
                return 7;
            case "CC":
                return 6;
            case "CD":
                return 5;
            case "DD":
                return 4;
            default:
                return 0;
        }
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}