package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {

		// configurating the browser using key
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\SeleniumChrome\\drivers\\chromedriver.exe");

		// object creation
		WebDriver driver = new ChromeDriver();
		WebDriver drivers = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();

// Method calling & Launching the URL
		driver.get("http://www.greenstechnologys.com/");
		drivers.get("https://www.facebook.com/");
		driver1.get("https://www.amazon.in");
		driver2.get("http://greenstech.in/selenium-course-content.html");

// Maximizing the webpage
		driver.manage().window().maximize();
		drivers.manage().window().maximize();

// To get the title of the browser:
		// greens technology
		String title = driver.getTitle();
		System.out.println("\n\nBROWSER TITLE:" + title);
		// facebook
		String titl = drivers.getTitle();
		System.out.println("\n\nBROWSER TITLE:" + titl);

// To get the current URL:
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CURRENT URL:" + currentUrl);

	}
}
