package com.jeelpatel.stpicalculatorgtu.helper;

public class TotalOfGC {
    private String subject;

    public int subjectSelector() {
        switch (subject) {
            case "MEELECTIVE1":
            case "IE3351904":
            case "DOM3351902":
            case "MEELECTIVE3":
            case "MEELECTIVE2":
            case "TE3361902":
                return 5;
            case "THE23351901":
            case "ECC3351905":
            case "CAM3361901":
                return 4;
            case "ME33351903":
                return 7;
            case "IM3361903":
                return 3;
            default:
                return 0;
        }
    }

    public String getGrade() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
