package com.scuc.scucapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MatchRecordDTO {
    private Long rno;
    private String winnerName;
    private String winnerUniv;
    private String winnerSpecies;
    private String loserName;
    private String loserUniv;
    private String loserSpecies;
    private String mapName;
    private LocalDateTime matchDateTime;
    private LocalDateTime regDate, modDate;
}
