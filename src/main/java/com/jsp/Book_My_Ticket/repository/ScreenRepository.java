package com.jsp.Book_My_Ticket.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.Book_My_Ticket.entity.Screen;
import com.jsp.Book_My_Ticket.entity.Theater;

public interface ScreenRepository extends JpaRepository<Screen, Long> {
	List<Screen> findByTheater(Theater theater);

	boolean existsByNameAndTheater(String name, Theater theater);
}
