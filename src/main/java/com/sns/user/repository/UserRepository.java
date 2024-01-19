package com.sns.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sns.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	// null or UserEntity(단건)
		public UserEntity findByLoginId(String loginId);
		
		// null or UserEntity(단건)
		public UserEntity findByLoginIdAndPassword(String loginId, String password);
}
