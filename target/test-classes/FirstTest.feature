Feature: Is it Friday yet?
  Everybody wants to know when its Friday

  Scenario Outline: Today is or is not Friday
    Given today is <day>
    When I ask whether its Friday yet
    Then i should be told <answer>

    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | Anything else! | Nope   |