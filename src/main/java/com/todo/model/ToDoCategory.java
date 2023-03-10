package com.todo.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ToDoCategory implements Serializable {
	@Id
	@GeneratedValue
	private Long id;

	@NonNull
	private String name;
	
	private String description;

	@ManyToOne
	@JoinColumn(name = "userid")
	@JsonIgnore
	private User user;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private List<ToDoItem> toDoList;
}
