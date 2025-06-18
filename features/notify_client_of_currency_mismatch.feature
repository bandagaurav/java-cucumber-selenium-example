Feature: Notify Client of Currency Mismatch

  Scenario: Notify client of currency mismatch
    Given a bill payment deposit is flagged due to a currency mismatch
    When the operations team reviews the deposit
    Then the client is notified of the mismatch
    And instructions are provided for correcting the deposit currency