package me.fanCodeCity.FanCode.model;

import lombok.Data;

@Data
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
}