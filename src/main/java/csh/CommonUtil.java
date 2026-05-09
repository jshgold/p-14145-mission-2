package csh;

import java.io.File;

public class CommonUtil {
    public static final String DIR_PATH = "db/wiseSaying";

    public void createFile() {
        File dir = new File(DIR_PATH);
        dir.mkdirs();
    }

    public boolean isExistDirectory() {
        File dir = new File(DIR_PATH);
        return dir.exists();
    }
}
