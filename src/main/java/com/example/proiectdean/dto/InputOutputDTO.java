package com.example.proiectdean.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InputOutputDTO {
    public String nume;
    public String prenume;
    public int votePurcent;

    @Getter @Setter
    public static class InputOutputDTO {
        public String nume;
        public String prenume;
        public int votePurcent;

    }
}
