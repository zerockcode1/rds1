package org.zerock.rds1.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "tbl_sample")
public class TimeSample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid;

}
