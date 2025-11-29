package com.jsp.Book_My_Ticket.service;

import com.jsp.Book_My_Ticket.dto.UserDto;

public interface RedisService {
	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getDtoByEmail(String email);

	int getOtpByEmail(String email);
}
