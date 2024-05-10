package com.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivermemthods {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Thread.sleep(3000);

        driver.manage().window().maximize();

        String Title = driver.getTitle();

        //get methods are used for webpages only like testing fir wbpage for title page source window handles etc .., 
        
        System.out.println("Title of the page : "+ Title);

        System.out.println("Curret Url is : "+driver.getCurrentUrl());

       // System.out.println("Get page source : "+ driver.getPageSource());

        String windowID = driver.getWindowHandle();
        System.out.println("Window ID :"+ windowID);

        //driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> WindowIds = driver.getWindowHandles();
        System.out.println("Window handles : "+ WindowIds);


        driver.close(); //closes one browser windows

        driver.quit(); // closes multiple browser windows








    }
}
