package com.vytrack.step_definitions;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {


    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        BrowserUtils.waitFor(2);
        System.out.println(menuOptions.size());
        System.out.println(menuOptions);
        //get the list of web element and convert them list of string and asssert
        List <String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals(menuOptions,actualOptions);
        System.out.println("menuOptions = " + menuOptions);
        System.out.println("actualOptions = " + actualOptions);
    }


    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {
        System.out.println(userInfo);
        //use map information to login and also verify firstname and lastname
        //login with map info
        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));
        //verify firstname and lastname
        String actualName = new DashboardPage().getUserName();
        String expectedName = userInfo.get("firstname")+" "+userInfo.get("lastname");

        Assert.assertEquals(expectedName,actualName);
        System.out.println("expectedName = " + expectedName);
        System.out.println("actualName = " + actualName);
    }

}