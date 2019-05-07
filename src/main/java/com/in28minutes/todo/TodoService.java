package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	// ideally database; here hardcoded

	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Web"));
		todos.add(new Todo("Learn Spring"));
		todos.add(new Todo("Learn Rest"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
}
