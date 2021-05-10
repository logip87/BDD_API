package MyStepdefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {


    @When("I use Body from {string} in {string} method")
    public void iUseBodyFromInMethod(String arg0, String arg1) {
        methods.useBodyFromMethod();
    }

    @Then("I Got Response {string}")
    public void iGotResponse(String responseCode) {
        methods.checkReposnseCode(responseCode);
    }

    @Given("I get {string} id {string} from request {string}")
    public void iGetIdFromRequest(String method, String id, String request) {
        methods.getMethod(method);
        methods.getId(id);
        methods.getRequest(request);
    }

    @And("I see response code {string} and status {string}")
    public void iSeeResponseCodeAndStatus(String responseCode, String status) {
        methods.checkReposnseCode(responseCode);
        methods.checkStatus(status);
    }
}
