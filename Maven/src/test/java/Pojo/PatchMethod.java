package Pojo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class PatchMethod {

	public void patchMethodExecution() {
		
		RestAssured.baseURI="https://reqres.in/";
		given().
			body("json").
		when().
			patch("/api/users/2").
		then().log().all();
		
	}
	public static void main(String[] args) {
		PatchMethod obj=new PatchMethod();
		obj.patchMethodExecution();
	}
}
