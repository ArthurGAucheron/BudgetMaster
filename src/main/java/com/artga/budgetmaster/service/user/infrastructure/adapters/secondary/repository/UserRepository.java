package com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.repository;

import com.artga.budgetmaster.service.user.infrastructure.adapters.secondary.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}
