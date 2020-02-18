package com.stq.temperaturecollectionsystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cogo {
    private int A_ID;
    private int U_ID;
    private String A_WAY;
    private Timestamp A_DATETIME;
}
