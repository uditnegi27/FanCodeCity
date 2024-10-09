package me.fanCodeCity.FanCode.model;

import lombok.Data;

@Data
public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
}