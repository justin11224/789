package it2d;

import java.util.Scanner;

public class IT2d {
    public static void main(String[] args) {
        String response;
        Scanner sc = new Scanner(System.in); 
        do { 
            System.out.println("1. EMPLOYEES");
            System.out.println("2. PRODUCTS");
            System.out.println("3. ORDERS RECORDS");
            System.out.println("4. EXIT");
           
            System.out.print("Enter action number: ");
            int action = sc.nextInt();
            sc.nextLine(); 
            
            Employee EmployeeAction = new Employee();
            Product  ProductAction  = new Product();
            
            switch(action) {
                case 1: 
                    EmployeeAction.Employees(); 
                    break;
                case 2:
                    ProductAction.Products();
                    break;
                case 3:
                    System.out.println("Orders records management not implemented yet.");
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid action. Please try again.");
                    break;
            }
            
            System.out.print("Do you want to continue? (yes or no): ");
            response = sc.next();
        } while (response.equalsIgnoreCase("yes"));
        
        System.out.println("Thank you, see you!");
        sc.close(); 
    }
}
