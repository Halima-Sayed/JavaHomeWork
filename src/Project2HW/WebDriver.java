package Project2HW;

import java.security.Key;

public interface WebDriver {
    /*
    Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
CHECK FILE for the diagram
     */
    void get(String url);
    void click();
    void sendKeys(String Keys);

}
interface TakeScreenshot{
    void getScreenShot();
}
interface RemoteWebDriver extends WebDriver,TakeScreenshot{
public void navigate();

}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void get(String url) {
        System.out.println(url);
    }

    @Override
    public void click() {
    }

    @Override
    public void sendKeys(String Keys) {
        System.out.println(Keys);
    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void navigate() {

    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void get(String url) {
        System.out.println(url);
    }

    @Override
    public void click() {

    }

    @Override
    public void sendKeys(String Keys) {
        System.out.println(Keys);
    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void get(String url) {
        System.out.println(url);
    }

    @Override
    public void click() {

    }

    @Override
    public void sendKeys(String Keys) {
        System.out.println(Keys);
    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void navigate() {

    }
}
class WebTester {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("www.google.com");
        driver.click();
        driver.sendKeys("Hi");
        driver.getScreenShot();
        driver.navigate();

        FirefoxDriver driver1=new FirefoxDriver();
        driver1.get("www.google.com");
        driver1.click();
        driver1.sendKeys("Hi");
        driver1.getScreenShot();
        driver1.navigate();

        SafariDriver driver2=new SafariDriver();
        driver2.get("www.google.com");
        driver2.click();
        driver2.sendKeys("Hi");
        driver2.getScreenShot();
        driver2.navigate();



    }
}
