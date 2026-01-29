package com.jsp.Book_My_Ticket.repository;

import java.time.LocalDate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Book_My_Ticket.entity.Movie;
import com.jsp.Book_My_Ticket.entity.Screen;
import com.jsp.Book_My_Ticket.entity.Show;



public interface ShowRepository extends JpaRepository<Show, Long>{
	List<Show> findByScreen(Screen screen);
	
	List<Show> findByShowDateAfter(LocalDate minusDays);
	
	List<Show> findByMovieAndShowDateAfter(Movie movie, LocalDate minusDays);

	boolean existsByScreen(Screen screen);

	List<Show> findByShowDateAndMovie(LocalDate date, Movie movie);

	boolean existsByMovie(Movie movie);


}
