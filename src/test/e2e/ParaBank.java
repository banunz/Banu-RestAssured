import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import com.fasterxml.jackson.databind.*;

public class ParaBank {
    public void testaccount(){
        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            Person person = objectMapper.readValue(jsonString, Person.class);
//            // Do something with the person object
//        } catch (Exception e) {
//            // Handle the exception
//            e.printStackTrace();
//        }
        baseURI="https://parabank.parasoft.com";
     Customer st= given().auth().basic("parabanktest","test@123")
                .header("Content-Type","application/json")
                .when().get("/parabank/services_proxy/bank/customers/20093/accounts")
                .then().assertThat().statusCode(200).as(Customer.class);
    }
}
