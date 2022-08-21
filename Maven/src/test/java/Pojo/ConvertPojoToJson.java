package Pojo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertPojoToJson {

	String request() throws Exception 
	{
		//we have create object of set class to set the  data in setter
		
				PatchMethodBodySerilization objpatch=new PatchMethodBodySerilization();
				objpatch.setName("morpheus");
				objpatch.setJob("zion resident");
				
		//use object mapper class to convert data(which we set) into jason
				
				ObjectMapper objmap=new ObjectMapper();
				String json=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(objpatch);
				
				return json;
				
				//System.out.println(json);
			
	}
	//public static void main(String[] args) throws Exception {
//		//we have create object of set class to set the  data in setter
//		PatchMethodBodySerilization objpatch=new PatchMethodBodySerilization();
//		objpatch.setName("morpheus");
//		objpatch.setJob("zion resident");
//		
//		//use object mapper class to convert data(which we set) into jason
//		ObjectMapper objmap=new ObjectMapper();
//		String json=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(objpatch);
//		
//		System.out.println(json);
//	
	}

