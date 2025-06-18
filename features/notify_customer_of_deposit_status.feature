Feature: Notify Customer of Deposit Status

  Scenario: Notify customer of successful deposit processing
    Given a deposit request is successfully processed
    When the system completes the matching and validation
    Then the customer is notified of the successful deposit
    And the updated account balance is displayed