package AddPlace;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import addPlaceFiles.ReUsuableMethods;
import addPlaceFiles.payload;

public class Basics {

    public static void main(String[] args) {

    	//Validate if add place api is working as expected
		//given-all input details
		//when-Submit the api
		//then-validate the response
    	
        // Base URI
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        
        // Add Place API
        String response = given().log().all().queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body(payload.AddPlace())
                .when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200)
                .body("scope", equalTo("APP"))
                .header("server", "Apache/2.4.52 (Ubuntu)")
                .extract().response().asString();
        
        // Parse the response to get the place ID
        JsonPath js = new JsonPath(response);
        String placeId = js.getString("place_id");
        System.out.println("Place ID: " + placeId);
        
        // Update Place API
        String newAddress = "New Updated Random Address";
        given().log().all().queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body("{\n"
                        + "\"place_id\":\"" + placeId + "\",\n"
                        + "\"address\":\"" + newAddress + "\",\n"
                        + "\"key\":\"qaclick123\"\n"
                        + "}")
                .when().put("maps/api/place/update/json")
                .then().log().all().assertThat().statusCode(200)
                .body("msg", equalTo("Address successfully updated"));
        
        // Get Place API
        String getPlaceResponse = given().log().all()
                .queryParam("key", "qaclick123")
                .queryParam("place_id", placeId) // Use the correct variable here
                .when().get("maps/api/place/get/json")
                .then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        
        // Verify the updated address
        JsonPath js1=ReUsuableMethods.rawToJson(getPlaceResponse);
        String actualAddress = js1.getString("address");
        System.out.println("Updated Address: " + actualAddress);
        
        //Cucumber Junit or Testng for assertion as it is out of the given method now
        Assert.assertEquals(actualAddress,newAddress);
    }
}

