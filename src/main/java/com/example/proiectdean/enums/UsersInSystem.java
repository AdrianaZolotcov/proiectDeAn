package com.example.proiectdean.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public enum UsersInSystem {
    USER_A("Bogdan","Iliinca","TI-224",false),
    USER_B("Ceachir","Vladislav","TI-224",false),
    USER_C("Cioresco", "Adrian", "TI-224", false),
    USER_D("Coadă","Livia","TI-224", false),
    USER_E("Cuflic", "Dan","TI-224", false),
    USER_F("Damian","Dan","TI-224", false),
    USER_G("Deleu" ,"Nicoleta","TI-224", false),
    USER_H("Dombrovschi","Iulia","TI-224", false);
    public String nume;
    public String prenume;
    public String grupa;
    public boolean votedFlag;


    UsersInSystem(String nume, String prenume, String grupa, boolean vote){
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.votedFlag = vote;
    }
    UsersInSystem(String nume) {
        this.nume = nume;
    }
    public String get(){
        return this.nume;
    }

    public static List<UsersInSystem> filterUserByName(String input){
        return Arrays.stream(UsersInSystem.values())
                .filter(user->user.nume.contains(input.toString()))
                .collect(Collectors.toList());
    }

}
