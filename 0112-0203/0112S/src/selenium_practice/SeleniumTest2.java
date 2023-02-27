package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {
	public static void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		// 크롬 드라이버 생성 후 변수에 넣음
		
		driver.get("https://www.naver.com");
		// 원하는 사이트 열어줘
		
		WebElement financeBtn = driver.findElement(By.cssSelector("#NM_FAVORITE > div.group_nav > ul.list_nav.NM_FAVORITE_LIST > li:nth-child(3) > a"));
		// 증권 버튼(선택자)을 가져와
		
		financeBtn.click();
		
		// 1. 검색창 선택
		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));
		
		// 2. 삼성전자 키워드 입력하기
		searchInput.sendKeys("삼성전자");
		
		// 3. 검색창 엔터 누르기
		searchInput.sendKeys(Keys.ENTER);
		
		// Ctrl + Shift + O -> auto import
	}
}
