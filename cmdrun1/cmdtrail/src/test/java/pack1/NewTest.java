package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	public  ThreadLocal<WebDriver> d=new ThreadLocal<WebDriver>();	
	public void setdriver(WebDriver driver) {
		this.d.set(driver);
	}
	public WebDriver getdriver() {
		return this.d.get();
	}
  @Test
  public void a() throws InterruptedException {
	  System.out.println("bfvhs111111111111111");
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver1.exe");
	//   WebDriverManager.chromedriver().setup();
	 
	 
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  co.addArguments("--incognito");
	  ChromeDriver dr = new ChromeDriver(co);
	  setdriver(dr);Thread.sleep(5000);
	  getdriver().manage().window().maximize(); 
	  getdriver().get("C:\\Users\\ciadmin\\Downloads\\index.html.html");
  }
  @Test
  public void b() throws InterruptedException {
	  getdriver().findElement(By.xpath("//p[text()='CONTACT']")).click();Thread.sleep(3000);
	  getdriver().findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vfgdchsb");
	  
	
}
}
