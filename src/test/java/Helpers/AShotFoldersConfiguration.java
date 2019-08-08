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
    public static String[] pathsForScreenshots = new String[5];

    public static void setRootScreenshotsDir(String absolutePath) {
        resourcesImagesDir = absolutePath;
        expectedDir = resourcesImagesDir + "/expected/";
        actualDir = resourcesImagesDir + "/actual/";
        diffDir = resourcesImagesDir + "/diff/";
        resultDir = resourcesImagesDir + "/result/";
        pathsForScreenshots[0] = resourcesImagesDir;
        pathsForScreenshots[1] = expectedDir;
        pathsForScreenshots[2] = actualDir;
        pathsForScreenshots[3] = diffDir;
        pathsForScreenshots[4] = resultDir;
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