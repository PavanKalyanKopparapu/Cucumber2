package Pavan1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class defsteps {
    WebDriver driver;
    @Given("I open Google application")
    public void i_open_google_application()
    {
        System.out.println("Step1: Open Google Application");
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @When("I capture title")
    public void i_capture_title()
    {
        System.out.println("Step2: Captured the title");
        System.out.println("Title is: "+driver.getTitle());
    }
    @Then("I should get valid title as Google")
    public void i_should_get_valid_title_as_google()
    {
        String act=driver.getTitle();
        String exp="Google";
        System.out.println("Step3: Title verified!");
    }
    @Given("open google application")
    public void open_google_application() {
        System.out.println("Step1: Open Google Application for search");
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @When("I search valid keyword and go for search")
    public void i_search_valid_keyword_and_go_for_search() {
        driver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);
    }
    @Then("I should get a valid search result")
    public void i_should_get_a_valid_search_result() {

        System.out.println("Current url is: "+driver.getCurrentUrl());
    }
}





