package com.tecnotab.frontend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnotab.frontend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
