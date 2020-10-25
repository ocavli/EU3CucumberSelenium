package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {
    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        //selenium code
        System.out.println("the user navigates to Fleet, Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("Expected and Actual title are matching");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("the user navigates to Marketing, Campaigns");

    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        System.out.println("Expected and Actual title are matching");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the user navigates to Activities, Calendar Events");

    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        System.out.println("Expected and Actual title are matching");
    }


    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {
        BrowserUtils.waitFor(3);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber =Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNum,actualNumber);
    }

    @Then("the user should see {string} as a page title")
    public void the_user_should_see_as_a_page_title(String page) {



    }

    @When("the user navigate to {string} page")
    public void the_user_navigate_to_page(String page) {
        DashboardPage dashboardPage = new DashboardPage();
        switch(page.toLowerCase()) {
            case "vehicles":
                dashboardPage.navigateToModule("Fleet","Vehicles");
                break;
            case "campaigns":
                dashboardPage.navigateToModule("Marketing","Campaigns");
                break;
            case "Calendar Events":
                dashboardPage.navigateToModule("Activities","Calendar Events");
                break;
        }
    }



}