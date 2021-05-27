package org.donate.cancer.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.donate.cancer.utils.CommonMethods;

import java.util.List;


public class donationStepDefinition extends CommonMethods {

    @When("verify the donation home page comes up")
    public void verify_the_donation_home_page_comes_up() {
        setUp();
    }

    @When("click on One Time button")
    public void click_on_one_time_button() {
        donationPage.clickOnOneTimeBtn();
    }

    @Then("verify One Time donation amounts are displayed")
    public void verify_one_time_donation_amounts_are_displayed(DataTable OneTimeAmounts) {
        List<String> expectedOneTimeAmounts = OneTimeAmounts.asList();
        donationPage.clickOnoneTime$50Btn();
        donationPage.clickOnOneTime$75Btn();
        donationPage.clickOnoneTime$100Btn();
        donationPage.clickOnoneTime$250Btn();
    }

    @When("click on Monthly button")
    public void click_on_monthly_button() {
        donationPage.clickOnmonthlyBtn();
    }

    @Then("verify Monthly donation amounts are displayed")
    public void verify_monthly_donation_amounts_are_displayed(DataTable MonthlyAmounts) {
        List<String> expectedMonthlyAmounts = MonthlyAmounts.asList();
        donationPage.clickOnmonthly$21Btn();
        donationPage.clickOnmonthly$50Btn();
        donationPage.clickOnmonthly$100Btn();
        donationPage.clickOnmonthly$250Btn();
    }

    @Then("quit the browser")
    public void quit_the_browser() {
        tearDown();
    }
}
