package Helpers;


import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

import static Helpers.AShotFoldersConfiguration.setRootScreenshotsDir;

public class TestConfig {
    public static WebDriver driver;

    public static void testPreconditions() throws AWTException {
        //hotfix for Chrome 73
        ChromeOptions options = new ChromeOptions();
        options.addArguments("enable-automation");
        //options.addArguments("--headless");
        //options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        options.addArguments("--dns-prefetch-disable");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-browser-side-navigation");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //hotfix for Chrome 73
        setRootScreenshotsDir("C:\\CowabSiteTestScreens");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1936, 1056));
        Robot bot = new Robot();
        bot.mouseMove(0, 0);
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.close();
    }

    public static String browserWindowSize() {
        return driver.manage().window().getSize().toString();
    }

    public static void openNewTab(String url) {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //switches to new tab
        driver.get(url);
    }

    public static ArrayList URLS() {
        ArrayList<String> testingURLs = new ArrayList<String>();
        testingURLs.add("https://preprod.cowab.com/sv/se");//home page
        testingURLs.add("https://preprod.cowab.com/sv/se/sok?q=441562&v=637075132991878540");//product listing
        testingURLs.add("https://preprod.cowab.com/sv/se/omkladningsrum/skap/omkladningsskap/kladskap-pn3178?ic=441562");//regular product page
        testingURLs.add("https://preprod.cowab.com/sv/se/kontor-konferens/entre-reception/entremattor/entrematta-pn6458?ic=41362");//cut by meter
        return testingURLs;
    }

    public static ArrayList<String> elementsToRemove() {
        ArrayList<String> elements = new ArrayList<String>();
        elements.add("div[class=\"zoid-outlet\"]");
        elements.add("header[class=\"js-header\"]");
        elements.add("div[class='pagelist']");
        elements.add("span[class='measure-control__btn measure-control__btn--plus js-measure-control__btn--plus']");
        elements.add("span[class='measure-control__btn measure-control__btn--minus js-measure-control__btn--minus measure-control__btn--disabled']");
        return elements;
    }

    public static boolean removeFolderWithObsoleteData(File dir) {

        if (dir.isDirectory()) {
            try {
                File[] children = dir.listFiles();
                for (int i = 0; i < children.length; i++) {
                    boolean success = removeFolderWithObsoleteData(children[i]);
                    if (!success) {
                        return false;
                    }
                }
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception for 'children' dereference");
            }
        }
        System.out.println("Removing file or directory: " + dir.getName());
        return dir.delete();
    }

    public static void sendFailedTestsScreenshotViaGmail(String screenshotAddress) throws AddressException, MessagingException {
        JavaEmail javaEmail = new JavaEmail();

        javaEmail.setMailServerProperties();
        javaEmail.createEmailMessage(screenshotAddress);
        javaEmail.sendEmail();
    }

    public static void zipImagesFromResultsFolder() {
        CompressToZip.compress();
    }
}