package knoldus

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait

trait TestSetUp {

  val BASE_URL = "https://www.flipkart.com/"
  val email = "kunals201@gmail.com"
  val password = "kunals201"
  System.setProperty("webdriver.chrome.driver", "/home/knoldus/Desktop/chromedriver")
  val capabilities = DesiredCapabilities.chrome()
  val driver = new ChromeDriver(capabilities)
  val webdriverwait = new WebDriverWait(driver, 50)


}
