package org.donate.cancer.pages;

import org.donate.cancer.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DonationPage extends CommonMethods {

    @FindBy(id = "frequency_onetime")
    public WebElement oneTimeBtn;

    @FindBy(xpath = "//*[@id=\"donate_amount\"]/div[2]/div[1]/div[1]")
    public WebElement oneTime$50Btn;

    @FindBy(xpath = "//*[@id=\"donate_amount\"]/div[2]/div[1]/div[2]")
    public WebElement oneTime$75Btn;

    @FindBy(xpath = "//*[@id=\"donate_amount\"]/div[2]/div[1]/div[3]")
    public WebElement oneTime$100Btn;

    @FindBy(xpath = "//*[@id=\"donate_amount\"]/div[2]/div[1]/div[4]")
    public WebElement oneTime$250Btn;

    @FindBy(id = "frequency_monthly")
    public WebElement monthlyBtn;

    @FindBy(xpath = "//*[@id=\"donate_amount\"]/div[3]/div[1]/div[1]")
    public WebElement monthly$21Btn;

    @FindBy(xpath = "//*[@id=\"donate_amount\"]/div[3]/div[1]/div[2]")
    public WebElement monthly$50Btn;

    @FindBy(xpath = "//*[@id=\"donate_amount\"]/div[3]/div[1]/div[3]")
    public WebElement monthly$100Btn;

    @FindBy(xpath = "//*[@id=\"donate_amount\"]/div[3]/div[1]/div[4]")
    public WebElement monthly$250Btn;

    public void clickOnOneTimeBtn() {
        jsClick(oneTimeBtn);
    }

    public void clickOnoneTime$50Btn() {
        jsClick(oneTime$50Btn);
    }

    public void clickOnOneTime$75Btn() {
        jsClick(oneTime$75Btn);
    }

    public void clickOnoneTime$100Btn() {
        jsClick(oneTime$100Btn);
    }

    public void clickOnoneTime$250Btn() {
        jsClick(oneTime$250Btn);
    }

    public void clickOnmonthlyBtn() {
        jsClick(monthlyBtn);
    }

    public void clickOnmonthly$21Btn() {
        jsClick(monthly$21Btn);
    }

    public void clickOnmonthly$50Btn() {
        jsClick(monthly$50Btn);
    }

    public void clickOnmonthly$100Btn() {
        jsClick(monthly$100Btn);
    }

    public void clickOnmonthly$250Btn() {
        jsClick(monthly$250Btn);
    }

    public DonationPage() {
        PageFactory.initElements(driver, this);
    }


}
