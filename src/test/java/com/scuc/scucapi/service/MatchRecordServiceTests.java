package com.scuc.scucapi.service;

import com.scuc.scucapi.dto.MatchRecordDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class MatchRecordServiceTests {

    @Autowired MatchRecordService service;

    @Test
    public void testRegister() {
        MatchRecordDTO matchRecordDTO = MatchRecordDTO.builder()
                .winnerName("유저4")
                .winnerUniv("B대")
                .winnerSpecies("저그")
                .loserName("유저5")
                .loserUniv("A대")
                .loserSpecies("프로토스")
                .mapName("그냥맵")
                .matchDateTime(LocalDateTime.now())
                .build();

        System.out.println(service.register(matchRecordDTO));
    }

    @Test
    public void testGetList() {

        List<MatchRecordDTO> matchRecordDTOList = service.getList();
        matchRecordDTOList.forEach(matchRecordDTO -> System.out.println(matchRecordDTO));
    }
}
