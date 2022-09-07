import Utils.BasicStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class A101TestCase extends BasicStaticDriver {
    public static void main(String[] args) {

        // ister chrome ister firefox ile çalıştırılabilir
        // defaultta firefox ayarlıdır . değiştirmek isterseniz driver daki chrome un yorumlarını kaldırabilirsiniz
        // herhangi bir özel durum şekil veya framework belirtilmediği için bu şekilde bir proje oluşturdum.
        // istenilir ise cucumber ile framework yapısı ile de bu rpojeyi oluşturabilirim.

        driver.get("https://www.a101.com.tr/");
       // driver.manage().window().maximize();

        WebElement kabul = driver.findElement(By.xpath("//button[contains(text(),'Kabul Et')]"));
        kabul.click();
        Bekle(1);
        WebElement giyim= driver.findElement(By.cssSelector("[title='GİYİM & AKSESUAR']"));

        Actions aksiyonlar=new Actions(driver);
        Bekle(1);
        aksiyonlar.moveToElement(giyim).build().perform();
        Bekle(1);
        WebElement dizAlti= driver.findElement(By.linkText("Dizaltı Çorap"));
        aksiyonlar.moveToElement(dizAlti).build().perform();
        dizAlti.click();

        WebElement siyah = driver.findElement(By.cssSelector("[value='SİYAH']"));
        siyah.click();

        WebElement sepetekle = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/div/div[2]/div[2]/a/strong/span"));
        sepetekle.click();

        Bekle(2);
        WebElement sepetekle2= driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button"));
        sepetekle2.click();
        Bekle(2);

        WebElement sepetgoruntule= driver.findElement(By.xpath("//*[@id=\"js-modal-basket\"]/div[3]/a[3]"));
        sepetgoruntule.click();
        Bekle(2);

        WebElement sepetonayla= driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a"));
        sepetonayla.click();
        Bekle(2);

        WebElement uyeolma= driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a"));
        uyeolma.click();
        Bekle(2);

        WebElement mailyolla= driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input"));
        mailyolla.sendKeys("fssss@gmail.com");
        Bekle(2);

        WebElement devam= driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button"));
        devam.click();
        Bekle(2);

        WebElement yeniadres= driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a"));
        yeniadres.click();
        Bekle(2);


        WebElement adresbaslik= driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[2]/div/div/label/input"));
        adresbaslik.sendKeys("ev");
        Bekle(2);

        WebElement ad= driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[1]/div/label/input"));
        ad.sendKeys("ali");
        Bekle(2);


        WebElement soyad= driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[2]/div/label/input"));
        soyad.sendKeys("veli");
        Bekle(2);

        WebElement cep= driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[4]/div/div/label/input"));
        cep.sendKeys("5555555555");
        Bekle(2);



      WebElement menu= driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select"));
      Select ddmenu=new Select(menu);
      Bekle(1);
      ddmenu.selectByVisibleText("DÜZCE");

      Bekle(3);

        WebElement menu2= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select"));

        wait.until(ExpectedConditions.elementToBeClickable(menu2));
        Select ddmenu2=new Select(menu2);
        Bekle(1);
        ddmenu2.selectByVisibleText("MERKEZ");

        Bekle(2);

        WebElement menu3= driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select"));
        Select ddmenu3=new Select(menu3);
        Bekle(1);
        ddmenu3.selectByVisibleText("AZMİMİLLİ MAH");

        Bekle(2);


        WebElement adres= driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[7]/label/textarea"));
        adres.sendKeys("cami mah. okul sok. kahve apt.");
        Bekle(2);


        WebElement kaydet= driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/button[1]"));
        kaydet.click();
        Bekle(2);


        WebElement kargo= driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div[2]/ul/li[2]/label/div[2]/div"));
        kargo.click();
        Bekle(2);

        WebElement kayitdevam= driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button"));
        kayitdevam.click();
        Bekle(2);



        WebElement kartbilgisikontrol=driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]"));
        Bekle(2);
        Assert.assertTrue(kartbilgisikontrol.getText().contains("Kart"));









        BekleKapat();
    }
}
