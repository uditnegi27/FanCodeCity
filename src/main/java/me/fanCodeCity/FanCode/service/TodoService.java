package me.fanCodeCity.FanCode.service;

import io.restassured.RestAssured;
import me.fanCodeCity.FanCode.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public List<Todo> getAllTodos() {
        Todo[] todos = RestAssured.get(BASE_URL + "/todos")
                .as(Todo[].class);
        return List.of(todos);
    }

    public Todo getTodoById(int todoId) {
        return RestAssured.get(BASE_URL + "/todos/" + todoId)
                .as(Todo.class);
    }

    public List<Todo> getTodosOfUser(int userId) {
        Todo[] todos = RestAssured.get(BASE_URL + "/todos?userId=" + userId)
                .as(Todo[].class);
        return List.of(todos);
    }
}
