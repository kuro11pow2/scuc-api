package com.scuc.scucapi.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass // 테이블 생성 방지 (실제 테이블은 BaseEntity를 상속한 엔티티의 클래스로 생성)
@EntityListeners(value={AuditingEntityListener.class})
@Getter
abstract class BaseEntity {

    @CreatedDate
    @Column(name="regdate", updatable = false)
    private LocalDateTime regDate; // 등록 시간

    @LastModifiedDate
    @Column(name="moddate")
    private LocalDateTime modDate; // 수정 시간
}
