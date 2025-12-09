package com.jsp.Book_My_Ticket.service;

import java.io.IOException;

import org.springframework.ui.ModelMap;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jsp.Book_My_Ticket.dto.LoginDto;
import com.jsp.Book_My_Ticket.dto.PasswordDto;
import com.jsp.Book_My_Ticket.dto.Screendto;
import com.jsp.Book_My_Ticket.dto.TheaterDto;
import com.jsp.Book_My_Ticket.dto.UserDto;
import com.jsp.Book_My_Ticket.entity.Screen;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

public interface UserService {

	String login(LoginDto dto, RedirectAttributes attributes,HttpSession session);

	String logout(HttpSession session, RedirectAttributes attributes);

	String submitOtp(int otp, String email, RedirectAttributes attributes);

	String register(UserDto userDto, BindingResult result, RedirectAttributes attributes);

	String forgotPassword(String email, RedirectAttributes attributes);

	String resendOtp(String email, RedirectAttributes attributes);

	String resetPassword(PasswordDto passwordDto, BindingResult result, RedirectAttributes attributes,
			ModelMap map);

	String manageUsers(HttpSession session, RedirectAttributes attributes, ModelMap map);

	String blockUser(Long id, HttpSession session, RedirectAttributes attributes);

	String unBlockUser(Long id, HttpSession session, RedirectAttributes attributes);

	String addTheater(HttpSession session, RedirectAttributes attributes, TheaterDto theaterDto, BindingResult result)
			throws IOException;

	String loadAddTheater(HttpSession session, RedirectAttributes attributes, TheaterDto theaterDto);

	String manageTheater(ModelMap map, RedirectAttributes attributes, HttpSession session);

	String deleteTheater(Long id, HttpSession session, RedirectAttributes attributes);

	String updateTheater(HttpSession session, RedirectAttributes attributes, @Valid TheaterDto theaterDto,
			BindingResult result, Long id);

	String editTheater(Long id, HttpSession session, RedirectAttributes attributes, ModelMap map);

	String manageScreens(Long id, HttpSession session, RedirectAttributes attributes, ModelMap map);

	String addScreen(Long id, HttpSession session, RedirectAttributes attributes, ModelMap map, Screen screenDto);

	String addScreen(@Valid Screendto screenDto, BindingResult result, HttpSession session,
			RedirectAttributes attributes);

	
}
