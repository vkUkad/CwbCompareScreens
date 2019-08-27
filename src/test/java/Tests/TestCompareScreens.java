package Tests;

import Helpers.TestConfig;
import Pages.LatestProjects.CS;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static Helpers.TestConfig.*;

public class TestCompareScreens {
    @BeforeTest
    public void beforeTest() throws AWTException {
        TestConfig.testPreconditions();
    }

    @Test(description = "Creating actual screenshot and comparing screens test#000")
    public void compareScreens000() throws IOException {
        int number = 0;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#001")
    public void compareScreens001() throws IOException {
        int number = 1;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#002")
    public void compareScreens002() throws IOException {
        int number = 2;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#003")
    public void compareScreens003() throws IOException {
        int number = 3;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#004")
    public void compareScreens004() throws IOException {
        int number = 4;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#005")
    public void compareScreens005() throws IOException {
        int number = 5;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#006")
    public void compareScreens006() throws IOException {
        int number = 6;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#007")
    public void compareScreens007() throws IOException {
        int number = 7;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#008")
    public void compareScreens008() throws IOException {
        int number = 8;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#009")
    public void compareScreens009() throws IOException {
        int number = 9;
        Object url = URLS().get(number);
        System.out.println(" Test#00" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#010")
    public void compareScreens010() throws IOException {
        int number = 10;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#011")
    public void compareScreens011() throws IOException {
        int number = 11;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#012")
    public void compareScreens012() throws IOException {
        int number = 12;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#013")
    public void compareScreens013() throws IOException {
        int number = 13;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#014")
    public void compareScreens014() throws IOException {
        int number = 14;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#015")
    public void compareScreens015() throws IOException {
        int number = 15;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#016")
    public void compareScreens016() throws IOException {
        int number = 16;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#017")
    public void compareScreens017() throws IOException {
        int number = 17;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#018")
    public void compareScreens018() throws IOException {
        int number = 18;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#019")
    public void compareScreens019() throws IOException {
        int number = 19;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#020")
    public void compareScreens020() throws IOException {
        int number = 20;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#021")
    public void compareScreens021() throws IOException {
        int number = 21;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#022")
    public void compareScreens022() throws IOException {
        int number = 22;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#023")
    public void compareScreens023() throws IOException {
        int number = 23;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#024")
    public void compareScreens024() throws IOException {
        int number = 24;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#025")
    public void compareScreens025() throws IOException {
        int number = 25;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#026")
    public void compareScreens026() throws IOException {
        int number = 26;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#027")
    public void compareScreens027() throws IOException {
        int number = 27;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#028")
    public void compareScreens028() throws IOException {
        int number = 28;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#029")
    public void compareScreens029() throws IOException {
        int number = 29;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#030")
    public void compareScreens030() throws IOException {
        int number = 30;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#031")
    public void compareScreens031() throws IOException {
        int number = 31;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#032")
    public void compareScreens032() throws IOException {
        int number = 32;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#033")
    public void compareScreens033() throws IOException {
        int number = 33;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#034")
    public void compareScreens034() throws IOException {
        int number = 34;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#035")
    public void compareScreens035() throws IOException {
        int number = 35;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#036")
    public void compareScreens036() throws IOException {
        int number = 36;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#037")
    public void compareScreens037() throws IOException {
        int number = 37;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#038")
    public void compareScreens038() throws IOException {
        int number = 38;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#039")
    public void compareScreens039() throws IOException {
        int number = 39;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#040")
    public void compareScreens040() throws IOException {
        int number = 40;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#041")
    public void compareScreens041() throws IOException {
        int number = 41;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#042")
    public void compareScreens042() throws IOException {
        int number = 42;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#043")
    public void compareScreens043() throws IOException {
        int number = 43;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#044")
    public void compareScreens044() throws IOException {
        int number = 44;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#045")
    public void compareScreens045() throws IOException {
        int number = 45;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#046")
    public void compareScreens046() throws IOException {
        int number = 46;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#047")
    public void compareScreens047() throws IOException {
        int number = 47;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#048")
    public void compareScreens048() throws IOException {
        int number = 48;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#049")
    public void compareScreens049() throws IOException {
        int number = 49;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#050")
    public void compareScreens050() throws IOException {
        int number = 50;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#051")
    public void compareScreens051() throws IOException {
        int number = 51;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#052")
    public void compareScreens052() throws IOException {
        int number = 52;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#053")
    public void compareScreens053() throws IOException {
        int number = 53;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#054")
    public void compareScreens054() throws IOException {
        int number = 54;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#055")
    public void compareScreens055() throws IOException {
        int number = 55;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#056")
    public void compareScreens056() throws IOException {
        int number = 56;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#057")
    public void compareScreens057() throws IOException {
        int number = 57;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#058")
    public void compareScreens058() throws IOException {
        int number = 58;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#059")
    public void compareScreens059() throws IOException {
        int number = 59;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#060")
    public void compareScreens060() throws IOException {
        int number = 60;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#061")
    public void compareScreens061() throws IOException {
        int number = 61;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#062")
    public void compareScreens062() throws IOException {
        int number = 62;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#063")
    public void compareScreens063() throws IOException {
        int number = 63;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#064")
    public void compareScreens064() throws IOException {
        int number = 64;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#065")
    public void compareScreens065() throws IOException {
        int number = 65;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#066")
    public void compareScreens066() throws IOException {
        int number = 66;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#067")
    public void compareScreens067() throws IOException {
        int number = 67;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#068")
    public void compareScreens068() throws IOException {
        int number = 68;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#069")
    public void compareScreens069() throws IOException {
        int number = 69;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#070")
    public void compareScreens070() throws IOException {
        int number = 70;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#071")
    public void compareScreens071() throws IOException {
        int number = 71;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#072")
    public void compareScreens072() throws IOException {
        int number = 72;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#073")
    public void compareScreens073() throws IOException {
        int number = 73;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#074")
    public void compareScreens074() throws IOException {
        int number = 74;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#075")
    public void compareScreens075() throws IOException {
        int number = 75;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#076")
    public void compareScreens076() throws IOException {
        int number = 76;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#077")
    public void compareScreens077() throws IOException {
        int number = 77;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#078")
    public void compareScreens078() throws IOException {
        int number = 78;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#079")
    public void compareScreens079() throws IOException {
        int number = 79;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#080")
    public void compareScreens080() throws IOException {
        int number = 80;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#081")
    public void compareScreens081() throws IOException {
        int number = 81;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#082")
    public void compareScreens082() throws IOException {
        int number = 82;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#083")
    public void compareScreens083() throws IOException {
        int number = 83;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#084")
    public void compareScreens084() throws IOException {
        int number = 84;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#085")
    public void compareScreens085() throws IOException {
        int number = 85;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#086")
    public void compareScreens086() throws IOException {
        int number = 86;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#087")
    public void compareScreens087() throws IOException {
        int number = 87;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#088")
    public void compareScreens088() throws IOException {
        int number = 88;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#089")
    public void compareScreens089() throws IOException {
        int number = 89;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#090")
    public void compareScreens090() throws IOException {
        int number = 90;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#091")
    public void compareScreens091() throws IOException {
        int number = 91;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#092")
    public void compareScreens092() throws IOException {
        int number = 92;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#093")
    public void compareScreens093() throws IOException {
        int number = 93;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#094")
    public void compareScreens094() throws IOException {
        int number = 94;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#095")
    public void compareScreens095() throws IOException {
        int number = 95;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#096")
    public void compareScreens096() throws IOException {
        int number = 96;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#097")
    public void compareScreens097() throws IOException {
        int number = 97;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#098")
    public void compareScreens098() throws IOException {
        int number = 98;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#099")
    public void compareScreens099() throws IOException {
        int number = 99;
        Object url = URLS().get(number);
        System.out.println(" Test#0" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), "0" + number);
    }

    @Test(description = "Creating actual screenshot and comparing screens test#100")
    public void compareScreens100() throws IOException {
        int number = 100;
        Object url = URLS().get(number);
        System.out.println(" Test#" + number + " " + URLS().get(number).toString());
        openNewTab(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeFileToActualDir(CS.getActualScreenshotTitle(url.toString()), CS.takeScreenshot());
        CS.readExpectedScreenshot(url.toString());
        CS.checkIfPagesAreDifferent(CS.getDifference(url.toString()), url.toString(), number+"");
    }

    @AfterTest
    public void doAfterTest() {
        closeBrowser();
        removeFolderWithObsoleteData(new File("C:\\UkadSiteTestScreens\\actual"));
        removeFolderWithObsoleteData(new File("C:\\UkadSiteTestScreens\\diff"));
    }
}
