package org.zerock.rds1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.zerock.rds1.domain.TimeSample;

import java.util.Date;

public interface TimeRepository extends JpaRepository<TimeSample, String> {

    @Query(value ="select now()", nativeQuery = true)
    String now();
}
