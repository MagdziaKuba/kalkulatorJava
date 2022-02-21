package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver=getDriver("chrome");
        driver.get();
        /*ChromeDriver chrome=new ChromeDriver();
        chrome.get();
        chrome.findElementBy();

        FirefoxDriver firefox=new FirefoxDriver();
        firefox.get();
        firefox.findElementBy();*/
    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("chrome")){
            return new ChromeDriver();
        }else if(name.equals("firefox")){
            return new FirefoxDriver();
        }else{
            throw new NoValidBrowserName("No valid browser name");
        }

    }
}
