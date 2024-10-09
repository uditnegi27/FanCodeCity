package me.fanCodeCity.FanCode.service;

import io.restassured.RestAssured;
import me.fanCodeCity.FanCode.model.Album;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public List<Album> getAllAlbums() {
        Album[] albums = RestAssured.get(BASE_URL + "/albums")
                .as(Album[].class);
        return List.of(albums);
    }

    public Album getAlbumById(int albumId) {
        return RestAssured.get(BASE_URL + "/albums/" + albumId)
                .as(Album.class);
    }

    public List<Album> getAlbumsByUserId(int userId) {
        Album[] albums = RestAssured.get(BASE_URL + "/albums?userId=" + userId)
                .as(Album[].class);
        return List.of(albums);
    }
}
