package RestAssured.Maven;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class RestAPI {

	public void GETmethod() {


		given().
		when().
			get("/api/unknown").
		then().
			log().all();

	}
	public void POSTmethod() {

		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		given().
			body(payload).
		when().
			post("/api/users").
		then().
			log().all();

	}
	public void PUTmethod() {

		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		
		
		given().
			body(payload).
		when().
			put("/api/users/2").
		then().
			log().all();

	}


	public void PATCHmethod() {

		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		
		given().
			body(payload).
		when().
			patch("/api/users/2").
		then().
			log().all();	
	}

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RestAPI obj=new RestAPI();
		//obj.GETmethod();
		//obj.POSTmethod();
		//obj.PUTmethod();
		obj.PATCHmethod();

	}
}
