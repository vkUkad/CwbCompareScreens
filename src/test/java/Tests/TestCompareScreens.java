package Tests;

import Helpers.TestConfig;
import Pages.LatestProjects.CS;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;

import static Helpers.TestConfig.*;

public class TestCompareScreens {
    @BeforeTest
    public void beforeTest() throws AWTException {
        TestConfig.testPreconditions();
    }

    @Test(description = "Creating actual screenshot and comparing screens test#000")
    public void compareScreens000() throws Exception {
        int number = 0;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickInitialPopupButton("button[class=\"btn btn--full-width btn--primary-orange js-changeVisitorType\"]");
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#000")
    public void compareScreens001() throws Exception {
        int number = 1;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        //CS.clickInitialPopupButton("button[class=\"btn btn--full-width btn--primary-orange js-changeVisitorType\"]");
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#000")
    public void compareScreens002() throws Exception {
        int number = 2;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        //CS.clickInitialPopupButton("button[class=\"btn btn--full-width btn--primary-orange js-changeVisitorType\"]");
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#000")
    public void compareScreens003() throws Exception {
        int number = 3;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        //CS.clickInitialPopupButton("button[class=\"btn btn--full-width btn--primary-orange js-changeVisitorType\"]");
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @AfterTest
    public void doAfterTest() {
        closeBrowser();
        removeFolderWithObsoleteData(new File("C:\\CowabSiteTestScreens\\actual"));
        removeFolderWithObsoleteData(new File("C:\\CowabSiteTestScreens\\diff"));
        removeFolderWithObsoleteData(new File("C:\\CowabSiteTestScreens\\result"));
    }
}
