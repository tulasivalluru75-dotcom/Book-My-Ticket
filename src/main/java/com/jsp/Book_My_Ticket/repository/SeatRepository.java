package com.jsp.Book_My_Ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Book_My_Ticket.entity.Screen;
import com.jsp.Book_My_Ticket.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

	List<Seat> findByScreenOrderBySeatRowAscSeatColumnAsc(Screen screen);

}
