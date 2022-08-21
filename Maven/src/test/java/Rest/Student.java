package Rest;

public class Student {
	
	public int id;
	public String job;
	public String name;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStudentRecord() {
		
		return (this.id+" "+this.name+" "+this.job);
	}
}
