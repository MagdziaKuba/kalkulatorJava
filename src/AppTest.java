public class AppTest {
    public static void main(String[] args) {
        AndroidApp telefon=new AndroidApp("Androidek");
        telefon.runAndroidApp();
        AndroidApp telefon2=new AndroidApp();
        telefon2.name="Androndzio";
        telefon2.runAndroidApp();
        telefon2.appInfo();

        IphoneApp jablko=new IphoneApp("Jabłko");
        jablko.runIphoneApp();
        jablko.appInfo();

    }
}
