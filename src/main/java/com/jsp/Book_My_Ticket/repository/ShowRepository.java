package com.jsp.Book_My_Ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Book_My_Ticket.entity.Screen;
import com.jsp.Book_My_Ticket.entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long>{
	List<Show> findByScreen(Screen screen);
}
