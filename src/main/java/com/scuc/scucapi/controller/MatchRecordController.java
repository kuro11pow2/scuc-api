package com.scuc.scucapi.controller;

import com.scuc.scucapi.dto.MatchRecordDTO;
import com.scuc.scucapi.service.MatchRecordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Log4j2
@RequiredArgsConstructor
public class MatchRecordController {

    private final MatchRecordService matchRecordService;

    @GetMapping(value = "/records", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MatchRecordDTO>> getList() {
        return new ResponseEntity<>(matchRecordService.getList(), HttpStatus.OK);
    }
}
