package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class signup_automation_script {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\nirub\\OneDrive\\Documents\\Automation\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("hhttps://authorized-partner.vercel.app/");
        WebElement loginEmail = driver.findElement(By.name("email"));
        loginEmail.sendKeys("nirubhandari04@gmail.com");

        WebElement loginPassword = driver.findElement(By.name("password"));
        loginPassword .sendKeys("dontforgetStud@345");

        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
        loginBtn.click();
    }
//Get Started
    @Test(priority = 1)
    public void getStarted() {
        By getStartedBtn = By.xpath("//button[normalize-space()='Get Started']");
        driver.findElement(getStartedBtn).click();

        WebElement checkBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='remember']"))
        );
        wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();

        WebElement continueBtn = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Continue']"))
        );
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }

    //step1: setup account
    @Test(priority = 2)
    public void step1_SetupAccount() {

        WebElement first = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
        first.clear();
        first.sendKeys("Niru");

        WebElement last = driver.findElement(By.name("lastName"));
        last.clear();
        last.sendKeys("Bhandari");


        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("niru" + System.currentTimeMillis() + "@gmail.com");


        WebElement phone = driver.findElement(By.name("phoneNumber"));
        phone.clear();
        phone.sendKeys("9848035767");


        String pass = "Test@1234";
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys(pass);

        // Confirm Password
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.clear();
        confirmPassword.sendKeys(pass);


        if (!pass.equals("Test@1234")) {
            System.out.println("Password mismatch!");
        }


        By nextBtn = By.xpath("//button[normalize-space()='Next' or normalize-space()='Continue']");
        wait.until(ExpectedConditions.elementToBeClickable(nextBtn)).click();

    }
// Entering OTP
    @Test(priority = 3)
    public void enterOTP() throws InterruptedException {
        System.out.println("Waiting for OTP...");
        Thread.sleep(20000); // Tester enters OTP manually
        driver.findElement(By.xpath(" //button[normalize-space()='Verify Code']")).click();
    }

    //step2: Agency Details

    @Test(priority = 4)
    public void step2_AgencyDetails() {

        WebElement agencyName = driver.findElement(By.name("agency_name"));
        agencyName.sendKeys("Niru Tech Agency");

        // Role in Agency
        WebElement role = driver.findElement(By.name("role_in_agency"));
        role.sendKeys("Owner");

        // Email Address
        WebElement email = driver.findElement(By.name("agency_email"));
        email.sendKeys("agency" + System.currentTimeMillis() + "@gmail.com");

        // Website
        WebElement website = driver.findElement(By.name("agency_website"));
        website.sendKeys("www.remoteaxle.com");

        // Address
        WebElement address = driver.findElement(By.name("agency_address"));
        address.sendKeys("Kirtipur, Kathmandu, Nepal");

        // Region Dropdown
        WebElement region = driver.findElement(By.xpath(" //span[@class='font-satoshi-regular text-translucent']"));
        region.click();

        // Select first option
        WebElement regionOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Australia']")
        ));
        regionOption.click();

        // Click Next
        WebElement nextBtn = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        nextBtn.click();
    }
//step3: Professional Experience
    @Test(priority = 5)
    public void step3_ProfessionalExperience() throws InterruptedException {

        By experienceDropdown = By.xpath("//button[@role='combobox']");
        wait.until(ExpectedConditions.elementToBeClickable(experienceDropdown)).click();
        Thread.sleep(1000);

        By option = By.xpath("//div[contains(@class,'radix') or @role='option']//span[text()='2 years']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(option));
        wait.until(ExpectedConditions.elementToBeClickable(option)).click();

        WebElement noOfStudent = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("number_of_students_recruited_annually")
        ));
        noOfStudent.sendKeys("10");

        WebElement focusArea = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("focus_area")
        ));
        focusArea.sendKeys("Under graduate");

        WebElement metrics = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("success_metrics")
        ));
        metrics.sendKeys("90%");

        By checkBox = By.xpath("//button[@role='checkbox']");
        wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
        Thread.sleep(1000);

        WebElement nextBtn = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        nextBtn.click();

    }
// step4: Verification and Preference
    @Test(priority = 6)
    public void step3_VerificationAndPreference() throws InterruptedException {

        WebElement registrationNumber = wait.until(ExpectedConditions.elementToBeClickable(
                By.name("business_registration_number")
        ));
        registrationNumber.sendKeys("1010101010");

        By countries = By.xpath("//button[@id='«r2r»-form-item']");
        wait.until(ExpectedConditions.elementToBeClickable(countries)).click();

        WebElement countryOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[normalize-space()='Australia']")
        ));
        countryOption.click();


        By checkBox = By.xpath("//button[@role='checkbox']");
        wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
        Thread.sleep(1000);

        WebElement nextBtn = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        nextBtn.click();

    }

    @AfterClass
        public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed. Test execution finished.");
       }
    }
}
