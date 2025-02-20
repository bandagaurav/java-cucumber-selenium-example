@horizontalTable
Scenario: Login with correct credential
Given I navigate to login page
And I enter following for login
| username | password |
| admin | pw1234 |
When I click login button
Then I should be able to access the protected area

@verticalTable
Scenario: Login with correct credentials
Given I navigate to login page
And I enter following values to login
| username | admin |
| password | pw1234 |
When I click login button
Then I should be able to access the protected area

Scenario: Login with incorrect credentials
Given I navigate to login page
And I enter following values to login
| username | admin |
| password | wrongpassword |
When I click login button
Then I should see an error message "Incorrect username or password"
And I should not be able to access the protected area

Scenario: Secure login process
Given I navigate to login page
And I enter following values to login
| username | admin |
| password | pw1234 |
When I click login button
Then the login process should follow best practices to protect user information
And I should be able to access the protected area