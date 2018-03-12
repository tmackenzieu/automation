package pom.scripts;

import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author tmackenz
 * 
 */

public class Main {
	enum Browser {
		CHROME, FIREFOX, IE
	}
	
	private WebDriver driver;

	public Main(Browser browser) throws URISyntaxException {
		switch (browser) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case IE:
			driver = new InternetExplorerDriver();
			break;
		}
	}

	   public void goToGoogleAndSearch() {
	        driver.get("https://google.com");
	        WebElement searchFieldElement = driver.findElement(By.id("lst-ib"));
	        searchFieldElement.sendKeys("tenis raquetas");
	        searchFieldElement.sendKeys(Keys.ENTER);
	    }
	   
	public void atEnd() {
		driver.quit();
	}

	public static void main(String[] args) throws URISyntaxException {
		Main main = new Main(Browser.CHROME);
		main.goToGoogleAndSearch();
		main.atEnd();

	}

}
