package Pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPojoDeserilization {
	public static void main(String[] args) throws Exception, Exception {
		
	
	String payload="{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}";
	
	ObjectMapper objmap=new ObjectMapper();
	PatchMethodBodySerilization objpatch=objmap.readValue(payload,PatchMethodBodySerilization.class);
	System.out.println(objpatch.getName());
	System.out.println(objpatch.getJob());

	}	
}
