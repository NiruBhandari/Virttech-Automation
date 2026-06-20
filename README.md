
#  Virttech signup flow testing project

This project automates the **Authorized Partner Signup Flow** using **Selenium WebDriver and TestNG**.  
It covers login, onboarding steps, agency details, professional experience, and verification steps.

---

#   ENVIRONMENT & SETUP

## **Language and Framework**

- **Programming Language:** Java (JDK 19)  
- **Automation Framework:** Selenium WebDriver 4.16.1  
- **Test Framework:** TestNG 7.8.0  
- **Build Tool:** Maven  
- **Browser:** Google Chrome  
- **Driver:** ChromeDriver (compatible with Chrome version 144)  
- **IDE:**  IntelliJ IDEA (Eclipse can also be used)

---

##   PRECONDITION

Before running this project, install the following:

- Java JDK 19  
- Apache Maven  
- Google Chrome Browser  
- ChromeDriver (matching Chrome version)  
- IntelliJ IDEA or Eclipse  

---

#   HOW TO RUN THE AUTOMATION SCRIPT

## **1. Clone the Repository**


git clone https://github.com/NiruBhandari/Virttech-Automation.git
cd signup-automation


---

## **2. Configure ChromeDriver**

Download ChromeDriver from:
[https://chromedriver.chromium.org/downloads](https://chromedriver.chromium.org/downloads)

---

## **3. Update ChromeDriver Path in Code**


System.setProperty("webdriver.chrome.driver",
"C:\\Users\\nirub\\OneDrive\\Documents\\Automation\\chromedriver-win32\\chromedriver.exe");


---

## **4. Install Dependencies**


mvn clean install


---

## **5. Execute the Automation Script**

### **Run using IntelliJ or Eclipse**

1. Open `signup_automation_script.java`
2. Right-click the file
3. Select **Run as TestNG Test**

### **Run using Command Line**


mvn test


---



## **Registration Test Data**

### **Personal Information**

* **First Name:** Niru
* **Last Name:** Bhandari
* **Phone Number:** 9848035767
* **Password:** Test@1234

---

### **Agency Information**

* **Agency Name:** Niru Tech Agency
* **Role in Agency:** Owner
* **Agency Website:** [www.remoteaxle.com](http://www.remoteaxle.com)
* **Address:** Kirtipur, Kathmandu, Nepal

---

### **Professional Experience**

* **Experience:** 2 years
* **Students Recruited Annually:** 10
* **Focus Area:** Undergraduate
* **Success Metrics:** 90%

---

### **Business Verification**

* **Business Registration Number:** 1010101010
* **Region/Country Selected:** Australia

---

##  Dynamic Email Generation

To avoid duplicate registration errors, a unique email is generated dynamically:


"niru" + System.currentTimeMillis() + "@gmail.com";


---

#  NOTES

1. OTP verification is performed **manually** due to security restrictions.
2. Explicit waits are implemented to handle dynamic React UI components.
3. Selenium WebDriver and TestNG are used for step-wise automation execution.

---

#  Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* IntelliJ IDEA
* ChromeDriver

---


