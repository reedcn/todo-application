package com.todo.model;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class AddItemRequest {
	private String title;
	private String description;
	private ZonedDateTime date;
	private boolean done;
}
