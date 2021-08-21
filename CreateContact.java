package assignment2week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver con=new ChromeDriver();
con.get("http://leaftaps.com/opentaps/control/login");
con.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
con.manage().window().maximize();
con.findElement(By.id("username")).sendKeys("demosalesmanager");
con.findElement(By.id("password")).sendKeys("crmsfa");
con.findElement(By.className("decorativeSubmit")).click();
con.findElement(By.linkText("CRM/SFA")).click();
con.findElement(By.linkText("Contacts")).click();
con.findElement(By.linkText("Create Contact")).click();
con.findElement(By.id("firstNameField")).sendKeys("AATHI");
con.findElement(By.id("lastNameField")).sendKeys("PRAKASH");
con.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
con.findElement(By.id("createContactForm_description")).sendKeys("Hello, How are you? What are you doing? What about your project?");
con.findElement(By.id("createContactForm_primaryEmail")).sendKeys("aathiprakash.1995@gmai.com");
WebElement Id = con.findElement(By.id("createContactForm_generalCountryGeoId"));
Select c=new Select(Id);
c.selectByVisibleText("India");
WebElement Ib = con.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
Select box=new Select(Ib);
box.selectByVisibleText("KERALA");

con.findElement(By.name("submitButton")).click();
con.findElement(By.linkText("Edit")).click();
con.findElement(By.id("updateContactForm_description")).clear();
con.findElement(By.name("importantNote")).sendKeys("This is important Note");
con.findElement(By.xpath("//input[@value='Update']")).click();
String title = con.getTitle();
System.out.println("Create Contact:"+title);

	}

}
