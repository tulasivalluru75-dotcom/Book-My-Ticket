package com.jsp.Book_My_Ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jsp.Book_My_Ticket.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	void deleteByRole(String string);

	User findByEmail(String email);

	boolean existsByEmail(String email);

	boolean existsByMobile(Long mobile);
	List<User> findByRole(String string);


}
