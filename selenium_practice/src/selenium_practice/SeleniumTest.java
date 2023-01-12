package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) {
		// main부터 읽음
		// 이거 실행되면 chromedriver import가 된 것
		WebDriver driver = new ChromeDriver();
		// 크롬 드라이버 생성 후 변수에 넣음
		
		driver.get("https://www.naver.com");
		// 원하는 사이트 열어줘
	}
}
