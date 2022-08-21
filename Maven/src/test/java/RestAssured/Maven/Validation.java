package RestAssured.Maven;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Validation {

	public void GetMethodValidation() {

		String res= given().
					when().
						get("/api/users/2").
					then().
						log().all().assertThat().statusCode(200).
						extract().response().asString();


		//System.out.println(res);

		//we will extract particular field from json path
		JsonPath js=new JsonPath(res);
	

		String emailId=js.getString("data.email");   //in json viver email is present under data folder thats why we taken data.email

		System.out.println(emailId);

		String actualEmail="janet.weaver@reqres.in";

		if(actualEmail.equals(emailId))
		{
			System.out.println("Same");

		}else
		{
			System.out.println("Different");
		}
	}



	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		Validation obj=new Validation();
		obj.GetMethodValidation();

	}

}
