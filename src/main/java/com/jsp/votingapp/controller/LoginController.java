package com.jsp.votingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.votingapp.service.LoginService;

@RestController
public class LoginController {
@Autowired
	LoginService loginService;
}
