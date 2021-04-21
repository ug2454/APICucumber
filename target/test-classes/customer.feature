Feature: Customer Testing

  @Smoke
  Scenario Outline: Boarding new customer
    Given I have the data to create customer with "<firstname>" , "<lastname>" , "<phone>" , "<address1>" , "<address2>"
    And I use customer header
    When I create post request to create customer
    Then I get status code 201 from database
    And response body should contain
      | firstName |
      | lastName  |
      | phone     |
      | addresses |
      | idqwa        |

    Examples:
      | firstname | lastname | phone      | address1 | address2     |
      | Uday      | Garg     | 1010101010 | 221B     | Baker Street |
