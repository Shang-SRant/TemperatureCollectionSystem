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
    private String U_NAME;
    private String U_SEX;
    private String U_AGE;
    private String U_IDCARD;
    private String U_HOME;
    private String A_WAY;
    private float T_TEMPERATURE;
    private Timestamp T_DATETIME;
}
