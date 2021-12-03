package com.appsdeveloperblog.awslambda.repository;

import org.springframework.data.repository.CrudRepository;
import com.appsdeveloperblog.awslambda.model.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {

}
