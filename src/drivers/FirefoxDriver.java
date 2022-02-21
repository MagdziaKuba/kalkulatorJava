package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Firefox otwiera przeglądarkę.");
    }

    @Override
    public void findElementBy() {
        System.out.println("Firefox Znajduje");

    }
}
