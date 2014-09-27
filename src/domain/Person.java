package domain;

public class Person {
	
	private String firstName;
	private String surname;
	private String pesel;
	
	private User user;
	private List<Addres> Addresses;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Addres> getAddresses() {
		return Addresses;
	}
	public void setAddresses(List<Addres> addresses) {
		Addresses = addresses;
	}
	
	

}
