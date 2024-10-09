package me.fanCodeCity.FanCode.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.spring.CucumberContextConfiguration;
import me.fanCodeCity.FanCode.model.User;
import me.fanCodeCity.FanCode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

@CucumberContextConfiguration
@SpringBootTest
public class UserStepDefinitions {

    @Autowired
    private UserService userService;

    @Autowired
    private User user;

    private List<User> allUsersList = new ArrayList<>();
    private List<User> fanCodeCityUsersList = new ArrayList<>();

    @Given("Users has the todo tasks")
    public void users_has_the_todo_tasks() {
        allUsersList = userService.getAllUsers();
    }

    @Given("User {int} has the todo tasks")
    public void user_id_has_the_todo_tasks(int userId) {
        user = userService.getUserById(userId);
    }

    @And("User belongs to the city FanCode")
    public void user_belongs_to_the_city_FanCode() {
        // Checking if user is from fanCode city or not?
        Assert.assertTrue(userService.isFromFanCodeCity(user));
    }

    @And("Users belongs to the city FanCode")
    public void users_belongs_to_the_city_FanCode() {
        // Checking if user is from fanCode city or not?
        fanCodeCityUsersList = userService.getFanCodeCityUser(allUsersList);
    }

    @Then("User Completed task percentage should be greater than 50%")
    public void user_completed_task_percentage_should_be_greater_than_50() {
        Assert.assertTrue(userService.hasMoreThanHalfCompletedTasks(user));
    }

    @Then("Users Completed task percentage should be greater than 50%")
    public void users_completed_task_percentage_should_be_greater_than_50() {
        Assert.assertTrue(userService.userHasMoreThanHalfCompletedTasks(fanCodeCityUsersList));
    }

}
