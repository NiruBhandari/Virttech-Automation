
ENVIRONMENT & SETUP  

Language and Framework:

Programming Language: Java (JDK 19)

Automation Framework: Selenium WebDriver 4.16.1

Test Framework: TestNG 7.8.0

Build Tool: Maven

Browser: Google Chrome

Driver: ChromeDriver (matching Chrome version 144)

IDE: IntelliJ IDEA

PREREQUISITES:
Before running this project, make sure the following are installed:
- Java JDK 19
- Apache Maven
- Google Chrome Browser
- ChromeDriver
- IntelliJ IDEA or Eclipse

HOW TO RUN THE AUTOMATION SCRIPT:

1. Clone the Repository:
git clone [https://github.com/your-username/signup-automation.git](https://github.com/NiruBhandari/Virttech-Automation.git)
cd signup-automation


2. Configure ChromeDriver:
Download ChromeDriver from:
https://chromedriver.chromium.org/downloads


3.Update the path in the code:
System.setProperty("webdriver.chrome.driver",
"C:\Users\nirub\OneDrive\Documents\Automation\chromedriver-win32\chromedriver.exe");


4. Install Dependencies:
mvn clean install


5. Execute the Script:

Run using IntelliJ or Eclipse:
Open signup_automation_script.java
Right click → Run as TestNG Test

Run using Command Line:
mvn test


TEST DATA AND ACCOUNTS USED:

Login Test Account:
Email: nirubhandari04@gmail.com
Password: dontforgetStud@345

Registration Test Data:

First Name: Niru

Last Name: Bhandari

Phone Number: 9848035767

Password: Test@1234

Agency Name: Niru Tech Agency

Role in Agency: Owner

Agency Website: www.remoteaxle.com

Address: Kirtipur, Kathmandu, Nepal

Experience: 2 years

Students Recruited Annually: 10

Focus Area: Undergraduate

Success Metrics: 90%

Business Registration Number: 1010101010

Region/Country Selected: Australia


Dynamic Email Generation:

To avoid duplicate registration errors, the email is generated dynamically:

"niru" + System.currentTimeMillis() + "@gmail.com"

NOTES:

1.OTP verification is performed manually due to security restrictions.

2.Explicit waits are used to handle dynamic UI loading.

3.Selenium WebDriver and TestNG are used for step-wise automation execution.

