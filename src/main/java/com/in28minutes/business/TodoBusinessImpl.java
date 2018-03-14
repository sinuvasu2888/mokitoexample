package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;
//TodoBusinessImpl SUT
//TodoService Dependency

public class TodoBusinessImpl {

    private TodoService todoservice;


    public TodoBusinessImpl(TodoService todoservice) {
        super();
        this.todoservice = todoservice;
    }


    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredtodos = new ArrayList<String>();
        List<String> todos = todoservice.retrieveTodos(user);

        for (String todo : todos) {
            if (todo.contains("Spring")) {
                filteredtodos.add(todo);

            }


        }

        return filteredtodos;

    }


}
