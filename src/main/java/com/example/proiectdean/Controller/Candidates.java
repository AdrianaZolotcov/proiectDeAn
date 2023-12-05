package com.example.proiectdean.Controller;

public enum Candidates {
    CANDIDAT_A("CANDIDAT_A"),
    CANDIDAT_B("CANDIDAT_B"),
    CANDIDAT_C("CANDIDAT_C"),
    CANDIDAT_D("CANDIDAT_D"),
    CANDIDAT_E("CANDIDAT_E"),
    CANDIDAT_F("CANDIDAT_F"),
    CANDIDAT_G("CANDIDAT_G"),
    CANDIDAT_H("CANDIDAT_H");
    public String candidat;

    Candidates(String candidat) {
    }

    public static Candidates[] getAll(){
        return Candidates.values();
    }
}
