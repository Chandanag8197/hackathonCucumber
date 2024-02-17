package stepDefinations;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.TravelInsurencePage;

public class TravelInsurenceSteps  {
	
	WebDriver driver;
	static TravelInsurencePage tip;
	
//	@Given("a")
//	public void method_a() {
//		System.out.println("Chandan!");
//	}
	
	@Given("user navigates to the url")
	public void user_navigates_to_the_url() {
		tip = new TravelInsurencePage(BaseClass.getDriver());
		
		BaseClass.getLogger().info("Starting of application!");

	}

	@When("user enters destination as {string}")
	public void user_enters_destination_as(String string) {
		tip.enter_destination(string);

	}

	@When("user selects start and end date as")
	public void user_selects_start_and_end_date_as() {
		tip.pick_start_date();
		tip.pick_end_date();
	}
//
//	@When("user selects age of the two students")
//	public void user_selects_age_of_the_two_students() {
//		tip.age_select();
//	}
//
//	@When("user selects the medical condition and provides mobile details")
//	public void user_selects_the_medical_condition_and_provides_mobile_details() {
//		tip.medical_mobile();
//	}
//
//	@When("user click on view plans")
//	public void user_click_on_view_plans() {
//		tip.view_plans();
//	}
//
//	@When("user provide visa details and sort the plans low to high")
//	public void user_provide_visa_details_and_sort_the_plans_low_to_high() {
//		tip.student_plans();
//		tip.planResults();
//	}
//
//	@When("user clicks on the home page icon")
//	public void user_clicks_on_the_home_page_icon() {
//		tip.navigateBack();
//	}

}
