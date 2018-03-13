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

	
	public static void main(String[] args) throws URISyntaxException {
		
		Main main = new Main();
		main.setPropertyBrowser();
		main.initialize(Browser.CHROME);
		main.goToGoogleAndSearch();
		main.atEnd();

	}

	private WebDriver driver = null;
	
	public void setPropertyBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

	}

	public void initialize(Browser browser) {
		switch (browser) {
		case CHROME:
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case IE:
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
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
		System.out.println("Automatización finalizada");
	}
}
