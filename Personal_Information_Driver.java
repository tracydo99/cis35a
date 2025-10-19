import java.util.Scanner;

public class Driver {
    static Scanner s1 = new Scanner(System.in);

    public static void main(String[] args) {
        Driver d1 = new Driver();
        
        System.out.println("--- Enter first person's information ---");
        Person person1 = d1.readValue();

        System.out.println("\n--- Enter second person's information ---"); 
        Person person2 = d1.readValue();

        System.out.println("\n--- Enter third person's information ---");
        Person person3 = d1.readValue();

        System.out.println("\n=== Personal Information ===");
        System.out.println("\n--- Person 1 ---");
        person1.print();

        System.out.println("\n--- Person 2 ---");
        person2.print();

        System.out.println("\n--- Person 3 ---");
        person3.print();

        s1.close(); 
    }

    public Person readValue() {
        Person p = new Person();

        System.out.print("Enter name: ");
        p.setName(s1.nextLine());

        System.out.print("Enter address: ");
        p.setAddress(s1.nextLine());

        System.out.print("Enter age: ");
        p.setAge(s1.nextInt());
        s1.nextLine(); // this makes sure to get the next input after

        System.out.print("Enter phone number: ");
        p.setPhoneNumber(s1.nextLine());

        return p;
    }
}