package com.appsdeveloperblog.awslambda.request;

public class APIGatewayRequest {

    private String httpMethod;
    private UserRequest userRequest;

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public UserRequest getUserRequest() {
        return userRequest;
    }

    public void setUserRequest(UserRequest userRequest) {
        this.userRequest = userRequest;
    }
}
