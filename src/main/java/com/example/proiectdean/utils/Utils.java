package com.example.proiectdean.utils;

import com.example.proiectdean.enums.Candidates;
import com.example.proiectdean.dto.InputOutputDTO;

import java.util.ArrayList;

public class Utils {
    public static ArrayList<InputOutputDTO> getAll(){
        Candidates[] candidatesArray = Candidates.values();
        ArrayList<InputOutputDTO> candidatesList = new ArrayList<InputOutputDTO>();

        // Print each element and its parameter
        for (Candidates name : candidatesArray) {
            InputOutputDTO responsOBJ = new InputOutputDTO();
            responsOBJ.prenume = name.prenume;
            responsOBJ.votePurcent = name.votePurcent;
            responsOBJ.nume = name.nume;
            candidatesList.add(responsOBJ);


    }
        return candidatesList;
    }

    public static InputOutputDTO getByName(String name){
        Candidates[] candidatesArray = Candidates.values();
        InputOutputDTO responsOBJ = new InputOutputDTO();
        // Print each element and its parameter
        for (Candidates candidat : candidatesArray) {
            if(candidat.nume.equals(name) ){
                responsOBJ.prenume = candidat.prenume;
                responsOBJ.votePurcent = candidat.votePurcent;
                responsOBJ.nume = candidat.nume;
            }
        }
        return responsOBJ;

    }

    public static void quickSort(String[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(String[] array, int low, int high) {
        String pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;

                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        String temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

}


