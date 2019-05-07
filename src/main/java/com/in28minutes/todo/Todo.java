package com.in28minutes.todo;

public class Todo {
	private String name;

	public Todo() {
		super();
	}

	public Todo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String todo) {
		this.name = todo;
	}

	@Override
	public String toString() {
		return String.format("Todo [name=%s]", name);
	}
}
