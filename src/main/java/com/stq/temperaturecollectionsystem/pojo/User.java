package com.stq.temperaturecollectionsystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int U_ID;
    private String U_NAME;
    private String U_SEX;
    private String U_AGE;
    private String U_IDCARD;
    private String U_HOME;
}
