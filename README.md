# CPI_BDD_Automation


    TASK
1. Automate and validate the CPI Homepage
  https://www.crisisprevention.com/

Explanation of framework
1. Java as a programming language
2. Maven as a project build tool
3. Selenium as a UI script automation tool
4. Junit for its assertions
5. WebDriverManager/HtmlUnitDriver to set the browser for the UI automation scripts
6. Cucumber as the BDD framework helper with Gherkin feature files 
7. I use a page object model design pattern and maintain a separate class for each webpage. Each page class stores the members, locators, and associated methods for each webpage. This helps with refactoring.
8. I have a base class for the common functions, hooks class, and a very useful utility class for the repetitive methods which helps me achieve better usability.
9. The runner class is used to run steps classes, run execute test suites, save reports, and more.
10. Smoke and Regression suite 
    A. SMOKE  mvn clean test -Dcucumber".options=--tags"@Smoke 
    B. REGRESSION mvn clean test -Dcucumber.options=”--tags @Regression” 
