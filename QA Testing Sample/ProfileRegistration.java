import java.util.Scanner;

public class ProfileRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Profile Registration");
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine(); // Clear the input buffer
        
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        
        System.out.println("\nRegistration Successful!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}
