package Helpers;

import lombok.Getter;

import java.io.File;

//methods for creating folders for the screenshots
@Getter
public class AShotFoldersConfiguration {
    public static String resourcesImagesDir;
    public static String expectedDir;
    public static String actualDir;
    public static String diffDir;
    public static String resultDir;
    public static String baseDir;
    public static String baseDirFullPath;
    public static String[] pathsForScreenshots = new String[6];

    public static void setRootScreenshotsDir(String absolutePath) {
        resourcesImagesDir = absolutePath;
        baseDir = "/CowabSiteTestScreens/";
        baseDirFullPath = resourcesImagesDir + "/CowabSiteTestScreens/";
        expectedDir = baseDirFullPath + "/expected/";
        actualDir = baseDirFullPath + "/actual/";
        diffDir = baseDirFullPath + "/diff/";
        resultDir = baseDirFullPath + "/result/";
        pathsForScreenshots[0] = resourcesImagesDir;
        pathsForScreenshots[1] = baseDirFullPath;
        pathsForScreenshots[2] = expectedDir;
        pathsForScreenshots[3] = actualDir;
        pathsForScreenshots[4] = diffDir;
        pathsForScreenshots[5] = resultDir;
        createFolders();// Метод который проверяет наличие папок file.exists() , в случае их отсутствия - создает (file.mkdirs())
    }

    private static void createFolders() {
        for (String x : pathsForScreenshots) {
            File resourcesDir = new File(x);
// if the directory does not exist, create it
            if (!resourcesDir.exists()) {
                System.out.println("creating directory: " + resourcesDir.getName());
                boolean result = false;

                try {
                    resourcesDir.mkdir();
                    result = true;
                } catch (SecurityException se) {
                    System.out.println(resourcesDir + " is existing. " + se.getMessage());
                }
                if (result) {
                    System.out.println("DIR created");
                }
            }
        }
    }
}