package com.example.proiectdean.service;
import com.example.proiectdean.interfaces.VotesRepository;
import com.example.proiectdean.repository.VotesPcTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VotesService {
    @Autowired
    private static VotesRepository votesRepository;

    @Autowired
    public VotesService(VotesRepository votesRepository) {
        this.votesRepository = votesRepository;
    }

    public static List<VotesPcTable> getAllEntities() {
        return votesRepository.findAllField();
    }
}
