package org.example;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //given -all input details
        //when -submit the API
        //then - validate the response
     RestAssured.baseURI="https://parabank.parasoft.com" ;
   given().log().all()
   .auth().basic("parabanktest","test@123")
   .header( "Content-Type","application/json")
   .when()
   .get("/parabank/services_proxy/bank/customers/20093/accounts")
   .then().log().all().assertThat().statusCode(200);
    }
}