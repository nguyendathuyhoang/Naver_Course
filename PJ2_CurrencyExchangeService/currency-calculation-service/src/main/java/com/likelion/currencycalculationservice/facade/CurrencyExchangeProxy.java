package com.likelion.currencycalculationservice.facade;

import com.likelion.currencycalculationservice.model.CalculateAmount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CURRENCY-EXCHANGE-SERVICE")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CalculateAmount retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
