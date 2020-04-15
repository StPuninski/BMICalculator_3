import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalculator_2 {

    @Test
    public void normalCategory() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("82");
        driver.findElement(By.name("ht")).sendKeys("188");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getAttribute("value");
        driver.findElement(By.name("desc")).getAttribute("value");
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal",
                "Категория не совпадает с ожидаемой");

        driver.quit();
    }

    @Test
    public void OverweightCategory() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("100");
        driver.findElement(By.name("ht")).sendKeys("188");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getAttribute("value");
        driver.findElement(By.name("desc")).getAttribute("value");
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight",
                "Категория не совпадает с ожидаемой");

        driver.quit();
    }

    @Test
    public void StarvationCategory() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("45");
        driver.findElement(By.name("ht")).sendKeys("188");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getAttribute("value");
        driver.findElement(By.name("desc")).getAttribute("value");
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation",
                "Категория не совпадает с ожидаемой");

        driver.quit();
    }

    @Test
    public void ObeseCategory() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("123");
        driver.findElement(By.name("ht")).sendKeys("188");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getAttribute("value");
        driver.findElement(By.name("desc")).getAttribute("value");
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese",
                "Категория не совпадает с ожидаемой");

        driver.quit();
    }

    @Test
    public void UnderweightCategory() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("66");
        driver.findElement(By.name("ht")).sendKeys("191");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getAttribute("value");
        driver.findElement(By.name("desc")).getAttribute("value");
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight",
                "Категория не совпадает с ожидаемой");

        driver.quit();
    }

}