package com.appsdeveloperblog.awslambda;

import com.appsdeveloperblog.awslambda.request.APIGatewayRequest;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class MyLambdaFunctionHandler extends SpringBootRequestHandler<APIGatewayRequest,Object> {
}
