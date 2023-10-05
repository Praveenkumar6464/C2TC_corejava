package DayThree;

public class Customer {

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}
	private int CustomerId;
	private String customerName;
	private String customerCity;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	
	
	

}
