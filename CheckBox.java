package assignment2week2day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static <WebElement> void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver box=new ChromeDriver();
box.get("http://leafground.com/pages/checkbox.html");
box.manage().window().maximize();
box.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
box.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).click();
box.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
box.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).click();

box.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[1]")).click();
box.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[2]")).click();
box.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]")).click();
box.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]")).click();
box.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]")).click();
	
	}

}
