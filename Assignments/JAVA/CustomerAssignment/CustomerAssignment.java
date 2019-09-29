package oopsDemo;

public class CustomerAssignment {
	private int customerID;
	private String customerName;
	private String customerAddress;
	private int billAmount;

	public CustomerAssignment() {
		customerID=0;
		customerName="Not Available";
		customerAddress="Address not available";
		billAmount=0;
	}

	public CustomerAssignment(int customerID, String customerName, String customerAddress, int billAmount) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "CustomerAssignment [customerID=" + customerID + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}
	
}
