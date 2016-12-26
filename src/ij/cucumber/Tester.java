package ij.cucumber;

import cucumber.api.java.en.*;


public class Tester {
	@Given("^I am a ([a-zA-Z]{1,}) Tester$")
	
public void I_am_a_Manual_Tester(String Testertype){
		System.out.println(Testertype+" : in @given");
		
	}
	@When("^i apply for ([a-zA-Z]{1,})$")
	public void i_apply_for_jobs(String Testertype){
		System.out.println(Testertype+": in @when");
		
	}
	@Then("i get paid ([a-zA-Z]{1,})")
	public void i_get_paid_less(String Testertype){
		System.out.println(Testertype+" : in @then");
		
	}
	@And("i m ([a-zA-Z]{1,}) satisfied")
	public void i_m_not_satisfied(String Testertype){
		System.out.println(Testertype+" : in @and");
		
	}
	@But("my parents are ([a-zA-Z]{1,})")
	public void my_parents_are_happy(String Testertype){
		System.out.println(Testertype+": in @but");
		
	}
}
