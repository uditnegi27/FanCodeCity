package me.fanCodeCity.FanCode.service;

import io.restassured.RestAssured;
import me.fanCodeCity.FanCode.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public List<Comment> getAllComments() {
        Comment[] comments = RestAssured.get(BASE_URL + "/comments")
                .as(Comment[].class);
        return List.of(comments);
    }

    public Comment getCommentById(int commentId) {
        return RestAssured.get(BASE_URL + "/comments/" + commentId)
                .as(Comment.class);
    }

    public List<Comment> getCommentsByPostId(int postId) {
        Comment[] comments = RestAssured.get(BASE_URL + "/comments?postId=" + postId)
                .as(Comment[].class);
        return List.of(comments);
    }
}
