package blocks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by AT on 22.07.2016.
 */

@Name("Navigation block")
@Block(@FindBy(className = "dev-all"))
public class NavigationBlock extends HtmlElement{

    private WebDriver driver;


    @Name("Lenta link")
    @FindBy(xpath = "//ul[@class='menu']//a[@href = 'https://dev.by/lenta']")
    private Link lentaLink;

    @Name("Companies link")
    @FindBy(xpath = "//ul[@class='menu']//a[@href = 'https://companies.dev.by/']")
    private Link companiesLink;

    @Name("Salaries link")
    @FindBy(xpath = "//ul[@class='menu']//a[@href = 'https://salaries.dev.by/']")
    private Link salariesLink;

    @Name("Jobs link")
    @FindBy(xpath = "//ul[@class='menu']//a[@href='https://jobs.dev.by/']")
    private Link jobsLink;



    public void clickLentaLink() {

        lentaLink.click();
    }

    public void clickCompaniesLink(){

        companiesLink.click();
    }

    public void clickSalariesLink() {

        salariesLink.click();
    }

    public void clickJobsLink() {

        jobsLink.click();
    }

}
