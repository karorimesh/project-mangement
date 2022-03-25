package com.karorimesh.projectmangement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CalculatorDTO {
    private Double num1;
    private Double num2;
    private Double num3;
    @JsonProperty("lastNum")
    private Double num4;
}
