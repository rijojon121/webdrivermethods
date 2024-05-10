package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalelement {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        // conditonal statements access through webelements isDispalyed, isERnabled or isSelected();


        driver.get("https://demo.nopcommerce.com/register");

        driver.manage().window().maximize();

        //isdisplayed()
        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();

        System.out.println("Display Staus :" + " "+ status);

        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        System.out.println("Display Status of Logo: "+ " "+ logo.isDisplayed());

        //isEnabled -  we can check the enable.disabled status

        boolean EnabledStatus =  driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();

        System.out.println("Enabled Status of the First name: "+ " " + EnabledStatus);

        //isSelected()

       WebElement male_radio =  driver.findElement(By.xpath("//input[@id='gender-male']"));
       WebElement female_radio =  driver.findElement(By.xpath("//input[@id='gender-female']"));
       
       System.out.println("male radio button "+ male_radio.isSelected());
       System.out.println("female radio button "+ female_radio.isSelected());
       
       driver.findElement(By.xpath("//input[@id='gender-female']")).click();
       System.out.println(" after selecting female radio button "+ female_radio.isSelected());
       System.out.println("male radio button "+ male_radio.isSelected());


        driver.quit(); // closes multiple browsers 
        




    }
}
