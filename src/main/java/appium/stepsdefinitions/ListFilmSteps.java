package appium.stepsdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListFilmSteps {


    ListFilmes listFilm;

    public ListFilmSteps(){
        listFilm = new ListFilmes();
    }

    @Given("^I'm on the movie list$")
    public void ı_m_on_the_movie_list() throws Throwable {

        this.listFilm.home();
    }

    @When("^to perform a title search$")
    public void to_perform_a_title_search() throws Throwable {
        this.listFilm.type_name();

    }

    @Then("^I see the search result$")
    public void ı_see_the_search_result() throws Throwable {
        this.listFilm.btn_search();
    }
}
