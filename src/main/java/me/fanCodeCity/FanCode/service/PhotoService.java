package me.fanCodeCity.FanCode.service;

import io.restassured.RestAssured;
import me.fanCodeCity.FanCode.model.Photo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public List<Photo> getAllPhotos() {
        Photo[] photos = RestAssured.get(BASE_URL + "/photos")
                .as(Photo[].class);
        return List.of(photos);
    }

    public Photo getPhotoById(int photoId) {
        return RestAssured.get(BASE_URL + "/photos/" + photoId)
                .as(Photo.class);
    }

    public List<Photo> getPhotosByAlbumId(int albumId) {
        Photo[] photos = RestAssured.get(BASE_URL + "/photos?albumId=" + albumId)
                .as(Photo[].class);
        return List.of(photos);
    }
}
