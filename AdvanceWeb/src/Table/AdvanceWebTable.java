package Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Logesh K\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/sorttable.html");
		
		List<WebElement> allname = d.findElements(By.xpath("//tr/td[2]"));
		ArrayList<String> names= new ArrayList<String>();
		for (WebElement webElement : allname) {
			String allnames=webElement.getText();
			names.add(allnames);
		}
		System.out.println("Print all names:"+names);
		Collections.sort(names);
		System.out.println("Sorted names are :"+names);
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement Cli = d.findElement(By.xpath("//th[2]"));
		Cli.click();
		
		List<WebElement> allnam = d.findElements(By.xpath("//tr/td[2]"));
		ArrayList<String> name= new ArrayList<String>();
		for (WebElement webElement : allnam) {
			String allnames=webElement.getText();
			name.add(allnames);
		}
		System.out.println("Print all names after clicked :"+name);
		System.out.println("Comparing :"+name +"Comparing :"+names+":"+name.equals(names));
		}
		
		
	}

