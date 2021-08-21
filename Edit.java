package assignment2week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver edit=new ChromeDriver();
	edit.get("http://leafground.com/pages/Edit.html");
	edit.manage().window().maximize();
	edit.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	edit.findElement(By.xpath("//input[@id='email']")).sendKeys("aathiprakash.1995@gmail.com");
	WebElement findElement2 = edit.findElement(By.xpath("//input[@value='TestLeaf']"));
findElement2.clear();
findElement2.sendKeys("Welcome");
	WebElement findElement = edit.findElement(By.xpath("//input[@value='Clear me!!']"));
	findElement.clear();
	edit.findElement(By.xpath("//input[@disabled='true']"));
	
}
}

