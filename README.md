# Shopbridge_Demo
Project folder structure : 
FlightSearch :
i.src/main/java >> Package name : pageObject >LandingPage.java
ii.src/test/java>>Package name : travel.FlightSearch >SignupPage.java
iii.pom.xml
iv.testng.xml
Implemented Page object model desing pattern.
LandingPage.java is pageclass.Initialized webelements and method chooseLanaguage()
In which we are checking the languages English and Dutch from the dropdown.
Methods : enterName() >> we are sending username in name text field
          enterOrgname >>We are sending the organization name in Organization name text box
          enterMailId >>we are sending email in email text box
          selectChkbox >>We are selecting checkbox in this function
          
In test folder,we have added SignupPage.java file in which we are intializing browser and passing input parameter to the createAcc method.
Used testng annaotaion like : @BeforeTest,@DataProvider,@Test,@AfterTest
          
