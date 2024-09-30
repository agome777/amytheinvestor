import java.util.Scanner; // Start with the import

/*
 * This is a program written by Amy Gomez
 * as a deliverable of Programming Assignment 1
 * for COP2210 - Fall 2024
 * Date: 09/21/2024
 */

public class ContactBook { // Define the main class
    private Scanner scanner = new Scanner(System.in); // Add the scanner
//private so only same class can access

    // Method to create an Address record
    public Address addressRecord() {
        //Method implementation
        System.out.println("Enter the street number: ");
        int streetNumber = scanner.nextInt();
        scanner.nextLine(); //always put this line after int or double

        System.out.println("Enter the street name: ");
        String streetName = scanner.nextLine();

        System.out.println("Enter the ZIP code: ");
        int zipCode = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the city: ");
        String cityName = scanner.nextLine();

        System.out.println("Enter the state: ");
        String stateName = scanner.nextLine();

        // Return the address
        return new Address(streetNumber, streetName, zipCode, cityName, stateName);
    }

    // Method to create a Contact record
    public Contact contactRecord(Address homeAddress) {
        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter the birthday (mm/dd/yyyy): ");
        String birthday = scanner.nextLine();

        System.out.println("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter the email address: ");
        String emailAddress = scanner.nextLine();

        // Return the new Contact object
        return new Contact(firstName, lastName, birthday, phoneNumber, emailAddress, homeAddress);
    }

    // Main method
    public static void main(String[] args) {
        ContactBook book = new ContactBook();
        Address address = book.addressRecord(); // Create an address
        Contact contact = book.contactRecord(address); // Create a contact
        System.out.println("Contact created: " + contact); // Display the contact
    }
}

// Address class
class Address {
    private int streetNumber;
    private String streetName;
    private int zipCode;
    private String city;
    private String state;

    public Address(int streetNumber, String streetName, int zipCode, String city, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return "Address{number: " + streetNumber + ", street: '" + streetName + "', city: '" + city + "', state: '" + state + "', zipCode: " + zipCode + "}";
    }
}

// Contact class
class Contact {
    private String firstName;
    private String lastName;
    private String birthday;
    private String phoneNumber;
    private String email;
    private Address homeAddress;

    public Contact(String firstName, String lastName, String birthday, String phoneNumber, String email, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.homeAddress = homeAddress;
    }

    public String toString() {
        return "Contact{firstname: '" + firstName + "', lastname: '" + lastName + "', birthday: '" + birthday + "', phoneNumber: '" + phoneNumber + "', email: '" + email + "', homeAddress: " + homeAddress + "}";
    }
}

/* I tried my best. Could we review this again? I had a hard time
doing/understanding this assignment. Thank you!
 */