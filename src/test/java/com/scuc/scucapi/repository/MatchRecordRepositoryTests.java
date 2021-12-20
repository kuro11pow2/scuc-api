package com.scuc.scucapi.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.scuc.scucapi.entity.MatchRecord;
import com.scuc.scucapi.entity.QMatchRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class MatchRecordRepositoryTests {

    @Autowired MatchRecordRepository matchRecordRepository;

    @Test
    public void insertDummies() {
        MatchRecord matchRecord1 = MatchRecord.builder()
                .winnerName("유저1").winnerSpecies("프로토스").winnerUniv("A대")
                .loserName("유저2").loserSpecies("저그").loserUniv("B대")
                .mapName("파이썬")
                .matchDateTime(LocalDateTime.now())
                .build();
        MatchRecord matchRecord2 = MatchRecord.builder()
                .winnerName("유저2").winnerSpecies("프로토스").winnerUniv("B대")
                .loserName("유저3").loserSpecies("저그").loserUniv("C대")
                .mapName("파이썬")
                .matchDateTime(LocalDateTime.now())
                .build();
        System.out.println(matchRecordRepository.save(matchRecord1));
        System.out.println(matchRecordRepository.save(matchRecord2));
    }

    @Test
    public void testQuery() {
        QMatchRecord qMatchRecord = QMatchRecord.matchRecord;
        String keyword = "프로토스";

        BooleanBuilder builder = new BooleanBuilder();
        BooleanExpression expression = qMatchRecord.winnerSpecies.contains(keyword);
        builder.and(expression);

        Iterable<MatchRecord> result = matchRecordRepository.findAll(builder);
        result.forEach(matchRecord -> {
            System.out.println(matchRecord);
        });
    }
}
