package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Chrome otwiera przeglądarkę.");
    }

    @Override
    public void findElementBy() {
        System.out.println("Chrome Znajduje");

    }
}
