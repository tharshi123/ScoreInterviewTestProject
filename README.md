Score Media Mobile Automation Project 

The following repository contain This repository contains a mobile automation project using Appium, Java, Cucumber, and Maven.

Repository Name:
    https://github.com/tharshi123/ScoreInterviewTestProject


Test Framework:

    Hybrid framework using Cucumber +TestNG
    Page object Model
    Data Driven test cases ( test data is consumed from external file)

Tools Used:
    
    Appium: Version 2.5.4
    Android SDK: Version 13.0
    Emulator: Pixel 8

Project Structure

    Project Root
    Src\main\Java
    src\test\java 
    	baseStep =>BaseStep class
    	stepDefinition => test Scenarios
    	pages => page objects classes
    	utils => property file reader java class
    runners   => TestNG-Cucumber Runner class
    src\test\resources
    	data => data files /Properties files
    	features => cucumber feature files 


How to Run:
•	Make sure you have all the required tools installed and configured properly.
•	Clone this repository to your local machine.
•	Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
•	Update the pom.xml file with any additional dependencies or configurations if needed.

    Steps:
        1.	Open the pom.xml file from project directory 
        2.	Right-click on the file "Run As" -> "maven Test" (in Eclipse).
        3.	The test execution will start, and you can view the results in the console.
        OR 
        1.	Go to your project folder
        2.	Open the command prompt from this folder 
        3.	In command prompt, type “mvn test”

Reports and Screenshots: 
	  The Test reports will be under
		Targets>cucumber-html-report
		Note: if a test scenario fails, The Failed step screenshot will be attached in the report  


Notes:
    •	Ensure that the Appium server is running and configured to connect to the Android Pixel 8 emulator.
    •	Make sure to update the capabilities in the Appium configuration file (AppiumConfig.java) according to your device/emulator specifications.
    •	You may need to adjust the paths and configurations based on your local setup.
    



