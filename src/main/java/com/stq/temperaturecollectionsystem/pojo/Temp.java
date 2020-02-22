package com.stq.temperaturecollectionsystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Temp {
    private int T_ID;
    private int U_ID;
    private String U_NAME;
    private String A_WAY;
    private float T_TEMPERATURE;
    private Timestamp T_DATETIME;
}
