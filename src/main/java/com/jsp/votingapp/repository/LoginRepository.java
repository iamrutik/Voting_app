package com.jsp.votingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.votingapp.dto.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

}
