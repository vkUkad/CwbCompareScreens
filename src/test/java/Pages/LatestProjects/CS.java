package Pages.LatestProjects;

import Helpers.AShotFoldersConfiguration;
import Helpers.RemoveElements;
import Helpers.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static Helpers.AShotFoldersConfiguration.actualDir;
import static Helpers.AShotFoldersConfiguration.expectedDir;
import static Helpers.TestConfig.sendFailedTestsScreenshotViaGmail;

public class CS {

    public static Screenshot takeScreenshot() {

        TestConfig.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(1500))
                .takeScreenshot(TestConfig.driver);
        return screenshot;
    }

    public static void createResultImageAndSendEmailWithResult(String actual, String expected, String difference, String url, String testId) throws IOException, MessagingException {
        File file1 = new File(actual);
        File file2 = new File(expected);
        File file3 = new File(difference);

        DateFormat dateFormat = new SimpleDateFormat("_yyyy_MM_dd_HH-mm-ss");
        Date date = new Date();

        BufferedImage img1 = ImageIO.read(file1);
        BufferedImage img2 = ImageIO.read(file2);
        BufferedImage img3 = ImageIO.read(file3);

        int widthImg1 = img1.getWidth();
        int heightImg1 = img1.getHeight();
        int widthImg2 = img2.getWidth();
        int widthImg3 = img3.getWidth();

        BufferedImage img = new BufferedImage(widthImg1 + widthImg2 + widthImg3, heightImg1, // Final image will have width and height as addition of widths and heights of the images we already have
                BufferedImage.TYPE_INT_RGB);

        boolean image1Drawn = img.createGraphics().drawImage(img1, 0, 0, null); // 0, 0 are the x and y positions
        if (!image1Drawn)
            System.out.println("Problems drawing first image"); //where we are placing image1 in final image
        boolean image2Drawn = img.createGraphics().drawImage(img2, widthImg1, 0, null); // here width is mentioned as width of
        if (!image2Drawn)
            System.out.println("Problems drawing second image"); // image1 so both images will come in same level horizontally
        boolean image3Drawn = img.createGraphics().drawImage(img3, widthImg1 + widthImg2, 0, null); // here width is mentioned as width of
        if (!image3Drawn) System.out.println("Problems drawing third image");

        File final_image = new File(AShotFoldersConfiguration.resultDir + "testID-" + testId + "_" + getResultScreenshotTitile(url) + dateFormat.format(date) + ".png"); // “png can also be used here”
        boolean final_Image_drawing = ImageIO.write(img, "png", final_image); //if png is used, write “png” instead “jpeg”
        sendFailedTestsScreenshotViaGmail(AShotFoldersConfiguration.resultDir + "testID-" + testId + "_" + getResultScreenshotTitile(url) + dateFormat.format(date) + ".png");
        if (!final_Image_drawing) System.out.println("Problems drawing final image");
    }

    public static void writeFileToActualDir(String name, Screenshot screenshot) throws IOException {
        File actualFile = new
                File(AShotFoldersConfiguration.actualDir + name + ".png");
        ImageIO.write(screenshot.getImage(), "png", actualFile);
    }

    public static void clickOkButton() {
        WebElement btnOKfromCookiesArea = TestConfig.driver.findElement(By.cssSelector("button[class=\"cookies__button\"]"));
        if (btnOKfromCookiesArea.isDisplayed()) {
            btnOKfromCookiesArea.click();
        }
    }

    public static void removeElementsFromCreateExpectedScreensPages(String[] by) {
        for (int i = 0; i < by.length; i++) {
            String currentElement = by[i];
            TestConfig.driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
            if (TestConfig.driver.findElements(By.xpath(currentElement)).size() != 0) {
                RemoveElements.removePageElements(By.xpath(currentElement));
            }
        }
    }

    public static String getExpectedScreenshotTitle(String input) {
        String name = input.replaceAll("https://www.ukad-group.com/", "") + "_expected_window.size-" + TestConfig.browserWindowSize();
        name = name.replaceAll("/", "_");
        return name;
    }

    public static String getActualScreenshotTitle(String input) {
        String name = input.replaceAll("https://www.ukad-group.com/", "") + "_actual_window.size-" + TestConfig.browserWindowSize();
        name = name.replaceAll("/", "_");
        return name;
    }

    public static String getDifferenceScreenshotTitle(String input) {
        String name = input.replaceAll("https://www.ukad-group.com/", "") + "_difference_window.size-" + TestConfig.browserWindowSize();
        name = name.replaceAll("/", "_");
        return name;
    }

    public static String getResultScreenshotTitile(String input) {
        String name = input.replaceAll("https://www.ukad-group.com/", "")
                + "_result(actual-expected-difference)_window.size-"
                + TestConfig.browserWindowSize();

        name = name.replaceAll("/", "_");
        return name;
    }

    public static Screenshot readExpectedScreenshot(String name) throws IOException {
        Screenshot screenshotExpected = new
                Screenshot(ImageIO.read
                (new File(expectedDir + CS.getExpectedScreenshotTitle(name) + ".png")));
        return screenshotExpected;
    }

    public static Screenshot readActualScreenshot(String name) throws IOException {
        Screenshot screenshotActual = new
                Screenshot(ImageIO.read(
                new File(actualDir + CS.getActualScreenshotTitle(name) + ".png")));
        return screenshotActual;
    }

    public static ImageDiff getDifference(String url) throws IOException {
        ImageDiff diff = new
                ImageDiffer().makeDiff(CS.readExpectedScreenshot(url), CS.readActualScreenshot(url));
        diff.getDiffSize();
        return diff;
    }

    public static void checkIfPagesAreDifferent(ImageDiff diff, String url, String testId) throws IOException,MessagingException {
        if (diff.getDiffSize() > 16) {
            DateFormat dateFormat = new SimpleDateFormat("_yyyy_MM_dd_HH-mm-ss");
            Date date = new Date();
            String differenceScreenshotAddress = AShotFoldersConfiguration.diffDir
                    + getDifferenceScreenshotTitle(url)
                    + dateFormat.format(date)
                    + "_testID-"
                    + testId
                    + ".png";
            String actualScreenshotAddress = actualDir + CS.getActualScreenshotTitle(url) + ".png";
            String expectedScreenshotAddress = expectedDir + CS.getExpectedScreenshotTitle(url) + ".png";
            File diffFile = new
                    File(AShotFoldersConfiguration.diffDir + getDifferenceScreenshotTitle(url) + dateFormat.format(date) + "_testID-" + testId + ".png");
            ImageIO.write(diff.getMarkedImage(), "png", diffFile);

            createResultImageAndSendEmailWithResult(
                    actualScreenshotAddress,
                    expectedScreenshotAddress,
                    differenceScreenshotAddress,
                    url, testId);
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(diff.getDiffSize(), 0, "Test for the page: '" + url + "' is failed");
            softAssert.assertAll();
        }
    }
}
