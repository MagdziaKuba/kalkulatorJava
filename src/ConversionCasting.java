import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a=2;
        double b=4.23;

        double c=a/b;//konwersja niejawna, a zostaje przekonwertowane z int na double
        int d=a/(int)b;//wymuszenie konwersji i utrata wartości po przecinku; rzutowanie na typ int

        System.out.println(c);
        System.out.println(d);

        WebDriver driver=new FirefoxDriver();
        FirefoxDriver firefoxDriver=(FirefoxDriver)driver;
        firefoxDriver.get();


    }
}
