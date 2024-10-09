Feature: Todo Completion for FanCode Users

  # this test scenario will test user should be from fanCode city and have over 50% complete todo task
  Scenario Outline: User with <id> has more than 50% completed tasks
    Given User <id> has the todo tasks
    And User belongs to the city FanCode
    Then User Completed task percentage should be greater than 50%
    Examples:
      | id  |
      | 1   |
      | 2   |
      | 3   |
      | 4   |
      | 5   |
      | 6   |
      | 7   |
      | 8   |
      | 9   |
      | 10   |

  # this test scenario will test all users of fanCode city should have over 50% completed todo task
  Scenario: All users of fanCode city has more than 50% completed tasks
    Given Users has the todo tasks
    And Users belongs to the city FanCode
    Then Users Completed task percentage should be greater than 50%