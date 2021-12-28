package com.scuc.scucapi.controller;

import com.scuc.scucapi.dto.MatchRecordDTO;
import com.scuc.scucapi.service.MatchRecordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/api")
@Log4j2
@RequiredArgsConstructor
public class MatchRecordController {

    private final MatchRecordService matchRecordService;

    @GetMapping(value = "/record", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MatchRecordDTO>> getRecordAll() {
        return new ResponseEntity<>(matchRecordService.getList(), HttpStatus.OK);
    }

    @GetMapping(value = "/record/{mno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MatchRecordDTO> getRecord(@PathVariable("mno") Long mno) {
        return new ResponseEntity<>(matchRecordService.get(mno), HttpStatus.OK);
    }

    /**
     * user 객체 없음 (테스트용)
     */
    @GetMapping(value = "test/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getUserAll() {
        HashSet<String> userSet = new HashSet<>();
        for (MatchRecordDTO matchRecordDTO : matchRecordService.getList()) {
            userSet.add(matchRecordDTO.getWinnerName());
            userSet.add(matchRecordDTO.getLoserName());
        }
        return new ResponseEntity<>(new ArrayList<>(userSet), HttpStatus.OK);
    }
}
