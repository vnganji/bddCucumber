package Steps;

import java.util.TreeMap;

import com.codoid.products.exception.FilloException;

import Utilities.DataProviders;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class inputForms {
	

@Given("user navigates to easyselenium home page")
public void user_navigates_to_easyselenium_home_page() {
    System.out.println("step1 ");
}

@When("used clicks on InputForm")
public void used_clicks_on_input_form() {
	 System.out.println("step2 ");
}

@Then("it displayed list of {string} user actions")
public void it_displayed_list_of_user_actions(String menu) {
	 System.out.println(menu+" step3 ");
}


@Given("create test data from {string} and {string}")
public void getData(String testid,String sheetname) throws FilloException {
	TreeMap<String,String> data = DataProviders.generateGloabalData(testid, sheetname);
	System.out.println(data.get("name"));
	System.out.println(data.get("lastname"));
	System.out.println(data.get("age"));
}




}
