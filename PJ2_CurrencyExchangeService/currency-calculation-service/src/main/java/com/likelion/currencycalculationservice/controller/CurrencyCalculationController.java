package com.likelion.currencycalculationservice.controller;

import com.likelion.currencycalculationservice.facade.CurrencyExchangeProxy;
import com.likelion.currencycalculationservice.model.CalculateAmount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyCalculationController {
    private Logger logger = LoggerFactory.getLogger(CurrencyCalculationController.class);

    @Autowired
    private CurrencyExchangeProxy proxy;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CalculateAmount calculateAmount(@PathVariable String from, @PathVariable String to,
                                           @PathVariable BigDecimal quantity)
    {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to",to);
        ResponseEntity<CalculateAmount> responseEntity = restTemplate.getForEntity("http://CURRENCY-EXCHANGE-SERVICE/currency-exchange/from/{from}/to/{to}",
                CalculateAmount.class, uriVariables);
        CalculateAmount calculateAmount=responseEntity.getBody();
        return new CalculateAmount(calculateAmount.getId(), calculateAmount.getFrom(), calculateAmount.getTo(),
                calculateAmount.getConversionMultiplte(),quantity,quantity.multiply(calculateAmount.getConversionMultiplte()),calculateAmount.getPort());
    }

    @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CalculateAmount calculateAmountFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)
    {
        CalculateAmount calculateAmount=proxy.retrieveExchangeValue(from,to);
        logger.info("Port: "+calculateAmount.getPort());
        return new CalculateAmount(calculateAmount.getId(), calculateAmount.getFrom(), calculateAmount.getTo(),
                calculateAmount.getConversionMultiplte(),quantity,quantity.multiply(calculateAmount.getConversionMultiplte()),
                calculateAmount.getPort());
    }
}
