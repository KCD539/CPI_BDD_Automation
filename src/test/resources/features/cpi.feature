  @cpi
  Feature: CPI HomePage Validation and Automation

    Background:
      Given user navigates to "https://www.crisisprevention.com/"
      Then user should see the title "Crisis Prevention Institute (CPI Training)"

    @Regression
    Scenario: Validate Find Training Feature
        When user clicks on "FIND TRAINING" link
        Then user should see the title "Find Training | Crisis Prevention Institute (CPI)"
        Then under "I Want To:" user selects "Become a Certified Instructor" in checkbox
        And under "CPI Training Programs" user selects "Classroom Culture" in checkbox
        Then under "Program Type" user selects "Classroom Culture Training (New for 2022)" from dropdown
        Then under "Date Range" user selects "09/1/2022 - 10/1/2022" from calendar
        And under "Location" user types "Chicago, Illinois" in input box
        Then under "Location" user selects "100 miles" from dropdown
        And under "Language" user selects "English" in checkbox
        Then user clicks on "APPLY FILTERS" link


      @Smoke
      Scenario: Validate Main Menu Navigation Items
        Then user should see Main Menu navigation items
          |Our Programs|Industries|Resource Center|


        @Smoke
        Scenario: Validate an Invalid Login Attempt
          When user clicks on "My Account" link
          Then user should see the title "Sign In | Crisis Prevention Institute (CPI)"
          And under "EMAIL" user types "user123@gmail.com" in input box
          And under "PASSWORD" user types "User123!" in input box
          Then user clicks on "Sign In" link
          Then user should see alert "Invalid email and/or password combination." message















