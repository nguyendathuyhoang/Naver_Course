package com.likelion.currencyexchangeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValue {
    @Id
    private long Id;
    @Column(name="currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    private int port;
}
