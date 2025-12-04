package com.jsp.Book_My_Ticket.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.Book_My_Ticket.entity.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {
	boolean existsByNameAndAddress(String name, String address);
}
