package com.jsp.Book_My_Ticket.repository;


import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Book_My_Ticket.entity.Movie;



public interface MovieRepository extends JpaRepository<Movie, Long> {

	boolean existsByNameAndReleaseDate(String name, LocalDate releaseDate);

}