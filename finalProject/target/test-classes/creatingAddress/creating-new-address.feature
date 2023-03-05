Feature: Creating new addrress

  Scenario Outline: Adding an address
    Given The user is logged in
    When Appropriate form is filled with <alias>, <address>, <city>, <zipcode> and <phone>
    Then new address is added
    And The test cleans up after itself

    Examples:
      | alias  | address        | city   | zipcode| phone    |
      | mistrzu|prosta 82       |gdynia  |10-654  | 657843123 |
      | seba   |seleniowa 34    |warszawa|10-543  | 123567890 |
      | krzychu|placeholderowa 3|kraków  |99-678  | 876432678 |

