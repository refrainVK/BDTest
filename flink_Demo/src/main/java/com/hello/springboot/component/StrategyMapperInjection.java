package com.hello.springboot.component;

import com.hello.springboot.dao.StrategyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StrategyMapperInjection {
    private final StrategyMapper strategyMapper;

    @Autowired
    public StrategyMapperInjection(StrategyMapper strategyMapper) {
        this.strategyMapper = strategyMapper;
    }
}
