Feature: Match Bill Payment Deposits

  # This feature automates the process of matching bill payment deposits to client wealth accounts,
  # ensuring accurate reconciliation and reducing manual intervention.

  Scenario: Match a single bill payment deposit to a client account
    Given the system receives a bill payment deposit with a valid unique identifier
    When the system parses the payment data to extract client ID, payment amount, and transaction reference
    And the system matches the payment to the corresponding client account
    Then the payment should be recorded in the client’s account
    And the transaction should be logged for auditing purposes

  Scenario: Handle unmatched bill payment deposits
    Given the system receives a bill payment deposit without a matching client account
    When the system fails to find a match for the payment
    Then the payment should be flagged as unmatched
    And the operations team should be notified for manual review

  Scenario: Handle multiple matches for a bill payment deposit
    Given the system receives a bill payment deposit with multiple potential matches
    When the system identifies more than one client account for the payment
    Then the payment should be flagged as requiring manual resolution
    And the operations team should be notified to resolve the conflict

  Scenario: Generate a report of matched and unmatched bill payment deposits
    Given the system has processed bill payment deposits for a specific time period
    When the user requests a report of matched and unmatched payments
    Then the system should generate a report containing:
      | Matched Payments      |
      | Unmatched Payments    |
    And the report should be available for review and download

  Scenario: Notify customer of successful deposit match
    Given a bill payment deposit has been successfully matched to a client account
    When the system records the payment in the client’s account
    Then the customer should receive a notification confirming the deposit
    And the notification should include the transaction reference and amount

  Scenario: Validate payment data format
    Given the system receives bill payment data from the payment gateway
    When the system parses the payment data
    Then the system should validate that the data format is consistent
    And reject any payments with invalid or incomplete data

  Scenario: Ensure compliance with regulatory requirements
    Given the system processes bill payment deposits
    When the matching logic is applied
    Then the system should ensure compliance with all regulatory requirements
    And log any exceptions for audit purposes

  Scenario: Achieve a match rate of at least 95%
    Given the system processes multiple bill payment deposits
    When the matching algorithm is applied
    Then the system should achieve a match rate of at least 95%
    And unmatched payments should be flagged for manual review

  Scenario: Real-time processing of bill payment deposits
    Given the system receives bill payment deposits in real-time
    When the payment data is parsed and matched
    Then the system should process the deposits without delay
    And update the client accounts immediately

  Scenario: Log and audit all transactions
    Given the system processes bill payment deposits
    When a payment is matched or flagged as unmatched
    Then the system should log the transaction details
    And ensure the logs are available for auditing purposes

  Scenario: BMO-2514 - Handle duplicate bill payment deposits
    Given the system receives a duplicate bill payment deposit with the same transaction reference
    When the system identifies the duplicate payment
    Then the payment should be flagged as a duplicate
    And the operations team should be notified to investigate
    And the duplicate payment should not be recorded in the client’s account

  Scenario: BMO-2514 - Notify operations team of duplicate payments
    Given the system has flagged a bill payment deposit as a duplicate
    When the operations team is notified
    Then the notification should include the transaction reference, payment amount, and client ID
    And the notification should provide a link to the duplicate payment details for further action

  Scenario: BMO-2514 - Generate a report of duplicate payments
    Given the system has processed bill payment deposits
    When the user requests a report of duplicate payments
    Then the system should generate a report containing:
      | Duplicate Payments    |
    And the report should include transaction references, payment amounts, and client IDs
    And the report should be available for review and download