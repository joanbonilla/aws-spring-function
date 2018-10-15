package com.altran.aws.lambda.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int calculate(int x, int y){
        return x + y;
    }

}
