package org.zerock.rds1.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.rds1.repository.TimeRepository;

@Service
@Log4j2
@RequiredArgsConstructor
public class TimeServiceImpl implements TimeService{

    private final TimeRepository timeRepository;

    @Override
    public String getTime() {
        return timeRepository.now();
    }
}
