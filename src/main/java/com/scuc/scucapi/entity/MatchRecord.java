package com.scuc.scucapi.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class MatchRecord extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    @Column(nullable = false)
    private String winnerName; // FK로 수정

    @Column(nullable = false)
    private String winnerUniv;  // FK로 수정

    @Column(nullable = false)
    private String winnerSpecies;

    @Column(nullable = false)
    private String loserName; // FK로 수정

    @Column(nullable = false)
    private String loserUniv;  // FK로 수정

    @Column(nullable = false)
    private String loserSpecies;

    @Column(nullable = false)
    private String mapName; // FK로 수정

    @Column(nullable = false)
    private LocalDateTime matchDateTime;
}
