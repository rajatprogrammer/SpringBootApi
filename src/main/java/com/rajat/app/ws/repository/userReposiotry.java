package com.rajat.app.ws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rajat.app.ws.io.entity.userEntity;

@Repository
public interface userReposiotry extends CrudRepository<userEntity, Long> {
  // userEntity finUserbyEmail(String email);
	userEntity findByEmail(String email);
	userEntity findByUserId(String userId);
}
