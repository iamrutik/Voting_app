package com.jsp.votingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.votingapp.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
