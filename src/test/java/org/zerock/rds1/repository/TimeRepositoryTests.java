package org.zerock.rds1.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
select now();

CREATE DATABASE webdb;

CREATE USER 'webuser'@'%' IDENTIFIED BY 'webuser';

GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, INDEX, ALTER, CREATE TEMPORARY TABLES,
    CREATE VIEW, EVENT, TRIGGER, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EXECUTE
    ON `webdb`.* TO 'webuser'@'%';
FLUSH PRIVILEGES;

 */

@SpringBootTest
@Log4j2
public class TimeRepositoryTests {

    @Autowired
    private TimeRepository timeRepository;

    @Test
    public void testNow() {

        log.info(timeRepository.now());

    }
}
