package com.todo.model;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ToDoItem {

	public ToDoItem(String titleInput, String descInput, ZonedDateTime dateInput, boolean doneInput) {
		this.title = titleInput;
		this.description = descInput;
		this.date = dateInput;
		this.done = doneInput;
	}

	@Id
	@GeneratedValue
	private Long id;

	@NonNull
	private String title;
	@NonNull
	private String description;
	@NonNull
	private ZonedDateTime date;

	private boolean done;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	@JsonIgnore
	private ToDoCategory category;
}
