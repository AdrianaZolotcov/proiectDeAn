package com.example.proiectdean.controller;

import com.example.proiectdean.dto.InputOutputDTO;
import com.example.proiectdean.dto.UserDTO;
import com.example.proiectdean.enums.Candidates;
import com.example.proiectdean.enums.UsersInSystem;
import com.example.proiectdean.repository.VotesPcTable;
import com.example.proiectdean.service.*;
import com.example.proiectdean.utils.Utils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerVote {
    @GetMapping("/getCandidates")
    public List<InputOutputDTO> getCandidates(){
        return Utils.getAll().stream().toList();
    }

    @GetMapping("/getCandidatesFromDB")
    public List<VotesPcTable> getCandidatesFromDB(){
        return VotesService.getAllEntities();
    }

    @GetMapping("/getCandidatesByName")
    public InputOutputDTO getCandidatesByName(@RequestParam String name){
        return Utils.getByName(name);//nu intoarce corect lista
    }

    @GetMapping("/getCandidatesSort")
    public ArrayList<InputOutputDTO> getCandidatesSort(){
        return Candidates.quickSortByName();
    }



    @PostMapping("/logIn")
    public boolean logInUser( @RequestBody UserDTO userDTO) {
        if (UsersInSystem.filterUserByName(userDTO.nume).size() > 0) {
            return true;
        } else return false;
    }

    @PostMapping("/votat")
    public void votat (@RequestBody InputOutputDTO votat){
        Candidates.voted(votat);
    }

    @GetMapping("/votedProcent")
    public ArrayList<InputOutputDTO> percent(){
        return Candidates.percentOfVote();

    }


}


