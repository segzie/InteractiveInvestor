package com.project.InteractiveInvestor.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InteractiveInvestorSeachSteps 
{
	private WebDriver driver;
	
	@Given("^I navigate to interactive investor homepage$")
	public void i_navigate_to_interactive_investor_homepage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ii.co.uk/indices/ftse-100-index");
	}
	
	@When("^I click the cookies$")
	public void i_click_the_cookies() throws Throwable {
	    
		WebElement theCookie = driver.findElement(By.xpath("//*[@id=\"site-layout-container\"]/div[3]/div[2]/button[1]"));
		theCookie.click();
	}

	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
		
		WebElement pSearch = driver.findElement(By.className("c0153"));
		pSearch.click();
		Thread.sleep(2000);
	}

	@When("^I enter gbpusd into search field$")
	public void i_enter_gbpusd_into_search_field() throws Throwable {
		
		WebElement searchBar1 = driver.findElement(By.xpath("//*[@id=\"site-layout-container\"]/div[2]/div/div/div/form/div/label/span/input"));
        searchBar1.sendKeys("gbpusd");
        Thread.sleep(2000);
	}

	@When("^I click on the first of the search result$")
	public void i_click_on_the_first_of_the_search_result() throws Throwable {
	    
		WebElement oneResult = driver.findElement(By.xpath("//*[@id=\"site-layout-container\"]/div[2]/div/div[2]/div/div[2]/div[2]/span/span"));
		oneResult.click();
	}

}
