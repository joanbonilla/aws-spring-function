package com.altran.aws.lambda.function;


import com.altran.aws.lambda.domain.DataRequest;
import com.altran.aws.lambda.domain.DataResponse;
import com.altran.aws.lambda.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("calculateFunction")
public class CalculatorFunction implements Function<DataRequest, DataResponse> {

    @Autowired
    private CalculatorService service;

    public DataResponse apply(final DataRequest request) {
        DataResponse response = new DataResponse();
        response.setResult(service.calculate(request.getX(), request.getY()));
        return response;
    }

}
