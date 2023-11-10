package com.example.proiectdean.enums;

import com.example.proiectdean.dto.InputOutputDTO;
import com.example.proiectdean.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Candidates {
    CANDIDAT_A("Rusu","Iulia",0),
    CANDIDAT_B("Motpan","Maria",0),
    CANDIDAT_C("Bulat","Constantin",0),
    CANDIDAT_D("Grosu","Ana",0),
    CANDIDAT_E("Stepanov","Tudor",0),
    CANDIDAT_F("Sudacevschi","Maria",0),
    CANDIDAT_G("Surdu","Ionela",0),
    CANDIDAT_H("Pastica","Andreea",0);
    public String nume;
    public String prenume;
    public int votePurcent;

    Candidates(String nume, String prenume, int vote){
    this.nume = nume;
    this.prenume = prenume;
    this.votePurcent = vote;
}
    Candidates(String nume) {
        this.nume = nume;
    }
    public Candidates get(){
        return this;
    }
    public static List<Candidates> filterCandidatByName(String input){
        return Arrays.stream(Candidates.values())
                .filter(user->user.nume.contains(input.toString()))
                .collect(Collectors.toList());
    }
    public void saveVoteToCandidates(){

        this.votePurcent ++;
    }

    public static void voted(InputOutputDTO candidates){
        Candidates[] candidatesArray = Candidates.values();
        for (Candidates candidat : candidatesArray) {
            if(candidat.nume.equals(candidates.nume)&&candidat.prenume.equals(candidates.prenume)){
                candidat.saveVoteToCandidates();
            }
        }

    }

    public static int totalNumberOfVotes(){
        int totalNumbers = 0;
        Candidates[] candidatesArray = Candidates.values();
        for (Candidates candidat : candidatesArray) {
            totalNumbers += candidat.votePurcent;
        }
        return totalNumbers;
    }

    public static ArrayList<InputOutputDTO> percentOfVote(){
        ArrayList<InputOutputDTO>percentOfVote = new ArrayList<InputOutputDTO>();
        int totalNumber = totalNumberOfVotes();
        Candidates[] candidatesArray = Candidates.values();
        for (Candidates candidat : candidatesArray) {
            if(candidat.votePurcent != 0){
                InputOutputDTO obj = new InputOutputDTO();
                obj.nume = candidat.nume;
                obj.prenume = candidat.prenume;
                obj.votePurcent = (candidat.votePurcent * 100)/totalNumber;
                percentOfVote.add(obj);
            }
        }
        return percentOfVote;
    }

    public static ArrayList<InputOutputDTO> quickSortByName(){
        Candidates[] candidatesArray = Candidates.values();
        ArrayList<InputOutputDTO> candidatesList = new ArrayList<InputOutputDTO>();
        String[] names = Arrays.stream(Candidates.values()).map(can -> can.nume).toList().toArray(new String[0]);
        Utils.quickSort(names,0,names.length-1);
        for (String name:names){
            for (Candidates candidat : candidatesArray) {
                InputOutputDTO responsOBJ = new InputOutputDTO();
                 if(candidat.nume.equals(name) ){
                    responsOBJ.prenume = candidat.prenume;
                    responsOBJ.votePurcent = candidat.votePurcent;
                    responsOBJ.nume = candidat.nume;
                     candidatesList.add(responsOBJ);
            }


            }


        }
        return candidatesList;
    }

}
