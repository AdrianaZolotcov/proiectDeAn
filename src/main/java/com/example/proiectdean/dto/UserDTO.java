package com.example.proiectdean.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO {
    public String nume;
    public String prenume;
    public String grupa;

    public static boolean checkIfPresent(){

        return true;

    }

}

