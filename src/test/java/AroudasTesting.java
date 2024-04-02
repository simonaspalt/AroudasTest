import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.color.ICC_ColorSpace;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;



public class AroudasTesting {

    WebDriver _globalDriver;

    private WebDriver globalDriver;

    @BeforeTest
    public void SetupWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        _globalDriver = new ChromeDriver(options);
        _globalDriver.get("https://www.aruodas.lt/");
        _globalDriver.manage().window().maximize();
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        _globalDriver.findElement(By.id("onetrust-accept-btn-handler")).click();

    }
    @Test
    public void AroudasTC12(){
        //click prisijungti
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();
        //_globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        //click registruotis
        _globalDriver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();
        //type email
        _globalDriver.findElement(By.id("userName")).sendKeys(generateRandomEmail());
        //type pwd
        _globalDriver.findElement(By.id("password")).sendKeys(generateUserName());
        //press registruotis
        _globalDriver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void AroudasTC13(){
        //click prisijungti
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();
        //type email
        _globalDriver.findElement(By.id("userName")).sendKeys("belekoks@gmail.com");
        //type pwd
        _globalDriver.findElement(By.id("password")).sendKeys("belepwd@23");
        //press prisijugti
        _globalDriver.findElement(By.id("loginAruodas")).click();
        //press Mano Aroudas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]")).click();
        //press atsijungti
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div/ul/li[10]")).click();

    }
    @Test
    public void AruodasTC14(){
        //press ideti skelbima
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/a")).click();
        //pairinkite objekto tipa, press Butas
        _globalDriver.findElement((By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[1]"))).click();
        //press nuomai
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/ul/li[2]")).click();
        //press Savivialdybe: Pasirinktite
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/input[2]")).click();
        //press Vilnius
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
        //press Mikrorajonas: Pasirinkite
        _globalDriver.findElement(By.id("quartalTitle")).click();
        //scroll and press Zverynas (scroll not necesary)
        WebElement element = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[66]"));
        //((JavascriptExecutor) _globalDriver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        //press Gatve: Pasirinkti
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/input[2]")).click();
        //type Birutes g.
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[1]/input")).sendKeys("Birutes g.");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[2994]")).click();
        // type 1 at Namo Numeris
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[7]/span[1]/input")).sendKeys("1");
        // type 1 at Buto numeris
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[8]/span[1]/input")).sendKeys("1");
        //deselect Rodyti at both
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[7]/div/div/label")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[8]/div/div/label")).click();
        //type at Plotas
        _globalDriver.findElement(By.id("fieldFAreaOverAll")).sendKeys("11,45");
        // select 4 at Kambariu sk.
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[15]/div/div[4]/div[2]")).click();
        //type at Aukstas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[17]/div[1]/span[2]/input")).sendKeys("25");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[17]/div[2]/span[1]/input")).sendKeys("159");
        // type at Statybos metai
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[18]/div[1]/span[1]/span/input")).sendKeys("1410");
        //choose Rastinis at Patato tipas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[19]/div/div[6]/div[2]")).click();
        //select Irengtas at Irengimas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[20]/div/div[1]/div[2]")).click();
        //select Kietu kuru at Sildymas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[22]/div/div[8]/label")).click();
        //type text at Aprasymas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[37]/div/div[1]/textarea")).sendKeys("Mociutes trobele, gal kiek per auksta");
        //upload photo Ikelti nuotrauku
        //_globalDriver.findElement(By.id("uploadPhotoBtn")).click();
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[39]/div/div[1]/a/input")).sendKeys("C:\\Users\\simas\\OneDrive\\Pictures\\UbisoftConnect\\Anno 1800\\trobele.jpg");
        //type at Kaina men.
        _globalDriver.findElement(By.id("priceField")).sendKeys("777,88");
        //type phone number
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[47]/span[1]/input")).sendKeys("68854215");
        //type email
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[48]/span[1]/input")).sendKeys(generateRandomEmail());
        //check to agree with rules
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[51]/span[1]/div/div/label/span")).click();




    }



    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers

            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }
    public static String generateUserName(){
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};
        Random random = new Random();
        StringBuilder username = new StringBuilder();
        int usernameLength = random.nextInt(10) + 10; // Random length between 5 to 14 cha
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alph
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            username.append(randomChar);
        }
        return username.toString();
    }

}
