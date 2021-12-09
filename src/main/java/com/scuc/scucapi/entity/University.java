package com.scuc.scucapi.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "university")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(length = 200, nullable = false)
    private String name;
}
