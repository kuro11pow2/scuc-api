package com.scuc.scucapi.service;

import com.scuc.scucapi.dto.MatchRecordDTO;
import com.scuc.scucapi.entity.MatchRecord;

import java.util.List;

public interface MatchRecordService {

    Long register(MatchRecordDTO dto);
    List<MatchRecordDTO> getList();
    MatchRecordDTO get(Long mno);

    default MatchRecord dtoToEntity(MatchRecordDTO dto) {
        MatchRecord matchRecord = MatchRecord.builder()
                .rno(dto.getRno())
                .winnerName(dto.getWinnerName())
                .winnerUniv(dto.getWinnerUniv())
                .winnerSpecies(dto.getWinnerSpecies())
                .loserName(dto.getLoserName())
                .loserUniv(dto.getLoserUniv())
                .loserSpecies(dto.getLoserSpecies())
                .mapName(dto.getMapName())
                .matchDateTime(dto.getMatchDateTime())
                .build();
        return matchRecord;
    }

    default MatchRecordDTO entityToDto(MatchRecord matchRecord) {
        MatchRecordDTO dto = MatchRecordDTO.builder()
                .rno(matchRecord.getRno())
                .winnerName(matchRecord.getWinnerName())
                .winnerUniv(matchRecord.getWinnerUniv())
                .winnerSpecies(matchRecord.getWinnerSpecies())
                .loserName(matchRecord.getLoserName())
                .loserUniv(matchRecord.getLoserUniv())
                .loserSpecies(matchRecord.getLoserSpecies())
                .mapName(matchRecord.getMapName())
                .matchDateTime(matchRecord.getMatchDateTime())
                .regDate(matchRecord.getRegDate())
                .modDate(matchRecord.getModDate())
                .build();
        return dto;
    }
}
