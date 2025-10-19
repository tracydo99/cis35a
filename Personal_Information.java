public class Person {
	//private instance variables
	private String name;
	private String address;
	private int age;
	private String phonenumber;
	
	//getters
	public String getName() { return name; }
	public String getAddress() { return address; }
	public int getAge() { return age; }
	public String getPhoneNumber() { return phonenumber; }
	
	//setters
	public void setName(String giveName) { name = giveName; }
	public void setAddress(String giveAddress) { address = giveAddress; }
	public void setAge(int giveAge) { age = giveAge; }
	public void setPhoneNumber(String givePhoneNumber) { phonenumber = givePhoneNumber; }
	
	//default constructor
	public Person() {
		name = "";
		address = "";
		age = 0;
		phonenumber = "(000) 000 - 0000";
	}

	//overloaded constructor
	public Person(String name, String address, int age, String phonenumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phonenumber = phonenumber;
	}

	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phonenumber);
	}
}