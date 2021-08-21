package assignment2week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver drop=new ChromeDriver();
drop.get("http://leafground.com/pages/Dropdown.html");
drop.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
drop.manage().window().maximize();

WebElement drop1 = drop.findElement(By.id("dropdown1"));
	Select d=new Select(drop1);
	d.selectByIndex(2);
	
	WebElement drop2=drop.findElement(By.name("dropdown2"));
	Select d2=new Select(drop2);
	d2.selectByVisibleText("UFT/QTP");
	
	WebElement drop3=drop.findElement(By.id("dropdown3"));
	Select d3=new Select(drop3);
	d3.selectByValue("1");
	
	/*WebElement drop4=drop.findElement(By.xpath("//option[text()='Get the number of dropdown options']/parent::select"));
	drop4.getAttribute("dropdown");
	Select d4=new Select(drop4);
	d4.selectByIndex(1);
	System.out.println(drop4.getSize());*/
	
drop.findElement(By.xpath("//option[text( )='You can also use sendKeys to select']/..")).sendKeys("UFT/QTP");
WebElement drop5 = drop.findElement(By.xpath("//option[text()='Get the number of dropdown options']/following::select[2]"));
Select dd=new Select(drop5);
dd.selectByVisibleText("Selenium");
dd.selectByValue("2");
dd.selectByIndex(3);
dd.deselectByValue("1");


	}

	
	}


