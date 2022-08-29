  @smoke
  Feature: CPI HomePage Validation and Automation

    Background:
      Given user navigates to "https://www.crisisprevention.com/"
      Then user should see the title "Crisis Prevention Institute (CPI Training)"

    @cpi
    Scenario: Validate Find Training Feature
        When user clicks on "FIND TRAINING" link
        Then user should see the title "Find Training | Crisis Prevention Institute (CPI)"
        Then under "I Want To:" user selects "Become a Certified Instructor" in checkbox
        And under "CPI Training Programs" user selects "Classroom Culture" in checkbox
        Then under "Program Type" user selects "Classroom Culture Training (New for 2022)" from dropdown
        Then under "Date Range" user selects "Sep 1 2022" and "Oct 1 2022" from calendar
        And under "Location" user types "Chicago, Illinois" in input box
        Then under "Within" user selects "100 miles" from dropdown
        And under "Language" user selects "English" in checkbox
        Then user clicks on "APPLY FILTERS" link



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















