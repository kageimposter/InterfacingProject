package Library;

public class Customer implements Person {

	private long iD;
	private String fName;
	private String lName;

	@Override
	public long getID() {
		// Will return the ID
		return iD;
	}
	
	@Override
	public void setID(long id) {
		// TODO Auto-generated method stub
		iD = id;
	}
	
	@Override
	public void setFName(String fname) {
		// TODO Auto-generated method stub
		fName = fname;
	}
	
	@Override
	public String getFName() {
		// TODO Auto-generated method stub
		return fName;
	}
	
	@Override
	public void setLName(String lname) {
		// TODO Auto-generated method stub
		lName = lname;
	}
	
	@Override
	public String getLName() {
		// TODO Auto-generated method stub
		return lName;
	}

	
	


}
