package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SiteMapSteps {
    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30L));
    String rndTopMenuItem;
    String rndProduct;
    public List<WebElement> fullList;
    public List<String> strFullListSiteMap = new ArrayList<>();

    @Given("Click to sitemap link")
    public void clickToSitemapLink() {
        dc.findAndClick("siteMapLink");
        fullList = dc.waitVisibleListAllElement(dc.siteMapFullList);

        //Site Map Web Element getText() sonuçlarını String bi listeye atıyprum.
        for (WebElement item : fullList) {
            strFullListSiteMap.add(item.getText());
        }
    }

    @When("Verify the link")
    public void verifyTheLink() {
        dc.findAndContainsText("siteMapLink", "Apple Site Haritası");
    }

    @And("Random click on top menu")
    public void randomClickOnTopMenu() {
        wait.until(ExpectedConditions.visibilityOfAllElements(tn.topNavList));
        byte rnd = (byte) (Math.random() * 7 + 3);
        this.rndTopMenuItem = tn.randomClick((short) rnd);
        System.out.println("\nRastgele Seçilen Menü: " + rndTopMenuItem);
    }

    @And("Select random product in the top menu list")
    public void checkProductInTheSitemapList() {
        wait.until(ExpectedConditions.visibilityOfAllElements(tn.topNavProductList));
        byte rndItem = (byte) (Math.random() * tn.topNavProductList.size());
        rndProduct = ((WebElement) tn.topNavProductList.get(rndItem)).getText();
        System.out.println("Rastgele Seçim : " + rndProduct);
    }

    @Then("Check random product in the sitemap")
    public void checkRandomProductInTheSitemap() {

        boolean varMi = false;
        for (String item : strFullListSiteMap) {
            varMi = (item.contains(rndProduct));
            if (varMi) break;
        }
        System.out.println("Rastgele seçilen ürün SiteMap'te var mı? = " + varMi);
        Assert.assertTrue(varMi);
    }

    @And("Export contents to excel file")
    public void exportContentsToExcelFile() throws IOException {

        // hafızada  yeni workbook oluştur, sonra sheet oluştur
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("SiteMapElements");

        // HAFIZADA satır ve hücre oluşturma ve yazma işlemelri yapılıyor
        Row yeniSatir = sheet.createRow(0); // satır oluşturuldu 0.yerde
        Cell yeniHucre = yeniSatir.createCell(0); // yeni satırda ilk hucre oluşturuldu

        // Siteden Listeye aldığımız verileri hafızadaki excel'e yazdırıyoruz.
        for (int i = 0; i < strFullListSiteMap.size(); i++) {
            yeniHucre = sheet.createRow(i).createCell(0);
            yeniHucre.setCellValue(strFullListSiteMap.get(i));
        }

        // Yazma işlemini YAZMA modunda açıp öyle yapacağız. (Hafızadan, harddiske)
        FileOutputStream fos = new FileOutputStream("src/test/java/ExcelFiles/SiteMapElements.xlsx");
        workbook.write(fos);
        workbook.close();

        System.out.println("Excel File Exported");
    }

}
