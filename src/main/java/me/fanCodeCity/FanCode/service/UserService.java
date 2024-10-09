package me.fanCodeCity.FanCode.service;

import me.fanCodeCity.FanCode.model.Todo;
import me.fanCodeCity.FanCode.model.User;
import org.springframework.stereotype.Service;
import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public List<User> getAllUsers(){
        return List.of(RestAssured.get(BASE_URL + "/users").as(User[].class));
    }

    public User getUserById(int userId) {
        return RestAssured.get(BASE_URL + "/users/" + userId)
                .as(User.class);
    }

    public List<Todo> getTodosOfUser(int userId) {
        Todo[] todos = RestAssured.get(BASE_URL + "/todos?userId=" + userId)
                .as(Todo[].class);
        return List.of(todos);
    }

    /***
     *
     * @param user: This function take the user object as input and
     * @return the true if the user is from fanCode city of false if not.
     */
    public boolean isFromFanCodeCity(User user){
        double lat = Double.parseDouble(user.getAddress().getGeo().getLat());
        double lng = Double.parseDouble(user.getAddress().getGeo().getLng());
        return lat > -40 && lat < 5 && lng > 5 && lng < 100;
    }

    /***
     *
     * @param allUsers: This function will take the list of all users and
     * @return the user list which are from fanCode city on the basis of geo conditions.
     */
    public List<User> getFanCodeCityUser(List<User> allUsers){
        List<User> fanCodeCityUsers = new ArrayList<>();

        for (User user : allUsers) {
            double lat = Double.parseDouble(user.getAddress().getGeo().getLat());
            double lng = Double.parseDouble(user.getAddress().getGeo().getLng());

            // Check if the user's location fits within Fancode City boundaries
            if (lat > -40 && lat < 5 && lng > 5 && lng < 100) {
                fanCodeCityUsers.add(user);
            }
        }
        return fanCodeCityUsers;
    }

    /***
     *
     * @param user: take user object as input and
     * @return the true if todo complete is above 50% and false if below.
     */
    public boolean hasMoreThanHalfCompletedTasks(User user) {
        List<Todo> todos = getTodosOfUser(user.getId());
        long completedCount = todos.stream().filter(Todo::isCompleted).count();
        return completedCount > (todos.size() / 2);
    }

    /***
     *
     * @param fanCodeUsers: This will take users list of fanCode city as param
     * @return And will return false if any user has less than 50% incomplete todo and true for vise-versa.
     */
    public boolean userHasMoreThanHalfCompletedTasks(List<User> fanCodeUsers) {
        for(User user:fanCodeUsers) {
            List<Todo> todos = getTodosOfUser(user.getId());
            long completedCount = todos.stream().filter(Todo::isCompleted).count();
            if(completedCount < (todos.size() / 2)) return false;
        }
        return true;
    }

}
