package com.scuc.scucapi.repository;

import com.scuc.scucapi.entity.MatchRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface MatchRecordRepository extends
        JpaRepository<MatchRecord, Long>,
        QuerydslPredicateExecutor<MatchRecord> {

}
