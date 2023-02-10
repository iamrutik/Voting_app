package com.jsp.votingapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.votingapp.repository.LoginRepository;

@Repository
public class LoginDao {
@Autowired

	LoginRepository loginRepository;
}
