import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
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
        // type 1 at Namo NumeristypB
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

    @Test
    public void AroudasSearchTC(){
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
        //click "Butai pardavimui"
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       _globalDriver.findElement(By.id("display_obj")).click();
       //click "Butai nuomai"
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/ul/li[4]/label")).click();
        //click "Savivaldybe"
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/div/div")).click();
        // click "Vilnius"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/ul/li[2]")).click();
        //click "Pasirinkite mikrorajona"
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        _globalDriver.findElement(By.id("display_text_FQuartal")).click();
        //click "pasirinkti visus"
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.switchTo().frame("fancybox-frame");
        _globalDriver.findElement(By.id("cbCheckAll")).click();
        //click Issaugoti
        _globalDriver.findElement(By.id("btSaveSelected")).click();
        // click gatves
        _globalDriver.findElement(By.id("display_text_FStreets")).click();
        // click pasirinkti visus
        _globalDriver.switchTo().frame("fancybox-frame");
        _globalDriver.findElement(By.id("cbCheckAll")).click();
        //click issaugoti
        _globalDriver.findElement(By.id("btSaveSelected")).click();
        //type to Plotas nuo
        _globalDriver.findElement(By.id("input_FAreaOverAllMin")).sendKeys("15");
        //type to Plotas iki
        _globalDriver.findElement(By.id("input_FAreaOverAllMax")).sendKeys("55");
        //click at kambariai
        _globalDriver.findElement(By.id("quickValue_FRoomNum_1")).click();
        //type Kaina nuo
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[4]/div/div[1]/label/input")).sendKeys("150");
        //type Kaina iki
        _globalDriver.findElement(By.id("input_FPriceMax")).sendKeys("350");
        //click Sildymas
        _globalDriver.findElement(By.id("display_FWarmSystem")).click();
        // click centrinis
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div/ul/li[1]/label/input")).click();
        //click iekoti
        _globalDriver.findElement(By.id("buttonSearchForm")).click();
        //click on first item
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Actions actions = new Actions(_globalDriver);

        // Scroll down by holding down the Page Down key for 2 seconds
        actions.keyDown(Keys.PAGE_DOWN).pause(2000).keyUp(Keys.PAGE_DOWN).build().perform();
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[8]/div[5]/div/div[2]/h3/a")).click();
        // get name
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String adName = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/h1")).getText();
        //get price
        String adPrice = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/div[4]/div/span[1]")).getText();
        //go home page
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/h2/a/img")).click();
        // click at issaugotos paiekos
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[2]/div/div/div/ul/li[1]/div[1]/a/div[1]/p[1]")).click();
        //click on first item
        actions.keyDown(Keys.PAGE_DOWN).pause(2000).keyUp(Keys.PAGE_DOWN).build().perform();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[8]/div[5]/div/div[2]/h3/a")).click();
        //compare values
        Assert.assertEquals(adName,_globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/h1")).getText());
        Assert.assertEquals(adPrice,_globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/div[4]/div/span[1]")).getText());

    }

    @Test
    public void AruodasButuVertesSkaiciuokle(){
        //click butu vertes skaiciuokle
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/ul/li[5]")).click();
        //type namo numeris
        _globalDriver.findElement(By.id("address")).sendKeys("Rygos g., Vilnius");
        _globalDriver.findElement(By.id("street_number")).sendKeys("23");
        //type adress
        //_globalDriver.findElement(By.id("address")).sendKeys("Rygos g., Vilnius");
        //click on drop list
        //_globalDriver.findElement(By)
        //fix text box
        _globalDriver.findElement(By.id("address")).clear();
        _globalDriver.findElement(By.id("address")).sendKeys("Rygos g., Vilnius, Vilnius City Municipality");
        //type plotas
        _globalDriver.findElement(By.id("area")).sendKeys("55");
        //type metai
        _globalDriver.findElement(By.id("year")).sendKeys("1985");
        //click pastato tipas
        _globalDriver.findElement(By.id("buildingTypeTitle")).click();
        //click blokinis in drop list
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[2]/div[3]/span/ul/li[2]")).click();
        //type kambariu sk 4
        _globalDriver.findElement(By.id("roomNumTitle")).sendKeys("4");
        //click 4 in drop list
        //_globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[2]/div[4]/span/ul/li[4]")).click();
        // scroll down
        Actions actions = new Actions(_globalDriver);

        // Scroll down by holding down the Page Down key for 2 seconds
        actions.keyDown(Keys.PAGE_DOWN).pause(2000).keyUp(Keys.PAGE_DOWN).build().perform();
        //click Irengimas
        _globalDriver.findElement(By.id("houseStateTitle")).click();
        //click irengtas in drop list
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[3]/div[3]/span/ul/li[1]")).click();
        //click auktas
        _globalDriver.findElement(By.id("floorTitle")).sendKeys("9");
        //type 9 at drop list
        //_globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[3]/div[4]/span/ul/li[9]")).click();
        //type 9 Aukstu skaicius
        _globalDriver.findElement(By.id("houseHeightTitle")).sendKeys("9");
        //type 9 at drop list text box
        //_globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[3]/div[5]/span/ul/li[10]/input")).sendKeys("9");
        //check Centrinis at Sildymas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[3]/div[1]/ul/li[1]/label")).click();
        //check Nauja kanalizacija
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[3]/div[2]/ul/li[5]/label")).click();
        //check nauja elektro instaliacija
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[3]/div[2]/ul/li[6]/label")).click();
        //check rusys
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[3]/div[2]/ul/li[12]/label")).click();
        //check balkonas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[3]/div[2]/ul/li[10]/label")).click();
        //type email
        _globalDriver.findElement(By.id("email")).sendKeys(generateRandomEmail());
        //click Gauti busto ivertinima
        _globalDriver.findElement(By.id("submitEvaluateButton")).click();
        //need to find a way to click on google drop list adress


    }

    @Test
    public void AruodasSorting(){
        //click detalioji paieska
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[4]/div[3]/div[2]/label")).click();
        //type Kaina nuo
        _globalDriver.findElement(By.id("input_FPriceMin")).sendKeys("50000");
        //type Kaina iki
        _globalDriver.findElement(By.id("input_FPriceMax")).sendKeys("100000");
        //click Svarbesni virsuje
        _globalDriver.findElement(By.id("display_FOrder")).click();
        //click pigesni virsuje at drop list
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[4]/div[1]/div/div/div/div/ul/li[3]/label")).click();
        //click Ieskoti
        _globalDriver.findElement(By.id("buttonSearchForm")).click();

    }

    @Test
    public void AruodasIsiminti(){
        //click prisijungti
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();
        //type email
        _globalDriver.findElement(By.id("userName")).sendKeys("belekoks@gmail.com");
        //type pwd
        _globalDriver.findElement(By.id("password")).sendKeys("belepwd@23");
        //press prisijugti
        _globalDriver.findElement(By.id("loginAruodas")).click();
        //click Iekoti
        _globalDriver.findElement(By.id("buttonSearchForm")).click();
        //scroll
        Actions actions = new Actions(_globalDriver);
        // Scroll down by holding down the Page Down key for 2 seconds
        actions.keyDown(Keys.PAGE_DOWN).pause(2000).keyUp(Keys.PAGE_DOWN).build().perform();
        //click first item
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[8]/div[4]/div[2]/div[2]/h3/a")).click();
        //click Isiminti
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[4]/div/div[5]")).click();
        //actions.keyDown(Keys.PAGE_DOWN).pause(50000).keyUp(Keys.PAGE_DOWN).build().perform();
        //get id
        String adID = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[6]/div[1]/div[3]/div[11]/div[5]/div[1]/div[1]/div[2]")).getText();
        //click mano aruodas
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]")).click();
        //click Isiminti
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div/ul/li[4]")).click();
        //click first ad
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[2]/div[1]/h3/a")).click();
        Assert.assertEquals(adID,_globalDriver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[6]/div[1]/div[3]/div[11]/div[5]/div[1]/div[1]/div[2]")).getText());



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
