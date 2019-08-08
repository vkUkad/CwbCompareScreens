package Helpers;

import org.openqa.selenium.By;

import java.util.HashSet;
import java.util.Set;

public class SetIgnoredElements {
    public static Set<By> setTheElements() {
        Set<By> set = new HashSet() {
        };
        set.add(By.id("header"));
        return set;
    }
}
