package com.appsdeveloperblog.awslambda.functions;

import com.appsdeveloperblog.awslambda.model.UserEntity;
import com.appsdeveloperblog.awslambda.repository.UserRepository;
import com.appsdeveloperblog.awslambda.request.APIGatewayRequest;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.function.Function;

@Component
public class CreateUserFunction implements Function<APIGatewayRequest,UserEntity> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity apply(APIGatewayRequest userRequest) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = modelMapper.map(userRequest.getUserRequest(), UserEntity.class);
        userEntity.setId(UUID.randomUUID().toString());
        userRepository.save(userEntity);
        return userEntity;
    }
}
