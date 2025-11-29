package com.jsp.Book_My_Ticket.service;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jsp.Book_My_Ticket.dto.LoginDto;
import com.jsp.Book_My_Ticket.dto.UserDto;

import jakarta.servlet.http.HttpSession;

public interface UserService {

	String login(LoginDto dto, RedirectAttributes attributes,HttpSession session);

	String logout(HttpSession session, RedirectAttributes attributes);

	String submitOtp(int otp, String email, RedirectAttributes attributes);

	String register(UserDto userDto, BindingResult result, RedirectAttributes attributes);
}

