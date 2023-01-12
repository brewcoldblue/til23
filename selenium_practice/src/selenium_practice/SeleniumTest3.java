package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest3 {
	public static void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://finance.naver.com/news/");
		List<WebElement> news = driver.findElements(By.cssSelector("#newsMainTop > div > div.inner_area_left > div > div.main_news > ul > li > a"));
		
		for (WebElement n : news ) {
			System.out.println(n.getText());
		}
		
	}
}
