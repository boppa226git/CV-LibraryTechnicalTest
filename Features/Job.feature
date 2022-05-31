Feature: Job search

  Scenario: job search with more search options
    Given user launch the chrome browser
    And user open url as "https://www.cv-library.co.uk/"
    And user switch to more search options
    When user enter details "<jobtitle>" "<location>"  "<distance1>"  "<salarymin>"  "<salarymax>" "<salarytype>"  "<posted>"  "<jobtype>" "<industry>" "<sortby>"
    Then user can view the job details
    Examples:
    | jobtitle   | location    | distance1       | salarymin  | salarymax   | salarytype | posted        | jobtype     | industry   | sortby   |
    | java    | london      | up to 500 miles   | 2000       | 5000        | Per month  | Last 28 days   | Part Time  | IT         | Distance |
    | Selenium     |london         | up to 500 miles   | 2200       | 5500        | Per month  | Last 7 days   | Permanent   | IT         | Distance |