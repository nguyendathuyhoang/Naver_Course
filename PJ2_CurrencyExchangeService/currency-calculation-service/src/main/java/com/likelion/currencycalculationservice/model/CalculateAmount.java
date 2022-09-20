package com.likelion.currencycalculationservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculateAmount {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiplte;
    private BigDecimal quantity;
    private BigDecimal TotalCalculatedAmount;
    private int port;
}
