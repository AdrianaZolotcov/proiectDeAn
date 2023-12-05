package com.example.proiectdean.interfaces;

import com.example.proiectdean.repository.VotesPcTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VotesRepository extends  JpaRepository<VotesPcTable, Long> {

    @Query(value = "SELECT * FROM votes_pc pc", nativeQuery = true)
    List<VotesPcTable> findAllField();
}
