package com.jsp.votingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.votingapp.dto.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
