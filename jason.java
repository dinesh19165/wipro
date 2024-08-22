package stepdef;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class jason {
	Response res;
	@Given("i have given base url of {string}")
	public void i_have_given_base_url_of(String string) {
	   baseURI=string;
	}

	@When("i send a get request to {string}")
	public void i_send_a_get_request_to(String string) {
		res= given()
				.log().all()
		.when()
		.get(string);
	   
	}

	@Then("the response status code is {int}")
	public void the_response_status_code_is(Integer int1) {
		res.then()
		.log().all()
				.statusCode(int1);
	   
	}
	
	@When("i send a post request to {string} with the body of {string}")
	public void i_send_a_post_request_to_with_the_body_of(String string, String string2) {
		  res=given()
				 
				  .body(string2)
				  .when()
				  .post(string);
	}
	@Then("the time is lessthan 5000ms")
	public void the_time_is_lessthan_5000ms() {
	   res.then()
	   .time(lessThan(5000l));
	}
	@When("i send a get one post {string}")
	public void i_send_a_get_one_post(String string) {
	   res=(Response) given()
				.log().all()

			   .when()
			   .get(string);
			   
	}

	@When("i send a get delete to {string}")
	public void i_send_a_get_delete_to(String string) {
		res=(Response) given()
				.log().all()

				.when()
				.delete(string);
				
	    
	}
	@Then("the one response status code is {int}")
	public void the_one_response_status_code_is(Integer int1) {
		res.then()
		.log().all()

		.statusCode(int1);
	}

	@Then("the validate response status code is {int}")
	public void the_validate_response_status_code_is(Integer int1) {
		res.then()
		.log().all()
		.statusCode(int1);
	    
	}
	@When("i send a put to {string} with the body of {string}")
	public void i_send_a_put_to_with_the_body_of(String string, String string2) {
	   res=given()
			   .log().all()
			   .body(string2)
			   .when()
			   .put(string);
	}

	@Then("the put validate response status code is {int}")
	public void the_put_validate_response_status_code_is(Integer int1) {
		res.then()
		.log().all()
		.statusCode(int1);
	}
	@When("i send a get one post2 {string}")
	public void i_send_a_get_one_post2(String string) {
	    res =given()
	    		.log().all()
	    		.when()
	    		.get(string);
	}

	@Then("the one response status code is2 {int}")
	public void the_one_response_status_code_is2(Integer int1) {
		res.then()
		.log().all()
		.statusCode(int1);   
	}
}
