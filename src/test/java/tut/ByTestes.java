package tut;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ByTestes {

    ByTest test = new ByTest();

    @BeforeMethod(groups = "test1")
    public void logintutby() throws Exception {
        test.logintutby();
    }

    @Test(groups = "test1")
    public void yandex() throws Exception {
        test.yandex();
    }

    @AfterMethod(groups = "test1")
    public void exit() throws Exception {
        test.exit();
    }


}
