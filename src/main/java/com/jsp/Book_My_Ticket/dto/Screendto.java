package com.jsp.Book_My_Ticket.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Screendto {
	@NotBlank
	private String name;
	@NotBlank
	private String type;
	@NotNull
	private Long theaterId;
}
