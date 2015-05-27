package Library;

public interface Item {

	// String callNumber
	
	public void setCallNumber(String callNum);
	public String getCallNumber();
	
	// boolean checkedOut
	
	public void setCheckedOut(boolean checked);
	public boolean getCheckedOut();
	public boolean checkOut(long custID);
	
	// long customerID
	
	public void setCustomerID(long customerID);
	public long getCustomerID();
	
}
