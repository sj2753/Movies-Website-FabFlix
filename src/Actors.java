
public class Actors {
	private String stageName;
	private String firstName;
	private String lastName;
	private String dob;

	public Actors(String stageName, String firstName, String lastName, String dob){
		this.stageName = stageName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public  String getStageName(){
		return this.stageName;
	}

	public void setStageName(String stageName){
		this.stageName = stageName;
	}

	public  String getFirstName(){
		return this.firstName;
	}
	
	public void seFirstName(String firstName){
		this.firstName = firstName;
	}

	public  String getLastName(){
		return this.lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public  String getDob(){
		return this.dob;
	}

	public void setDob(String Dob){
		this.dob = Dob;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Employee Details - "
				+ "Name:" + getStageName()+", FirstName:" + getFirstName()+
				", LastName:" + getLastName()+", DOB:" + getDob());
		return sb.toString();
	}
}
