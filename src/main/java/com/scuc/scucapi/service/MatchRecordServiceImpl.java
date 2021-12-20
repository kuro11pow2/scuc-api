package com.scuc.scucapi.service;

import com.scuc.scucapi.dto.MatchRecordDTO;
import com.scuc.scucapi.entity.MatchRecord;
import com.scuc.scucapi.repository.MatchRecordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class MatchRecordServiceImpl implements MatchRecordService {

    private final MatchRecordRepository matchRecordRepository;

    @Override
    public Long register(MatchRecordDTO dto) {

        MatchRecord entity = dtoToEntity(dto);
        matchRecordRepository.save(entity);
        return entity.getRno();
    }

    @Override
    public List<MatchRecordDTO> getList() {

        List<MatchRecord> result = matchRecordRepository.findAll();
        return result.stream().map(matchRecord -> entityToDto(matchRecord)).collect(Collectors.toList());
    }
}
