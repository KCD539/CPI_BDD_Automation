  @smoke
  Feature: CPI HomePage Validation and Automation

    Background:
      Given user navigates to "https://www.crisisprevention.com/"
      Then user should see the title "Crisis Prevention Institute (CPI Training)"

      Scenario: Validate Find Training Feature
        When user clicks on "FIND TRAINING" link
        Then user should be navigated to "https://www.crisisprevention.com/Training-and-Events?src=homepage_sticky"
        Then under "I Want To:" user selects "Become a Certified Instructor" in checkbox
        And under "CPI Training Programs" user selects "Classroom Culture" in checkbox
        Then under "Program Type" user selects "Classroom Culture Training (New for 2022)" from dropdown
        Then under "Date Range" user selects "Sep 1 2022" and "Oct 1 2022" from calendar
        And under "Location" user types "Chicago, Illinois" in input box
        Then under "Within" user selects "100 miles" from dropdown
        And under "Language" user selects "English" in checkbox
        Then user clicks on "APPLY FILTERS" link
        Then user should be navigated to "https://www.crisisprevention.com/Training-and-Events?seat-type=ICP&specialty=CC&city-or-zip-code=Chicago,%20Illinois&within=100&date-start=Thu%20Sep%2001%202022&date-end=Sat%20Oct%2001%202022&program-type=CC-10100176&language=English"


      Scenario: Validate Main Menu Navigation Items
        Then user should see Main Menu navigation items
          |Our Programs|Industries|Find Training|Resource Center|
        
        
        Scenario: Validate Elements on HomePage 
          When user clicks on "LEARN MORE" link
          When user clicks on "Verbal Intervention" link
          When user clicks on "Nonviolent crisis intervention" link
          When user clicks on "Nonviolent crisis intervention with advanced physical skills" link
          When user clicks on "Classroom culture" link
          When user clicks on "Dementia capable care" link
          # would 2-5 be a list under "CPI Behavior Management and De‑escalation Training Solutions"
        # make a switch case instead of seperate lines















