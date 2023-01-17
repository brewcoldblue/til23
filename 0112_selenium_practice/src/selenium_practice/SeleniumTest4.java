package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskorail.com/");
		
		System.out.println(driver.getWindowHandles());
		
		// 메인창 이름 저장, 가장 첫 번째 것 하나
		String mainPage = driver.getWindowHandle();
		
		// 메인창 이외의 팝업
		for (String handle: driver.getWindowHandles()) {
			if(!handle.equals(mainPage)) {
				driver.switchTo().window(handle).close();
			}
		}
		
		// 다시 메인 페이지 봐!
		driver.switchTo().window(mainPage);
	}
}
