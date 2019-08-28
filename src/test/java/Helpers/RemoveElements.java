package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RemoveElements extends TestConfig {
    public static void removePageElements(By by) {
        List<WebElement> elementsList = driver.findElements(by);
        for (WebElement element : elementsList) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            ((JavascriptExecutor) driver).executeScript("arguments[0].remove();", element);
        }
    }
}
