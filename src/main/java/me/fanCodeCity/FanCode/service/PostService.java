package me.fanCodeCity.FanCode.service;

import io.restassured.RestAssured;
import me.fanCodeCity.FanCode.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public List<Post> getAllPosts() {
        Post[] posts = RestAssured.get(BASE_URL + "/posts")
                .as(Post[].class);
        return List.of(posts);
    }

    public Post getPostById(int postId) {
        return RestAssured.get(BASE_URL + "/posts/" + postId)
                .as(Post.class);
    }

    public List<Post> getPostsOfUser(int userId) {
        Post[] posts = RestAssured.get(BASE_URL + "/posts?userId=" + userId)
                .as(Post[].class);
        return List.of(posts);
    }

}
