package selenium_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\Downloads\\sel\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	}

}
