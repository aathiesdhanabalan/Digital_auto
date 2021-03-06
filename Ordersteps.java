package com.quinbay.Steps;

import com.quinbay.Search;
import com.quinbay.utilclass.Orderpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class Ordersteps {
    static WebDriver driver;
    static Orderpage search;
    @And("User enters in the Orderdetailpage")
    public void user_enters_in_the_orderdetailpage() throws InterruptedException {
        driver=CucumberHooks.getdriver();
        search=new Orderpage(driver);
        search.clickDipesan();
        System.out.println("User enters successfull");
    }

    @And("Verify the invalid tag")
    public void user_clicks_dibatalkan_tag() {
        search.searchbox();
        search.setClickDipat();
        search.searchforh2tag();
    }

    @Then("verify the product inside is invalid")
    public void the_first_product_is_same_as_dibatalkan_tag() {
       }
       @And("verify for searchbox")
    public void verify_for_searchbox(){
        search.verifysearchBox();
       }

}
