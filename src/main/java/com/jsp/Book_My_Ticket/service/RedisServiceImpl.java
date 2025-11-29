package com.jsp.Book_My_Ticket.service;

import java.time.Duration;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.jsp.Book_My_Ticket.dto.UserDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService{
	private final RedisTemplate<String, Object> redisTemplate;

	@Override
	public void saveUserDto(String email, UserDto userDto) {
		redisTemplate.opsForValue().set("dto-" + email, userDto, Duration.ofMinutes(2));
	}

	@Override
	public void saveOtp(String email, int otp) {
		redisTemplate.opsForValue().set("otp-" + email, otp, Duration.ofSeconds(30));
		
	}

	@Override
	public UserDto getDtoByEmail(String email) {
		return (UserDto) redisTemplate.opsForValue().get("dto-" + email);
	}

	@Override
	public int getOtpByEmail(String email) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
