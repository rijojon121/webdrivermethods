package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivermemthods {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        String Title = driver.getTitle();
        
        System.out.println("Title of the page : "+ Title);

        System.out.println("Curret Url is : "+driver.getCurrentUrl());

        System.out.println("Get page source : "+ driver.getPageSource());

        driver.close();


    }
}
