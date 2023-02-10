package com.jsp.votingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.votingapp.dao.LoginDao;

@Service
public class LoginService {
@Autowired

	LoginDao loginDao;
	
}
