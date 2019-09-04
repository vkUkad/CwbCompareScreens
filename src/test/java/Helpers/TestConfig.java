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
        setRootScreenshotsDir("C:\\UkadSiteTestScreens");
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
        testingURLs.add("https://www.ukad-group.com/ ");
        testingURLs.add("https://www.ukad-group.com/react-native-development-services-building-native-like-applications-twice-faster/ ");
        testingURLs.add("https://www.ukad-group.com/services/outsourcing/ ");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/ ");
        testingURLs.add("https://www.ukad-group.com/episerver-development-services-empower-your-content-and-commerce/ ");
        testingURLs.add("https://www.ukad-group.com/aspnet-development/ ");
        testingURLs.add("https://www.ukad-group.com/angular-development-services/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/kiggit-ios-and-android-app/ ");
        testingURLs.add("https://www.ukad-group.com/xamarin-development-services/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/ ");
        testingURLs.add("https://www.ukad-group.com/company/about-us/ ");
        testingURLs.add("https://www.ukad-group.com/our-services/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/aj-produkter/ ");
        testingURLs.add("https://www.ukad-group.com/reviews/ ");
        testingURLs.add("https://www.ukad-group.com/technologies/ ");
        testingURLs.add("https://www.ukad-group.com/privacy-policy/ ");
        testingURLs.add("https://www.ukad-group.com/how-we-work/ ");
        testingURLs.add("https://www.ukad-group.com/ionic-development/ ");
        testingURLs.add("https://www.ukad-group.com/blog/ ");
        testingURLs.add("https://www.ukad-group.com/azure-development/ ");
        testingURLs.add("https://www.ukad-group.com/services/nearshore/ ");
        testingURLs.add("https://www.ukad-group.com/contact-us/ ");
        testingURLs.add("https://www.ukad-group.com/wpf-development-services/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/cotunity-the-app-to-capture-inspiration/ ");
        testingURLs.add("https://www.ukad-group.com/company/why-are-we-different/ ");
        testingURLs.add("https://www.ukad-group.com/blog/sketch-great-tool-for-modern-designers/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/andrenverken/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/whiteport/ ");
        testingURLs.add("https://www.ukad-group.com/blog/net-development-in-ukraine-safe-and-simple-approach/ ");
        testingURLs.add("https://www.ukad-group.com/blog/6-pros-and-3-cons-of-ionic-development/ ");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/senior-sitecore-developersitecore-team-lead/ ");
        testingURLs.add("https://www.ukad-group.com/blog/should-i-use-firebase/ ");
        testingURLs.add("https://www.ukad-group.com/blog/figma-or-sketch-ukad-experience/ ");
        testingURLs.add("https://www.ukad-group.com/blog/increase-web-accessibility-in-6-steps/ ");
        testingURLs.add("https://www.ukad-group.com/blog/aspnet-core-8-pros-and-3-cons/ ");
        testingURLs.add("https://www.ukad-group.com/blog/security-issues-in-ehr/ ");
        testingURLs.add("https://www.ukad-group.com/blog/fast-and-smooth-communication-with-development-team/ ");
        testingURLs.add("https://www.ukad-group.com/blog/top-umbraco-plugins-i-recommend-to-use/ ");
        testingURLs.add("https://www.ukad-group.com/blog/iot-project-office-weather-station/ ");
        testingURLs.add("https://www.ukad-group.com/blog/google-amp/ ");
        testingURLs.add("https://www.ukad-group.com/blog/is-it-safe-to-outsource-long-term-projects-to-ukraine/ ");
        testingURLs.add("https://www.ukad-group.com/blog/ukad-became-umbraco-partner/ ");
        testingURLs.add("https://www.ukad-group.com/blog/merchello-for-umbraco-ecommerce-projects/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/electra/ ");
        testingURLs.add("https://www.ukad-group.com/blog/release-management-with-jira-and-confluence/ ");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/middle-senior-front-end-developer/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/travel-vaccination-service/ ");
        testingURLs.add("https://www.ukad-group.com/blog/automated-gui-testing-a-step-by-step-guide/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/maarten-angner/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/the-academy/ ");
        testingURLs.add("https://www.ukad-group.com/blog/how-to-boost-the-umbraco-performance/ ");
        testingURLs.add("https://www.ukad-group.com/blog/ukad-is-a-top-developer-in-2019-clutch-report/ ");
        testingURLs.add("https://www.ukad-group.com/blog/why-to-choose-cms/ ");
        testingURLs.add("https://www.ukad-group.com/blog/amp-testing/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/contenttap-web-and-ios-app/ ");
        testingURLs.add("https://www.ukad-group.com/blog/episerver-or-umbraco/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/photowall/ ");
        testingURLs.add("https://www.ukad-group.com/blog/ucommerce-for-umbraco/ ");
        testingURLs.add("https://www.ukad-group.com/blog/react-native-9-pros-and-3-cons/ ");
        testingURLs.add("https://www.ukad-group.com/blog/ukad-is-episerver-associate-partner/ ");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/senior-middle-backend-net-developer/ ");
        testingURLs.add("https://www.ukad-group.com/blog/css-flex-box-web-development-guide/ ");
        testingURLs.add("https://www.ukad-group.com/blog/azure-blockchain-workbench/ ");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/senior-episerver-developerepiserver-team-lead/ ");
        testingURLs.add("https://www.ukad-group.com/blog/server-and-service-monitoring-with-tick/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/kiggit/ ");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/senior-middle-android-developer-1/ ");
        testingURLs.add("https://www.ukad-group.com/blog/how-personal-bot-assisted-ukad-at-workspace/ ");
        testingURLs.add("https://www.ukad-group.com/blog/top-10-outsourcing-best-practices/ ");
        testingURLs.add("https://www.ukad-group.com/blog/seo-in-qa-ukad-experience/ ");
        testingURLs.add("https://www.ukad-group.com/blog/continuous-integration-ios/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/moblrn/ ");
        testingURLs.add("https://www.ukad-group.com/blog/my-azure-services-top-list/ ");
        testingURLs.add("https://www.ukad-group.com/blog/how-to-develop-a-secure-app/ ");
        testingURLs.add("https://www.ukad-group.com/blog/ukad-continues-to-rank-higher-on-clutch/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/apartdirect/ ");
        testingURLs.add("https://www.ukad-group.com/blog/3d-kharkiv-international-marathon/ ");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/digital-data-analyst/ ");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/juniorplus-middle-net-developer/ ");
        testingURLs.add("https://www.ukad-group.com/blog/ukad-team-was-nominated-umbraco-mvp15/ ");
        testingURLs.add("https://www.ukad-group.com/latest-projects/ginza/ ");
        testingURLs.add("https://www.ukad-group.com/blog/umbraco-cloud-uaas/ ");
        testingURLs.add("https://www.ukad-group.com/blog/what-is-cqrs-and-when-to-use-it/ ");
        testingURLs.add("https://www.ukad-group.com/blog/how-to-build-a-great-editorial-experience-with-umbraco/");
        testingURLs.add("https://www.ukad-group.com/blog/why-docker-containers-for-net-are-great/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/entitledto-social-benefit-calculator/");
        testingURLs.add("https://www.ukad-group.com/blog/outsourcing-to-ukraine/");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/senior-middle-ios-developer/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/cotunity/");
        testingURLs.add("https://www.ukad-group.com/blog/5-reasons-to-hate-react-native/");
        testingURLs.add("https://www.ukad-group.com/blog/react-native-development-ios-and-android-differences/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/nowwhere/");
        testingURLs.add("https://www.ukad-group.com/blog/css-grid-web-development-guide/");
        testingURLs.add("https://www.ukad-group.com/blog/gdpr-data-protection-act/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/birdie/");
        testingURLs.add("https://www.ukad-group.com/blog/when-to-choose-umbraco-as-a-cms/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/chefone-iosandroid-app/");
        testingURLs.add("https://www.ukad-group.com/blog/umbraco-pros-and-cons/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/mef/");
        testingURLs.add("https://www.ukad-group.com/umbraco-development-services-smart-choice-for-content-management-system/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/kiggit-ios-app/");
        return testingURLs;
    }

    public static String[] elementsToRemove() {
        String[] elements = new String[9];
        //Using Xpath
        elements[0] = "//div[@class='fullscreen-bg js-fullscreen-bg']";
        elements[1] = "//img[@src=\"https://cdn.ukad-group.com/media/2169/image1-1.gif?width=290.4761904761905&height=500\"]";
        elements[2] = "//video[@class='fullscreen-bg__video js-fullscreen-bg__video']";
        elements[3] = "//a[@class='ytp-title-channel-logo']";
        elements[4] = "//div[@class='fp-slidesContainer']";
        elements[5] = "//ul[@class='toc__list']";
        elements[6] = "//p[@class='toc__title']";
        elements[7] = "//ul[@class='bib__module bib--hover bib--row-4 bib--square']";
        elements[8] = "//ul[@class='portfolio__list']";
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
            }catch (NullPointerException e){
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

    public static void zipImagesFromResultsFolder(){
        CompressToZip.compress();
    }
}