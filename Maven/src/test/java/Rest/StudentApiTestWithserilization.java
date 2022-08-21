package Rest;

import org.junit.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class StudentApiTestWithserilization {

	@Test(priority=1)
	public void creatNewStudentSerilization() {
		
		
		Student stu = new Student();
		
		stu.setId(48);
		stu.setName("morpheuss");
		stu.setJob("leaderr");
		
		
		RestAssured.baseURI="https://reqres.in/";
		given()
			.contentType(ContentType.JSON)
			.body(stu)
		.when()
			.post("/api/users")
		.then()
			.statusCode(201).log().all();
	}
	
	@Test(priority=2)
	public void getStudentRecordDeserilization() {
		
		Student stu = get("/api/users/48").as(Student.class);
		System.out.println(stu.getStudentRecord());
		Assert.assertEquals(stu.getId(), 48);
	}

	
	
	
	
	
	
	
}
